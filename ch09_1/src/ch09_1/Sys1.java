package ch09_1;

public class Sys1 {
	public static void main(String[] args) {
		// getenv 시스템의 설정파일을 읽을 때 사용
		String path = System.getenv("path");
		String java_home = System.getenv("JAVA_HOME");
		System.out.println("path = " + path);
		System.out.println("home = " + java_home);
	}
}
