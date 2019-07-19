package teamcalypso;



public class Iterator<E extends Storage> {
    private E[] elementData;
    private int size;
    private int currentIndex = 0;
    public Iterator(E[] data) {
       this.elementData = data;
       this.size = 0;
    }
    public boolean hasNext() {
        return currentIndex<size&&elementData[currentIndex]!=null;
    }

    public E next() {
        return elementData[currentIndex++];
    }
}
