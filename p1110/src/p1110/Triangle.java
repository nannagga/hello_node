package p1110;

public class Triangle extends Shape {
	
	Point[] p;//배열 3개 꼭지점
	
	Triangle(){}//기본생성자
	
	Triangle(Point[] p){//매개변수 1개 받는 생성자
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3){
		Point[] p = {p1, p2, p3};//배열에 값 넣기
//		Point[] p = new Point[] {p1, p2, p3};//배열에 값 넣기
//		Point[] p = new Point[3];//배열에 값 넣기
//		p[0] = p1; 
//		p[1] = p2;
//		p[2] = p3;
		
		
		this.p = p;
	}

}
