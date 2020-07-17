interface Student{
	int id=11;
	int term1=50;
}
interface L4Student{
	int id=44;
	int thesis=60;
}

class Final implements Student,L4Student{
	int id;
	void show()
	{
		System.out.println(id+" "+term1+" "+thesis);
	}
}
public class Driver {
	public static void main(String[] args)
	{
		Final f=new Final();
		f.id=20;
		
		f.show();
	}
}
