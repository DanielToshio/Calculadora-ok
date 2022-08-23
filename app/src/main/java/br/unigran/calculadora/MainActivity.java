package br.unigran.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    TextView textoResultado;
    Button bt1,bt2,bt3,bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.editTextNumber);
        numero2 = findViewById(R.id.editTextNumber2);
        textoResultado = findViewById(R.id.textResultado);
        bt1 = findViewById(R.id.Soma);
        bt2 = findViewById(R.id.Subtrair);
        bt3 = findViewById(R.id.Multiplica);
        bt4 = findViewById(R.id.Divisão);
        textoResultado.setText("Aqui vai aparecer o resultado");
        Object resultado;

    }
}