package com.datastructure.assignmentquestion1;

import java.util.Scanner;

public class Driver {

	static Model model = new Model();
	static Service service = new Service();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of floors in the building");

		model.setFloors(sc.nextInt());

		int[] sizeOfFloors = new int[model.getFloors()];

		for (int i = 0; i < model.getFloors(); i++) {
			System.out.println("Enter the floor size given on day " + (i + 1));
			sizeOfFloors[i] = sc.nextInt();
		}

		model.setSize(sizeOfFloors);

		service.orderOfConstruction(model.getSize(), model.getFloors());

	}

}
