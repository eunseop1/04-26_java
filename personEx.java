package kr.human.mavenEx;

public class personEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			person kimc = new person("한사람",27,true);
			person leec = kimc;
			
			System.out.println(kimc);
			System.out.println(leec);
			
			//내용이 복사되는게 아니라 -> 주소가 복사되는 얕은 복사
			leec.setName("이순신");
			
			//김씨도 바뀐다. 객체는 1개이고 두 변수가 같은 객체를 가리킨다
			System.out.println(kimc);
			System.out.println(leec);
			
			// 깊은복사 : 값을 복사해준다.
			//값을 복사하는 깊은 복사가 필요
			person parkc = new person();
			parkc.setName(leec.getName());
			parkc.setAge(leec.getAge());
			parkc.setGender(leec.isGender());
			
			System.out.println(leec);
			System.out.println(parkc);
			
			//1개만 바뀐다 -> 다른객체라는 뜻
			parkc.setName("박문수");
			System.out.println(leec);
			System.out.println(parkc);
			
			person sonc = new person(kimc);
			System.out.println(kimc);
			System.out.println(sonc);
			
			//복사 생성자를 이용한 깊은 복사
			sonc.setName("손흥민");
			System.out.println(kimc);
			System.out.println(sonc);
			
			
	}

}
