package src;

public class WaterPokemon extends Pokemon {

    String attack;
    public WaterPokemon(String name, int weight, int height, int hp, String sound, String food, String attack) {
        super(name, weight, height, hp, sound, food);
        this.attack = attack;
    }

    public void speaks(String sound) {
        System.out.println(sound);

    }

    @Override
    public void eats(String food) {
        System.out.println(food);

    }

    public void hydroPump(String attack) {
        System.out.println(attack);
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

}
