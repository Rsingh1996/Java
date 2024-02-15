public class HumanUtils {
    public static Human whoIsPowerful(Human firstHuman, Human secondHuman ) {
        if(firstHuman.getPower()>secondHuman.getPower())
            return firstHuman ;
        else 
            return secondHuman;
    }
    public static Human whoIsSmart( Human firstHuman, Human secondHuman ) {
        if(firstHuman.getIq()>secondHuman.getIq())
            return firstHuman ;
        else 
            return secondHuman;
    }
    public static Human whoIsHeavier( Human firstHuman, Human secondHuman ) {
        if(firstHuman.getWeight()>secondHuman.getWeight())
            return firstHuman ;
        else 
            return secondHuman;
    }
}
