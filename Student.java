//Chanchakorn Jullapech
//672115007
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.*;
public class Student{
    private String SID;
    private String firstName;
    private String lastName;

    public Student(String SID,String firstName,String lastName){
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return this.SID + " " + this.firstName + " " + this.lastName;
    }
    public int getSID(){return Integer.parseInt(SID);}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public char getCharFirstName(){return firstName.charAt(0);}
    public char getCharLastName(){return lastName.charAt(0);}
}
