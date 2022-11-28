package p1110_02;

import java.util.Scanner;

public class StuCal {//계산과 화면출력
	//변수선언
	Scanner scan = new Scanner(System.in);
	Student[] s = new Student[10];//객체 배열 선언
	String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int rank;
	int choice;
	int count;
	double avg;
	
	int screen_print() {
		System.out.println("[성적처리프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("--------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		choice = scan.nextInt();
		return choice;
	}
	
	void score_input() {
		System.out.println("[성적입력]");
		System.out.println((count+1)+"번째 이름을 입력하세요.(0.이전페이지 이동)");
		name = scan.next();
		if(name.equals("0")) {
			System.out.println("이전화면으로 이동합니다.!");
			return;
		}
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		s[count] = new Student(name, kor, eng, math);
		count++;
		System.out.printf("%d명 성적입력이 완료되었습니다.", count);
	}
	
	void score_print() {
		System.out.println("[성적출력]");
		System.out.println("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t 등수");
		
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", 
				s[0].name, s[0].kor, s[0].eng, s[0].math, s[0].total, s[0].avg, s[0].rank );
	}
	
	void score_modify() {
		
	}
	
	void score_rank() {
		
	}
	
}
