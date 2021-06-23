package customer;

import java.util.Collection;

// Ex01로 부터 전달받은 명령어를 분석해서 처리할 내용을 Dao에게 시키고 결과를 EX01전달
public class CustomerServiceImpl {
	private static CustomerDaoImpl cd = new CustomerDaoImpl();
	
	public int insert(Customer customer) {
		int result = 0;  // 0은 실패, 1은 성공
		// map에서 입력한 id로 데이터를 읽어서 있으면 이미 있는 아이디 입니다
		// 없으면 데이터를 map에 목적
		Customer ct = cd.select(customer.getId());
		if (ct == null) result = cd.insert(customer);
		else System.out.println("이미 있는 아이디니 다른 것을 사용하세요");
		return result;
	}
	
	
	public Customer select(String id) { // string보다는 id쓰는 것이 가독성이 높다
		return cd.select(id);
	}
	
	
	public Collection<Customer> list() {
		return cd.list();
	}


	public int update(Customer customer) {
		int result = 0;
		Customer ct = cd.select(customer.getId());
		if (ct == null) System.out.println("없는 데이터를 우찌 수정하니"); // result = 0
		else result = cd.update(customer); // 성공하면 1 실패하면 0
		return result;
	}


	public int delete(String id) {
//		return cd.delete(id);
		
		int result = 0;
		Customer ct = cd.select(id);
		if (ct == null) System.out.println("없는데 삭제 못하지");
		else result = cd.delete(id);
		return result;	
	}	
}