package SpringDemobean.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class samsung {
	@Autowired
	private mobile m11;

	public mobile getM11() {
		return m11;
	}

	public void setM11(mobile m11) {
		this.m11 = m11;
	}
	
   public void display()
   {
	   System.out.print("hi this is samsung" +m11);
   }
}
