package teamcalypso;


public class Storage implements Comparable<Storage> {
    int id;
    String type;
    int size;

    public Storage(int id, String type, int size) {
        this.id = id;
        this.type = type;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Storage storage) {
        return this.type.compareTo(storage.type);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                '}';
    }
}
