package shelter;


public class VirtualPet {

    private int hunger;
    private int thirst;
    private int energy;
    private String description;

    public VirtualPet() {
        hunger = 5;
        thirst = 5;
        energy = 5;
        description = "This is a cute and lovely pet that you will love forever.";
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getEnergy() {
        return energy;
    }

    public void feed() {
        hunger -= 2;
    }

    public void water() {
        thirst -= 2;
    }

    public void play() {
        energy -= 2;
    }

    public void tick(){
       hunger += 1;
       thirst += 1;
       energy += 1;
    }
}