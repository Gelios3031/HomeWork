package com.gmail.gelios3031;

public class Main {

	public static void main(String[] args) {

		Student DogOne = new Student("DogOne", 19, "true", 1);
		Student CatOne = new Student("CatOne", 20, "false", 2);
		Student DogTwo = new Student("DogTwo", 18, "false", 3);
		Student CatTwo = new Student("CatTwo", 21, "true", 4);

		Group groupOne = new Group();

		System.out.println();
		System.out.println("Group:");

		try {
			groupOne.addStudent(DogOne);
			groupOne.addStudent(CatOne);
			groupOne.addStudent(DogTwo);
			groupOne.addStudent(CatTwo);
		} catch (MyException e) {
			System.out.println(e.toString());
		}
		System.out.println("number of students: " + groupOne.numberOfStudents());

		groupOne.toPrintGroup();

		System.out.println();
		System.out.println("found students:");
		System.out.println(groupOne.searchStudent("DogOne"));
		System.out.println(groupOne.searchStudent("CatTwo"));

		groupOne.deleteStudent(1);
		groupOne.deleteStudent(2);

		System.out.println();
		groupOne.toPrintGroup();
	}
}
