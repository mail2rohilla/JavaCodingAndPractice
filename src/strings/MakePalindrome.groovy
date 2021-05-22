package strings

class MakePalindrome {

    // wrong approach : in this we find a palindrome existing in a string and look at the remaining two parts of the string
    // we count common characters in  the remaining parts and infer that the common characters in both strings won't be required to form a palindrome
    // as they are already present, bu this is wrong, because the ordering of the common characters will also matter
    // so we opt to chose longest common sub-sequence approach
    public int countMinForPalindrome(String s){


        int counterMin = 1000000;
        for(int i =0; i < s.length(); i++){
            int maxL = -1;
            // odd case

            int iT = i-1;
            int jT = i+1;
            int iB = iT,jB = jT;

            while(iT >= 0 && jT < s.length() && s.charAt(iT) == s.charAt(jT)){
                iT--;
                jT++;
            }
            if(jT-iT-1 > maxL){
                maxL = jT-iT-1;
                iB = iT;
                jB = jT;
            }

            // even case

            iT = i;
            jT = i+1;

            while(iT >= 0 && jT < s.length() && s.charAt(iT) == s.charAt(jT)){
                iT--;
                jT++;
            }
            if(jT-iT-1 > maxL){
                maxL = jT-iT-1;
                iB = iT;
                jB = jT;
            }

            int counter = 0;

            HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
            HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();


// collection of characters
            while(iB >=0){
                if(hm1.containsKey(s.charAt(iB))){
                    int temp = hm1.get(s.charAt(iB));
                    temp++;
                    hm1.put(s.charAt(iB), temp);
                }else{
                    hm1.put(s.charAt(iB), 1);
                }
                iB--;
            }

            while(jB < s.length()){
                if(hm2.containsKey(s.charAt(jB))){
                    int temp = hm2.get(s.charAt(jB));
                    temp++;
                    hm2.put(s.charAt(jB), temp);
                }else{
                    hm2.put(s.charAt(jB), 1);
                }
                jB++;
            }
//      comparision of all the collected characters
            for(Map.Entry<Character, Integer> entry : hm1.entrySet()){
                char ch = entry.getKey();
                if(hm2.containsKey(ch)){
                    counter += Math.abs(hm2.get(ch) - hm1.get(ch));
                    hm2.put(ch, -1);
                    hm1.put(ch, -1);
                }else{
                    counter += hm1.get(ch);
                    hm1.put(ch, -1);

                }

            }

            for(Map.Entry<Character, Integer> entry : hm2.entrySet()){
                int temp = entry.getValue();
                if(temp != -1){
                    counter += temp;
                }

            }
            println "counter found for index ${i} and vaue is ${counter}"

            if(counter  < counterMin){
//                println "counter found for index ${i} and vaue is ${counterMin}"
                counterMin = counter;
            }

        }
        return counterMin;

    }

    static int countMin(String s){

        int maxChars = 10000000;
        for(int i =0; i < s.length(); i++){
            int maxL = -1;
            int iB = 0,jB = 0;
            // odd case

            int iT = i-1;
            int jT = i+1;

            while(iT >= 0 && jT < s.length() && s.charAt(iT) == s.charAt(jT)){
                iT--;
                jT++;
            }
            if(jT-iT-1 > maxL){
                maxL = jT-iT-1;
                iB = iT;
                jB = jT;
            }

            // even case

            iT = i;
            jT = i+1;

            while(iT >= 0 && jT < s.length() && s.charAt(iT) == s.charAt(jT)){
                iT--;
                jT++;
            }
            if(jT-iT-1 > maxL){
                maxL = jT-iT-1;
                iB = iT;
                jB = jT;
            }


            String s1 = s.substring(0, iB+1);
            String s2 = s.substring(jB, s.length());

            int commonSubString = longestCommonSubsequence(s1, s2);
            maxChars = (int)Math.min(maxChars, (s1.length()+s2.length()-(2*commonSubString)));
        }
        return maxChars;
    }

    private static int longestCommonSubsequence(String s1, String s2){

        int[][] arr = new int[s1.length()+1][s2.length()+1];
        print "lcs for ${s1} ---- ${s2}"
        if(s1.length() > 0 && s2.length() > 0){

            for(int i =0; i < s1.length(); i++){
                for(int j =0; j< s2.length(); j++){
                    int max = Math.max(arr[i+1][j], arr[i][j+1]);
                    if(s1.charAt(i) == s2.charAt(j) && s1.charAt(i) != "~"){
                        s1 = s1.substring(0,i) + "~" + s1.substring(i+1);
                        s2 = s2.substring(0,j) + "~" + s2.substring(j+1);
                        arr[i+1][j+1] = max+1;
                    }else{
                        arr[i+1][j+1] = max;
                    }
                }
            }

            println " is ${arr[s1.length()][s2.length()]}"
            return arr[s1.length()][s2.length()];
        }else{
            println " is ${arr[s1.length()][s2.length()]}"

            return 0;
        }

    }
}
