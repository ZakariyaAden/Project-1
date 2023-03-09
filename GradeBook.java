import java.io.*;
import java.util.*;

public class GradeBook{
    public static void main(String[] args){
        Student[] arr = {
            new Student("Ali"),
            new Student("Zak"),
            new Student("Aideed"),
            new Student("Hamza"),
        };
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
                    String[] possibleGradeArr = {
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
                    Student objForLoop = arr[i];
                    fw.write(objForLoop.getName());

                    //have to covert Hashmap to readable string
                    //have to test if what i did actually did anything

                    //fw.write(objForLoop.getLetterGrade(1));
                    //fw.write(objForLoop.getLetterGrade(2));
                    //fw.write(objForLoop.getLetterGrade(3));
                    fw.write(objForLoop.getLetterGrade());
                    fw.close();
                    Scanner fr = new Scanner(file);
                    int lineCounter = 0;
                    while(fr.hasNextLine()){    
                        lineCounter++;
                    }
                    if(lineCounter != 2){
                        //dang
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        }
    }
    public static void rankMethod(Student[] paraArr){
        for(int i = 0; i < paraArr.length;i++){

        }
    }
}
