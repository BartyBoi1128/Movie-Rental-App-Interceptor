import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors = new ArrayList<>();

    public void addInterceptor(Interceptor interceptor){
        interceptors.add(interceptor);
    }

    public void removeInterceptor(Interceptor interceptor){
        interceptors.remove(interceptor);
    }

    public void callback(Context context){
        for (Interceptor interceptor : interceptors){
            interceptor.extraPriceCheck(context);
        }
    }
}
