package in.manrajsingh.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by manraj singh on 2/9/2016.
 */
public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_2,values);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout_2, parent, false);
        String tv = getItem(position);
        TextView tV = (TextView) theView.findViewById(R.id.textView1);
        tV.setText(tv);
        ImageView iv = (ImageView) theView.findViewById(R.id.iv1);
        iv.setImageResource(R.drawable.dot);
        return theView;
    }
}
