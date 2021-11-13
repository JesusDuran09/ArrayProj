
import java.util.Random;

public static void main(String[] args)
{
    Random rand = new Random();

    int[] arr = new int[2000000000];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = rand.nextInt(10) + 1; // 1..10
    }

  
    Summation.sum(arr);

    Summation.parallelSum(arr);
}