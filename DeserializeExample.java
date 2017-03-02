import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeExample implements Serializable{

	public static void main(String[] args) {
		//Create an array to hold the objects
		Fruit[] fruitItems = new Fruit[3];
		
		try{
			//Create the stream objects
			FileInputStream inStream = new FileInputStream("Fruit.txt");
			ObjectInputStream objectInputFile = new ObjectInputStream(inStream);
			
			//Read the serialized objects from the file
			for(int i = 0; i < fruitItems.length; i++){
				fruitItems[i] = (Fruit) objectInputFile.readObject();
			}
			
			//Close the file
			objectInputFile.close();
			
			//Display the objects
			for(Fruit fruit: fruitItems)
				System.out.println("***New Fruit Item***\n" +
						"Fruit Name: " + fruit.getFruitType() + "\n" +
						"Fruit Color: " + fruit.getColor() + "\n" +
						"Fruit Qty: " + fruit.getQty() + "\n" +
						"Rating: " + fruit.getRating() + " Stars out of five\n");
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("The program has generated an error");
		}

	}

}
