package hw_ext;

public class RoleGameTest {
	public static void main(String[] args) {
		Hero saberr = new SwordMan("亞拉岡", 1, 0);
		Hero archerr = new ArrowMan("勒苟拉斯", 1, 0);

		saberr.attack();
		saberr.move();

		archerr.attack();
		archerr.move();

	}

}
