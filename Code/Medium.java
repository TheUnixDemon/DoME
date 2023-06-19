import java.io.*; 
import java.util.*;

abstract public class Medium implements Serializable{
    private int CountMedium = 0;

    private String title;
    private String artist;
    private int number;
    private double length;
    private boolean mark;
    private String comment;

    public Medium(String title, String artist, int number, double length, boolean mark, String comment){
        SetTitle(title);
        SetArtist(artist);
        SetNumber(number);
        SetLength(length);
        SetMark(mark);
        SetComment(comment);

        CountMedium += 1;
    }
    
    public Medium(String title, String artist, double length, boolean mark, String comment){ // habe Medium überladen für DVD(hat keine Titelanzahl)
        SetTitle(title);
        SetArtist(artist);
        SetLength(length);
        SetMark(mark);
        SetComment(comment);

        CountMedium += 1;
    }

    public void SetTitle(String title){
        this.title = title;
    }
    public void SetArtist(String artist){
        this.artist = artist;
    }
    public void SetNumber(int number){
        this.number = number;
    }
    public void SetLength(double length){
        this.length = length;
    }
    public void SetMark(boolean mark){
        this.mark = mark;
    }
    public void SetComment(String comment){
        this.comment = comment;
    }

    public int GetCountMedium(){
        return CountMedium;
    }

    public String GetTitle(){
        return title;
    }
    public String GetArtist(){
        return artist;
    }
    public int GetNumber(){ // Amzahl der Dateien auf der CD
        return number;
    }
    public double GetLength(){
        return length;
    }
    public boolean GetMark(){
        return mark;
    }
    public String GetComment(){
        return comment;
    }

    @Override
    public String toString(){
        return "Titel = " + GetTitle() + ", Regisseur = " + GetArtist() + ", Länge = " + GetLength() + " Min, Eigentümer? = " + String.valueOf(GetMark()) + ", Kommentar = " + GetComment();
    }
}