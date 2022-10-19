package javaPackage;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println("Number or rows:" +a.length);
		System.out.println("Number or columns:" +a[0].length);
		
		
		/*
		 * for (int i=0;i<a.length;i++) { for (int j=0;j<a[i].length;j++) {
		 * System.out.println("Number is:" +a[i][j]);
		 * 
		 * } }
		 */
		
		for (int r[]:a)
		{
			for (int i:r)
			{
				System.out.println("Number is:" +i);
			}
		}
		}

	

}
