package sorting

class QuickSort {

    public void quickSort(int[] arr, int s, e){
        if(s == e || s > e)
            return;

        int partitionIndex = partition(arr, s, e);

        quickSort(arr, s, partitionIndex-1)
        quickSort(arr, partitionIndex+1, e)

    }

    private int partition(int[] arr,int s, int e){
        // doing partition for the last element
        int lastPointer = e-1, i =s;
        while(i <lastPointer){
            if(arr[i] <= arr[e]){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[lastPointer];
                arr[lastPointer] = temp;
                lastPointer--;
            }
        }

//         replace last element, on last replacement we don't know wehether the replaced element is larger than pivot or not
//        so we check if last element replaced is larger than pivot element then we need to replace the element with pivot,
//        else we will require the element next to the replaced element to replace the pivot as
//        the current element is already shorter than the pivot replacing shorter element with pivot will destroy the integrity of the algorithm
        if(arr[i] > arr[e]){
            int temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            return i;

        }else{
            int temp = arr[i+1];
            arr[i+1] = arr[e];
            arr[e] = temp;
            return i+1;
        }

    }

    int[] getTestCase(int n){
        int[] arr = new int[n];
        Random rd = new Random();
        for(int i=0; i< n; i++)
            arr[i] = Math.abs(rd.nextInt()%10000000);

        return arr;
    }
}


