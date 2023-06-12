package src;

public class Main {

    public static void main(String[] args) {

        //type 1
        FirePokemon charmender = new FirePokemon(
                "Charmander",
                200,
                150,
                50,
                "har-har",
                "flies",
                "hij is niet jarig"
        );

        charmender.eats(charmender.getFood());
        charmender.speaks(charmender.getSound());
        charmender.special(charmender.getSpecial());

        //type 2
        ElectricPokemon raichu = new ElectricPokemon(
                "Raichu",
                75,
                55,
                100,
                "rai-rai",
                "butterflies",
                "very accurate");


        raichu.thunderPunch(raichu.getAccuracy());

        //type 3
        GrassPokemon bulbasaur = new GrassPokemon(
                "Bulbasaur",
                200,
                150,
                270,
                "bulba-bulba",
                "sunlight",
                "very defensive"
        );

        bulbasaur.eats(bulbasaur.getFood());
        bulbasaur.defends(bulbasaur.getDefence());

        //type 4
        WaterPokemon blastoise = new WaterPokemon(
                "Blastoise",
                300,
                76,
                250,
                "bla-bla",
                "fish",
                "hydro pump"
        );

        //this is a more flexible way of writing code, because if i want, I can replace what's written in the () with a "hard value"
        blastoise.hydroPump(blastoise.getAttack());
        //and if I write it like this it's less flexible, because then I can't give any new argument in the (), I have to use what's been defined at Pokemon
        blastoise.testingMyPokeHeight();

    }


}
