
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 21, 30, 17, 22, 79, 6, 97, 8, 54};
        System.out.println("увеличиваем четные числа на 1");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] + 1;
            }
            System.out.println(array[i]);
        }
        System.out.println("вывод с 3 по 7 число");
        sumArray(array);

    }
    public static int sumArray(int[] array) {
        for (int i = 3; i < 7; i++) {
            if (i < array.length) ;
            System.out.println(array[i]);
        }
        return array.length;
    }

}









             








