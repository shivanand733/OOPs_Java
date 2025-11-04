package Agreegation;

public class belagavi {

	private int trincost;
	private String trainName;
	
	public belagavi () {
		//default constructor 
	}
	
	public belagavi(int traincost,String trainName) {
		this.trincost = traincost;
		this.trainName = trainName;
	}

	public int getTrincost() {
		return trincost;
	}

	public void setTrincost(int trincost) {
		this.trincost = trincost;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	
	
}
