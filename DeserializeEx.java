import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 
 */

/**
 * @author Bradley
 *
 */
public class DeserializeEx {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cereal[] cerealCabinet = new Cereal[4];
		
		try{
			
			ObjectInputStream inputObject = 
					new ObjectInputStream(new FileInputStream("cereal.txt"));
			
			for(int i = 0; i < cerealCabinet.length; i++)
				cerealCabinet[i] = (Cereal)inputObject.readObject();
				
			for(Cereal cereal: cerealCabinet)
				System.out.println(cereal + "\n");
			
			inputObject.close();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("The program has encountered an error");
		}

	}

}
