public class Mammals extends Animals{
    private boolean warmBloodedness = true;
    private boolean liveBirth;
    private boolean neurodevelopmental = true;

    public boolean isWarmBloodedness() {
        return warmBloodedness;
    }

    public void setWarmBloodedness(boolean warmBloodedness) {
        this.warmBloodedness = warmBloodedness;
    }

    public boolean isLiveBirth() {
        return liveBirth;
    }

    public void setLiveBirth(boolean liveBirth) {
        this.liveBirth = liveBirth;
    }

    public boolean isNeurodevelopmental() {
        return neurodevelopmental;
    }

    public void setNeurodevelopmental(boolean neurodevelopmental) {
        this.neurodevelopmental = neurodevelopmental;
    }
}