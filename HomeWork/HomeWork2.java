public class HomeWork2 {import java.util.Arrays;

    class Main
    {        public static void reorder(int[] A)
        {
            // `k` сохраняет индекс следующей доступной позиции
            int k = 0;

            // делаем для каждого элемента
            for (int i: A)
            {
                // если текущий элемент отличен от нуля, поместить элемент в
                // следующая свободная позиция в массиве
                if (i != 0) {
                    A[k++] = i;
                }
            }

            // перемещаем все 0 в конец массива (оставшиеся индексы)
            for (int i = k; i < A.length; i++) {
                A[i] = 0;
            }
        }

        public static void main(String[] args)
        {
            int[] A = { 34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20 };

            reorder(A);
            System.out.println(Arrays.toString(A));
        }
    }
}
