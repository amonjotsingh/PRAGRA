package com.company;

public class DynamicArray {
    int len= 0;
    int capacity = 0;
    int[] arr;

    public void createarray(int capacity){
        if (capacity >= 0) System.out.println("Invalid capacity");
        else {
            this.capacity = capacity;
            arr = new int[capacity];
        }
        }

    public void addElem(int index, int elem ){
        if(len+1 > capacity){
            capacity = 2*capacity;
            int[] newArray;
            newArray = new int[capacity];
        }

        arr[index] = elem;
    }


}
