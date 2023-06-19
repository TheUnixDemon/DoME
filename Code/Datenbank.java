import java.util.Scanner;
import java.io.*;
import java.text.FieldPosition;
import java.util.*; // dient für Arrays

public class Datenbank implements Serializable{
    private static ArrayList<Medium> medien = new ArrayList<Medium>(); 
    private String filename = "11223344.bin";

    public Datenbank(){
    }
    public void erfasseMediumRAM(Medium medium){
        this.medien.add(medium);
    }
    public void auflistenMedienRAM(){
        for(Medium oneEntry : this.medien){
            System.out.println(oneEntry.toString());
        }
    }
    public void speicherMedienHD(){
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
    
    }
    public void ladeMedienHD(){
        //ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
        this.medien = (ArrayList<Medium>)is.readObject();
    }
}
