// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задание № 1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        float[] floatArray = {1.57f, 7.654f, 9.986f};

        double[] doubleArray = new double[10];
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = (i + 1) * 0.5;
        }
        System.out.println( doubleArray);

        System.out.println();

        // task 2
        System.out.println("Задание № 2");
        for (int i = 0; i < 2; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.println(intArray[2]);

        for (int i = 0; i < floatArray.length; i++) {
            if (i == floatArray.length - 1){
                System.out.println(floatArray[i]);
                break;
            }
            System.out.print(floatArray[i] + ", ");
        }

        for (int i = 0; i < doubleArray.length; i++) {
            if (i == doubleArray.length - 1) {
                System.out.println(doubleArray[i]);
                break;
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        System.out.println();

        // task 3
        System.out.println("Задание № 3");
        for (int i = 2; i > 0; i--) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.println(intArray[0]);

        for (int i = floatArray.length-1; i >= 0; i--) {
            if (i == 0){
                System.out.println(floatArray[i]);
                break;
            }
            System.out.print(floatArray[i] + ", ");
        }

        for (int i = doubleArray.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(doubleArray[i]);
                break;
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        System.out.println();

        // task 4
        System.out.println("Задание № 4");
        for (int i = 0; i < intArray.length - 1; ++i) {
            if (intArray[i] % 2 == 0) {
                System.out.print(intArray[i] + ", ");
            } else {
                System.out.print(intArray[i] + 1 + ", ");
            }
        }
        if (intArray[intArray.length - 1] % 2 == 0) {
            System.out.println(intArray[intArray.length - 1]);
        } else {
            System.out.println(intArray[intArray.length - 1] + 1);
        }
    }
}