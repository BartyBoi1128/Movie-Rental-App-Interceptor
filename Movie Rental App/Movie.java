public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    Price price;
    private double lateFee;

    public Movie(String title, int priceCode, double lateFee) {
        this.title = title;
        setPriceCode(priceCode);
        this.lateFee = lateFee;
    }

    public String getTitle() {
        return title;
    }

    private void setPriceCode(int priceCode) {
        switch (priceCode) {
            case CHILDREN:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            default:
                throw new IllegalArgumentException("invalid price code");
        }
    }

    private int getPriceCode() {
        return price.getPriceCode();
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public double getLateFee(){
        return lateFee;
    }

}
