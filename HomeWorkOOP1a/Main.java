package com.gmail.gelios3031;

public class Main {

	public static void main(String[] args) {

		Triangle trOne = new Triangle(4, 5, 6);
		System.out.println(trOne);

		if (trOne.chekTriangle()) {
			System.out.println("S = " + trOne.getSquare());
		} else {
			System.out.println("this is do not a triangle");
		}

		Triangle trTwo = new Triangle(2, 2, 5);
		System.out.println(trTwo);

		if (trTwo.chekTriangle()) {
			System.out.println("S = " + trTwo.getSquare());
		} else {
			System.out.println("this is do not a triangle");
		}

	}

}
