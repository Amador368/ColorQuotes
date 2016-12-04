package me.asantiago.android.colorquotes;

import android.graphics.Color;

/**
 * Created by asantiago on 04/12/16.
 */

public class QuotesGenerator {

    private Cita[] quotes;
    private int[] colorsArray = {Color.CYAN,Color.RED,Color.BLACK,Color.GRAY,Color.YELLOW, Color.GREEN,Color.MAGENTA};

    public QuotesGenerator(){

        quotes = new Cita[5];

        quotes[0] = new Cita();
        quotes[0].setAutor("Walt Disney");
        quotes[0].setText("Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir");

        quotes[1] = new Cita();
        quotes[1].setAutor("Albert Einstein");
        quotes[1].setText("La imaginación es más importante que el conocimiento");

        quotes[2] = new Cita();
        quotes[2].setAutor("Steve Jobs");
        quotes[2].setText("Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona");

        quotes[3] = new Cita();
        quotes[3].setAutor("Albert Camus");
        quotes[3].setText("El exito es facil de obtener. Lo dificil es merecerlo.");

        quotes[4] = new Cita();
        quotes[4].setAutor("Irving Berlin");
        quotes[4].setText("El sabio no dice lo que sabe, y el necio no sabe lo que dice.");

    }

    public Cita obtainRandomQuote(){
        int randomGenerated = Utils.generateRandomNumber(quotes.length);
        int rancomColorGenerated = Utils.generateRandomNumber(quotes.length);
        int color = colorsArray[rancomColorGenerated];
        Cita cita = quotes[randomGenerated];
        cita.setColor(color);
        return quotes[randomGenerated];
    }

}
