package IOStream;

	import java.io.DataOutputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	import IOStream.Student; 

	public class StudentRecordOutput {
		DataOutputStream dataOutput;
		
		public StudentRecordOutput(String outputFile) throws IOException {
			
			dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
		}
		
		public void writer(Student student) throws IOException {
			dataOutput.writeUTF(student.getName());
			dataOutput.writeBoolean(student.getGender());
			dataOutput.writeInt(student.getAge());
			dataOutput.writeFloat(student.getGrade());
		}
		
		public void save() throws IOException {
			dataOutput.close();
		}
		
		
		public static void main(String[] args) {
//			if(args.length < 1) {
//				System.out.println("Please provide output file");
//				System.exit(0);
//			}
			
			//String outputfile = args[0];
			String outputfile = "C:\\Users\\SHALU\\eclipse-workspace1\\wileyjava\\Book2.txt";
			
			List<Student> listStudent = new ArrayList<>(); 
			
			listStudent.add(new Student("Shalu", true, 28, 90.1f));
			listStudent.add(new Student("Shreya", true, 21, 81.5f));
			listStudent.add(new Student("Swati", true, 18, 91.1f));
			listStudent.add(new Student("Rishav", false, 19, 95.1f));
			
			try {
				StudentRecordOutput outputWriter = new StudentRecordOutput(outputfile);
				
				for(Student student: listStudent) {
					outputWriter.writer(student);
				}
				
				outputWriter.save();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}


