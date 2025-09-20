package OOPS;

public class Student {
    String name;
    private int Roll_No;
    double percent;
    int numberofstudent;
public int getRoll_No(){
    return Roll_No;
}
//    public void setRoll_No(int rollno){
//       Roll_No=rollno;
//    }
//e this keyword in Java is a reference variable used to refer to the current object of a class. It is very commonly used inside constructors and methods to avoid ambiguity between instance variables and parameters.
        public void setRoll_No(int Rollno){
       this.Roll_No=Rollno;
    }


}