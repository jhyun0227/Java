package customer;
import java.util.*;
import java.util.Scanner;
// 콘솔창(웹)으로 부터 명령어를 전달받고 결과를 콘솔창으로 알려 준다
public class Ex01 {
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("명령어를 입력하세요");
			String command = sc.nextLine();
			if (command.equals("exit")) break;
			// insert로 시작하는 명령어를 입력하명
			else if (command.startsWith("insert"))
			// 컴머(,)를 기준으로 데이터를 나누어서 배열을 만들고 그것을 매개변수로 사용
			// insert,id,암호,암호확인,이메일,이름 : 갯수 6인 배열
			// insert,k1,1,1,k1@k.com,길동
				insert(command.split(","));
			else if (command.startsWith("update"))
				update(command.split(","));
			else if (command.startsWith("delete"))
				delete(command.split(","));
			else if (command.startsWith("select")) 
				select(command.split(","));
			else if (command.equals("list"))
				list();
			else help();
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
	
	private static void delete(String[] str) {
		if (str.length != 2) {
			help();
			return; // 메서드 종료
		}
		
//		Customer customer = cs.delete(str[1]);
//		if (customer == null) System.out.println("정보를 지울 수 없습니다.");
//		else System.out.println("성공적으로 정보를 지웠습니다.");
		
		int result = cs.delete(str[1]);
		if (result > 0) System.out.println("삭제 성공 ㅋㅋ");
	}

	private static void update(String[] str) {
		if (str.length != 6) {
			help();
			return; // 메서드 종료
		}
		Customer customer = new Customer(str[1],str[2], str[4],str[5],new Date());
		
		if (!str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		int result = cs.update(customer); // result는 성공 여부 체크(1은 성공, 0은 실패)
		if (result > 0) System.out.println("수정 성공 !! 대박");
	}

	private static void list() {
		Collection<Customer> list = cs.list();
		if (list == null || list.size() == 0)
			System.out.println("데이터가 없습니다.");
		else
			for (Customer customer : list) {
				System.out.println(customer);
			}
	}
	
	
	private static void select(String[] str) {
		if (str.length != 2) {// select,id
			help();
			return; // 메서드 종료
		}
		// id가 일치하는 고객 데이터를 읽어서 고객 객체를 생성하고 저장
		Customer customer = cs.select(str[1]);
		if (customer == null) System.out.println("없는 고객입니다");
		else System.out.println(customer);
	}
	
	
	private static void insert(String[] str) {
		if (str.length != 6) {
			help();
			return; // 메서드 종료
		}
		Customer customer = new Customer(str[1],str[2], str[4],str[5],new Date());
		
		if (!str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		// CustomerServiceImpl 객체의 insert()를 실행하고 그 결과를 result에 저장
		int result = cs.insert(customer);
		if (result > 0) System.out.println("고객 등록 성공 ㅋㅋ");
	}
	
	
	private static void help() {
		System.out.println("잘못된 명령어 입니다");
		System.out.println("다음 명령어에서 선택 하세요");
		System.out.println("insert,id,암호,암호확인,이메일,이름");
		System.out.println("update,id,암호,암호확인,이메일,이름");
		System.out.println("select,id");
		System.out.println("delete,id");
		System.out.println("list");
		System.out.println("exit");
	}
}