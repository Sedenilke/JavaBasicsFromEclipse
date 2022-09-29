package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Monday";
		if (day.equals("Saturday") || day.equals("Sunday") || day.equals("Thursday")) {
			System.out.println("We have Java Class at Syntax");
		} else {
			System.out.println("We do not have Java Class");
		}
	}

}
