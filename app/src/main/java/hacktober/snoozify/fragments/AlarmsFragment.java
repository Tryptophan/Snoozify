package hacktober.snoozify.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    }
}
