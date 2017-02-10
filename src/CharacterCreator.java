import java.util.ArrayList;

/**
 * Created by Jeongwon Park on 2/7/2017.
 */
public class CharacterCreator {
    public String mFirstName;
    public String mLastName;
    public char mGender;
    public String mClassType;
    public int mAge;
    public int mSwordFighting;

    public CharacterCreator(String fname, String lname, char gender, String classType, int age, int swordFighting){

        //Here i Added some Comments to the Character Creator Class //Threatsignal
        mFirstName = fname;
        mLastName = lname;
        mGender = gender;
        mClassType = classType;
        mAge = age;
        mSwordFighting = swordFighting;
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
}
