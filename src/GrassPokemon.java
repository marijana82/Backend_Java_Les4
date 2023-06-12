package src;

public abstract class GrassPokemon extends Pokemon {

    private String defence;
    public GrassPokemon(String name, int weight, int height, int hp, String sound, String food, String defence) {
        super(name, weight, height, hp, sound, food);
        this.defence = defence;
    }

    @Override
    public void speaks(String sound) {
        System.out.println(sound);
    }

    @Override
    public void eats(String food) {
        System.out.println(food);

    }

    public void defends(String defence) {
        System.out.println(defence);
    }


    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
}
