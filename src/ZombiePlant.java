public class ZombiePlant {
    private int potency;
    private int treatment;
    public ZombiePlant(int potency, int treatment) {
        this.potency = potency;
        this.treatment = treatment;
    }
    public int getPotency() {
        return potency;
    }
    public int treatmentsNeeded() {
        return treatment;
    }
    public boolean isDangerous() {
        return treatment > 0;
    }
    public void treat(int potency) {
        if (potency <= 0) {}
        else if (potency > this.potency) treatment++;
        else if (treatment > 0) treatment--;
    }
}
