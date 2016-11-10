public class Herbivorous extends Mammals {
    private boolean alive = true;
    final private String typeOfFeeding = "Herbivorous";
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Herbivorous.count = count;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void die (){
        setAlive(false);
        count++;
    }

    public String toString (){
        return "Species is "+ getSpecies() +
                ". Heterotroph " + isHeterotroph()+
                ". Age of "+ getAge()
                +". Alive "+isAlive()+
                ". WarmBlooded: "+isWarmBloodedness();
    }
}
