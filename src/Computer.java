public class Computer {
    String Brand;
    String ScreenSize;
    int NumberOfCores;
    String Type;

    public Computer(String Brand, String ScreenSize, int NumberOfCores, String Type) {
        this.Brand = Brand;
        this.ScreenSize = ScreenSize;
        this.NumberOfCores = NumberOfCores;
        this.Type = Type;
    }

    public String getBrand() {
        return this.Brand;
    }

    public String getScreenSize() {
        return this.ScreenSize;
    }

    public int getNumberOfCores() {
        return this.NumberOfCores;
    }

    public String getType() {
        return this.Type;
    }

    public static void main(String[] args) {
        Computer c1 = new Computer("HP", "17", 7, "Laptop");
        System.out.println("Brand: " + c1.getBrand());
        System.out.println("Screen size: " + c1.getScreenSize());
        System.out.println("Number of cores: " + c1.getNumberOfCores());
        System.out.println("Type:  " + c1.getType());
    }
}