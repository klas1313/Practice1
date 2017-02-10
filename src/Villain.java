public class Villain extends CharacterCreator{

    public Villain(String fname, String lname, char gender, String classType, int age, int swordFighting) {
        super(fname, lname, gender, classType, age, swordFighting);
    }

    public String evilActions(String evil){
        int choice = 0;
        //System.out.println("Choose between 1,2,3. 1 will pillage a village, 2 will rape churches and burn women, 3 will be a dick to small children. If you don't want to select any of them then go with 4 which will make you do nothing");

        switch (choice){
            case 1:
                if(evil.equals("pillage")) {
                    return getFirstName() + " has pillaged a nearby village, taking what little gold and food owned by the locals";
                } else {
                    return getFirstName() + " did nothing of any notice";
                }
            case 2:
                if(evil.equals("rape")) {
                    return getFirstName() + " has raped churches and burned women, spreading fear and chaos throughout the land";
                } else {
                    return getFirstName() + " did nothing. How boring";
                }
            case 3:
                if(evil.equals("dick")) {
                    return getFirstName() + " cruelly crushed the precious dreams of small children. Their tears quenched your thirst";
                } else {
                    return getFirstName() + "%s has disappointed the god of evildoers. His patience is growing thin";
                }
            default:
               return getFirstName() + "You have contemplated doing something but couldn't find anything worth your time";
        }
    }

}