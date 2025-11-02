package Agreegation;

public class carApp {
public static void main(String[] args) {

	engine powerfullEngine = new engine();
	powerfullEngine.model = "v8";
	powerfullEngine.hoursePower = "480 H";
	
	car sportsCar = new car();
	sportsCar.install(powerfullEngine);
	sportsCar.showEngineDetails();
}
}
