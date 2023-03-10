import java.util.HashMap;

public class Student{
    
    private String name;
    private HashMap<String,String> letterGradeHashMap;
    private int ranking;

    public Student(String name){
        this.name = name;
                HashMap<String,String> letterGradeHashMap = new HashMap<>();
    }
    public String getName(){
        return this.name;
    }
    public void setLetterGrade(String mathletterGrade, String scienceletterGrade, String englishletterGrade){
        if (!mathletterGrade.equals("A") || !mathletterGrade.equals("-A")  || !mathletterGrade.equals("B+") || !mathletterGrade.equals("B") || !mathletterGrade.equals("B-")  || !mathletterGrade.equals("C+") || !mathletterGrade.equals("C") || !mathletterGrade.equals("C-") || !mathletterGrade.equals("D+") || !mathletterGrade.equals("D") || !mathletterGrade.equals("D-")){return;}
        if (!scienceletterGrade.equals("A") || !scienceletterGrade.equals("-A")  || !scienceletterGrade.equals("B+") || !scienceletterGrade.equals("B") || !scienceletterGrade.equals("B-")  || !scienceletterGrade.equals("C+") || !scienceletterGrade.equals("C") || !scienceletterGrade.equals("C-") || !scienceletterGrade.equals("D+") || !scienceletterGrade.equals("D") || !scienceletterGrade.equals("D-")){return;}
        if (!englishletterGrade.equals("A") || !englishletterGrade.equals("-A")  || !englishletterGrade.equals("B+") || !englishletterGrade.equals("B") || !englishletterGrade.equals("B-")  || !englishletterGrade.equals("C+") || !englishletterGrade.equals("C") || !englishletterGrade.equals("C-") || !englishletterGrade.equals("D+") || !englishletterGrade.equals("D") || !englishletterGrade.equals("D-")){return;}
        letterGradeHashMap.put("Math",mathletterGrade);
        letterGradeHashMap.put("Science",scienceletterGrade);
        letterGradeHashMap.put("English",englishletterGrade);
    }
    public String getLetterGrade(int indecator){
        String grade = null;
        if(indecator > 3){return null;}
        switch(indecator){
            case 1: 
                if (this.letterGradeHashMap.containsValue("Math") != true){return grade;}
                grade = "Math: " + this.letterGradeHashMap.get("Math") + "\n";
                break;
            case 2: 
                if (this.letterGradeHashMap.containsValue("Science") != true){return grade;}
                grade = "Science: " + this.letterGradeHashMap.get("Science") + "\n";
                break;
            case 3: 
                if (this.letterGradeHashMap.containsValue("English") != true){return grade;}
                grade = "English: " + this.letterGradeHashMap.get("English") + "\n";
                break;
            default:
                break;
        }
        return grade;
    }
/*
    public String addAssignment(double score, double possibleScore){
        
        double gradePercentage = score/possibleScore;
        this.gradePercentage = this.gradePercentage + gradePercentage;
        if (gradePercentage > 100.00){
            this.gradePercentage = 100.00;
        }
    }
*/
}
