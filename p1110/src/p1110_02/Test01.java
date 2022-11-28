package p1110_02;

public class Test01 {
	public static void main(String[] args) {

		StuCal s = new StuCal();
		int choice = 0;

		loop:
		while (true) {
			// 화면출력
			choice = s.screen_print();

			switch (choice) {
			case 1:
			
				s.score_input();
				break;

			case 2:
				s.score_print();
				break;

			case 3:
				s.score_modify();
				
				break;

			case 4:
				s.score_rank();
				break;

			case 0:
				System.out.println("성적처리프로그램을 종료합니다.");
				break loop;
				
			}//switch

		}//while

	}//main
}//class
