import java.util.Arrays;

public class CheckArray {
    public static void main(String[] args) {
        int[] randomArray = new int[] {1, 4, 5, 1, 1, 3};
        System.out.println("Количество различных элементов массива - " + countOfDifferentElements(randomArray) + ".");
    }

    public static int countOfDifferentElements(int[] randomArray) {
        int[] sortedArrayOfRandomArray = randomArray.clone();
        int count = 0;
        Arrays.sort(sortedArrayOfRandomArray);
        for (int i = 0; i < sortedArrayOfRandomArray.length; i++) {
            for (int j = i + 1; j < sortedArrayOfRandomArray.length; j++) {
                if (sortedArrayOfRandomArray[i] == sortedArrayOfRandomArray[j]) {
                    count++;
                    i = j;
                }
            }
        }
        return sortedArrayOfRandomArray.length - count;
    }
}
