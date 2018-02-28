package com.gmail.gelios3031;

public class Square extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Square() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public double getPerimetr() {

		return a.getDistance(b) + b.getDistance(c) + c.getDistance(d) + d.getDistance(a);

	}

	@Override
	public double getArea() {

		return Math.pow(a.getDistance(b), 2) / 2;
	}

	@Override
	public String toString() {
		return "Square [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
