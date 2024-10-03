package hw_ext;

public class PensTest {
	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		p1.write();
		p1.setPrice(10);
		System.out.println("售價金額：" + p1.getPrice());

		InkBrush i1 = new InkBrush();
		i1.write();
		i1.setPrice(100);
		System.out.println("售價金額：" + i1.getPrice());
	}
}
