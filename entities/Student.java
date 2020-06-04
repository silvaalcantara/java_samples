package entities;

public class Student {

    public String name;
    public String email;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public Student() {}

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void calcResult(){
        double result = this.firstGrade + this.secondGrade + this.thirdGrade;

        if (result > 60) {
            System.out.printf("%nFINAL GRADE = %.02f%nPASS%n", result);
        } else{
            double missingPoints = 60 - result;
            System.out.printf("%nFINAL GRADE = %.02f%nFAILED%nMISSING %.02f POINTS%n", result, missingPoints); 
        }
    }
}