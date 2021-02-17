package com.qa.operator.results;

public class Results {

	public static int physics;
	public static int chemistry;
	public static int biology;

	public static int total;
	public static double percentage;

	public static void main(String[] args) {

		physics = 93;
		chemistry = 91;
		biology = 1;
		total = physics + chemistry + biology;

		marks();
		overallPercentage();
		message();

	}

	public static void marks() {

		System.out.println("Physics mark: " + physics);
		System.out.println("Chemistry mark: " + chemistry);
		System.out.println("Biology mark: " + biology);
		System.out.println("Total mark: " + total);

	}

	public static void overallPercentage() {
		percentage = (total / 450.0) * 100;

		System.out.println("Percentage total: " + String.format("%.2f", percentage) + "%");
	}

	public static void message() {

		int failedExams = 0;

		if (physics < 90) {
			failedExams++;
		}

		if (chemistry < 90) {
			failedExams++;
		}

		if (biology < 90) {
			failedExams++;
		}

		if (percentage < 60.0 || failedExams > 0) {

			System.out.println("FAILED " + failedExams + " exam(s):");

			if (physics < 90) {
				System.out.println("Physics");
			}
			if (chemistry < 90) {
				System.out.println("Chemistry");
			}

			if (biology < 90) {
				System.out.println("Biology");
			}

		} else {
			System.out.println("PASSED");
		}
	}

}
