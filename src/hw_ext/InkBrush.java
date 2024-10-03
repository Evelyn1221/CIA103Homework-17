package hw_ext;

public class InkBrush extends Pen {

	@Override
	void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public void setPrice(double price) {
		this.price = price*0.9;
	}

}
