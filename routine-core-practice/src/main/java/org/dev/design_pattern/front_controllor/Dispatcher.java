package org.dev.design_pattern.front_controllor;

public class Dispatcher {
	
	private HomeView homeView;
	private StudentView studentView;

	public Dispatcher() {
		homeView=new HomeView();
		studentView=new StudentView();
	}
	public void dispatch(String request){
		if(request.equals("HOME")){
			homeView.show();
		}
		else if(request.equals("STUDENT")){
			studentView.show();
		}
	}

}
