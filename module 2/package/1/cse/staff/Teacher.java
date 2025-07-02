package college.cse.staff;

public class Teacher {
	int teacherId;
	String teacherName;

	public Teacher(int teacherId, String teacherName) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
	}

	public void display() {
		System.out.println(teacherId + " " + teacherName);

	}

}
