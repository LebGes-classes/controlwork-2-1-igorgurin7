package controlWork;
public class ArrayLists<E> {
    private E[] values;
    public ArrayLists(){
        values = (E[]) new Object[0];
    }
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }
    public int size() {
        return values.length;
    }
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int cntElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, cntElemAfterIndex);
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }
    public void update(int index, E e) {
        values[index] = e;
    }
    public E get(int index) {
        return values[index];
    }
}
