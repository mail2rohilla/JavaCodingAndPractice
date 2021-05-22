package arrays

class CircularTour

{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int[] petrol, int[] distance)
    {
        // Your code here
        for(int i = 0; i < petrol.length; i++)
            petrol[i] -= distance[i];

        int i =0, j = 0, elemCount = 0, sum = 0;

        print "petrol -> ${petrol}"
        while(i < petrol.length)
            sum += petrol[i++];

        if(sum < 0)
            return -1;

        i = 0;
        sum = 0;
        while(i < petrol.length){

            if(elemCount == petrol.length)
                return i;

            if(sum >= 0){
                sum += petrol[j%petrol.length];
                j++;
                elemCount++;
            }else{
                sum -= petrol[i];
                i++;
                elemCount--;
            }

        }

        return -1;
    }
}

