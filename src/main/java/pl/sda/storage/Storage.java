package pl.sda.storage;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Object> items = new ArrayList<>();
    private final Connection connection;

    public Storage(Connection connection) {
        this.connection = connection;
    }

    public int addValue(Object value) {
        if (connection.isClosed()) {
            throw new StorageConnectionException("Connection is closed " +
                    "so data cannot be added!");
        }

        items.add(value);
        return items.size();
    }

    public boolean removeValue(Object value) {
        if (connection.isClosed()) {
            throw new StorageConnectionException("Connection is closed " +
                    "so data cannot be removed!");
        }

        return items.remove(value);
    }

    public List<Object> getData() {
        if (connection.isClosed()) {
            throw new StorageConnectionException("Connection is closed " +
                    "so data cannot be retrieved!");
        }

        return items;
    }
}
