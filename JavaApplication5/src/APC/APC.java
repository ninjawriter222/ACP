package APC;

class BobView 
{ 
	public void display() 
	{ 
		System.out.println("Bob View"); 
	} 
} 

class BortView 
{ 
	public void display() 
	{ 
		System.out.println("Bort View"); 
	} 
} 

class Dispatching 
{ 
	private BortView BortView; 
	private BobView BobView; 
	
	public Dispatching() 
	{ 
		BortView = new BortView(); 
		BobView = new BobView(); 
	} 

	public void dispatch(String request) 
	{ 
		if(request.equalsIgnoreCase("The Better One")) 
		{ 
			BortView.display(); 
		} 
		else
		{ 
			BobView.display(); 
		}	 
	} 
} 

class APC
{ 
	public static void main(String[] args) 
	{ 
		FrontController frontController = new FrontController(); 
		frontController.dispatchRequest("Bob"); 
		frontController.dispatchRequest("Bort"); 
	} 
} 
