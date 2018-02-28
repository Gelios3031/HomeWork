package com.gmail.gelios3031;

public class Group {

	private Student[] group = new Student[10];

	public Group(Student[] group) {
		super();
		this.group = group;

	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public int numberOfStudents() {
		int number = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				number = number + 1;
			}
		}
		return number;
	}

	public void addStudent(Student st) throws MyException {
		if (st == null) {
			throw new IllegalArgumentException("Not found");
		}
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = st;
				return;

			}
		}
		throw new MyException();
	}

	public void deleteStudent(int a) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getNrecbook() == a) {
				group[i] = null;
				break;
			}

		}

	}

	public Student searchStudent(String name) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getName().equals(name)) {
				return group[i];
			}
		}
		return null;

	}

	public void toPrintGroup() {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				System.out.println("Number student's record-book: " + group[i].getNrecbook() + ", Name: "
						+ group[i].getName() + ", Age: " + group[i].getAge() + ", Sex: " + group[i].getSex());
			}
		}
	}
}
