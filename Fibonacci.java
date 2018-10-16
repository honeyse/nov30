import java.util.Scanner;

public class Fibonacci {
	
	//output : 0 1 1 2 3 5 8 13
	int n,s1=0,s2=1,s3;
	void input(){
		System.out.println("Enter the sequence");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		
	}

	void fibseries(int n){
		
		if(n>0){
			s3=s1+s2;
			s1=s2;
			s2=s3;
			System.out.print(s3+" ");
			fibseries(n-1);
		}
		
	}
	
	public static void main(String args[]) {
		Fibonacci f = new Fibonacci();
		 f.input();
		System.out.print(f.s1+" "+f.s2+" ");
		f.fibseries(f.n);
	}
}
