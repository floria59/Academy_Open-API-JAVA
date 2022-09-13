package sec11.exam01_final;

public class Earth {

	//필드에 final키워드를 사용하면, 초기값 이외에는 다른값으로 변경할수가 없다.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
