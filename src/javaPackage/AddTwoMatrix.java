package javaPackage;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m,n,c,d;
		int first[][]= {{1,2},{3,4},{5,6}};
		int second[][]= {{6,2},{6,4},{4,6}};
		m=first.length;
		n=first[0].length;
		int sum[][]=new int[m][n];
		System.out.println("Sum of 2 matrices is:");
		for (c=0;c<m;c++)
		{
			for (d=0;d<n;d++)
			{
				sum[c][d]=first[c][d]+second[c][d];
				System.out.println(sum[c][d]);
			}
		}

	}

}
