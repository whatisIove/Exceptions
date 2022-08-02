package ua.ithillel.java;

public class ArrayExceptionTest {
    public static void main(String[] args) {

        int[] array = new int[]{66, 77, 99, 44, 55, 33};

        printArray(array, 0, 7);
    }

    public static void printArray(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error. An attempt to access a non-existent index: " +
                        "current index = " + i + "; array size = " + array.length + ";");
                break;
            }
        }
    }
}
