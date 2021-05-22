package problems

class JosepheusProblem {

    public int josephus(int n, int k)
    {
        boolean[] arr = new boolean[n];

        int counter = n;
        int init = 0;
        while(counter != 1){
            int traverser = k;
            while(traverser != 0){

                if(arr[init%n] != true){
                    if(traverser == 1){
                        arr[init%n] = true;
                        counter--;
                    }

                    traverser--;
                }
                init++;
            }

            println( arr );
        }

        for(int i=0; i< n; i++){
            if(arr[i] == false)
                return i;
        }

        return -1;
    }
}
