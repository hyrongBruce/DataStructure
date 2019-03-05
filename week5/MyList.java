package week5;
import java.util.Arrays;

public class MyList<E> {

    private E[] data;
    private int free; // next available index

    public MyList() {
        data = (E[]) new Object[1];
        free = 0;
    }

    public E get(int index) {
        if (index < 0 || index >= free) {
            throw new IllegalArgumentException("Out of bounds");
        }
        return data[index];
    }

    public int size() {
        return data.length;
    }

    // Methods: add, insert, remove, removeAt, filter, toString

    private void resize() {
    	
    }

    public void add(E item) {
    }

    public void insert(E item, int index) {
    }

    public boolean remove(E item) {
        return true;
        //remember to ask : what if there is multiple E;
    }

    public boolean removeAt(int index) {
        return true;
    }

    public String toString() {
    	return"";
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        System.out.println(list);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);
        list.insert(12,1);
        list.add(13);
        System.out.println(list);
        list.removeAt(2); // remove index 2
        System.out.println(list);
    }
}