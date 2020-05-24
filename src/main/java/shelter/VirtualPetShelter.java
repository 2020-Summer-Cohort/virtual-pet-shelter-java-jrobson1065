package shelter;


import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    public VirtualPetShelter() {
    }

    public void addPet(String name, VirtualPet pet) {
        pets.put(name, pet);
    }

    public void removePet(String name) {
        pets.remove(name);
    }

    public void showPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet())
            System.out.println("\t" + entry.getKey() + "\n" +
                    "\t\tHunger: " + entry.getValue().getHunger() +
                    "\t\tThirst: " + entry.getValue().getThirst() +
                    "\t\tEnergy: " + entry.getValue().getEnergy());
    }

    public void showPetNames() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet())
            System.out.println(entry.getKey());
    }

    public void feedAllPets() {
        for (VirtualPet value : pets.values())
            value.feed();
    }

    public void feedPet(String name) {
        pets.get(name).feed();
    }

    public void waterAllPets() {
        for (VirtualPet value : pets.values())
            value.water();
    }

    public void waterPet(String name) {
        pets.get(name).water();
    }

    public String showDiscription(String name) {
        return pets.get(name).getDescription();
    }

    public void playAllPets() {
        for (VirtualPet value : pets.values())
            value.play();
    }

    public void playPet(String name) {
        pets.get(name).play();
    }

    public void tick() {
        for (VirtualPet value : pets.values())
            value.tick();
    }
}
