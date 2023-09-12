
public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][] {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String[][] arr2 = new String[2][2];
        String[][] arr3 = new String[][] {{"sd", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"5", "6", "7", "8"},
                {"5", "6", "7", "8"}};

        System.out.println(arrSum(arr1));
//        System.out.println(arrSum(arr2));
        System.out.println(arrSum(arr3));

    }

    static public int arrSum(String[][] arr){
        int summ = 0;
        if (arr.length != 4 || arr[0].length != 4){
            throw new MyArraySizeException();
        }
        for (String[] i: arr) {
            for (String j: i) {
                try {
                    summ += Integer.parseInt(j);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException();
                }
            }

        }
        return summ;
    }

}