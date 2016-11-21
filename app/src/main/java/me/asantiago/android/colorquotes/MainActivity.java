package me.asantiago.android.colorquotes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView citaTextView;
    private TextView autorTextView;
    private Button nuevaFraseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citaTextView = (TextView) findViewById(R.id.citaTextView);
        autorTextView = (TextView) findViewById(R.id.autorTextView);
        nuevaFraseButton = (Button) findViewById(R.id.nuevaFraseButton);
    }
}
