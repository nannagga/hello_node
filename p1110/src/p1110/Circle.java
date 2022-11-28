package p1110;

public class Circle extends Shape {
	Point p;// 원점
	int r;// 반지름

	Circle() {
		this.r = 100;		
	}// 기본 생성자

	Circle(Point p, int r) {// 생성자 매개변수 2개
		this.p = p;
		this.r = r;
	}

}
