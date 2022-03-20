package assignment4.FrequencyOfWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class ReadStoryText  {
	HashMap<String,Integer> map=new HashMap<>();
	private BufferedReader br;


	public ReadStoryText()
	{
		init();
	}

	void init() {

		try {
			String words[] = null;
			br = new BufferedReader(new FileReader(new File("C:/Users/Krupa/Documents/workspace-sts-3.9.12.RELEASE/AssignmentHarman/src/assignment4/story.txt")));
			String line = null;

			while ((line = br.readLine()) != null) {
				words = line.split(" ");
			}

			for(int i=0;i<words.length;i++)
			{
				if(map.containsKey(words[i])) 
				{
					int count=map.get(words[i]);
					map.replace(words[i],count+1);	
				}
				else
				{
					map.put(words[i],1);
				}
			}

			map.forEach((i,j)->{
				System.out.println(i+" : "+j);
				});

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
