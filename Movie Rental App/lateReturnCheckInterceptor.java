public class lateReturnCheckInterceptor implements Interceptor {

    @Override
    public void extraPriceCheck(Context context) {
        int lateDays = context.getRental().getDaysLate();
        if (lateDays>0){
            double lateFee = lateDays * context.getRental().getMovie().getLateFee();
            context.setLateFee(lateFee);
        }
    }
    
}
