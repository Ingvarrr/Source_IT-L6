public class Animals {
    private String species;
    private boolean heterotroph = true;
    private int age;


    public void eat(Animals animals){}


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {this.species = species;}

    public boolean isHeterotroph() {
        return heterotroph;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}