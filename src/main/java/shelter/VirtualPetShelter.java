package shelter;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    public VirtualPetShelter() {
    }

    public VirtualPet returnVirtualPetByName(String name) {
        return pets.get(name);
    }

    public void addPet(String name, VirtualPet pet) {
        pets.put(name, pet);
    }

    public void removePet(String name) {
        pets.remove(name);
    }

    public Collection<VirtualPet> showPets() {
        return pets.values();
    }

    public void showPetNames() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet())
            System.out.println(pet.getKey());
    }

    public void feedAllPets() {
        for (VirtualPet value : pets.values())
            value.feed();
    }

    public VirtualPet returnPet(String name) {
        return pets.get(name);
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

    public String showDescription(String name) {
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