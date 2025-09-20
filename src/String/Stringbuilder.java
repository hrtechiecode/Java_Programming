package String;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        str.append(1);
        System.out.println(str);
        str.append('h');
        System.out.println(str);
        //hello -->mello
        str.setCharAt(0,'m');
        System.out.println(str);
        System.out.println(str.reverse());
        System.out.println(str.insert(1,2));
        System.out.println(str.deleteCharAt(4));



    }
}
