public class Rental {

    Movie movie;
    private int daysRented;
    private int currentRentalPeriod;

    public Rental(Movie movie, int daysRented, int currentRentalPeriod) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.currentRentalPeriod = currentRentalPeriod;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    public void setCurrentRentalPeriod(int rentalPeriod){
        currentRentalPeriod = rentalPeriod;
    }

    public int getCurrentRentalPeriod(){
        return currentRentalPeriod;
    }

    public int getDaysLate(){
        if (daysRented>=currentRentalPeriod){
            return 0;
        }else{
            return (currentRentalPeriod - daysRented);
        }
    }
}