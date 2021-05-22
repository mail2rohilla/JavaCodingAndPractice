package arrays

class Sort012 {
    void sort012(int[] a, int n){
        // code here

        int p1 = 0;
        int p2 = n-1;
        int c = 0;

        while(c != p2 && c < n){
            if(a[c] == 1){
                c++;
                continue;
            }
            if(a[c] == 2){
                while(a[p2] == 2 && c != p2)
                    p2--;
                if(p2 != c){
                    //perform swap
                    int temp = a[p2];
                    a[p2] = a[c];
                    a[c] = temp;
                }else{
                    c++;
                    return;
                }
            }
            if(a[c] == 0){
                while(a[p1] == 0 && c != p1)
                    p1++;
                if(p1 != c){
                    //perform swap
                    int temp = a[p1];
                    a[p1] = a[c];
                    a[c] = temp;
                }else{
                    c++;
                }
            }


        }


    }




    int[] getTestCase(int n){
        int[] arr = new int[n];
        Random rd = new Random();
        for(int i=0; i< n; i++)
            arr[i] = Math.abs(rd.nextInt()%3);

        return arr;
    }
}
