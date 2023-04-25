package IOStream;

public class StudentClass {
	private String name;
	private boolean gender;
	private int age;
	private float grade;

	public StudentClass(String name, boolean gender, int age, float grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
