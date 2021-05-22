import java.util.regex.Matcher
import java.util.regex.Pattern

class Demo {
    void readFile( File file, String filePath = null){
        if(filePath == null && file == null)
            return;
        try
        {
            String pattern = "(ng-change.*?~.*?~)";
            Pattern r = Pattern.compile(pattern);
            Matcher m;
            File myObj = file ? file :  new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                m = r.matcher(data);
                if (m.find()) {
                    System.out.println("Found value : ${file.toString()}" + m.group(0) );
                }else {
                   // System.out.println("NO MATCH");
                }
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        println " EOF ${file?.toString()}"
        println " "
        println " "
    }

    void readRecursiveFiles(String dir){
        try
        {
            File dirFile = new File(dir);
            if(dirFile.isDirectory()){
                String[] listFiles = dirFile.list();
                for(String f : listFiles){
                    readRecursiveFiles(dir + '/' + f);
                }
            }else{
                readFile(dirFile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String s;
        temp(s, 10f);

        PriorityQueue<Integer> pq;
        pq.remove();
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        PriorityQueue
    }

    public void temp(String s, float i) {
        println s;
        println "in string";
    };

    @Override
    protected void finalize(){
        super.finalize();
        print "finalized";

    }


//    private void temp(int s) {
//        print s
//        println "in int";
//
//    };
}
