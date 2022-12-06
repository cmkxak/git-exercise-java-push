package com.likelion.lecture.week12;

import java.util.Arrays;

public class HeapSortEx {
    //힙 상태로 만들기 위해 heapify를 호출할 때는 다음과 같이 해야 함
    public static void heapSort(int[] arr){
        int size = arr.length;
        if (size < 2){
            return;
        }
        //가장 마지막 노드의 부모 노드 인덱스
        int parentIdx =  (size-1)- 1 / 2;

        //1. maxheap 만들기
        for(int i = parentIdx; i>=0; i--){
            heapify(arr, i, size-1);
        }
        //2. 최댓값과 맨 뒤의 요소를 교환
        //2-1. 마지막 위치를 제외한 부분 트리에 대해 최대힙을 만족하도록 힙 재구성
        for(int i = size-1; i>0; i--){
            swap(arr,0,i); //최댓값과 맨 뒤의 요소 교환
            heapify(arr, 0, i-1); //마지막 위치를 제외한 부분트리에 대해 maxHeap을 만족하도록 재구성
        }
    }

    //힙을 만드는 함수 : maxHeap(부모 노드의 값 >= 자식 노드의 값)
    private static void heapify(int a[], int parentIdx, int lastIdx){
        int leftChildIdx = parentIdx * 2 + 1;
        int rightChildIdx = parentIdx * 2 + 2;
        int largestIdx = parentIdx;

        //왼쪽 자식 노드와 비교
        if (leftChildIdx <= lastIdx && a[largestIdx] < a[leftChildIdx]){
            largestIdx = leftChildIdx;
        }

        //오른쪽 자식 노드와 비교
        //인덱스가 작고, 값이 더 크면. 부모 노드와 교환
        if (rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]){
            largestIdx = rightChildIdx;
        }

        if(parentIdx != largestIdx){
            swap(a, largestIdx, parentIdx);
            heapify(a, largestIdx, lastIdx);
        }
    }

    private static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8, 1, 2, 4};
        System.out.println("---- 정렬 전 ----");
        System.out.print(Arrays.toString(arr)+ " ");

        //최대힙으로 만들기
        heapSort(arr);
        System.out.println();

        System.out.println("---- 정렬 후 ----");
        System.out.println(Arrays.toString(arr) + " ");
    }
}
