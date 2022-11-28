package p1110;

public class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];// 객체 배열 선언 카드 개수 52개

	Deck() {
		// 카드 입력
//		for (int i = 0; i < 4; i++) {
//			
//			for (int j = 1; j < 14; j++) {
//				c[i].kind = i + "";
//				c[j].number = i + 1 + "";
//			}
//		}

		for (int i = 0; i < c.length; i++) {// 1~10까지 숫자로 J, Q, K로 입력
			c[i] = new Card();// 객체선언

			if (i % 13 == 10) {
				c[i].number = "J";
			} else if (i % 13 == 11) {
				c[i].number = "Q";
			} else if (i % 13 == 12) {
				c[i].number = "K";
			} else {
				c[i].number = ((i % 13) + 1) + "";
			} // if

			if ((i / 13) == 0) {
				c[i].kind = "Spade";
			} else if ((i / 13) == 1) {
				c[i].kind = "Diamond";
			} else if ((i / 13) == 2) {
				c[i].kind = "Heart";
			} else {
				c[i].kind = "Clover";
			}
		} // for
	}// deck()

	// 카드 1개 뽑는 메소드
	Card pick(int index) {

		return c[index%52];
	}

	// 카드 섞는 메소드
	void shuffle() {
		Card temp = null;
		int r_num = 0;
		for (int i = 0; i < 2000; i++) {
			r_num = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[r_num];
			c[r_num] = temp;
		}

	}// shuffle

}// class
