import java.util.Arrays;

public class ArraySortingElena {
    public static void main(String[] args){
        int[] numbers = {9, 7, 8, 15, 3, 2};
        
        Arrays.sort(numbers);
        
        System.out.println("Sorted Array in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
