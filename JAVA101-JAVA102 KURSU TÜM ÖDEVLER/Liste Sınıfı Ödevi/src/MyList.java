public class MyList<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        array = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        if (size == array.length) {
            // If the array is full, resize it to twice its current capacity
            resizeArray(array.length * 2);
        }
        array[size] = data;
        size++;
    }

    private void resizeArray(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            @SuppressWarnings("unchecked")
            T data = (T) array[index];
            return data;
        }
        return null;
    }

    public T remove(int index) {
        if (index >= 0 && index < size) {
            @SuppressWarnings("unchecked")
            T removedData = (T) array[index];
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[size - 1] = null; // Clear the last element
            size--;
            return removedData;
        }
        return null;
    }

    public T set(int index, T data) {
        if (index >= 0 && index < size) {
            @SuppressWarnings("unchecked")
            T previousData = (T) array[index];
            array[index] = data;
            return previousData;
        }
        return null;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] dataArray = (T[]) new Object[size];
        System.arraycopy(array, 0, dataArray, 0, size);
        return dataArray;
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        if (start >= 0 && finish < size && start <= finish) {
            MyList<T> sublist = new MyList<>(finish - start + 1);
            for (int i = start; i <= finish; i++) {
                sublist.add(get(i));
            }
            return sublist;
        }
        return null;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(",");
        }
        sb.append(array[size - 1]).append("]");
        return sb.toString();
    }
}
