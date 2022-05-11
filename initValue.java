package kr.human.mavenEx;

import java.util.Arrays;
import java.util.Random;

import lombok.Data;
@Data
public class initValue {
	/*
	// 두개의 변수를 난수로 초기화해야 한다라고 가정하면
	//선언시 초기화
	private int[] instanceData = {1,2,3,4,5};
	private static int[] staticData = {11,22,33,44,55};
	
	*/
	private int[] instanceData = new int[10];
	private static int[] staticData = new int[10];
	
	/*
	초기화블록 -> 초기화 g과정이 복잡할경우에는 사용
	두개의 변수를 난수로 초기화 해야 한다고 가정하면 인스턴스 블록이 편하다

	인스턴스 초기화 블록: 인스턴스 변수를 초기화 할때 사용한다 
	-> 하지만 생성자에서도 초기화 가능해서 잘 안쓰임
	*/
	{
		Random random = new Random();
		System.out.println("인스턴스 초기화 블록!");
		for(int i=0; i<instanceData.length; i++) {
			instanceData[i] = random.nextInt(101);
		}
	}
	//정적 초기화 블록
	static {
		Random random = new Random();
		System.out.println("정적 초기화 블록!");
		for(int i=0; i<staticData.length; i++) {
			staticData[i] = random.nextInt(101);
		}
	}
	
	public initValue() {
		System.out.println("생성자 호출!!");
	}
	public static void viewStaticMember() {
		System.out.println(Arrays.toString(staticData));
	}
}
