package teamcalypso;

public class Iterator<E extends Storage> {
    private E[] elementData;
    private int currentIndex = 0;

    public Iterator(E[] data) {
        this.elementData = data;
    }

    public boolean hasNext() {
        if (currentIndex < elementData.length) {
            return true;
        } else {
            return false;
        }
    }

    public E next() {
        if (hasNext()) {
            return elementData[currentIndex++];
        } else {
            return null;
        }
    }
}
