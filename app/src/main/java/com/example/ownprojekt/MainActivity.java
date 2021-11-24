package com.example.ownprojekt;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

private TextView tvX;
private TextView tvY;
private TextView tvZ;

    private SensorManager sm;
    private Sensor sensorAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView-Objekte referenzieren
        tvX= (TextView)findViewById(R.id.textViewX);
        tvY=(TextView)findViewById(R.id.textViewY);
        tvZ=(TextView)findViewById(R.id.textViewZ);

        //Sensormanager
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);

        //Accleration Sensor
        sensorAcc = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //register Sensor Listener
        sm.registerListener(this, sensorAcc, sm.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event){
        tvX.setText("X:"+event.values[0]);
        tvY.setText("Y:"+event.values[1]);
        tvZ.setText("Z:"+event.values[2]);
    }

    @Override

    private Object findViewById(int textViewZ) {
    }
}