package csanti.barriento.conversorunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
public class Longitud extends AppCompatActivity {
    public RadioButton btn_km1,btn_km2, btn_milla1,btn_milla2,btn_yarda1,btn_yarda2,btn_messi1,btn_messi2;//variables declaradas
    TextView mostrarresultado;
    float km,milla, yarda, messi,calculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);

    }
    public void  calcular(View view) {
        btn_km1 = (RadioButton) findViewById(R.id.km1);
        btn_km2 = (RadioButton) findViewById(R.id.km2);
        btn_milla1 = (RadioButton) findViewById(R.id.mil1);
        btn_milla2 = (RadioButton) findViewById(R.id.mil2);
        btn_yarda1 = (RadioButton) findViewById(R.id.yarda1);
        btn_yarda2 = (RadioButton) findViewById(R.id.yarda2);
        btn_messi1 = (RadioButton) findViewById(R.id.messi1);
        btn_messi2 = (RadioButton) findViewById(R.id.messi2);
        try {
        mostrarresultado = (TextView) findViewById(R.id.resultado_longitud);
        EditText numero1 = findViewById(R.id.numerousertemp);
        calculo = Float.parseFloat(numero1.getText() + "");
            //calculos de las km a km
        if (btn_km1.isChecked() && btn_km2.isChecked()) {
            km = calculo;
            String resultado = String.valueOf(km);
                mostrarresultado.setText(resultado);
        }
            //calculos de las km a millas
        if (btn_km1.isChecked() && btn_milla2.isChecked()) {
            milla = calculo *0.6213712f;
            String resultado = String.valueOf(milla);
                mostrarresultado.setText(resultado);
        }
            //calculos de las km a yardas
        if (btn_km1.isChecked() && btn_yarda2.isChecked()) {
            yarda = calculo *1093.613f;
            String resultado = String.valueOf(yarda);
                mostrarresultado.setText(resultado);
        }
            //calculos de las km a messis
        if (btn_km1.isChecked() && btn_messi2.isChecked()) {
            messi = calculo * 39370.08f;
            String resultado = String.valueOf(messi);
                mostrarresultado.setText(resultado);
        }
            //calculos de las millas a km
        if (btn_milla1.isChecked() && btn_km2.isChecked()) {
            km = calculo *1.609344f;
            String resultado = String.valueOf(km);
                mostrarresultado.setText(resultado);
        }
            //calculos de las millas a millas
        if (btn_milla1.isChecked() && btn_milla2.isChecked()) {
            milla = calculo;
            String resultado = String.valueOf(milla);
                mostrarresultado.setText(resultado);
        }
            //calculos de las millas a yardas
        if (btn_milla1.isChecked() && btn_yarda2.isChecked()) {
            yarda = calculo * 1760f;
            String resultado = String.valueOf(yarda);
                mostrarresultado.setText(resultado);
        }
            //calculos de las millas a messis
        if (btn_milla1.isChecked() && btn_messi2.isChecked()) {
            messi = calculo * 	63360f;
            String resultado = String.valueOf(messi);
                mostrarresultado.setText(resultado);
        }
            //calculos de las yardas a km
        if (btn_yarda1.isChecked() && btn_km2.isChecked()) {
            km = calculo *0.0009144f;
            String resultado = String.valueOf(km);
                mostrarresultado.setText(resultado);
        }
            //calculos de las yardas a millas
        if (btn_yarda1.isChecked() && btn_milla2.isChecked()) {
            milla = calculo * 0.0005681818f;
            String resultado = String.valueOf(milla);
                mostrarresultado.setText(resultado);
        }
            //calculos de las yardas a yardas
        if (btn_yarda1.isChecked() && btn_yarda2.isChecked()) {
            yarda = calculo;
            String resultado = String.valueOf(yarda);
                mostrarresultado.setText(resultado);
        }
            //calculos de las yardas a messis
        if (btn_yarda1.isChecked() && btn_messi2.isChecked()) {
            messi = calculo * 36f;
            String resultado = String.valueOf(messi);
                mostrarresultado.setText(resultado);
        }
        //calculos de las pulgadas a km
        if (btn_messi1.isChecked() && btn_km2.isChecked()) {
            km = calculo * 	0.0000254f;
            String resultado = String.valueOf(km);
                mostrarresultado.setText(resultado);
        }
            //calculos de las pulgadas a millas
        if (btn_messi1.isChecked() && btn_milla2.isChecked()) {
            milla = calculo *0.00001578283f;
            String resultado = String.valueOf(milla);
                mostrarresultado.setText(resultado);
        }
            //calculos de las pulgadas a yardas
        if (btn_messi1.isChecked() && btn_yarda2.isChecked()) {
            yarda = calculo * 0.02777778f;
            String resultado = String.valueOf(yarda);
                mostrarresultado.setText(resultado);
        }
            //calculos de las pulgadas a messis
        if (btn_messi1.isChecked() && btn_messi2.isChecked()) {
            messi = calculo;
            String resultado = String.valueOf(messi);
                mostrarresultado.setText(resultado);
        }
    } catch (NumberFormatException e){
        Toast.makeText(this, "Escribe el valor a convertir y selecciona las unidades", Toast.LENGTH_LONG).show();

    }
    }
}
