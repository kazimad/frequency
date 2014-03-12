import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;



/**
 * Created by KaZimad on 11.03.14.
 */
public class Dictionary  {


    public static void main (String []args) throws IOException {

        String num;

        HashSet<Integer> SetOfInt = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new FileReader("pass.txt"));
        while ((num = br.readLine()) !=null){
            StringTokenizer stnum = new StringTokenizer(num);
            while (stnum.hasMoreTokens()){
                String token = stnum.nextToken();
                Integer  q = Integer.parseInt(token);
                SetOfInt.add(q);
            }

        }
        System.out.println(SetOfInt.size());
    }

}
