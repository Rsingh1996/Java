public class Main {
    public static void main(String args[]) {
        Human male = new Human("Rahul", 10, 5.9f);
        System.out.println(
                "Name =" + male.getName() + "\n" +
                        "Fingers Count = " + male.getFingerCount() + "\n" +
                        "Height = " + male.getHeight());
        LaptopUtilse utilse = new LaptopUtilse();
        utilse.isLess();
    }
}
