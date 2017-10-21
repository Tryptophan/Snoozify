package hacktober.snoozify.fragments;

/**
 * Created by jcd4912 on 10/21/2017.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import hacktober.snoozify.Alarm;
import hacktober.snoozify.R;

public class AlarmAdapter extends ArrayAdapter {


    public AlarmAdapter(@NonNull Context context, List<Alarm> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Alarm alarm = (Alarm) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.alarm_list_item, parent, false);
        }
        // Lookup view for data population
        TextView name = (TextView) convertView.findViewById(R.id.alarm_name);

        // Populate the data into the template view using the data object
        name.setText(alarm.getHour() + ":" + alarm.getMinute());

        // Return the completed view to render on screen
        return convertView;
    }
}