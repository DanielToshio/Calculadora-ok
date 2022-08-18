package br.unigran.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numeroEntrada;
    TextView textoResultado;
    Button botaoOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeroEntrada=findViewById(R.id.editTextNumber);
        numeroEntrada=findViewById(R.id.editTextNumber2);
        textoResultado=findViewById(R.id.textResultado);
        botaoOK=findViewById(R.id.Soma);
        botaoOK=findViewById(R.id.Subtrair);
        botaoOK=findViewById(R.id.Multiplica);
        botaoOK=findViewById(R.id.Divisão);
        textoResultado.setText("Aqui vai aparecer o resultado");
    }
}