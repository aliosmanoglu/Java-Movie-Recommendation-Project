/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructersprojectheap;

/**
 *
 * @author Ali Haydar
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxHeap {

    Node[] heap;
    int size;

    public MaxHeap(int capacity) {
        heap = new Node[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(double value,int id) {
        if (size == heap.length) {
            throw new IllegalStateException("Heap is full. Cannot insert more elements.");
        }

        Node newNode = new Node(value, id);
        heap[size] = newNode;
        
        siftUp(size);
        size++;
    }

    public Node extractMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty. Cannot extract maximum element.");
        }

        Node max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);

        return max;
    }

    
    public void deleteAll() {
        for (int i = 0; i < heap.length; i++) {
            heap[i] = null;
        }
        
    }
    private void siftUp(int index) {
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heap[index].data > heap[parentIndex].data) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void siftDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        int maxIndex = index;

        if (leftChildIndex < size && heap[leftChildIndex].data > heap[maxIndex].data) {
            maxIndex = leftChildIndex;
        }

        if (rightChildIndex < size && heap[rightChildIndex].data > heap[maxIndex].data) {
            maxIndex = rightChildIndex;
        }

        if (index != maxIndex) {
            swap(index, maxIndex);
            siftDown(maxIndex);
        }
    }

    private void swap(int index1, int index2) {
        Node temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

  

}
