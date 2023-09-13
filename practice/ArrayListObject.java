package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListObject {
    ArrayList<Integer> arr;

    public ArrayListObject() {
        this.arr = new ArrayList<>();
    }

    // checks if arraylist is empty
    public boolean isEmpty() {
        if (getSize() == 0) {
            return true;
        }
        return false;
    }

    // checks the size of the arraylist
    public int getSize() {
        return this.arr.size();
    }

    // adds element to the end of arraylist
    public ArrayList<Integer> push(int num) {
        this.arr.add(num);
        return this.arr;
    }

    // adds element at specific index of arraylist
    public ArrayList<Integer> addNumberAtIndex(int index, int num) {
        this.arr.add(index, num);
        return arr;
    }

    // gets element at index
    public int getNumber(int index) throws IndexOutOfBoundsException {
        if ((index > this.arr.size() - 1) || index < 0) {
            throw new IndexOutOfBoundsException("Index does not exist.");
        }
        return this.arr.get(index);
    }

    // removes element at end
    public int removeLast() {
        return this.arr.remove(this.arr.size() - 1);
    }

    // remove values
    public ArrayList<Integer> remove(int num) {
        for (int i = 0; i < this.arr.size(); i++) {
            if (this.arr.get(i) == num) {
                this.arr.remove(i);
            }
        }
        return this.arr;
    }

    // delete at index
    public ArrayList<Integer> delete(int index) {
        this.arr.remove(index);
        return this.arr;
    }

    // finds first index that contains num
    // if it doesn't exist return -1;
    public int find(int num) {
        for (int i = 0; i < this.arr.size(); i++) {
            if (this.arr.get(i) == num) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return this.arr.toString();
    }

    public static void main(String[] args) {
        ArrayListObject arrList = new ArrayListObject();
        arrList.push(1);
        arrList.push(2);
        arrList.push(3);
        arrList.push(1);
        System.out.println(arrList.getSize()); // should be 4
        arrList.addNumberAtIndex(1, 5);
        System.out.println(arrList.toString()); // print [1,5,2,3,1]
        arrList.push(2);
        System.out.println(arrList.toString()); // [1,5,2,3,1,2]
        arrList.removeLast();
        System.out.println(arrList.toString()); // [1,5,2,3,1]
        arrList.remove(1);
        System.out.println(arrList.toString()); // [5,2,3]
        System.out.println(arrList.find(2)); // 1
        System.out.println(arrList.find(-4)); // -1
        arrList.getNumber(5); // throws Exception
    }
}
