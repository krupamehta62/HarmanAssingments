package assignment4.DisplayBigNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DisplayBigNum {

	BufferedReader br;
	private ArrayList<Double> doubles=new ArrayList<>();

	public  DisplayBigNum()
	{
	init();	
	}

	void init()
	{
		try {
			double doubleValue;
			br= new BufferedReader(new FileReader(new File("C:/Users/HP/Documents/workspace-spring-tool-suite-4-4.13.1.RELEASE/Assignment4/src/ques3/data.txt")));
			String str = null;
			while ((str = br.readLine()) != null) {
			doubleValue=Double.parseDouble(str);
			doubles.add(doubleValue);
			}

			double biggestOne = 0;
			for(int i=1;i<doubles.size();i++)
			{
				biggestOne=doubles.get(0);
				if(biggestOne<=doubles.get(i))	biggestOne=doubles.get(i);
			}
			System.out.println("Biggest One : "+biggestOne);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
