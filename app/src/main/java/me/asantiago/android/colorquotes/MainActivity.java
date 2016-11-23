package me.asantiago.android.colorquotes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private TextView citaTextView;
    private TextView autorTextView;
    private Button nuevaFraseButton;

    private String[] quotes;

    private String[] autors;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citaTextView = (TextView) findViewById(R.id.citaTextView);
        autorTextView = (TextView) findViewById(R.id.autorTextView);
        nuevaFraseButton = (Button) findViewById(R.id.nuevaFraseButton);

        quotes = new String[5];
        autors = new String[5];

        autors[0] = "Walt Disney";
        quotes[0] = "Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir";

        autors[1] = "Albert Einstein";
        quotes[1] = "La imaginación es más importante que el conocimiento";


        autors[2] = "Steve Jobs";
        quotes[2] = "Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona";

        autors[3] = "Albert Camus";
        quotes[3] = "El éxito es fácil de obtener. Lo difícil es merecerlo.";

        autors[4] = "Irving Berlin";
        quotes[4] = "El sabio no dice lo que sabe, y el necio no sabe lo que dice.";

    }

    public void newQuote(View view){

        int randomGenerated = Utils.generateRandomNumber(quotes.length);
        String cita = quotes[randomGenerated];
        String autor = autors[randomGenerated];

        citaTextView.setText(cita);
        autorTextView.setText(autor);
    }

}
