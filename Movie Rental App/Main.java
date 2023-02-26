public class Main {
    public static void main(String[] args){
        Movie testMovie1 = new Movie("Cars 3", 0, 25);
        Rental testRental1 = new Rental(testMovie1, 2, 2);

        Movie testMovie2 = new Movie("Shrek 2", 1, 0.12);
        Rental testRental2 = new Rental(testMovie2, 5, 12);

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.addInterceptor(new lateReturnCheckInterceptor());

        Context testContext1 = new Context(testRental1);
        dispatcher.callback(testContext1);
        double lateFee1 = testContext1.getLateFee();
        System.out.println("Late fee for rental 1: " + lateFee1);

        Context testContext2 = new Context(testRental2);
        dispatcher.callback(testContext2);
        double lateFee2 = testContext2.getLateFee();
        System.out.println("Late fee for rental 2: " + lateFee2);
    }    
}
