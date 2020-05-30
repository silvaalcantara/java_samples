package entities;

public class Student {

    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    
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