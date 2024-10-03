package hw_ext;

public class Pencil extends Pen {

	@Override
	void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public void setPrice(double price) {
		this.price = price*0.8;
	}

}
