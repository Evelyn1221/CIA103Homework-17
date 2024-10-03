package Homework5_4;

public class MyRectangle {
	double width;
	double depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		double Area = width * depth;
		return Area;
	}

	public MyRectangle() {
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

}
