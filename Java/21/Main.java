import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Sony", "Experia X", 32, 12.5, 4.6, "Yes", 150));
        phones.add(new Phone("Sony", "Experia Z", 64, 14.2, 5.6, "Yes", 175));
        phones.add(new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, "Yes", 180));
        phones.add(new Phone("Nokia", "3330", 16, 13.2, 2.3, "No", 90));
        phones.add(new Phone("Motorola", "M1", 8, 11.3, 4.9, "Yes", 100));
        phones.add(new Phone("IPhone", "6", 32, 13.5, 6.4, "Yes", 250));
        phones.add(new Phone("Alcatel", "A3", 8, 9.3, 2.4, "No", 50));
        
        try (FileOutputStream fos = new FileOutputStream("phone.ser");
        	    ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(phones);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("phone.ser");
        	    ObjectInputStream ois = new ObjectInputStream(fis);) {

        	  phones = (ArrayList) ois.readObject();
        	} catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        phones.removeIf(phone -> phone.getMake().equals("Alcatel"));
        
        Phone newPhone = new Phone("Iphone", "7 Plus\t", 16, 14.2, 5.8, "Yes", 300);
        phones.add(newPhone);
        
        System.out.println("Make		Model		Memory (GB)	Camera (MP)	Smart 	Price (€)");
        for (Phone phone : phones) {
        	
            System.out.println(phone.getMake() + "\t\t" + phone.getModel() + "\t" + 
            phone.getMemory() + "\t\t" + phone.getCamera() + "	" + 
            phone.getScreenSize() + "	" + phone.isSmart() + "	" + phone.getPrice());
        }

        PhoneGUI phoneGUI = new PhoneGUI(phones);
        phoneGUI.show();

    }
}