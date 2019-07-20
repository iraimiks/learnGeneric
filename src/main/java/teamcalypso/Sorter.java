package teamcalypso;

public class Sorter<E extends Storage> {
    private E[] element;

    public Sorter(E[] data) {

        this.element = data;
    }

    public E[] sort(E[] data) {
        int N = data.length;
        for (int i = 0; i <= N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(data[j], data[min])) {
                    min = j;
                }
                exch(data, i, min);
            }
        }
        return data;
    }

    private static boolean less(Storage elementOne, Storage elementTwo) {
        return elementOne.getType().compareTo(elementTwo.type) > 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


}
