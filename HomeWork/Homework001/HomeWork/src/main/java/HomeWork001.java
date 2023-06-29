//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах



import org.w3c.dom.ls.LSOutput;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Random;

public class HomeWork001 {
    static int i = new Random().nextInt(2001);
    static int n = Integer.toBinaryString(i).length() - 1;
    static String tmp = Integer.toBinaryString(i);
    static int[] AliquotN (int i, int n){
        int[] m1 = new int[Short.MAX_VALUE];
        int index = 0;
        for (int j = i; j <= Short.MAX_VALUE ; j++) {
            if (j % n == 0) {
                m1[index] = j;
                index++;
            }
        }
        return m1;
    }
    static int[] NotAliquotN (int i, int n){
        int[] m2 = new int[Short.MAX_VALUE];
        int index = 0;
        for (int j = Short.MIN_VALUE; j <= i  ; j++) {
            if (j % n != 0){
                m2[index] = j;
                index++;
            }
        }
        return m2;
    }
    static void PrintArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                System.out.print(array[i] + " ");
            }

        }
    }



    public static void main(String[] args) {
        System.out.println("Случайное число i = " + i);
        System.out.println("Число i в двоичном виде: " + tmp);
        System.out.println("Номер старшего значащего бита n числа i: " + n);
        System.out.println(Short.MAX_VALUE);

        int[] m1 = AliquotN(i, n);
        System.out.println("Все кратные n числа в диапазоне от i до Short.MAX_VALUE: ");
        PrintArray(m1);

        System.out.println();

        int[] m2 = NotAliquotN(i, n);
        System.out.println("Все некратные n числа в диапазоне от Short.MIN_VALUE до i: ");
        PrintArray(m2);

    }

}
