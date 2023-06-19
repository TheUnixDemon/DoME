import java.io.*;
import java.util.*;

public abstract class Schallplatte extends Medium{

    private int speed;

    public Schallplatte(String title, String artist, int speed, int number, double length, boolean mark, String comment){
        super(title, artist, number, length, mark, comment);

        this.speed = speed;
    }
    
    @Override
    public String toString(){
        return "Schallplatte: " + "Geschwindigkeit = " + speed + " U/min, " + super.toString();
    }
}