package p1110;

import java.util.Scanner;

public class J1110_02_카드 {

	public static void main(String[] args) {
		// Deck객체 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		Deck d = new Deck();
//		d.shuffle();//카드 섞기
		loop:
		while(true) {
			System.out.println("[포커 카드게임]");
			System.out.println("1. 카드섞기");
			System.out.println("2. 카드 1장 받기");
			System.out.println("3. 카드 5장 받기");
			System.out.println("4. 내 카드 보기");
			System.out.println("9. 게임리셋");   
			System.out.println("10.  완전 게임 종료");
			System.out.println("--------------------");
			System.out.println("원하는 변호를 선택하세요.>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				d.shuffle();
				System.out.println("카드를 섞었습니다.");
				break;
				
			case 2:
				System.out.println("카드를 뽑으세요.(0~51)");
				choice = scan.nextInt(); 
				Card c = d.pick(choice);//내가 뽑은 카드
				
				System.out.printf("%s %s 카드를 받았습니다.\n", c.kind, c.number); 
				break;
				
			case 3:
				System.out.println("카드 5장을 받았습니다.");
				break;
				
			case 4:
				System.out.println("카드게임을 리셋합니다.");
				break;
			}
			
			
		}
		
//		System.out.println("원하는 카드를 뽑아주세요.>>(0~51)");
//		int choice = scan.nextInt();
//		
//		Card c = d.pick(choice);
//		System.out.printf("%s %s", c.kind, c.number);
//		
//		
//
//		for (int i = 0; i < d.c.length; i++) {
//			System.out.printf("%s %s\n", d.c[i].kind, d.c[i].number);
//		}
	}

}
