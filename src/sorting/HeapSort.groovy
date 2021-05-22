package sorting

class HeapSort {

    void buildHeap(int[] arr, int n)
    {
        for(int i = n%2 ==0 ? n/2 -1: n/2; i >=0 ; i--)
            heapify(arr, n, i);
    }

    //Heapify function to maintain heap property.
    void heapify(int[] arr, int n, int i)
    {

        int large = i;
        int l = 2*i+1,r = 2*i +2;

        if(l < n && arr[l] > arr[large])
            large = l;
        if(r < n && arr[r] > arr[large])
            large = r;

        if(large !=i)
        {
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
            heapify(arr, n, large);
        }


    }

    //Function to sort an array using Heap Sort.
    public void heapSort(int[] arr, int n)
    {
        buildHeap(arr, n);

        println "deepanshu ${arr}"
        for(int i = n-1; i  >=0; i-- ){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,i, 0);
        }
    }
}
