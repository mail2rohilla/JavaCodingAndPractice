package strings

class PermutateStrings {

    /*package whatever //do not write package name here */


    public void permutate(char[] s, int i){
        if(i == s.length-1){
            print(s);
            return;
        }

        permutate(s, i+1);

        for(int p =i+1; p < s.length; p++){
            bubble(s,i, p);
            // here we ask for the swap with 1st letter and the string apart from it to undergo permutations
            permutate(s, i+1);
            bubbleBack(s,i, p);
        }
    }

    void print(char[] arr){
        String s = "";
        for(int i =0; i < arr.length ;i++)
            s+=arr[i];

        System.out.println(s);
    }

    void swap(char[] s, int i, int j){
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
    }
    void bubble(char[] s, int i, int j){
        while(j > i){
            swap(s, j, j-1);
            j--;
        }

    }

    void bubbleBack(char[] s, int i, int j){
        while(i < j){
            swap(s, i, i+1);
            i++;
        }

    }
}

