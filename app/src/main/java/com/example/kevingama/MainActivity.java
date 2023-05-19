package com.example.kevingama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declarando elementos da tela
    final Button btnSoma = (Button)findViewById(R.id.btnSomar);
    final Button btnSubtracao = (Button)findViewById(R.id.btnSubtrair);
    final Button btnMultiplicacao = (Button)findViewById(R.id.btnMultiplicar);
    final Button btnDivisao = (Button)findViewById(R.id.btnDividir);
    EditText num1;
    EditText num2;
    TextView result;
    int n1, n2;

    //Método que roda sempre quando o programa inicia
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.number1);
        num2 = (EditText)findViewById(R.id.number2);
        result = (TextView)findViewById(R.id.result);

        btnSoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                soma();
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                subtracao();
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                multiplicacao();
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                divisao();
            }
        });
    }

    //Métodos das operações matemáticas
    public void soma(){
        int r = n1 + n2;
        result.setText(Integer.toString(r));
    }

    public void subtracao(){
        int r = n1 - n2;
        result.setText(Integer.toString(r));
    }

    public void multiplicacao(){
        int r = n1 * n2;
        result.setText(Integer.toString(r));
    }

    public void divisao(){
        int r = n1 / n2;
        result.setText(Integer.toString(r));
    }
}
