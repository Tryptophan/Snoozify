package hacktober.snoozify.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import hacktober.snoozify.R;
import hacktober.snoozify.charities.CharitiesAdapter;
import hacktober.snoozify.charities.Charity;

public class PaymentSettingsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.payment_settings_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // TODO: Get the list of added charities from the internal database
        List<Charity> charities = new ArrayList<>();

        charities.add(new Charity("The Charity for Jimothy", "55555"));
        charities.add(new Charity("Making the Trees Happy Charity", "55556"));

        // Add the charities to the listview
        CharitiesAdapter adapter = new CharitiesAdapter(view.getContext(), charities);

        ListView listView = (ListView) view.findViewById(R.id.charity_list);
        listView.setAdapter(adapter);

        // TODO: Save the settings to a settings table in the internal db
    }
}
