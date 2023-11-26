package software.ulpgc.Kata2;

public class Cars {
    private final String name;
    private final int year;
    private final int selling_price;
    private final int km_driven;
    private final String fuel;
    private final String seller_type;
    private final String transmission;
    private final String owner;
    public Cars(String name, int year, int sellingPrice, int kmDriven, String fuel, String sellerType, String transmission, String owner){
        this.name = name;
        this.year = year;
        this.selling_price = sellingPrice;
        this.km_driven = kmDriven;
        this.fuel = fuel;
        this.seller_type = sellerType;
        this.transmission = transmission;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getKm_driven() {
        return km_driven;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public int getYear() {
        return year;
    }

    public String getFuel() {
        return fuel;
    }

    public String getOwner() {
        return owner;
    }

    public String getSeller_type() {
        return seller_type;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", selling_price=" + selling_price +
                ", km_driven=" + km_driven +
                ", fuel='" + fuel + '\'' +
                ", seller_type='" + seller_type + '\'' +
                ", transmission='" + transmission + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
