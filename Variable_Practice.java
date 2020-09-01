package a_variable;

import java.util.Scanner;

public class Variable_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		//자신의 이름을 저장할 변수를  선언해 주세요.
		 String myName;
		 
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아 주세요.
		 System.out.println("이름을 입력해 주세요> ");
		 myName = sc.nextLine();
		 
		 // 자신의 나이를 저장할 변수를 선언해주세요.
		 int age;
		 
		 //위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아 주세요.
		 System.out.println("나이를 입력해 주세요>");
		 age = Integer.parseInt(sc.nextLine());
		 
		 //위에서 입력받은 이름과 나이를 출력해 주세요.
		 System.out.println("이름은 " + myName + " 이며\n" + "나이는 " +age + "세 입니다.");
//		 System.out.println("당신의 나이는 " + age + "세 입니다.");
		 
		
		 
	}

}
