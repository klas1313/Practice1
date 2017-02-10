import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jeongwon Park on 2/7/2017.
 */
public class CharacterCreator {
    //Constants determining the sword range. Change these to change random values.
    private static int minSwordFighting;  // Here i'm adding your constants They will be set by program
    private static int maxSwordFighting;

    private Random rand = new Random();
    private static int mRange;
    private String mFirstName;
    private String mLastName;
    private char mGender;
    public String mClassType;
    public int mAge;
    public int mSwordFighting;

    public CharacterCreator(String fname, String lname, char gender, String classType, int age){

        //Here i Added some Comments to the Character Creator Class //Threatsignal
        mFirstName = fname;
        mLastName = lname;
        mGender = gender;
        mClassType = classType;
        mAge = age;

        setSwordFighting(minSwordFighting, maxSwordFighting);

    }

    public String getFirstName(){
        return mFirstName;
    }

    public String getLastName(){
        return mLastName;
    }

    public char getGendere(){
        return mGender;
    }

    public String getClassType(){
        return mClassType;
    }

    public int getAge(){
        return mAge;
    }

    public int getSwordFighting(){
        return mSwordFighting;
    }

    public void setFirstName(String fname){
        mFirstName = fname;
    }

    public void setLastName(String lname){
        mLastName = lname;
    }

    public void setGender(char gender){
        if(gender == 'M'|| gender == 'm'){
            mGender = 'M';
        } else if(gender == 'F' || gender == 'f'){
            mGender = 'F';
        } else {
         System.out.println("Not a valid gender");
        }
    }

    public void setAge(int age){
        mAge = age;
    }

    public void setSwordFighting(int swordFighting){
        mSwordFighting = swordFighting;
    }


    //These two static methods are used to preset the sword fighting skills before objects are created.
    public static void setMinSwordFighting(int value){
        minSwordFighting = value;
    }
    public static void setMaxSwordFighting(int value){
        maxSwordFighting = value;
    }
//Here are some changes wtf


    //This method is called by this classes Constructor! used to set the mSwordFighting variable for each object when it is created. Allows it to be created randomly.
    public void setSwordFighting(int min, int max){
        mSwordFighting = rand.nextInt(max - min +1) + min;
    }



}
