package OOPS;

public class Constructor {
    String name;
    int rollno;
    int age;
    final String school="DPS";
    //parameterised constructor
    public Constructor(String naam,int no,int umar){
       name=naam;
       rollno=no;
        age=umar;

    }
    public static void main(String[] args) {
        Constructor student = new Constructor("Hritika", 27, 21);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.rollno);
        //student.school="oxford";
        System.out.println(student.school);

    }
}
