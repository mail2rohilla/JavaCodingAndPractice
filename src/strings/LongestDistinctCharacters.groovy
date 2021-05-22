package strings

class LongestDistinctCharacters {
    int longestSubstrDitinctChars(String S){

        int i =0, j =0, maxGap = -1;
        HashMap<Character, Integer> map = new HashMap();
        while(i < S.length() && j < S.length() ){
            if(map.containsKey(S.charAt(j))){
                while(i <= j){
                    if( S.charAt(i) == S.charAt(j)){
                        map.remove(S.charAt(i));
                        i++;
                        break;
                    }else{
                        map.remove(S.charAt(i));
                        i++;
                    }
                }
            }else{
                map.put(S.charAt(j), 1);
                j++;
                maxGap = (int)Math.max(j-i, maxGap);
            }
        }

        return maxGap;
    }
}
