package com.example.dell.proyecto003programatico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tvResultado;
    private RadioButton rbSuma,rbResta, rbMultiplicacion, rbDivision;
    private double nro1, nro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tvResultado=(TextView)findViewById(R.id.tvResultado);
        rbSuma=(RadioButton)findViewById(R.id.rbSumar);
        rbResta=(RadioButton)findViewById(R.id.rbRestar);
        rbMultiplicacion=(RadioButton)findViewById(R.id.rbMultiplicar);
        rbDivision=(RadioButton)findViewById(R.id.rbDividir);

        rbSuma.setOnClickListener(miRadioSelectListener);
        rbResta.setOnClickListener(miRadioSelectListener);
        rbMultiplicacion.setOnClickListener(miRadioSelectListener);
        rbDivision.setOnClickListener(miRadioSelectListener);
    }

    private View.OnClickListener miRadioSelectListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String valor1=et1.getText().toString();
            String valor2=et2.getText().toString();
            nro1=Double.parseDouble(valor1);
            nro2=Double.parseDouble(valor2);

            switch(view.getId()){
                case R.id.rbSumar:
                    sumar();
                    break;
                case R.id.rbRestar:
                    restar();
                    break;
                case R.id.rbMultiplicar:
                    multiplicar();
                    break;
                case R.id.rbDividir:
                    dividir();
                    break;

            }
        }
    };

    public void sumar(){
        double suma=nro1+nro2;
        String resu=String.valueOf(suma);
        tvResultado.setText(resu);
    }

    public void restar(){
        double resta=nro1-nro2;
        String resu=String.valueOf(resta);
        tvResultado.setText(resu);
    }

    public void multiplicar(){
        double multiplicacion=nro1*nro2;
        String resu=String.valueOf(multiplicacion);
        tvResultado.setText(resu);
    }

    public void dividir(){
        double division=nro1/nro2;
        String resu=String.valueOf(division);
        tvResultado.setText(resu);
    }

}
