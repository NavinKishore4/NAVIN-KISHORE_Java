package com.qn2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map.Entry;

public class Producer extends Thread{

	Thread1 thread;
	FileOutputStream fos;
	ObjectOutputStream oos;
	
	Producer(Thread1 thread) throws IOException
	{
		this.thread=thread;
		fos = new FileOutputStream("Project.txt");
		oos = new ObjectOutputStream(fos);
	} 
	public Producer() {
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		synchronized (thread) 
		{
			try {
				oos.writeObject(thread.hMap);
				oos.flush();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Serialize called by Producer");
			System.out.println("Serialized Data");
			for(Entry<Project, ArrayList<Employee>> temp : thread.hMap.entrySet())
			{
				System.out.println(temp.getKey());
				for(Employee t : temp.getValue())
				{
					System.out.println(t);
				}
			}
			thread.notifyAll();
		};
	}
	
	
}
