package task002;

public class task002 {
//    try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }

    public void arithmetic() {
        int index = 8;
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 0;
        if (d == 0) {
            System.out.println("На 0 делить нельзя!");
        } else
            if (index >= intArray.length - 1) {
                System.out.println("Индекс больше размера массива!!!");
            } else {
            double catchedRes1 = intArray[8] / d;
        }
    }

}
