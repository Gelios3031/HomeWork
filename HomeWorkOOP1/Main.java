package com.gmail.gelios3031;

public class Main {

	public static void main(String[] args) {

		Cat catOne = new Cat("Shustrik", "GRAY", 1.5, 8, "Gray-yard");
		System.out.println(catOne);
		System.out.print("Shustrik said:");
		catOne.catWantEat();
		System.out.println();

		Cat catTwo = new Cat("Richard", "BLACK", 2, 12, "Black-yard");
		System.out.println(catTwo);
		System.out.print("Richard said:");
		catTwo.catSleep();
		System.out.println();

		Cat catTree = new Cat("Barsik", "RED", 5, 16, "Red-yard");
		System.out.println(catTwo);
		System.out.print("Barsik said:");
		catTree.catEat();
		System.out.println();
	}

}
