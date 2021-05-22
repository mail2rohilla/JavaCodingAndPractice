package strings

class IsRotated {

    public boolean isRotated(String str1, String str2){

        // Your code here

        if(str1.length() != str2.length())
            return false;

        boolean retval = true;

        int length =  str1.length();

        if(length > 2){
            //clockwise check
            for(int i =2; i < length; i++){
                if(str2.charAt(i%length) == str1.charAt((i-2)%length))
                    continue;
                else{
                    retval = false;
                    break;
                }
            }

            if(retval)
                return retval;
            else
                retval = true;

            //anticlockwise check
            for(int i = str2.length()-2; i < length; i++){
                if(str2.charAt(i%length) == str1.charAt((i-(str2.length()-2)) %length ))
                    continue;
                else{
                    retval = false;
                    break;
                }
            }
        }else if(str1.length() == 1){
            if(str1 == str2)
                return true;
            else
                return false;
        }else if(str1.length() == 0){
            return true;
        }

        return retval;

    }
}
