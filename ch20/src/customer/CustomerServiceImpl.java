package customer;

import java.util.List;

public class CustomerServiceImpl {
	private CustomerDaoImpl cd = new CustomerDaoImpl();

	public int insert(Customer customer) { // customer 입력한 데이터
		int result = 0;
		Customer ct = cd.select(customer.getId()); // ct 조회한 데이터
		if (ct == null) {
			result = cd.insert(customer);
		} else {
			System.out.println("이미 있는 데이터 입니다.");
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
		Customer ct = cd.select(customer.getId()); // ct 조회한 데이터
		if (ct == null) {
			System.out.println("없는 데이터는 수정 할 수 없습니다.");
		} else {
			result = cd.update(customer);
		}
		return result;
	}

	public int delete(String id) {
		int result = 0;
		Customer ct = cd.select(id); // ct 조회한 데이터
		if (ct == null) {
			System.out.println("없는 데이터는 삭제 할 수 없습니다.");
		} else {
			result = cd.delete(id);
		}
		return result;
	}
}
