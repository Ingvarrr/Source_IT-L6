public class Main {
    public static void main(String[] args) {

        Carnivorous wolf = new Carnivorous();
        Herbivorous deer = new Herbivorous();
        Herbivorous hare = new Herbivorous();
        Carnivorous fox = new Carnivorous();

        wolf.setSpecies("Wolf");
        wolf.setAge(13);
        deer.setSpecies("Deer");
        deer.setAge(9);
        hare.setSpecies("Hare");
        hare.setAge(3);
        fox.setSpecies("Fox");
        fox.setAge(4);

        wolf.eatHerbivorous(deer);
        wolf.eatCarnivorous(fox);
        wolf.eatHerbivorous(hare);

        System.out.println(wolf);
        System.out.println(deer);
        System.out.println(hare);
        System.out.println(fox);
        Carnivorous.counter();

    }
}