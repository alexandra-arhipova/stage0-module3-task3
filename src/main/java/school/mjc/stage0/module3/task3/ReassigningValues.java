package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        first = 15;
        second = 6;
        third = 4;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        int first1 = 1;
        int second2 = 10;
        int third3 = 100;
        int linkToFirst = first1;
        int linkToSecond = second2;
        int linkToThird = third3;
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
