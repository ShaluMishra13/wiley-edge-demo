package stringClasses;

public class StringBuilderClass {	
		public static void main(String args[]) {
			StringBuilder logmessage=new StringBuilder();
			long timestamp=System.currentTimeMillis();
			logmessage.append("[").append(timestamp).append("]");
			int userId=123456;
			logmessage.append("user ").append(userId).append(":");
		String message="Login Successfully";
		logmessage.append(message);
		System.out.println(logmessage);
		
		}
}
