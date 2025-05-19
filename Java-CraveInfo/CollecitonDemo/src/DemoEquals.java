
public class DemoEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Account a1 = new Account(2,"abc",50);
	
	     Account a2 = new Account(2,"xyz",50);
	     
	    System.out.println(a1.hashCode());
	    System.out.println(a2.hashCode());
	
	    System.out.println(a1.equals(a2));
	     
		/*
		 * String s1 = new String("abc"); String s2 = new String("abc");
		 * 
		 * System.out.println(s1.equals(s2)); System.out.println(s1.hashCode());
		 * System.out.println(s2.hashCode());
		 */
	   //  System.out.println(s1==s2);
	     
	     
	     
	     
	
	}

}
