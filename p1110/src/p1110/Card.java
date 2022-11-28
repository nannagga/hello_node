package p1110;

public class Card {
	String kind; // Heart, Spade, Clover, Diamond
	String number;// 숫자 1~10 J, Q, K

	Card() {
		this("Heart", "1");
	}

	Card(String kind, String number) {
		this.kind = kind;
		this.number = number;

	}

}
