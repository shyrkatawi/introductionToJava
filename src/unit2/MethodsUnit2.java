package unit2;

public class MethodsUnit2 {
    public static void printArray(double[] array) {
        for (double d : array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array, String message) {
        System.out.println(message);
        for (double d : array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static double[] copyArray(double[] sourceArray) {
        double[] copy = new double[sourceArray.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = sourceArray[i];
        }
        return copy;
    }

    public static int[] copyArray(int[] sourceArray) {
        int[] copy = new int[sourceArray.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = sourceArray[i];
        }
        return copy;
    }
}
