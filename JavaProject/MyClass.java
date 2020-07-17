import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Javaaaaa.....");
		Scanner sc=new Scanner(System.in);
		
		String s,s2,s3;
		s=sc.nextLine();
		s2=sc.nextLine();
		System.out.println(s);
		s=s.concat(s2);
		System.out.println(s);
	}

}
