package com.uriel.listasensores;

import androidx.appcompat.app.AppCompatActivity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView sensores;
    String sensoreslista="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensores = findViewById(R.id.salida);
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor: listaSensores)
        {
            sensoreslista= sensoreslista + sensor.getName()+"\n";
        }
        sensores.setText(sensoreslista);
    }
}
