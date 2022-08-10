(function(){
    const getLottoNumber = function()
    {
        const ranNumber = [];

        // ranNumber.length가 6이 될 때까지 계속
        let num = 0;
        while(ranNumber.length < 6)
        {
            // ranNumber의 개수가 6개가 될 때까지 계속
            // 1 ~ 45까지의 랜덤번호를 하나 만들어 낸다. 
            num = Math.floor(Math.random() * 45) + 1;

            if (-1 === ranNumber.indexOf(num))
            {
                ranNumber.push(num);
            }

            // 랜덤번호가 ranNumber배열에 
            // 존재하지 하지 않는다면 ranNumber에 넣는다.
            // 만약 랜덤번호가 존재한다면 랜덤번호를 다시 만든다.   
        }
        return ranNumber;
    }
    for (let i = 0; i < 5; i++)
    {
        ranLine = getLottoNumber();

        str = ranLine.join(',');

        document.body.innerHTML += `<h1>${str}</h1>`
    }
    

})();