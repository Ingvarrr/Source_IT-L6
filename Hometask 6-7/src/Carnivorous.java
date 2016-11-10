import java.util.Objects;

public class Carnivorous extends Mammals {
    private boolean alive = true;
    private String typeOfFeeding = "Carnivorous";
    public static int count;

    public String getTypeOfFeeding() {
        return typeOfFeeding;
    }

    public void setTypeOfFeeding(String typeOfFeeding) {
        this.typeOfFeeding = typeOfFeeding;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Carnivorous.count = count;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void die (){
        setAlive(false);
        count++;}

    public void eatHerbivorous (Herbivorous obj){ obj.die();}
    public void eatCarnivorous (Carnivorous obj){obj.die();}

    public String toString (){
        return "Species is "+ getSpecies() +
                ". Heterotroph " + isHeterotroph()+
                ". Age of "+ getAge() +
                ". Alive "+isAlive()+
                ". WarmBlooded: "+isWarmBloodedness();
    }
    public static void counter(){
        System.out.println("Animals eaten: "+
                (Herbivorous.getCount()+Carnivorous.count)+
                ". From them herbivorous: "+Herbivorous.getCount()+
                " and carnivorous: "+
                Carnivorous.getCount());
    }
}