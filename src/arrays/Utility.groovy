package arrays

public class Utility {

    static int[] getParsedIntArray(String  str, String delimitter){
        String[] st = str.split(delimitter);
        int[] arr = new int[st.length];
        for(int i =0; i < st.length; i++)
            arr[i] = Integer.parseInt(st[i]);

        return arr;
    }

    static int[] getRandomIntArray(int size , int range=1000){
        Random random = new Random();
        int[] arr = new int[size];

       for(int i=0; i< size;i++)
           arr[i] = random.nextInt(range)

        return arr;
    }
}
