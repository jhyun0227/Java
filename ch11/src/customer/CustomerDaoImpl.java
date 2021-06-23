package customer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// 전달받은 명령을 실행(map(DB)에 저장, 수정, 삭제, 읽고
public class CustomerDaoImpl {  // DAO Data Access Object
	private Map<String, Customer> map = new HashMap<>(); // key는 id, 값 고객정보
	
	public Customer select(String id) {
		return map.get(id);  // get(Key) : 결과는 값 customer 객체
	}
	
	
	public int insert(Customer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}
	
	
	public Collection<Customer> list() {
		// 키가 필요할때에는 map.keys();
		return map.values();
	}


	public int update(Customer customer) {
		map.put(customer.getId(), customer); // map인터페이스는 key가 같으면 덮어 씌운다.
		return 1;
	}


	public int delete(String id) {
// 		return map.remove(id)		
		
		map.remove(id);
		return 1;
	}
}