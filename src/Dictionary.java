import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;


/**
 * Created by KaZimad on 11.03.14.
 */
public class Dictionary  {


    public static void main (String []args) throws IOException {

        String num;
        int count1,count2,count3,count4,count5,count6,count7,count8,count9,count0;
        TreeMap <Integer,Integer>SetOfInt = new TreeMap<Integer, Integer>();
        BufferedReader br = new BufferedReader(new FileReader("pass.txt"));
        while ((num = br.readLine()) !=null){
            StringTokenizer stnum = new StringTokenizer(num);
            while (stnum.hasMoreTokens()){
                String token = stnum.nextToken();
                Integer  q = Integer.parseInt(token);
                SetOfInt.put( q ,q);
            }

        }
        System.out.println(SetOfInt.size());
    }

}
