package stringClasses;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("Wiley");
		StringBuffer sb1=new StringBuffer("Wiley");
		System.out.println(sb1.equals(sb));
		String ss="Wiley";
		System.out.println(ss.equals(sb));
		System.out.println(ss.equals(sb.toString()));//changing string to the same type so true;
		sb.append("Edge");
		System.out.println(sb);
		sb.insert(4,"lll");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(5,8));
		
		StringBuffer st=new StringBuffer();
		String sender="Shalu";
		String message="hey there!";
		st.append(sender);
		st.append(":");
		st.append(message);
		st.append("\n");
		sender="venkat";
		message="hey there!";
		
		st.append(sender);
		st.append(":");
		st.append(message);
		
		System.out.println(st);
		
		
		

	}

}
