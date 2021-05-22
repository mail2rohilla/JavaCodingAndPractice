package strings

class LongestPalindrome {

    public void largestPalindrome(String s){

            int maxL = -1;
            int iB = 0,jB = 0;
            for(int i =0; i < s.length(); i++){

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
        }
        System.out.println(s.substring(iB+1, jB));

    }
}
