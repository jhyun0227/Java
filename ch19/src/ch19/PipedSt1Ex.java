package ch19;
import java.util.ArrayList;
import java.util.List;
public class PipedSt1Ex {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("세정", 23, Member.FEMALE));
		list.add(new Member("원빈", 41, Member.MALE));
		list.add(new Member("하니", 31, Member.FEMALE));
		list.add(new Member("현빈", 27, Member.MALE));
		list.add(new Member("IU", 29, Member.FEMALE));
		
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균나이 : "+avg);
		avg = list.stream().filter(m->m.getGender()==Member.MALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("남자평균나이 : "+avg);
		avg = list.stream().filter(m->m.getGender()==Member.FEMALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.printf("여자평균나이 : %.2f",avg);
	}
}