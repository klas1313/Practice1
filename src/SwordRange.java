import java.util.Random;

/**
 * Created by Jeongwon Park on 2/9/2017.
 */
public class SwordRange {
    static Random rand = new Random();
    private static int mRange;

//    public SwordRange(int min, int max){
//    }

    public static int getRange(){
        return mRange;
    }

    public static void setRange(int min, int max){
        mRange = rand.nextInt(max - min +1) + min;
    }
}
