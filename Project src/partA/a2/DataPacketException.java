package partA.a2;

public class DataPacketException extends Exception {
    private final int id;

    public DataPacketException(int id, String message) {
        super(message);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Exception Id=" + id + ", " + "Exception Message=" + getMessage();
    }
}

