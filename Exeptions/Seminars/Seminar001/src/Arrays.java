public class Arrays {
    private int[] array;
    /**
     * Создаем пустой массив с заданным количество элементов
     * @param size
     */
    public Arrays(int size) {
       array = new int[size];
    }

    public int length(){
        return array.length;
    }

}
