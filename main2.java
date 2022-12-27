import java.util.Arrays;
public class main2 {public static void nums(int[] A)
{
    int k = 0;

    for (int i: A)
    {
        if (i != 0) {
            A[k++] = i;
        }
    }
    for (int i = k; i < A.length; i++) {
        A[i] = 0;
    }
}
public static void main(String[] args)
    {
        int[] A = { 34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20 };

        nums(A);
        System.out.println(Arrays.toString(A));
    }
}
