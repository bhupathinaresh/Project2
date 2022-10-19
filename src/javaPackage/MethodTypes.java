package javaPackage;

public class MethodTypes {
	int x=10;
	int y=20;
	
	/*
	 * public void sum () { System.out.println(x+y); } //Case1
	 */
	
	/*
	 * public int sum () //case2 { return(x+y); }
	 */
	
	/*
	 * public void sum(int a, int b) //Case3 { System.out.println(a+b); }
	 */
	
	 public int sum(int a, int b)
	 {
		 return (a+b);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MethodTypes cal=new MethodTypes();
	/*
	 * //cal.sum(); int s= cal.sum();
	 * 
	 * System.out.println(s);
	 */
	int c= cal.sum(200,300);
	System.out.println(c);
	
	}

}
