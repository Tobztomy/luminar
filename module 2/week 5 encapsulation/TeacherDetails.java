package encapsulation;

class Teacher {
	private int teacherId;
	private String teacherName;
	private float teacherSalary;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public float getTeacherSalary() {
		return teacherSalary;
	}

	public void setTeacherSalary(float teacherSalary) {
		this.teacherSalary = teacherSalary;
	}

	@Override
	public String toString() {
		return teacherId + " " + teacherName + " " + teacherSalary;
	}
}

public class TeacherDetails {

	public static void main(String[] args) {
		Teacher teacher =new Teacher();
		teacher.setTeacherId(15);
		teacher.setTeacherName("manu");
		teacher.setTeacherSalary(256.25f);
		System.out.println(teacher.getTeacherId()+" "+teacher.getTeacherName()+" "+teacher.getTeacherSalary());
		System.out.println(teacher);
	}

}
