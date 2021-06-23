package customer;

import java.util.List;

public class CustomerServiceImpl {
	private CustomerDaoImpl cd = new CustomerDaoImpl();

	public int insert(Customer customer) { // customer �Է��� ������
		int result = 0;
		Customer ct = cd.select(customer.getId()); // ct ��ȸ�� ������
		if (ct == null) {
			result = cd.insert(customer);
		} else {
			System.out.println("�̹� �ִ� ������ �Դϴ�.");
		}
		return result;
	}

	public Customer select(String id) {
		return cd.select(id);
	}

	public List<Customer> list() {
		return cd.list();
	}

	public int update(Customer customer) {
		int result = 0;
		Customer ct = cd.select(customer.getId()); // ct ��ȸ�� ������
		if (ct == null) {
			System.out.println("���� �����ʹ� ���� �� �� �����ϴ�.");
		} else {
			result = cd.update(customer);
		}
		return result;
	}

	public int delete(String id) {
		int result = 0;
		Customer ct = cd.select(id); // ct ��ȸ�� ������
		if (ct == null) {
			System.out.println("���� �����ʹ� ���� �� �� �����ϴ�.");
		} else {
			result = cd.delete(id);
		}
		return result;
	}
}
