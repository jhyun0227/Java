package ch09_1;

public class Sys1 {
	public static void main(String[] args) {
		// getenv �ý����� ���������� ���� �� ���
		String path = System.getenv("path");
		String java_home = System.getenv("JAVA_HOME");
		System.out.println("path = " + path);
		System.out.println("home = " + java_home);
	}
}
