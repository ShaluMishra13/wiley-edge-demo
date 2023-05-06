package week3_assingment;

	public class Student {
	    private int id;
	    private String name;
	    private int problem_solved;
	    private String grade;

	    public Student(int id, String name, int problem_solved, String grade) {
	        this.id = id;
	        this.name = name;
	        this.problem_solved = problem_solved;
	        this.grade = grade;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getProblem_solved() {
	        return problem_solved;
	    }

	    public String getGrade() {
	        return grade;
	    }
}