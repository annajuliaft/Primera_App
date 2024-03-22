package tamanini.ferreira.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Ler o arquivo de layot e constroi a interface
        Button btnEnviar = findViewById(R.id.btnEnviar); //Obtem o botao de enviar
        //defini a açao do click no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override //o onclick e chamado quando da o click do botao
            public void onClick(View v) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //para obter o campo de texto
                String textoDigitado = etDigiteAqui.getText().toString(); //obtem o texto da caixa de texto
                Intent i = new Intent(MainActivity.this,NextActivity.class); //cria uma intençao para navegar a proxima tela
                i.putExtra("texto", textoDigitado); //coloca o texto dentro da intençao
                startActivity(i); //executa a intençao e navega para a proxima tela
            }
        });
    }
}