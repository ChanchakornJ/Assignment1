//Chanchakorn Jullapech
//672115007
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.*;
class Class{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Type -n, -f, -l, -s following by the file name: ");
        String intp = input.nextLine();
        StringTokenizer ch = new StringTokenizer(intp, " ");
        String choice = ch.nextToken();
        String file = ch.nextToken();

        File f = new File(file);
        Scanner in = new Scanner(f);
        for(int i=0;i<7;i++){
            in.nextLine();
        }

        Vector<Student> student = new Vector<Student>();

        while(in.hasNextLine()){
            String dataLine = in.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
            stu.nextToken();
            student.addElement(new Student(stu.nextToken(),stu.nextToken(),stu.nextToken()));
        }


        switch (choice) {
            case "-n":
            SortSID(student);
                
                break;

            case "-f":
            firstNameSort(student);
                
                break;
            
            case "-l":
            lastNameSort(student);

                break;

            case "-s":
            String find = ch.nextToken().toUpperCase().trim();
                NameSearch(student, find);

                break;
        
            default:
                break;
        }
        
    }

    public static void SortSID(Vector<Student> Stu){
        for(int j = 0; j < Stu.size(); j++){
            for(int i = 0; i < Stu.size() - 1; i++){
                Student Stu1 = Stu.get(i);
                Student Stu2 = Stu.get(i+1);
                if(Stu1.getSID() > Stu2.getSID()){
                    Stu.set(i, Stu2);
                    Stu.set(i + 1, Stu1);

                }
            }
        }
        for(int i = 0; i < Stu.size(); i++){
            System.out.println(Stu.get(i));
        }
    }

    public static void firstNameSort(Vector<Student> Stu){
        for(int j = 0; j < Stu.size(); j++){
            for(int i = 0; i < Stu.size() - 1; i++){
                Student Stu1 = Stu.get(i);
                Student Stu2 = Stu.get(i+1);
                if(Stu1.getFirstName().compareToIgnoreCase(Stu2.getFirstName()) > 0){
                    Stu.set(i, Stu2);
                    Stu.set(i + 1, Stu1);

                }
            }
        }
        for(int i = 0; i < Stu.size(); i++){
            System.out.println(Stu.get(i));
        }
    }

    public static void lastNameSort(Vector<Student> Stu){
        for(int j = 0; j < Stu.size(); j++){
            for(int i = 0; i < Stu.size() - 1; i++){
                Student Stu1 = Stu.get(i);
                Student Stu2 = Stu.get(i+1);
                if(Stu1.getLastName().compareToIgnoreCase(Stu2.getLastName()) > 0){
                    Stu.set(i, Stu2);
                    Stu.set(i + 1, Stu1);

                }
            }
        }
        for(int i = 0; i < Stu.size(); i++){
            System.out.println(Stu.get(i));
        }
    }

    

    public static void NameSearch(Vector<Student> Stu, String Name){
        boolean found = false;
        for(int i = 0; i < Stu.size(); i++){
            if(Name.equalsIgnoreCase(Stu.get(i).getFirstName().trim())){
                System.out.println("found at index " + i);
                found = true;
                break;
            }   
        }
        if (!found) {
            System.out.println("Not found");
        }


    }
}
