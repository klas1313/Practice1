/**
 * Created by Jeongwon Park on 2/8/2017.
 */
public class Hero extends CharacterCreator {

    public Hero(String fname, String lname, char gender, String classType, int age, int swordFighting) {
        super(fname, lname, gender, classType, age, swordFighting);
    }

    public String doSomethingGood(String good) {
        int choice = 0;
        //System.out.println("Choose between 1,2,3. 1 will save a village, 2 will protect the weak, 3 will be kind. If you don't want to select any of them then go with 4 which will make you do nothing");

        switch (choice) {
            case 1:
                if (good.equals("save")) {
                    return getFirstName() + " has saved a nearby village, saving lives of the locals";
                } else {
                    return getFirstName() + " did nothing of any notice";
                }
            case 2:
                if (good.equals("protect")) {
                    return getFirstName() + " has protected the weak and the innocent";
                } else {
                    return getFirstName() + " did nothing. How boring";
                }
            case 3:
                if (good.equals("kind")) {
                    return getFirstName() + " showed compassion and kindness to those who are in need";
                } else {
                    return getFirstName() + "%s has disappointed the goddess of compassion. Her patience is growing thin";
                }
            default:
                return getFirstName() + "You have contemplated doing something but couldn't find anything worth your time";
        }
    }
}
