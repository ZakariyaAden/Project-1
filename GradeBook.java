import java.io.*;
import java.util.*;

public class GradeBook{
    public static void main(String[] args){
        HashMap<Integer,Student> objHashMap = new HashMap<>();
        Student ali = new Student("Ali");
        Student zak = new Student("Zak");
        Student aideed = new Student("Aideed");
        Student hamza = new Student("Hamza");
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
        int randIndex1 = randGradeGenerator.nextInt(possibleGradeArr.length); 
        int randIndex2 = randGradeGenerator.nextInt(possibleGradeArr.length);
        int randIndex3 = randGradeGenerator.nextInt(possibleGradeArr.length);
        ali.setLetterGrade("A","A","A");
        zak.setLetterGrade("A","A","A");
        aideed.setLetterGrade("A","A","A");
        hamza.setLetterGrade("A","A","A");
        System.out.println(ali.getLetterGrade(1));
        System.out.println(ali.getLetterGrade(2));
        System.out.println(ali.getLetterGrade(3));
        System.out.println(zak.getLetterGrade(1));
        System.out.println(zak.getLetterGrade(2));
        System.out.println(zak.getLetterGrade(3));
        System.out.println(aideed.getLetterGrade(1));
        System.out.println(aideed.getLetterGrade(2));
        System.out.println(aideed.getLetterGrade(3));
        System.out.println(hamza.getLetterGrade(1));
        System.out.println(hamza.getLetterGrade(2));
        System.out.println(hamza.getLetterGrade(3));
    }
    public static void rankMethod(Student[] paraArr){
        for(int i = 0; i < paraArr.length;i++){

        }
    }
}
