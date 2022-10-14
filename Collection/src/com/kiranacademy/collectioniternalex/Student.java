package com.kiranacademy.collectioniternalex;

import java.util.Objects;

public class Student {
	
	int rno,marks;

	public Student(int i, int j) {
		// TODO Auto-generated constructor stub
		rno=i;
		marks=j;
	}

	@Override
	public int hashCode() {
		return rno;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && rno == other.rno;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	

}
