package FInal;

public class helloShivu {
    public void Shivu() {
        System.out.println("This is the call the one class to another class ");
    }
    public void prashanth() {
        System.out.println("The call another methode ....");
    }
public static void main(String[] args) {

    helloShivu hello = new helloShivu();
    hello.Shivu();
    hello.prashanth();
}
}
