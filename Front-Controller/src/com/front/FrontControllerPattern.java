package com.front;
class TrainerView
{
	public void display()
	{
		System.out.println("hi trainer");
	}
}
class AssociateView
{
	public void display()
	{
		System.out.println("hi Team");
	}
}
class Dispatching 
{
	private TrainerView tv;
	private AssociateView As;
	
	public Dispatching()
	{
		
		TrainerView tv=new TrainerView();
		AssociateView as1=new AssociateView();
		 
	}
	public void dispatch(String req)
	{
		if(req.equalsIgnoreCase("associate"))
		{
		    As.display();
		}
		else
		{
			tv.display();
		}
	}
}
class FrontController 
{
	 private Dispatching Dispatching;
	 public FrontController()
	    {
	        Dispatching = new Dispatching();
	    }
	 private boolean isAuthenticUser()
	    {
	        System.out.println("Authentication successful.");
	        return true;
	    }
	 private void trackRequest(String request)
	    {
	        System.out.println("Requested View: " + request);
	    }
	 public void dispatchRequest(String request)
	    {
	        trackRequest(request);
	        
	        if(isAuthenticUser())
	        {
	            Dispatching.dispatch(request);
	        }    
	    }
	
}
public class FrontControllerPattern {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		 frontController.dispatchRequest("Trainersss");

	}

}
