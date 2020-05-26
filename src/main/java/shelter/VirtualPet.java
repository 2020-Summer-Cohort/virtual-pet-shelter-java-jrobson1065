package shelter;


public class VirtualPet {

    private int hunger;
    private int thirst;
    private int energy;
    private String name;
    private String description;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        hunger = 50;
        thirst = 50;
        energy = 50;
    }

    public VirtualPet(String name, String description, int hunger, int thirst, int energy) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.energy = energy;
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void feed() {
        hunger -= 10;
    }

    public void water() {
        thirst -= 10;
    }

    public void play() {
        energy -= 10;
    }

    public void tick() {
        hunger += 5;
        thirst += 5;
        energy += 5;
    }
}