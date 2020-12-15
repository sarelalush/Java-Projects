package FirstCode;

public class LabTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Sarel Alush", "316373851");
		Student s2 = new Student("Moshe Moshe", "316373851");
		Student s3 = new Student("Yosef Yosef", "316373851");
		LabClass l = new LabClass(3);
		l.enrollStudent(s1);
		l.enrollStudent(s2);
		l.enrollStudent(s3);
		l.setInstructor("Sarel :D");
		l.setRoom("1");
		l.setTime("20/10/2020 16:45");
		System.out.println("We have " + l.numberOfStudents() + " students in the Class");
		l.printList();
	}

}
