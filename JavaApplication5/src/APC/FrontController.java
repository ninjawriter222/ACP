/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APC;

/**
 *
 * @author Poozer
 */
public class FrontController {
    private Dispatching Dispatching; 

	public FrontController() 
	{ 
		Dispatching = new Dispatching(); 
	} 

	private boolean isAuthenticUser() 
	{ 
		System.out.println("Authentication successfull."); 
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
