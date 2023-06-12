package src;

public class Pokemon {
    //1. instance variables
    private String name;
    private int weight;
    private int height;
    private int hp;
    private String sound;
    private String food;

    //2. constructor
    public Pokemon(String name, int weight, int height, int hp, String sound, String food) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.hp = hp;
        this.sound = sound;
        this.food = food;
    }

    //3. getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    //4. methods
    public abstract void speaks(String sound);

    public abstract void eats(String food);

    public void testingMyPokeHeight() {
        System.out.println("This is the pokemon's height: " + height);
    }


}




