package br.com.senac.calculador01;

import android.content.res.Configuration;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double num1;
    private double num2;
    private String sinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int orientacao = this.getResources().getConfiguration().orientation;

        if (orientacao == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "Orientation Portrait",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Orientation LandScape",Toast.LENGTH_LONG).show();
        }



        final TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        final Button btnSoma = (Button) findViewById(R.id.btnSoma);
        final Button btnSubtracao = (Button) findViewById(R.id.btnSubt);
        final Button btnDivisao = (Button) findViewById(R.id.btnDivisao);
        final Button btnMultiplicacao = (Button) findViewById(R.id.btnMultip);
        final Button btnUm = (Button) findViewById(R.id.btnUm);
        final Button btnDois = (Button) findViewById(R.id.btnDois);
        final Button btnTres = (Button) findViewById(R.id.btnTres);
        final Button btnQuatro = (Button) findViewById(R.id.btnQuatro);
        final Button btnCinco= (Button) findViewById(R.id.btnCinco);
        final Button btnSeis = (Button) findViewById(R.id.btnSeis);
        final Button btnSete = (Button) findViewById(R.id.btnSete);
        final Button btnOito = (Button) findViewById(R.id.btnOito);
        final Button btnNove = (Button) findViewById(R.id.btnNove);
        final Button btnCE = (Button) findViewById(R.id.btnCE);
        final Button btnIgual = (Button) findViewById(R.id.btnIgual);
        final Button btnZero = (Button) findViewById(R.id.btnZero);
        final Button btnPonto = (Button) findViewById(R.id.btnPonto);
        final Button btnResto = (Button) findViewById(R.id.btnResto);
        final Button btnRaiz = (Button) findViewById(R.id.btnRaiz);


        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "1");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "1");
                }



            }
        });


        btnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "2");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "2");
                }
            }
        });


        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "3");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "3");
                }
            }
        });


        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "4");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "4");
                }
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "5");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "5");
                }

            }
        });


        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "6");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "6");
                }
            }
        });

        btnSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "7");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "7");
                }
            }
        });


        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "8");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "8");
                }
            }
        });

        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("");
                    txtResultado.setText(txtResultado.getText().toString() + "9");
                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "9");
                }
            }
        });


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtResultado.getText().toString().equals("0")){

                }else {
                    txtResultado.setText(txtResultado.getText().toString() + "0");
                }
            }
        });


        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtResultado.getText().toString().equals("0")){
                    txtResultado.setText("0");
                    num1 = 0;
                    num2 = 0;
                    sinal = "";
                }else {
                    txtResultado.setText("0");
                }
            }
        });

        btnPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResultado.setText(txtResultado.getText().toString() + ".");

            }
        });


        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinal = "+";
                if (String.valueOf(num1).equals(txtResultado.getText().toString())){
                    txtResultado.setText("");
                }else {
                    num2 = Double.valueOf(txtResultado.getText().toString());
                    num1 = Double.valueOf(calcular());

                    txtResultado.setText("");
                }

            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinal = "-";
                if (String.valueOf(num1).equals(txtResultado.getText().toString())){
                    txtResultado.setText("");
                }else {
                    num2 = Double.valueOf(txtResultado.getText().toString());
                    num1 = Double.valueOf(calcular());

                    txtResultado.setText("");
                }
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinal = "*";
                if (String.valueOf(num1).equals(txtResultado.getText().toString())){
                    txtResultado.setText("");
                }else {
                    num2 = Double.valueOf(txtResultado.getText().toString());
                    num1 = Double.valueOf(calcular());

                    txtResultado.setText("");
                }
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinal = "/";
                if (String.valueOf(num1).equals(txtResultado.getText().toString())){
                    txtResultado.setText("");
                }else {
                    num2 = Double.valueOf(txtResultado.getText().toString());
                    num1 = Double.valueOf(calcular());

                    txtResultado.setText("");
                }
            }
        });


        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.valueOf(txtResultado.getText().toString());
                txtResultado.setText(calcular());
            }
        });



        btnResto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sinal = "%";
                if (String.valueOf(num1).equals(txtResultado.getText().toString())){
                    txtResultado.setText("");
                }else {
                    num2 = Double.valueOf(txtResultado.getText().toString());
                    num1 = Double.valueOf(calcular());

                    txtResultado.setText("");
                }
            }
        });

    }


    private String calcular (){
        double resultado = 0;

        switch (sinal){
            case "+" : resultado = num1 + num2; break;
            case "-" : resultado = num1 - num2; break;
            case "*" : resultado = num1 * num2; break;
            case "/" : resultado = num1 / num2; break;
            case "&" : resultado = (num1 * num2)/100 ; break;

        }

        return String.valueOf(resultado);

    }


}
