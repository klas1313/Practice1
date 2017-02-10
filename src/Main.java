import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Jeongwon Park on 2/7/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<String> fnameList= new ArrayList<String>();
        fnameList.add(0,"Zakilvo");
        fnameList.add(1,"Kihalin");
        fnameList.add(2,"Selis");
        fnameList.add(3,"Jaskarr");
        fnameList.add(4,"Pagalla");
        fnameList.add(5,"Testadin");
        fnameList.add(6,"Falcondir");
        fnameList.add(7,"Mazzhuir");
        fnameList.add(8,"Daunst");
        fnameList.add(9,"Bbezmin");

        ArrayList<String> lnameList= new ArrayList<String>();
        lnameList.add(0,"Lapallanch");
        lnameList.add(1,"Yysvell");
        lnameList.add(2,"Schenhellr");
        lnameList.add(3,"Jamerrik");
        lnameList.add(4,"Wyvenffir");

        System.out.println("What is the minimum swordfighting value?");
        int min = sc.nextInt();

        System.out.println("What is the maximum swordfighting value?");
        int max = sc.nextInt();

//        int min = rand.nextInt(50 - 25 + 1) + 25;
//        int max = rand.nextInt(100 - 50 + 1) + 50;
        //SwordRange swordRange = new SwordRange(100,100);
        SwordRange.setRange(min,max);
        int sr1 = SwordRange.getRange();
        SwordRange.setRange(min,max);
        int sr2 = SwordRange.getRange();

        Villain evilOne = new Villain(fnameList.get(rand.nextInt(10)), lnameList.get(rand.nextInt(5)), 'M', "Evil Soldier", 30,sr1);
        Hero goodKnight = new Hero(fnameList.get(rand.nextInt(10)),lnameList.get(rand.nextInt(5)),'M', "Paladin", 32,sr2);



//        System.out.println(evilOne.evilActions("pillage"));
//        System.out.println(evilOne.evilActions("rape"));
//        System.out.println(evilOne.evilActions("dick"));
//        System.out.println(evilOne.evilActions("nothing"));
        System.out.println(evilOne.getSwordFighting());
//        System.out.println(goodKnight.doSomethingGood("save"));
//        System.out.println(goodKnight.doSomethingGood("protect"));
//        System.out.println(goodKnight.doSomethingGood("kind"));
//        System.out.println(goodKnight.doSomethingGood("love"));
        System.out.println(goodKnight.getSwordFighting());

//        if(evilOne.getSwordFighting() > goodKnight.getSwordFighting()){
//            System.out.printf("%s %s, the %s is stronger than %s %s, the %s!", evilOne.getFirstName(), evilOne.getLastName(), evilOne.getClassType(), goodKnight.getFirstName(), goodKnight.getLastName(), goodKnight.getClassType());
//        } else {
//            System.out.printf("%s %s, the %s is stronger than %s %s, the %s!", goodKnight.getFirstName(), goodKnight.getLastName(), goodKnight.getClassType(), evilOne.getFirstName(), evilOne.getLastName(), evilOne.getClassType());
//        } if (evilOne.getSwordFighting() == goodKnight.getSwordFighting()) {
//            System.out.printf("%s %s, the %s is as strong as %s %s, the %s!", goodKnight.getFirstName(), goodKnight.getLastName(), goodKnight.getClassType(), evilOne.getFirstName(), evilOne.getLastName(), evilOne.getClassType());
//        }

        int choice = 0;

        switch (choice) {
            case 1:
                if (evilOne.getSwordFighting() > goodKnight.getSwordFighting()) {
                    System.out.printf("%s %s, the %s is stronger than %s %s, the %s!", evilOne.getFirstName(), evilOne.getLastName(), evilOne.getClassType(), goodKnight.getFirstName(), goodKnight.getLastName(), goodKnight.getClassType());
                } else {
                    System.out.printf("%s %s, the %s is stronger than %s %s, the %s!", goodKnight.getFirstName(), goodKnight.getLastName(), goodKnight.getClassType(), evilOne.getFirstName(), evilOne.getLastName(), evilOne.getClassType());
                }
            default:
                System.out.printf("%s %s, the %s is as strong as %s %s, the %s!", goodKnight.getFirstName(), goodKnight.getLastName(), goodKnight.getClassType(), evilOne.getFirstName(), evilOne.getLastName(), evilOne.getClassType());
        }

    }
}
