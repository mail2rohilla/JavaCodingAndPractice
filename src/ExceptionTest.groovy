import arrays.CircularTour
import arrays.Sort012
import arrays.Utility
import problems.JosepheusProblem
import sorting.HeapSort
import sorting.MergeSort
import sorting.QuickSort
import strings.FindAnagrams
import strings.IsRotated
import strings.LongestDistinctCharacters
import strings.LongestPalindrome
import strings.MakePalindrome
import strings.PermutateStrings
import strings.RemoveAdjacentRecursive

import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {

    public static void main(String[] args) {

//        testQuickSort()
//        testSort012();
//        testDemo();

//        testMergeStrings();
//        permutateStrings();
//        testRemoveAdjacentRecursive();

//        testIsRotated();

//        testLongestpalindro=m();

//        testMakePalindrome();
//        testDistinctChars();

//        testFindAnagrams();
//        temp();;
//        circularTour();

//        heapSort();

        testJosepheusProblem();


     }


    private static void testMerge(){
        List<Integer> x = [4,3,2,1];
        MergeSort ms = new MergeSort();
        int n = 20;
        int[] arr = ms.getTestCase(n);
        println arr;
        ms.merge(arr, 0, n-1)
        print "${arr}";
    }

    private static void testRemoveAdjacentRecursive(){
        String s = "aaaaaaaaaaaaa";
        RemoveAdjacentRecursive rec = new RemoveAdjacentRecursive();

        rec.removeAdjacent(s);
    }
    private static void testMergeStrings(){
        MergeSort ms = new MergeSort();
        int n = 5;
//        String[] arr = ms.getTestCaseStrings(n);
        String[] arr = ["3", "30", "34",  "5",  "9"];
        println arr;
        ms.mergeSort(arr, 0, n-1);
        print "${arr}";
    }


    private static void testSort012(){
        Sort012 obj = new Sort012();
        int n = 1;
        int[] arr = obj.getTestCase(n);
//        int[] arr = [0, 0, 2, 0, 0, 1, 1, 0, 1, 2, 1, 1, 1, 2, 2, 2, 1, 0, 2, 1];
//        int[] arr = [2, 1,2,1,2,1,0]
//        int[] arr = [0, 0, 2, 0, 0]
        println "test arr ${arr}";
        obj.sort012(arr, arr.length)
        print "sorted arr ${arr}";
    }

    private static void testQuickSort(){
        QuickSort obj = new QuickSort();
        int n = 1;
        int[] arr = obj.getTestCase(n);
//        int[] arr = [68, 4, 34, 95, 21];
        println "test arr ${arr}";
        obj.quickSort(arr, 0, arr.length-1)
        println "sorted arr ${arr}";
        println "testing sort ${testSort(arr)}"
    }

    private static void permutateStrings(){
        PermutateStrings obj = new PermutateStrings();
        int n = 1;
        String s = "ABGS"
//        int[] arr = obj.getTestCase(n);
//        int[] arr = [68, 4, 34, 95, 21];
//        println "test arr ${s}";
        obj.permutate(s.toCharArray(), 0)
    }


    private static void testDemo(){
        Demo demo = new Demo();
        demo.readRecursiveFiles("/home/deepanshu/MPHRX/mphrx-angular/themes/htmlFiles/components/serviceRequest/v0")
    }

    private static void testIsRotated(){
        IsRotated obj = new IsRotated();

        String s1 = "b\n"
        String s2 = "b\n"

        print "depanshu ${obj.isRotated(s1, s2)}"
    }
    private static boolean testSort(int[] arr){
        int prev = arr[0];
        for(int i =1; i< arr.length; i++){
            if(arr[i] >= prev){
                prev = arr[i];
                continue;
            }else{
                return false;
            }
        }
        return  true;
    }
    private static boolean testLongestpalindrom(){
        String s = "fyfvladzpbfudkklrwq";
        new LongestPalindrome().largestPalindrome(s);
    }
    private static boolean testMakePalindrome(){
        String s = "justintumblera";
        int counter = new MakePalindrome().countMin(s);

        print "value of min couner = ${counter}"
    }
    private static boolean testDistinctChars(){
        String s = "geeksforgeeks";
        int counter = new LongestDistinctCharacters().longestSubstrDitinctChars(s);

        print "value of min couner = ${counter}"
    }

    private static boolean testFindAnagrams(){
        String s = "cbaebabacd";
        String p = "abc";
        List list = new FindAnagrams().findAnagrams(s, p);

        print "List is  = ${list}"
    }

    private static void temp(){;}
    private static void circularTour(){
        print("deepanshu ${new CircularTour().tour(Utility.getParsedIntArray('4 6 6 5', ' '),Utility.getParsedIntArray('7 3 4 5',   ' ')) }");
    }


    private static void heapSort(){
        int[] arr =  Utility.getRandomIntArray(5, 20);
//        int[] arr =  [14, 18, 15,  8, 7];
        new HeapSort().heapSort(arr, arr.length);

        println "${arr}"
    }

    private static void testJosepheusProblem(){
//        int[] arr =  [14, 18, 15,  8, 7];
        new JosepheusProblem().josephus(5, 3);

    }



}