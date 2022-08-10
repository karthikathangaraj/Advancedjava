package sample;


abstract class demo2  implements demo1
{
	abstract void aa1();
	void b1()
	{
		
	}
	
}

public class demo implements demo1 {

	public static void main(String[] args) {
		
		pojo p1=new pojo(101,"karthika","csc");
		System.out.println(p1.getId());
		p1.setName("karthika thagaraj");
		System.out.println(p1.getName());

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	

}
