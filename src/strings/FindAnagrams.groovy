package strings

class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {

        System.out.println("string is  " + (s));
        System.out.println("string2 is  " + (p));

        ArrayList<Integer> retval = new ArrayList();
        int[] frequency = new int[26];
        int[] temp = new int[26];
        char ch = 'a';
        for(int i = 0; i < p.length(); i++)
            frequency[p.charAt(i) - ch]++;


        int tempI = 0;
        while(tempI < p.length())
            temp[s.charAt(tempI++) - ch]++;

        int l = 0, r = tempI;

        while(r <= s.length()){
            if(compare(frequency, temp, 26))
                retval.add(l);

            if(r < s.length()){
                temp[s.charAt(l) - ch]--;
                temp[s.charAt(r) - ch]++;
            }
            l++;
            r++;
        }

        return retval;

    }

    private boolean compare(int[] ar1, int[] ar2, int n){
        for(int i =0; i< n; i++){
            if(ar1[i] != ar2[i])
                return false;
        }
        return true;
    }

}
