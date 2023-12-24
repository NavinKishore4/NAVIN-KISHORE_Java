package com.qn1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;


public class ProjectDeserializer {
	@SuppressWarnings("unchecked")
	public Map<Project, ArrayList<Employee>> deserializeProjectDetails() {
		try {
			FileInputStream f1 = new FileInputStream("Project.txt");
			ObjectInputStream ois = new ObjectInputStream(f1);
			return (Map<Project, ArrayList<Employee>>) ois.readObject();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public void displayDeserializedData(Map<Project, ArrayList<Employee>> deserializedData) {
		System.out.println("Deserialized Project Details:");
		for (Map.Entry<Project, ArrayList<Employee>> entry : deserializedData.entrySet()) {
			System.out.println("Project: " + entry.getKey().projectName);
			for (Employee employee : entry.getValue()) {
				System.out.println(employee);
				
			}
		}
	}

	public static void main(String[] args) {
		ProjectDeserializer projectDeserializer = new ProjectDeserializer();
		Map<Project, ArrayList<Employee>> deserializedData = projectDeserializer.deserializeProjectDetails();
		if (deserializedData != null) {
			projectDeserializer.displayDeserializedData(deserializedData);
		}
	}
}
