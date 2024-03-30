package controlWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArrayListsTest {

    @Test
    void add() {
        ArrayLists arrayLists = new ArrayLists<>();
        assertTrue(arrayLists.add("231"));

    }

    @Test
    void size() {
        ArrayLists arrayLists = new ArrayLists<>();
        arrayLists.add(4);
        arrayLists.add(5);
        int size1 = arrayLists.size();
        int size2 = 2;
        assertEquals(size1, size2);
    }

    @Test
    void delete() {
        ArrayLists arrayLists = new ArrayLists<>();
        arrayLists.add(4);
        arrayLists.add(10);
        int x1 = arrayLists.size();
        arrayLists.delete(1);
        int x2 = arrayLists.size();
        assertTrue(x1 == x2 + 1);


    }

    @Test
    void get() {
        ArrayLists arrayLists = new ArrayLists<>();
        arrayLists.add("Apple");
        arrayLists.add("Banana");
        assertEquals("Apple",arrayLists.get(0));

    }
    @Test
    void update(){
        ArrayLists arrayLists = new ArrayLists<>();
        arrayLists.add("Bananana");
        arrayLists.add("Cherry");
        arrayLists.add("Car");
        arrayLists.update(1, "Apple");
        assertEquals(arrayLists.get(1), "Apple");
    }
}
