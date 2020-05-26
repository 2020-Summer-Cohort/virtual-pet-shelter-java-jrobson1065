package shelter;


import java.util.Collection;
import java.util.Scanner;

public class VirtualPetApp {

    private static VirtualPetShelter shelter = new VirtualPetShelter();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        welcome();
        generatePets();
        showPets();
        gameLoop();
    }

    private static void generatePets() {
        VirtualPet pet1 = new VirtualPet("Max", "Max is a beautiful dog that is very loving.");
        VirtualPet pet2 = new VirtualPet("Skippy", "Skippy is a young black puppy with lots of energy.");
        shelter.addPet("Max", pet1);
        shelter.addPet("Skippy", pet2);
    }

    private static void showPets() {
        Collection<VirtualPet> pets = shelter.showPets();
        for (VirtualPet pet : pets)
            System.out.println(pet.getName() + "\n" +
                    "\tHunger: " + pet.getHunger() +
                    "\tThirst: " + pet.getThirst() +
                    "\tEnergy: " + pet.getEnergy());
    }

    public static String stringCapFirstLetter(String string) {
        if (string.length() < 2) return string;
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    private static void showPetNames() {
        shelter.showPetNames();
    }

    private static void welcome() {
        System.out.println("Welcome to the pet shelter. Here are our pets:");
    }

    private static void gameLoop() {
        while (true) {

            whatToDo();
            shelter.tick();
            showPets();
        }
    }

    private static void whatToDo() {
        System.out.println("What would you like to do?");
        System.out.println("\t 1: Feed");
        System.out.println("\t 2: Water");
        System.out.println("\t 3: Play");
        System.out.println("\t 4: Adopt");
        System.out.println("\t 5: Admit");

        int response = input.nextInt();
        input.nextLine();

        switch (response) {
            case 1:
                feedOptions();
                break;
            case 2:
                waterOptions();
                break;
            case 3:
                playOptions();
                break;
            case 4:
                adoptOptions();
                break;
            case 5:
                admitOptions();
        }
    }

    private static void feedOptions() {
        System.out.println("Enter pet name or \"all\" to feed all:");
        showPetNames();
        String response = stringCapFirstLetter(input.nextLine());

        if (response.toLowerCase().equals("all")) {
            shelter.feedAllPets();
        } else {
            shelter.feedPet(response);
        }
    }

    private static void waterOptions() {
        System.out.println("Enter pet name or \"all\" to water all:");
        showPetNames();
        String response = stringCapFirstLetter(input.nextLine());

        if (response.toLowerCase().equals("all")) {
            shelter.waterAllPets();
        } else {
            shelter.waterPet(response);
        }
    }

    private static void playOptions() {
        System.out.println("Enter pet name or \"all\" to play with all:");
        showPetNames();
        String response = stringCapFirstLetter(input.nextLine());

        if (response.toLowerCase().equals("all")) {
            shelter.playAllPets();
        } else {
            shelter.playPet(response);
        }
    }

    private static void adoptOptions() {
        System.out.println("Enter pet name to adopt:");
        showPetNames();
        String response = stringCapFirstLetter(input.nextLine());

        System.out.println("You adopted " + response + ". " + shelter.showDescription(response));
        shelter.removePet(response);
    }

    private static void admitOptions() {
        System.out.println("Enter pet name to admit:");
        String name = stringCapFirstLetter(input.nextLine());
        System.out.println("Enter pet description:");
        String description = stringCapFirstLetter(input.nextLine());

        shelter.addPet(name, new VirtualPet(name, description));
    }

}
