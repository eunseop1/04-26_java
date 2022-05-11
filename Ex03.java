/*
게시판 페이징
A씨는 게시판 프로그램을 작성하고 있다.
A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 
총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
*/
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(getTotalPage(0, 1));
		System.out.println(getTotalPage(1, 1));
		System.out.println(getTotalPage(2, 1));
		System.out.println(getTotalPage(1, 10));
		System.out.println(getTotalPage(10, 10));
		System.out.println(getTotalPage(11, 10));
	}
	public static int getTotalPage(int m, int n) {
		return (m-1)/n + 1;
		/*
		int rsult = 0;
		if(m%n==0){
			
		}
		*/
	}
}
