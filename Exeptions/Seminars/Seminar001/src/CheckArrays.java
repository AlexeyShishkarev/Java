import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckArrays {
    private int min;


    public CheckArrays() {
    }

    public void setMin(int min) {
        this.min = min;
    }


    public int findValueIndex(int[] array, int value){
        if(array == null){
            return -3;
        }
        if(array.length < min){
            return -1;
        }
         return findIndex(array, value);

    }

    private int findIndex(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -2;
    }

    public void outputUser(int[] array, int min, int value){
        this.min = min;
        switch (findValueIndex(array, value)){
            case (-1):
                System.out.println("Длинна массива меньше допустимого!");
                break;
            case (-2):
            System.out.println("Значение не найдено!");
                break;
            case (-3):
            System.out.println("Вместо массива пришел null");
                break;
            default:
                System.out.println("Длинна массива: " + findValueIndex(array, value));
        }

    }

    public int[][] fillArray(int rows, int columns){
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = j;
            }
        }
        return array;
    }

    public boolean squareArray(int[][] array){
        int rows = array.length;
        int columns = 0;
        for (int[] i:array ){
            if (i.length != rows){
                return false;
            }
        }
        return true;
    }

    public int sumOfElements (int[][] array) {
        if (squareArray(array)) {
            int summ = 0;
            int row = 0;
            int columns = 0;
            for (int[] i : array) {
                for (int j : i) {
                    if (j == 0 || j == 1) {
                        summ += j;
                    }else {
                        throw new RuntimeException("Значение не 0 и не 1!");
                    }
                }
            }
            return summ;
        }else {
            throw new RuntimeException("Массив не квадратный!");
        }
    }


    public void checkArray(Integer[] arr){
        List list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                list.add(i);
        }
        }
        if(list.size() == 0){
            System.out.println("Элементов равных Null в массиве нет");
        } else {
            System.out.println("Элементы равные NULL: " + list);
        }
    }


}
