public class Tire extends Part {
    private int size;
    private int width;

    public Tire(int size, int width, String Id, String manufacturerName, String model, String series) {
        this.size = size;
        this.width = width;
        setId(Id);
        setManufacturerName(manufacturerName);
        setModel(model);
        setSeries(series);

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void printInfo () {
        System.out.println("Opis opony:");
        System.out.println("Rozmiar: " + getSize());
        System.out.println("Szerokość: " + getWidth());
        System.out.println("ID: " + getId());
        System.out.println("Nazwa producenta: " + getManufacturerName());
        System.out.println("Model: " + getModel());
        System.out.println("Seria: " + getSeries());
    }
}
