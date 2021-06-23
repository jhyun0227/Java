package customer;

import java.util.*;
import java.util.Scanner;

public class Ex01 {
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			help();
			String command = sc.nextLine();
			if (command.equals("6")) {
				break;
			} else if (command.equals("1")) {
				insert();
			} else if (command.equals("2")) {
				update();
			} else if (command.equals("3")) {
				select();
			} else if (command.equals("4")) {
				delete();
			} else if (command.equals("5")) {
				list();
			}
		}
		sc.close();
		System.out.println("���α׷� ����");
	}

	private static void delete() {
		System.out.println("���� �� id�� �Է��ϼ���.");
		String id = sc.nextLine();
		int result = cs.delete(id);
		if (result > 0) {
			System.out.println("������ ���� ����");
		} else {
			System.out.println("������ ���� ����");
		}
	}

	private static void update() {
		System.out.println("������ id�� �Է��ϼ���.");
		String id = sc.nextLine();
		System.out.println("email�� �Է��ϼ���.");
		String email = sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println("��ȣ�� �Է��ϼ���.");
		String pass = sc.nextLine();
		System.out.println("��ȣȮ���� �Է��ϼ���.");
		String confirmPass = sc.nextLine();
		Customer customer = new Customer(id, pass, email, name);
		if (!(pass.equals(confirmPass))) {
			System.out.println("��ȣ�� ��ȣȮ���� �ٸ��ϴ�.");
			return;
		}
		int result = cs.update(customer);
		if (result > 0) {
			System.out.println("������ ���� ����");
		} else {
			System.out.println("������ ���� ����");
		}
	}

	private static void list() {
		List<Customer> list = cs.list();
		if (list == null || list.size() == 0) {
			System.out.println("�����Ͱ� �����ϴ�.");
		} else {
			for (Customer customer : list) {
				System.out.println(customer);
			}
		}
	}

	private static void select() {
		System.out.println("��ȸ�� id�� �Է��ϼ���.");
		String id = sc.nextLine();
		Customer customer = cs.select(id);
		if (customer == null) {
			System.out.println("���� ������ �Դϴ�.");
		} else {
			System.out.println(customer);
		}
	}

	private static void insert() {
		System.out.println("id�� �Է��ϼ���.");
		String id = sc.nextLine();
		System.out.println("email�� �Է��ϼ���.");
		String email = sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println("��ȣ�� �Է��ϼ���.");
		String pass = sc.nextLine();
		System.out.println("��ȣȮ���� �Է��ϼ���.");
		String confirmPass = sc.nextLine();
		Customer customer = new Customer(id, pass, email, name);
		if (!(pass.equals(confirmPass))) {
			System.out.println("��ȣ�� ��ȣȮ���� �ٸ��ϴ�.");
			return;
		}
		int result = cs.insert(customer);
		if (result > 0) {
			System.out.println("������ �Է� ����");
		} else {
			System.out.println("������ �Է� ����");
		}
	}

	private static void help() {
		System.out.println("���� ��ɾ� �߿��� �����Ͻÿ�.");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("5. ���");
		System.out.println("6. ����");
		System.out.println("��ɹ�ȣ");
	}
}
