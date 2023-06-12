package src;

public class FirePokemon extends Pokemon {

    //instance variables
    private String special;

    //constructor
    public FirePokemon(String name, int weight, int height, int hp, String sound, String food, String special) {
        super(name, weight, height, hp, sound, food);
        this.special = special;
    }

    @Override
    public void speaks(String sound) {
        System.out.println(sound);

    }

    @Override
    public void eats(String food) {
        System.out.println(food);

    }

    public void special(String special) {
        System.out.println(special);
    }


    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }


}
