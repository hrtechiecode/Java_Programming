package OOPS;

public class Studentjava {
    public static void main(String[] args) {
        Student x=new Student();//declaration object of same class having same properties
        x.name="hritika";//intialisation
        x.percent=85.7;
       // x.Roll_No=27;
        System.out.println(x.numberofstudent);
        System.out.println(x.getRoll_No());
        System.out.println(x.name );
        //System.out.println(x.Roll_No);
        System.out.println(x.percent);
x.setRoll_No(67);
        System.out.println(x.getRoll_No());
    }
}
