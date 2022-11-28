package p1110;

import java.util.Scanner;

public class J1110_03_학생성적처리메소드 {

	public static void main(String[] args) {
		// 변수선언
		StuCal stuCal = new StuCal();
		int choice = 0;

		loop:
		while (true) {
			// 1. 화면출력
			choice = stuCal.screen_print();
			
			switch(choice) {
			case 1: 
				stuCal.score_input();
				break;
				
			case 2:
				stuCal.score_print();
				
				break;
				
			case 3:
				stuCal.score_modify();
				break;
				
			case 4:
				stuCal.score_rank();
				break;
				
			case 0:
				System.out.println("성적처리 프로그램을 종료합니다.");
				break loop;
			}//switch
			
		}//while

	}//main

}//class
