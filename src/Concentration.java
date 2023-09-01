public class Concentration {
    public int lactate;
    public int ATP;
    public int glucose;

    public Concentration(int lactate, int ATP, int glucose){
        setlactate(lactate);
        setATP(ATP);
        setglucose(glucose);
    }

    public void setlactate(int lactate) {
        this.lactate = lactate;
    }

    public int getlactate() {
        return this.lactate;
    }

    public void setATP(int ATP) {
        this.ATP = ATP;
    }

    public int getATP() {
        return this.ATP;
    }

    public void setglucose(int glucose) {
        this.glucose = glucose;
    }

    public int getglucose() {
        return this.glucose;
    }
}
