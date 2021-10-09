//Name: Pallavi Saroj Jaiswa1
//CWID: 10478910


public class Complexity {
	private static int c = 0;

	//O(n^2)
	public static void method1(int n) {
		int c =0;
		if(n>0) {
		for (int i=0; i<n; i++)
		{	for(int j =0;j<n;j++) {		
			c++;
			System.out.println("Operation of method1: "+c); 
			
			}
		}
		System.out.println("Total no of operation in method1: "+c); 
		}
		else {
			System.out.println("The input parameter cannot be negative");
		}
	}

	//O(n^3)
	public static void method2(int n) {
		int c =0;
		if(n>0) {
		for (int i=0; i<n; i++)
		{	for(int j =0;j<n;j++) {	
			for(int k=0; k<n;k++) {
			c++;
			System.out.println("Operation of method2: "+c); 
			
			}
		}
		}
		System.out.println("Total no of operation in method2: "+c); 
		}
		else {
			System.out.println("The input parameter cannot be negative");
		}
		
		
	}
	
	//Log is base 2 - O(log(n))
	public static void method3(int n) {
		int c =0;
		if(n>0) {
			for(int i=n;i>=1;i = i/2) {
				c++;
				System.out.println("Operation of method3: "+c); 
				
			}
			System.out.println("Total no of operation in method3: "+c); 
			
		}
		
		else {
			System.out.println("The input parameter cannot be negative");
		}
		
	}
	//Log is base 2 - O(n(log(n)))
	public static void method4(int n) {
		int c =0;
		if(n>0) {
			for(int j =0;j<n;j++) {
			for(int i=n;i>=1;i/=2) {
				c++;
				System.out.println("Operation of method4: "+c); 
				
			}
			
		}
			System.out.println("Total no of operation in method4: "+c); 	
		}
		
		else {
			System.out.println("The input parameter cannot be negative");
		}
		
		
		
	}
	
	//Log is base 2 - O(log(log(n)))
	public static void method5(int n) {
		
		int c =0;
		if(n>0) {
			for(int i=2;i<n;i=(int)Math.pow(2,i)) {
				c++;
			System.out.println("Operation of method5: "+c); 
			}
			
			System.out.println("Total no of operation in method5: "+c); 
			
		}	
		else {
			System.out.println("The input parameter cannot be negative");
		}
		
	}
	
	//Log is base 2 - O(2^n)
	public static int method6(int n) {
		//int c =0;
		if(n>0) {
			c++;
			System.out.println("Operation of method6: "+c); 
			if(n<=1) {
				return n;	
			}
			return method6(n-1)+method6(n-1);
			
		}	
		else {
					
			System.out.println("The input parameter cannot be negative");
			return -1;
	}
		
	}
	

//Main method used to test the code
public static void main(String[] args) {
	int n = 10;
	
	Complexity.method1(n);
	Complexity.method2(n);
	Complexity.method3(n);
	Complexity.method4(n);	
	Complexity.method5(n);
	System.out.println(Complexity.method6(n));	
	System.out.println("Total no of operation in method6: "+c); 
}



}












