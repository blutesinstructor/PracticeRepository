import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * This program serializes objects of
 * the Fruit Class
 * @author Bradley
 *
 */
public class SerializeExample implements Serializable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiate fruit objects
		Fruit strawberry = new Fruit("Strawberry", 10, "Red", 5);
		Fruit banana = new Fruit("Banana", 7, "Yellow", 3);
		Fruit grape = new Fruit("Grape", 50, "Green", 5);
		
		//Create an array to hold Fruit objects
		Fruit[] fruitItems = new Fruit[3];	
		
		//Place items in the array
		fruitItems[0] = strawberry;
		fruitItems[1] = banana;
		fruitItems[2] = grape;
		
		try{
		//Create the stream objects
		FileOutputStream outStream = new FileOutputStream("Fruit.txt");
		ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
		
		//Write the serialized object to the file
		for(int i = 0; i < fruitItems.length; i++)
			objectOutputFile.writeObject(fruitItems[i]);
		
		//Close the file
		objectOutputFile.close();
		System.out.println("The serialized objects were written to the file");
		
		
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("There has been an error in the program.");
		}
	}

}
