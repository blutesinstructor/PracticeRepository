import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessExample {

	public static void main(String[] args) {
		//The letters array has all 26 letters of the alphabet
		char[] letters = {'a', 'b', 'c', 'd', 'e',
							'f', 'g', 'h', 'i', 'j',
							'k', 'l', 'm', 'n', 'o',
							'p', 'q', 'r', 's', 't',
							'u', 'v', 'w', 'x', 'y', 'z'};
		
		System.out.println("Opening the file...");
		
		try{
			//Open a file for reading and writing
			RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "rw");
			
			System.out.println("Writing to the file...");
			
			//Sequentially write the letters array to the file
			for(int i = 0; i < letters.length; i++)
				randomFile.writeChar(letters[i]);
			
			//Close the file
			randomFile.close();
			System.out.println("Done");
			
			final int CHAR_SIZE = 2; //2 byte characters
			long byteNum; 			//For the byte number
			char ch; 				//To hold a character
			
			//Open the file for reading
			RandomAccessFile randomFile2 = new RandomAccessFile("letters.dat", "r");
			
			//Move to character 5. This is the sixth character from the beginning of the file
			byteNum = CHAR_SIZE * 5;
			randomFile2.seek(byteNum);
			
			//Read the character stored at this location
			//and display it. Should be the letter f.
			ch = randomFile2.readChar();
			System.out.println(ch);
			
			//Move to character 10 (the 11th character),
			//and display it. Should be the letter k.
			byteNum = CHAR_SIZE * 10;
			randomFile2.seek(byteNum);
			ch = randomFile2.readChar();
			System.out.println(ch);
			
			//Move to character 3 (the fourth character)
			//Read the character and display it
			//Should be the letter d
			byteNum = CHAR_SIZE * 3;
			randomFile2.seek(byteNum);
			ch = randomFile2.readChar();
			System.out.println(ch);
			
			randomFile2.seek(8);
			System.out.println("The letter at the fifth character in the file is: " +
			randomFile2.readChar());
			
			randomFile2.seek(2);
			System.out.print(randomFile2.readChar());
			randomFile2.seek(34);
			System.out.print(randomFile2.readChar());
			randomFile2.seek(0);
			System.out.print(randomFile2.readChar());
			randomFile2.seek(6);
			System.out.print(randomFile2.readChar());
			
			//Close the file
			randomFile2.close();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("The program has produced an error");
		}
		
		
	}//End Main
}//End Class
