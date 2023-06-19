import java.io.*;
import java.util.*;

public class DVD extends Medium{
    public DVD(String title, String artist, double length, boolean mark, String comment){
        super(title, artist, length, mark, comment);
    }

    @Override
    public String toString(){
        return "DVD: " + super.toString();
    }
}
