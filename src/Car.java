public class Car {
    private String colour;
    private int doorsAmount;
    private String brand;
    private boolean automaticGearBox;


   public Car(String colour, int doorsAmount, String brand, boolean automaticGearBox){
       this.colour=colour;
       this.doorsAmount=doorsAmount;
       this.brand=brand;
       this.automaticGearBox=automaticGearBox;
   }

   public boolean setAutomaticGearBox(boolean automaticGearBox){
       this.automaticGearBox=automaticGearBox;
       return automaticGearBox;
   }

    public boolean getAutomaticGearBox() {
        return false;
    }
}
