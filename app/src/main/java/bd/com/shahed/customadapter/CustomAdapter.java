package bd.com.shahed.customadapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Activity activity;
    LayoutInflater inflater;
    List<Country> countries;

    public CustomAdapter(Activity activity, List<Country> countries) {
        this.activity = activity;
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int i) {
        return countries.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view == null) {
            assert inflater != null;
            view = inflater.inflate(R.layout.item_view, null);
        }

        TextView countryName = view.findViewById(R.id.show_country_name);
        countryName.setText(String.valueOf(countries.get(i).name));
        return view;
    }
}
