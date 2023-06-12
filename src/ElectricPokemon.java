package src;

public abstract class ElectricPokemon extends Pokemon {

    private String accuracy;


//default constructor containing super
    public ElectricPokemon(String name, int weight, int height, int hp, String sound, String food, String accuracy) {
        super(name, weight, height, hp, sound, food);
        this.accuracy = accuracy;
    }

    public void speaks(String sound) {
        System.out.println(sound);

    }

    @Override
    public void eats(String food) {
        System.out.println(food);

    }

    public void thunderPunch(String accuracy) {

        System.out.println(accuracy);
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

}
