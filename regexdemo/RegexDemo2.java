package regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {

        String s="1[3-9]\\d{9}";
        System.out.println("13888888888".matches(s));
        System.out.println("1388888888".matches(s));
        System.out.println("1388888888888".matches(s));
        System.out.println("138888888888".matches(s));



        //2.
        String s2="\\d{4}-\\d{2}-\\d{2}";
        System.out.println("2024-08-08".matches(s2));
        System.out.println("2024-08-08 12:12:12".matches(s2));







    }
}
