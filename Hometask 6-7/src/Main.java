public class Main {
    public static void main(String[] args) {

        Carnivorous wolf = new Carnivorous();
        Herbivorous deer = new Herbivorous();
        Herbivorous hare = new Herbivorous();
        Carnivorous fox = new Carnivorous();
        Herbivorous moose = new Herbivorous();
        Carnivorous bear = new Carnivorous();
        Herbivorous cow = new Herbivorous();

        wolf.setSpecies("Wolf");
        wolf.setAge(13);
        deer.setSpecies("Deer");
        deer.setAge(9);
        hare.setSpecies("Hare");
        hare.setAge(3);
        fox.setSpecies("Fox");
        fox.setAge(4);
        moose.setSpecies("Moose");
        moose.setAge(9);
        bear.setSpecies("Bear");
        bear.setAge(10);
        cow.setSpecies("Cow");
        cow.setAge(5);

        wolf.eatHerbivorous(deer);
        wolf.eatCarnivorous(fox);
        wolf.eatHerbivorous(hare);
        wolf.eat(moose);
        bear.eat1(wolf);
        bear.eat1(cow);

        System.out.println(wolf);
        System.out.println(deer);
        System.out.println(hare);
        System.out.println(fox);
        System.out.println(moose);
        System.out.println(bear);
        System.out.println(cow);
        Carnivorous.counter();

    }
}