package com.gmail.gelios3031;

public class Cat {
	private String name;
	private String color;
	private double weight;
	private int age;
	private String breed;

	public Cat(String name, String color, double weight, int age, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.breed = breed;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", weight=" + weight + ", age=" + age + ", breed=" + breed
				+ "]";
	}

	public void catEat() {
		System.out.println("Chavk-Chavk");
	}

	public void catWantEat() {
		System.out.println("Meow-Meow");
	}
	
	public void catSleep() {
		System.out.println("Moore-Moore");
	}
	
	
}
