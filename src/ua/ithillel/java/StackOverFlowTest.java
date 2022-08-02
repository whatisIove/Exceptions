package ua.ithillel.java;

public class StackOverFlowTest {
    static int count;

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int mcount = count++;
        System.out.println(mcount);
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
