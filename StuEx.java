package kr.human.mavenEx;

public class StuEx {
	public static void main(String[] args) {
		StudentVO vo1 = new StudentVO("22020211", "한사람", 78, 82, 54, 99);
		//System.out.println(vo1);
		
		StudentVO vo2 = new StudentVO("22020212", "두사람", 100, 82, 100, 99);
		//System.out.println(vo2);
		
		ClassVO classVO = new ClassVO(10);//공간확보
		classVO.addStudent(vo1);
		classVO.addStudent(vo2);
		classVO.addStudent("22020213", "세사람", 100, 100, 54, 99);
		
		System.out.println(classVO.getStudentVO("22020211"));
		//System.out.println(classVO.getStudentVO("22020219"));
		
		classVO.addStudent("22020214", "네사람", 100, 10, 40, 99);
		classVO.addStudent("22020215", "오사람", 50, 30, 54, 99);
		classVO.addStudent("22020216", "육사람", 100, 70, 4, 99);
		classVO.addStudent("22020217", "칠사람", 10, 70, 54, 99);
		classVO.addStudent("22020218", "팔사람", 20, 70, 54, 99);
		classVO.addStudent("22020219", "구사람", 100, 70, 54, 99);
		classVO.addStudent("22020220", "십사람", 100, 70, 54, 99);
		
		System.out.print(classVO);
		
	}
}
