(()=>{

    let yOffset = 0;            // 전체 문서에서의 yOffset
    let sectionYOffset = 0;     // 섹션내에서의 yOffset
    let currentSection = 0;     // 현재 섹션 번호

    const sectionSet = [
        {
            height: 0,            
            hMultiple: 5,

            objs : {
                container : document.querySelector('#section-0'),
                messageA : document.querySelector('.section0-message.a'),
                messageB : document.querySelector('.section0-message.b'),
                messageC : document.querySelector('.section0-message.c'),
                messageD : document.querySelector('.section0-message.d'),
                canvas : document.querySelector('#main-canvas'),
                context : document.querySelector('#main-canvas').getContext('2d'),
                canvasImages : [],

            },
            vals : {                
                imageCount              : 600,
                imageSequence           : [0, 599],
                canvas_opacity_out      : [1, 0, {start: 0.71, end:0.99}],

                messageA_opacity_in     : [0, 1, {start: 0.09, end: 0.19}],
                messageA_opacity_out    : [1, 0, {start: 0.21, end: 0.29}],
                messageA_translateY_in  : [0, -15, {start: 0.09, end: 0.19}],
                messageA_translateY_out : [-15, -30, {start: 0.21, end: 0.29}],
            
                messageB_opacity_in     : [0, 1, {start: 0.31, end: 0.39}],
                messageB_opacity_out    : [1, 0, {start: 0.41, end: 0.49}],
                messageB_translateY_in  : [0, -15, {start: 0.31, end: 0.39}],
                messageB_translateY_out : [-15, -30, {start: 0.41, end: 0.49}],
           
                messageC_opacity_in     : [0, 1, {start: 0.51, end: 0.59}],
                messageC_opacity_out    : [1, 0, {start: 0.61, end: 0.69}],
                messageC_translateY_in  : [0, -15, {start: 0.51, end: 0.59}],
                messageC_translateY_out : [-15, -30, {start: 0.61, end: 0.69}],

                messageD_opacity_in     : [0, 1, {start: 0.71, end: 0.79}],
                messageD_opacity_out    : [1, 0, {start: 0.81, end: 0.85}],
                messageD_translateY_in  : [0, -15, {start: 0.71, end: 0.79}],
                messageD_translateY_out : [-15, -30, {start: 0.81, end: 0.85}],

            }


        },
        {
            height: 0,
            hMultiple: 2,
            objs : {
                container : document.querySelector('#section-1'),
            },
            vals : {
            }

        }
    ];


    // section의 크기, 위치등의 레이아웃을 설정한다.
    const setLayout = function()
    {
        // section의 높이를 설정한다.
        for (let i = 0; i < sectionSet.length; i++)
        {
            sectionSet[i].height = window.innerHeight * sectionSet[i].hMultiple;
            sectionSet[i].objs.container.style.height = `${sectionSet[i].height}px`;
        }

    }

    // 현재 섹션을 알아내는 함수.
    const getCurrentSection = function()
    {
        let section = 0;

        if (yOffset <= sectionSet[0].height)
        {
            section = 0;

        }
        else if ((yOffset > sectionSet[0].height) && 
                 (yOffset <= sectionSet[0].height + sectionSet[1].height))        
        {
            section = 1;
        }
        else
        {

        }

        return section;

    }

    // body태그에 아이디를 넣어주는 함수
    const setBodyID = function(section)
    {
        document.body.setAttribute('id', `show-section${section}`);
        
    }

    const setLocalnavMenu = function(offset)
    {
        if (offset > 44)
        {
            document.body.classList.add('local-nav-sticky');
          
        }
        else
        {
            document.body.classList.remove('local-nav-sticky');

        }

    }


    const getPrevSectionHeight = function()
    {
        let prevHeight = 0;

        for (let i = 0; i < currentSection; i++)
        {
            prevHeight = prevHeight + sectionSet[i].height;

        }

        return prevHeight;
    }

    //현재 섹션에서 적용해야할 CSS값을 계산하는 함수.
    const calcValue = function(values)
    {
        let result;

        const height = sectionSet[currentSection].height;
        let rate;

        let partStart;      // 실제 start값
        let partEnd;        // 실제 end값
        let partHeight;     // 높이.

        if (values.length == 2)
        {
            rate = sectionYOffset / height;
            result = (rate * (values[1] - values[0])) + values[0];

        }
        // start, end값이 들어온 경우. [0, 1, {start: 0.1, end: 0.2}],
        else if (values.length === 3) 
        {
            partStart = values[2].start * height;
            partEnd   = values[2].end * height;
            partHeight = partEnd - partStart;

            if (sectionYOffset < partStart)
            {
                result = values[0];

            }
            else if (sectionYOffset > partEnd)
            {
                result = values[1];

            }
            else
            {
                rate = (sectionYOffset - partStart) / partHeight;
                result = (rate * (values[1] - values[0])) + values[0]
               
            }
           
        }

        return result;

    }

    const loadCanvasImages = function()
    {
        let imageElement;
        let imageCount = sectionSet[0].vals.imageCount;

        for (let i = 0; i < imageCount; i++)
        {
            imageElement = new Image();
            imageElement.src = `../image/apple_${i}.png`;

            sectionSet[0].objs.canvasImages.push(imageElement);

        }

        imageElement.addEventListener('load', ()=>{
            sectionSet[0].objs.context.drawImage(sectionSet[0].objs.canvasImages[0], 0, 0);

        });



    }


    const playAnimation = function()
    {
        const values  = sectionSet[currentSection].vals;
        const objects = sectionSet[currentSection].objs;
        const scrollRate = sectionYOffset / sectionSet[currentSection].height;
        let transY = 0;
        let imageIndex = 0;

        switch(currentSection)
        {
            case 0 :

                imageIndex = Math.round(calcValue(values.imageSequence));
                objects.context.drawImage(objects.canvasImages[imageIndex], 0, 0);

                if ((scrollRate > 0.7) && (scrollRate < 1))
                {
                    objects.canvas.style.opacity = calcValue(values.canvas_opacity_out);

                }



                objects.messageA.style.opacity = 0;
                objects.messageB.style.opacity = 0;
                objects.messageC.style.opacity = 0;
                objects.messageD.style.opacity = 0;


                if (scrollRate <= 0.2)
                {
                    // messageA
                    // [0, 1, {start: 0.09, end: 0.19}],
                    objects.messageA.style.opacity = calcValue(values.messageA_opacity_in);

                    transY = calcValue(values.messageA_translateY_in);
                    objects.messageA.style.transform = `translateY(${transY}%)`;
                

                }
                else if ((scrollRate > 0.2) && (scrollRate <= 0.3))
                {
                    //[1, 0, {start: 0.21, end: 0.29}],
                    objects.messageA.style.opacity = calcValue(values.messageA_opacity_out);
                   
                    transY = calcValue(values.messageA_translateY_out);
                    objects.messageA.style.transform = `translateY(${transY}%)`;
                

                }
                else if ((scrollRate > 0.3) && (scrollRate <= 0.4))
                {
                    // [0, 1, {start: 0.31, end: 0.39}]            
                    objects.messageB.style.opacity = calcValue(values.messageB_opacity_in);
                
                    transY = calcValue(values.messageB_translateY_in);
                    objects.messageB.style.transform = `translateY(${transY}%)`;
                

                }
                else if ((scrollRate > 0.4) && (scrollRate <= 0.5))
                {
                    // [1, 0, {start: 0.41, end: 0.49}],
                    objects.messageB.style.opacity = calcValue(values.messageB_opacity_out);

                    transY = calcValue(values.messageB_translateY_out);
                    objects.messageB.style.transform = `translateY(${transY}%)`;
                
                }
                else if ((scrollRate > 0.5) && (scrollRate <= 0.6))
                {
                    // [0, 1, {start: 0.51, end: 0.59}]
                    objects.messageC.style.opacity = calcValue(values.messageC_opacity_in);

                    transY = calcValue(values.messageC_translateY_in);
                    objects.messageC.style.transform = `translateY(${transY}%)`;
                

                }
                else if ((scrollRate > 0.6) && (scrollRate <= 0.7))
                {                    
                    // [1, 0, {start: 0.61, end: 0.69}]            
                    objects.messageC.style.opacity = calcValue(values.messageC_opacity_out);

                    transY = calcValue(values.messageC_translateY_out);
                    objects.messageC.style.transform = `translateY(${transY}%)`;
                
                }
                else if ((scrollRate > 0.7) && (scrollRate <= 0.8))                
                {   
                    // [0, 1, {start: 0.71, end: 0.79}]
                    objects.messageD.style.opacity = calcValue(values.messageD_opacity_in);

                    transY = calcValue(values.messageD_translateY_in);
                    objects.messageD.style.transform = `translateY(${transY}%)`;
                
                
                }
                else if ((scrollRate > 0.8) && (scrollRate <= 0.9))                
                {
                    // [1, 0, {start: 0.81, end: 0.85}            
                    objects.messageD.style.opacity = calcValue(values.messageD_opacity_out);
                    transY = calcValue(values.messageD_translateY_out);

                    objects.messageD.style.transform = `translateY(${transY}%)`;
                
                }
                

                break;


            case 1 :
                // 1번 섹션의 애니메이션 처리                             
                break;


        }

    }

    // 스크롤시 제일 마지막에 처리할 기능들...
    const scrollProc = function()
    {
        playAnimation();

    }

    ///////////////////////////////////////////////////////////////////////////////
    // Event Handler

    // 스크롤 이벤트
    window.addEventListener('scroll', ()=>{

        yOffset = window.scrollY;
        currentSection = getCurrentSection();
        sectionYOffset = yOffset - getPrevSectionHeight();

        setBodyID(currentSection);        
        setLocalnavMenu(yOffset);

        scrollProc();   

    });

    // 처음 로딩시 (리소스가 모두 로딩될 때)
    window.addEventListener('load', ()=>{        
        setLayout();
        loadCanvasImages();

        currentSection = getCurrentSection();
        sectionYOffset = yOffset - getPrevSectionHeight();

        setBodyID(currentSection);
        setLocalnavMenu(yOffset);

    });

    // 윈도우의 크기가 바뀔 때
    window.addEventListener('resize', ()=>{       
        setLayout();        
        
        currentSection = getCurrentSection();
        sectionYOffset = yOffset - getPrevSectionHeight();
        
        setBodyID(currentSection);
        setLocalnavMenu(yOffset);

    });


})();
