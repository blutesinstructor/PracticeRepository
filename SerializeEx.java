import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author Bradley
 *
 */
public class SerializeEx implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cereal[] cerealCabinet = new Cereal[4];
		
		cerealCabinet[0] = new Cereal("Cheerios", 3, "Yummy", 3, false);
		cerealCabinet[1] = new Cereal("Capn Crunch", 2, "Yummy", 4, true);
		cerealCabinet[2] = new Cereal("Raisin Bran", 1, "Yucky", 2, false);
		cerealCabinet[3] = new Cereal("Frosted Flakes", 32, "Yummy", 5, true);
		
		System.out.println("Writing to file...");
		try{
			FileOutputStream outputStream = new FileOutputStream("cereal.txt");
			ObjectOutputStream outputObject = new ObjectOutputStream(outputStream);
			
			for(int i = 0; i < cerealCabinet.length; i++)
				outputObject.writeObject(cerealCabinet[i]);
			
			outputObject.close();
		}catch(Exception badCereal){
			System.out.println(badCereal.getMessage());
			System.out.println("Your program has encountered an error");
		}//End catch
		System.out.println("Done");

	}//End Main

}
