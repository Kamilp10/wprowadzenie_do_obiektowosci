public class Main {
    public static void main(String[] args) {

        Car audi = new Car("RED",5,"Audi",false);
        System.out.println(audi.getAutomaticGearBox());
        audi.setAutomaticGearBox(true);
        System.out.println(audi.getAutomaticGearBox());
    }
}
