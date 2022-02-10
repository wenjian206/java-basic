package consdemo;

public class Student {
	int studentId;
	String studentName;
	int marks;
	int grade;
	
	//default constructor	
	public Student(){
		studentId = 1;
		studentName ="Mike";
		marks= -1;
		grade= -1;
	}

	//paramatrized constructor
	public Student(int studentId, String studentName, int marks, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}
	
	public Student(int studentId, String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void printStudentDetails() {
		System.out.println("Sutdent ID: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student marks: "+marks);
		System.out.println("Student grade: "+grade);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("---------Print the detail about student1------");
		s1.printStudentDetails();
		
		Student s2 = new Student(2,"Nick",10,100);
		System.out.println("---------Print the detail about student2------");
		s2.printStudentDetails();
		
		Student s3 = new Student(3,"Judy");
		System.out.println("---------Print the detail about student3------");
		s3.printStudentDetails();
	}


}
