import java.util.Scanner;
import java.io.*;
import java.util.*; // dient für Arrays

public class main{
    private static ArrayList<Medium> MediumArray = new ArrayList<Medium>(); 
    public static void main(String[] args){ // main muss klein geschrieben werden wegen compile-process
        CD cd1 = new CD("Rammstain: Paris", "Rammstein", 22, 128, false, "");
        DVD dvd1 = new DVD("A Silent Voice", "Yoshitoki Oima", 125, true, "Bester Anime-Film");
        LP schall1 = new LP("Die Toten Hosen", "Die Toten Hosen", 15, 90, false, "");
        Maxi schall2 = new Maxi("Die Toten Hosen", "Die Toten Hosen", 15, 90, false, "");

        MediumArray.add(cd1);
        MediumArray.add(dvd1);
        MediumArray.add(schall1);
        MediumArray.add(schall2);

        for(Medium OneMedium : MediumArray){
            System.out.println(OneMedium.toString()); // eigentlich unnötig toString zu schreiben. ist ja automatisch ausgeführt
        }
    }
}
