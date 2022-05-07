package month2.Animal;

public class Pets {
    private String animal;
    private String action;
    private String breed;
    private int lifespan;


    public Pets(String animal, String action, String breed, int lifespan) {
        this.animal = animal;
        this.action = action;
        this.breed = breed;
        this.lifespan = lifespan;
    }

    public Pets() {

    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}


