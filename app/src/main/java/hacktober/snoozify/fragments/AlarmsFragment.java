package hacktober.snoozify.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import hacktober.snoozify.Alarm;
import hacktober.snoozify.MainActivity;
import hacktober.snoozify.NewAlarmActivity;
import hacktober.snoozify.R;

public class AlarmsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.alarms_layout, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {

        FloatingActionButton addAlarm = (FloatingActionButton) getView().findViewById(R.id.addAlarm);
        addAlarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), NewAlarmActivity.class);
                startActivity(myIntent);
            }
        });
        // TODO: Get the list of added alarms from the internal database
        List<Alarm> alarms = new ArrayList<>();

        alarms.add(new Alarm(2, 43));
        alarms.add(new Alarm(7, 30));

        // Add the charities to the listview
        AlarmAdapter adapter = new AlarmAdapter(view.getContext(), alarms);

        ListView listView = (ListView) view.findViewById(R.id.alarm_list);
        listView.setAdapter(adapter);

        // TODO: Save the settings to a settings table in the internal db
//        // If the alarm has been set, cancel it.
//        if (alarmMgr!= null) {
//            alarmMgr.cancel(alarmIntent);
//        }
    }
}
