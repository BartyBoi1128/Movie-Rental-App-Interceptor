public class Context {
    private Rental rental;
    private double lateFee;

    public Context(Rental rental){
        this.rental = rental;
    }

    public Rental getRental(){
        return rental;
    }

    public double getLateFee(){
        return lateFee;
    }

    public void setLateFee(double lateFee){
        this.lateFee = lateFee;
    }
}
