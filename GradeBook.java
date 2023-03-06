import java.io.*;
import java.util.*;

public class GradeBook{
    public static void main(String[] args){
        Student arr = {
            Student s1 = new Student("Ali");
            Student s2 = new Student("Zak");
            Student s3 = new Student("Aideed");
            Student s4 = new Student("Hamza");
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
                    Random randGradeGenerator = new Random();
                    String possibleGradeArr = {
                        "A",
                        "A-",
                        "B+",
                        "B",
                        "B-",
                        "C+",
                        "C",
                        "C-",
                        "D+",
                        "D",
                        "D-",
                        "F"
                    };
                    int randIndex1 = randGradeGenerator.nextInt(11); 
                    int randIndex2 = randGradeGenerator.nextInt(11);
                    int randIndex3 = randGradeGenerator.nextInt(11);
                    arr[i].setLetterGrade(possibleGradeArr[randIndex1],possibleGradeArr[randIndex2],possibleGradeArr[randIndex3]);
                    fw.write(arr[i].name);
                    fw.write(arr[i].getLetterGrade);
                    fw.close();
                    Scanner fr = new Scanner(file);
                    int lineCounter = 0;
                    while(fr.hasNextLine()){    
                        lineCounter++;
                    }
                    if(lineCounter != 2){
                        th
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        }
    }
}