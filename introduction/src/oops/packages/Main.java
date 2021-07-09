package oops.packages;

import oops.packages.models.Student;//thiss will provide only things inside the student class
import oops.packages.models.*;//thiss will provide every thing inside the package models

public class Main {

	public static void main(String[] args) {
		Student obj = new Student("anushka");
		Teacher teacher= new Teacher();
	}

}
