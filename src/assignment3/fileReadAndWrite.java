package assignment3;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReadAndWrite {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				FileReader fr=new FileReader("C:/Users/Krupa/LeBron.jpg");
				FileWriter fw=new FileWriter("C:/Users/Krupa/LeBron.jpg");
				int i=0;
				while((i=fr.read())!=-1) {
					fw.write(i);
				}
				fw.close();
				fr.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
			System.out.println("File Written");
		}

		}


