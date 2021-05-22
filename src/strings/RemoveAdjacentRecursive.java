package strings;

public class RemoveAdjacentRecursive {

    public void removeAdjacent(String s){
        if(s.length() == 0)
            return ;

        int adjacentCount = 0;
        String str =   "";
        char prevChar = s.charAt(0);
        int i=0;
        while(i < s.length()){
            int p = i;
            while(p < s.length() && s.charAt(p) == prevChar)  p++;

            if(p-i == 1)
                str += prevChar;
            else
                adjacentCount++;

            if(p < s.length())
                prevChar = s.charAt(p);

            i = p;
        }

        if(adjacentCount == 0){
            System.out.println(str);
            return;
        }
        if(adjacentCount > 0)
            removeAdjacent(str);

    }
}
