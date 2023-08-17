package sg.edu.rp.c346.id22043453.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.loopj.android.http.JsonHttpResponseHandler;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    Context parent_context;
    ArrayList<Weather> weatherList;

    public WeatherAdapter(Context context, ArrayList<Weather> objects) {

        super(context, 0, objects);
        parent_context = context;
        weatherList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent_context).inflate(R.layout.row, parent, false);
        }

        Weather currentWeather = weatherList.get(position);

        TextView tvArea = convertView.findViewById(R.id.textViewArea);
        TextView tvForecast = convertView.findViewById(R.id.textViewForecast);

        tvArea.setText(currentWeather.getArea());
        tvForecast.setText(currentWeather.getForecast());

        return convertView;
    }
}
