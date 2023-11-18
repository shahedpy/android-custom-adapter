package bd.com.shahed.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;
    CustomAdapter adapter;
    List<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        countryList = new ArrayList<>();

        countryList.add(new Country("Bangladesh"));
        countryList.add(new Country("India"));
        countryList.add(new Country("Korea"));
        countryList.add(new Country("America"));
        countryList.add(new Country("Japan"));
        countryList.add(new Country("China"));
        countryList.add(new Country("Thailand"));

        adapter = new CustomAdapter(this, countryList);
        listView.setAdapter(adapter);
    }
}