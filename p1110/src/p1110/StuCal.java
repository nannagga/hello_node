package p1110;

import java.util.Scanner;

public class StuCal {// 계산과 화면출력
	Scanner scan = new Scanner(System.in);
	Student[] s = new Student[10];// 인스턴스 변수
	String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	String name;
	String checkName;
	int kor, eng, math, total, rank;
	double avg;
	int count;
	int r_count;
	int checkNo;
	int flag;
	int choice;

	// 1.화면출력
	int screen_print() {

		System.out.println("[성적처리 프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("--------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		choice = scan.nextInt();

		return choice;
	}

	// 2.성적 입력 메소드
	void score_input() {
		System.out.println("[성적입력]");
		System.out.println();
		System.out.printf("%d번째 이름을 입력하세요.(0.이전페이지이동)\n", count + 1);
		name = scan.next();
		if (name.equals("0")) {
			System.out.println("이전페이지로 이동합니다.");
			System.out.println();
			return;
		}
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		//Student s배열에 -> Student 객체 선언
		s[count] = new Student(name, kor, eng, math);
		System.out.printf("%d명의 입력이 완료되었습니다.!!", count + 1);
		count++;
	}

	// 성적 출력 메소드
	void score_print() {
		System.out.println("[성적출력]");
		System.out.println("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t 등수");
		System.out.println("----------------------------------------------------");
		
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", 
					s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total, s[i].avg, s[i].rank);
		} // for

	}//score_println()

	// 성적 수정 메소드
	void score_modify() {
		System.out.println("[성적수정]");
		System.out.println("수정할 학생의 이름을 입력하세요");
		checkName = scan.next();
		for(int i = 0; i < count; i++) {
			if(checkName.equals(s[i].name)) {
				System.out.printf("%s의 학생이 검색되었습니다.!!\n", s[i].name);
				checkNo = i;
				flag = 1;
				break;
			}//if
		}//for
		
		if(flag == 0) {
			System.out.println("찾는 학생이 없습니다. 다시 검색해주세요.");
			return;
		}//if
		
		flag = 0;
		
		System.out.println("[성적수적]");
		System.out.println("1. 국어점수");
		System.out.println("2. 영어점수");
		System.out.println("3. 수학점수");
		System.out.println("0. 수정취소");
		System.out.println("원하는 번호를 선택하세요.!!(0.이전페이지로 이동)");
		choice = scan.nextInt();
		
		switch(choice) {
		case 0:
			System.out.println("성적수정이 취소되었습니다.");
			System.out.println();
			return;
			
		case 1:
			System.out.printf("현재 국어점수 : %d\n", s[checkNo].kor);
			System.out.println("수정할 국어점수 입력: ");
			s[checkNo].kor = scan.nextInt();
			
			break;
			
		case 2:
			System.out.printf("현재 영어점수 : %d\n", s[checkNo].eng);
			System.out.println("수정할 영어점수 입력: ");
			s[checkNo].eng = scan.nextInt();
			break;
			
		case 3:
			System.out.printf("현재 수학점수 : %d\n", s[checkNo].math);
			System.out.println("수정할 수학점수 입력: ");
			s[checkNo].math = scan.nextInt();
			break;
			
		}//switch
		
		s[checkNo].total = s[checkNo].kor + s[checkNo].eng + s[checkNo].math;
		s[checkNo].avg = s[checkNo].total/3.0;
		System.out.println("점수수정이 완료되었습니다.");
		System.out.println();
//		if(choice == 0) {
//			System.out.println("성적수정이 취소되었습니다.");
//			System.out.println();
//			return;
//		}
		
	}//score_modify

	// 등수 처리
	void score_rank() {
		System.out.println("[등수처리]");

		for(int i = 0; i < count; i++) {
			r_count = 1;
			for(int j = 0; j < r_count; j++) {
				if(s[i].total<s[j].total) {
					r_count ++;
				}
				s[i].rank = r_count;
			}
		}
		System.out.println("등수처리가 완료되었습니다.");
	}

}
