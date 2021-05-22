package sorting;

import java.util.Random;

public class MergeSort {

    /*
    this merge sort is muatable, it changes the passed array, in place of retrning a new array
    */
    private void mergeHelper(int[] arr, int s1, int e1, int s2, int e2){
        // start sorting from s1 and sort upto e2 , make a new array of length upto the full length of he merge
        int[] temp = new int[e2-s1+1];
        int t1 = s1, t2 = s2, ind = 0;
        while(t1<= e1 && t2 <= e2){
            if(arr[t1] <= arr[t2])
                temp[ind++] = arr[t1++];
            else
                temp[ind++] = arr[t2++];
        }

            while(t2<= e2)
                temp[ind++] = arr[t2++];

            while(t1 <= e1)
                temp[ind++] = arr[t1++];

        // replace all the elements from temp array to orignal array
        for(int i =0 ; i < temp.length; i++)
            arr[s1+i] = temp[i];
    }

    void merge(int[] arr, int s, int e){
        if(e == s)
            return;

        merge(arr, s, (int)((s+e)/2));
        merge(arr, (int)((s+e)/2)+1, e);

        mergeHelper(arr, s, (int)((s+e)/2), (int)((s+e)/2 )+1, e);
    }









    int inversionCounter(int[] arr, int s, int e){
        if(e == s)
            return 0;

        int v1 = inversionCounter(arr, s, (int)((s+e)/2));
        int v2 = inversionCounter(arr, (int)((s+e)/2)+1, e);

        int v3 = countNumberOfSwapsOrSortOperationsPerformed(arr, s, (int)((s+e)/2), (int)((s+e)/2 )+1, e);

        return v1+v2+v3;
    }

    int countNumberOfSwapsOrSortOperationsPerformed(int[] arr, int s1, int e1, int s2, int e2){
        int retval = 0;
        int[] temp = new int[e2-s1+1];
        int t1 = s1, t2 = s2, ind = 0;
        while(t1<= e1 && t2 <= e2){
            if(arr[t1] <= arr[t2])
                temp[ind++] = arr[t1++];
            else{
                temp[ind++] = arr[t2++];
                retval += e1-s1+1;
            }
        }

        while(t2<= e2)
            temp[ind++] = arr[t2++];

        while(t1 <= e1)
            temp[ind++] = arr[t1++];

        // replace all the elements from temp array to orignal array
        for(int i =0 ; i < temp.length; i++)
            arr[s1+i] = temp[i];

        return retval;
    }







    void mergeSort(String[] arr, int i, int e){
        if(i > e || i == e)
            return;
        mergeSort(arr,i , (int)((i+e)/2));
        mergeSort(arr,(int)((i+e)/2) + 1 , e);

        mergeStrings(arr, i , e);
    }

    void mergeStrings(String[] arr, int i, int e){

        int  p1 = i, p2 = ((int)((i+e)/2 + 1)), c = 0;

        String[] temp = new String[e-i+1];
        while(p1 <= (int)((i+e)/2) && p2 <= e){

            boolean comp = compare(arr[p1], arr[p2]);
            if(comp){
                temp[c++] = arr[p1++];
            }else{
                temp[c++] = arr[p2++];
            }
        }

        while(p1 <= (int)((i+e)/2))
            temp[c++] = arr[p1++];
        while(p2 <= e)
            temp[c++] = arr[p2++];

        c = i;
        while(c <= e){
            arr[c] = temp[c - i];
            c++;
        }

    }

    boolean compare(String s1, String s2){
        int k = Math.min(s1.length(), s2.length()), i =0;

        for(; i < k; i++){
            if(s1.charAt(i) > s2.charAt(i))
                return true;
            else if(s1.charAt(i) == s2.charAt(i))
                continue;
            else if(s1.charAt(i) < s2.charAt(i))
                return false;
        }
        if(i == k){
            if(s1.length() == k)
                return true;
            else
                return false;
        }

        return false;
    }






    int[] getTestCase(int n){
        int[] arr = new int[n];
        Random rd = new Random();
        for(int i=0; i< n; i++)
            arr[i] = rd.nextInt()%10000;

        return arr;
    }

    String[] getTestCaseStrings(int n){
        String[] arr = new int[n];
        Random rd = new Random();
        for(int i=0; i< n; i++)
            arr[i] = Math.abs(rd.nextInt()%100 )+ "";

        return arr;
    }

}
