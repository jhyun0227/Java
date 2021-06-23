package ch11;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
public class PropertiesExample {
	public static void main(String[] args) throws  IOException {
		Properties pts = new Properties();
		String path = // database.properties파일의 위치와 이름
				PropertiesExample.class.getResource("database.properties").getPath();
		// utf-8, euc-kr(MS949)
		// path = URLDecoder.decode(path, "utf-8"); // url주소를 세팅
		pts.load(new FileReader(path)); // database.properties을 pts로 옮겨라
		System.out.println("driver : " + pts.getProperty("driver"));
		System.out.println("url : " + pts.getProperty("url"));
		System.out.println("username : " + pts.getProperty("username"));
		System.out.println("password : " + pts.getProperty("password"));
	}
}