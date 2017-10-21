package hacktober.snoozify;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

/**
 * Created by jcd4912 on 10/21/2017.
 */

public class NewAlarmActivity extends Activity {
    Button btnNext;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.activity_new_alarm);
        Button btnSet = (Button) findViewById(R.id.btnSetDateTime);
        final TimePicker tp = (TimePicker) findViewById(R.id.timePicker);

        btnSet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String strDateTime = dp.getYear() + "-" + (dp.getMonth() + 1) + "-" + dp.getDayOfMonth() + " "+ tp.getCurrentHour() + ":" + tp.getCurrentMinute();}});
    }
}
