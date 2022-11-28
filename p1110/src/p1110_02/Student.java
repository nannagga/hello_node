package p1110_02;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int rank;
	double avg;
	
	Student(){}
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}
	
}
