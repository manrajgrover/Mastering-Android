package in.manrajsingh.volley;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by manraj singh on 2/10/2016.
 */
public class AppController extends Application{
    public static final String TAG = AppController.class.getSimpleName();
    private RequestQueue mRQ;
    private static AppController mI;

    @Override
    public void onCreate(){
        super.onCreate();
        mI = this;
    }

    public static synchronized AppController getInstance(){
        return mI;
    }

    public RequestQueue getRequestQueue(){
        if(mRQ == null){
            mRQ = Volley.newRequestQueue(getApplicationContext());
        }
        return mRQ;
    }

    public <T> void addToRequestQueue(Request<T> req){
        req.setTag(TAG);
        getRequestQueue().add(req);
    }
    public <T> void cancelPendingRequest(Object tag){
        if(mRQ != null){
            mRQ.cancelAll(tag);
        }
    }
}
