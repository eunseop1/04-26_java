package kr.human.mavenEx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
//기본, 인수 생성자외에는 모두 포함하는게 @Data
public class person {
	private String name;
	private int age;
	private boolean gender;
	
	//복사 생성자 : 생성자인데 자신의 타입을 받는 생성자 => 깊은 복사
	public person(person person) {
		this.name = person.getName();
		this.age = person.getAge();
		this.gender = person.isGender();
	}
}
