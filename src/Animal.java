public class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println("Roarr!");
    }

    public String intensity;

    public void animalSound(String intensity) {
        if (intensity == "high") {
            System.out.println("Roarrrrrrrr!");
        } else if (intensity == "low") {
            System.out.println("roar");
        } else {
            System.out.println("cannot reproduce it properly");
        }


    }
}