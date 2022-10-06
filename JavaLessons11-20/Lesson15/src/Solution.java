import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Solution  {
    public static int intVar = 123;
    public static double doubleVar;
    public static boolean booleanVar;
    public static Object ObjectVar ;
    public static Exception ExceptionVar;
    public static String StringVar;
    public static Map<Double, String> labels = new HashMap<>();
    static {
        for (int i = 0; i < 5; i++) {
            labels.put((double)i,"ff" + i);
        }
    }

    static {
        if(true) throw new RuntimeException();
    }



    public static int C = 5;

    public static int A,B;

    static {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            A = Integer.parseInt(br.readLine());
            B = Integer.parseInt(br.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public final static  int MIN = min(A,B);

    public static int min(int a,int b){
        return a < b ? a : b;
    }
}
