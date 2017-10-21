package hacktober.snoozify.charities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import hacktober.snoozify.R;

public class CharitiesAdapter extends ArrayAdapter {


    public CharitiesAdapter(@NonNull Context context, List<Charity> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Charity charity = (Charity) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.charity_list_item, parent, false);
        }
        // Lookup view for data population
        TextView name = (TextView) convertView.findViewById(R.id.charity_name);

        // Populate the data into the template view using the data object
        name.setText(charity.getName());

        // Return the completed view to render on screen
        return convertView;
    }
}
