package Agreegation;

public class car {

	//Agreegation...
	engine carEngine;
	
	//install the engine...
	void install(engine newEngine) {
		carEngine = newEngine;
	}
	
	//display the engine ...
	void showEngineDetails() {
		carEngine.display();
	}
}
