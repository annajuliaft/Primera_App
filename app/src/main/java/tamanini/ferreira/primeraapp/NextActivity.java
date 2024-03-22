package tamanini.ferreira.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next); //Ler o arquivo de layot e constroi a interface


        Intent i = getIntent(); //obtem o intent que criou essa tela
        String texto = i.getStringExtra("texto"); //obtem o texto que veio junto com o intent
        TextView tvTexto = findViewById(R.id.tvTexto); //ele obtem o textview
        tvTexto.setText(texto); //seta o texto dentro do textview
    }
}