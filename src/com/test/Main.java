package com.test;

public class Main {

	public static void main(String[] args) {

		ProcessManager pm = new ProcessManager();

		Process p1 = new Process(001, "Payment", "Completed");

		Process p2 = new Process(002, "Software Installing", "Pending");

		Process p3 = new Process(003, "Software Update", "Pending");

		pm.addcompletedProcess(p1);
		pm.addcompletedProcess(p2);
		pm.addcompletedProcess(p3);

		System.out.println(pm);

		Process searching = pm.searchProcess(3);
		
		System.out.println(">>>>>>>Searching Process<<<<<<<<<");
		
		if (searching != null) {

			System.out.println(searching);
		} else {
			System.out.println("Process not found");
		}
		System.out.println(">>>>>>>Updating Status<<<<<<<<<");
		
		if (pm.updateProcess(001, "Completed")) {

			System.out.println("Status updated");
		} else {

			System.out.println("Not updated");
		}

		System.out.println(">>>>>>>Completed Process<<<<<<<<<");
		
		for (Process process : pm.getCompletedProcess()) {

			System.out.println(process);
		}

		System.out.println(">>>>>>>Pending Process<<<<<<<<<");
		
		for (Process process : pm.getPendingProcess()) {

			System.out.println(process);
		}

	}

}
