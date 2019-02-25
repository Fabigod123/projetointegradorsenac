package br.com.senac.calculadora;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double PrimeiroNumero ;
    private  double SegundoNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    final TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

    final EditText txtPrimeiroNumero = (EditText) findViewById(R.id.txtPrimeiroNumero);
    final EditText txtSegundoNumero = (EditText) findViewById(R.id.txtSegundoNumero);

    final Button btnSoma = (Button) findViewById(R.id.btnSoma);
    final Button btnSubtracao = (Button) findViewById(R.id.btnSubtracao);
    final Button btnDivisao = (Button) findViewById(R.id.btnDivisao);
    final Button btnMultiplicacao = (Button) findViewById(R.id.btnMultiplicacao);



    btnSoma.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){

        atribuicao(txtPrimeiroNumero,txtSegundoNumero);



            txtResultado.setText(soma(PrimeiroNumero , SegundoNumero));

    }
    });

    btnSubtracao.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            atribuicao(txtPrimeiroNumero,txtSegundoNumero);



            txtResultado.setText(subitracao(PrimeiroNumero , SegundoNumero));

        }
    });


    btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            atribuicao(txtPrimeiroNumero,txtSegundoNumero);



            txtResultado.setText(multiplicacao(PrimeiroNumero , SegundoNumero));
        }
    });

    btnDivisao.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            atribuicao(txtPrimeiroNumero,txtSegundoNumero);



            txtResultado.setText(divisao(PrimeiroNumero , SegundoNumero));
        }
    });


    }


    private String soma (Double num1 , Double num2){
        String resultado = String.valueOf(num1 + num2);
        return resultado;
    }

    private String subitracao ( Double num1, Double num2){
        String resultado = String.valueOf(num1 - num2);
        return  resultado;
    }

    private String multiplicacao (Double num1, Double num2){
        String resultado = String.valueOf(num1 * num2);
        return resultado;
    }

    private String divisao (Double num1, Double num2){
        String resultado = String.valueOf(num1 / num2);
        return resultado;
    }


    private void atribuicao (EditText num1, EditText num2){
        this.PrimeiroNumero = Double.parseDouble(num1.getText().toString());
        this.SegundoNumero = Double.parseDouble(num2.getText().toString());
    }

}

