import java.io.*;
import java.util.*;

public class GradeBook{
    public static void main(String[] args){
        Student arr = {
            Student s1 = new Student("Ali","A-");
            Student s2 = new Student("Zak","A");
            Student s3 = new Student("Ali","A-");
            Student s4 = new Student("Ali","A-");
        }
        for (int i = 0; i<arr.length;i++){
                try {
                    File file = new File("file" + i + ".txt");
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists.");
                        file.delete();
                    }
                    FileWriter fw = new FileWriter(file);
                    fw.write(arr[i].name);
                    fw.write(arr[i].letterGrade);
                    fw.write(arr[i].gradePercentage);
                    fw.close();
                    Scanner fr = new Scanner(file);
                    while(fr.hasNextLine()){
                        String line = fr.nextLine();
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        }
    }
}