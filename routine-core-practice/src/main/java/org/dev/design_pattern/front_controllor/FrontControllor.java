package org.dev.design_pattern.front_controllor;

public class FrontControllor {
	
	private Dispatcher dispatcher;

	public FrontControllor() {
		dispatcher=new Dispatcher();
	}
	
	private boolean isAuthenticUser(){
		System.out.println("User is authenticated successfully.");
		return true;
	}

	private void trackRequest(String request){
		System.out.println("Page requested: " + request);
	}
	public void dispatchRequest(String request){
		trackRequest(request);
		
		if(isAuthenticUser()){
			dispatcher.dispatch(request);
		}
	}

}
