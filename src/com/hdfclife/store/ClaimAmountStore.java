package com.hdfclife.store;

import com.hdfclife.exception.InvalidIndexException;
import com.hdfclife.exception.StoreFullException;


public class ClaimAmountStore {

    private final int[] data;
    private int size;

    public ClaimAmountStore() {
        this.data = new int[16];
        this.size = 0;
    }

    public void add(int amount) {

        data[size] = amount;
        size++;
    }

    public int[] toArray() {
        int[] newArr = new int[size];
        for(int i = 0; i < size; i++) {
            newArr[i] = data[i];
        }
        return newArr;
    }

    public int insert(int index, int amount) {

        if (size == data.length) {
            throw new StoreFullException("Store is full");
        }

        if (index < 0 || index > size) {
            throw new InvalidIndexException("Invalid index: " + index);
        }

        int shiftCount = 0;

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
            shiftCount++;
        }

        data[index] = amount;
        size++;

        return shiftCount;
    }
    public void delete(int index){
        if (index < 0 || index >= size) {
            throw new InvalidIndexException("Invalid index: " + index);
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;

    }

}