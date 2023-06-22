public class ExhaustPart extends Part {
    private boolean euroStandard;

    public ExhaustPart(boolean euroStandard, String Id, String manufacturerName, String model, String series) {
        this.euroStandard = euroStandard;
        setId(Id);
        setManufacturerName(manufacturerName);
        setModel(model);
        setSeries(series);
    }

    public boolean isEuroStandard() {
        return euroStandard;
    }

    public void setEuroStandard(boolean euroStandard) {
        this.euroStandard = euroStandard;
    }

    public void printInfo () {
        System.out.println("Opis systemu wydechowego:");
        System.out.println("Czy spełnia normę EURO ? " + isEuroStandard());
        System.out.println("ID: " + getId());
        System.out.println("Nazwa producenta: " + getManufacturerName());
        System.out.println("Model: " + getModel());
        System.out.println("Seria: " + getSeries());
    }

}
