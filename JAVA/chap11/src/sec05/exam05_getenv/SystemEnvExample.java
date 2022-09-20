package sec05.exam05_getenv;

public class SystemEnvExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바 환경변수 읽어오기.
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[ JAVA_HOME ]" + javaHome);

	}

}
