public class Main {
     public static void main(String[] args) {
        Human ankit = new Human("ankit", 10, 6.0f, 125.8f, 100,60);
        System.out.println(
            "Name : "+ankit.getName()+"\n"+
            "FingerCount : "+ankit.getFingerCount()+"\n"+
            "Height : "+ankit.getHeight()+"\n"+
            "Weight : "+ankit.getWeight()+"\n"+
            "Power : "+ankit.getPower()+"\n"+
            "IQ : "+ankit.getIq()+"\n"
        );

        Human rahul = new Human("rahul", 5, 4f, 10f, 10,100);
        System.out.println(
            "Name : "+rahul.getName()+"\n"+
            "FingerCount : "+rahul.getFingerCount()+"\n"+
            "Height : "+rahul.getHeight()+"\n"+
            "Weight : "+rahul.getWeight()+"\n"+
            "Power : "+rahul.getPower()+"\n"+
            "IQ : "+rahul.getIq()+"\n"
        );

        Human powerfulHuman = HumanUtils.whoIsPowerful(ankit, rahul);
        System.out.println(powerfulHuman.getName() + " is powerful human in the universe");
        Human smartHuman = HumanUtils.whoIsSmart(ankit, rahul);
        System.out.println(smartHuman.getName() + " is smart human in the universe");
        Human heaviHuman = HumanUtils.whoIsHeavier(ankit, rahul);
        System.out.println(heaviHuman.getName() + " is heavier human in the universe");
    }    
}
