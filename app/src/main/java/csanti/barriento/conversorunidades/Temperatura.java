package csanti.barriento.conversorunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Temperatura extends AppCompatActivity {
    public RadioButton btn_kelvin1, btn_kelvin2, btn_celsius1, btn_celsius2, btn_fh1, btn_fh2, btn_rk1, btn_rk2;//declaramos variables
    TextView mostrarresultado;
    Float kelvin, celsius, farenheit, rk, calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
        btn_kelvin1 = (RadioButton) findViewById(R.id.kelvin1);
        btn_kelvin2 = (RadioButton) findViewById(R.id.kelvin2);
        btn_celsius1 = (RadioButton) findViewById(R.id.celsius1);
        btn_celsius2 = (RadioButton) findViewById(R.id.celsius2);
        btn_fh1 = (RadioButton) findViewById(R.id.fh1);
        btn_fh2 = (RadioButton) findViewById(R.id.fh2);
        btn_rk1 = (RadioButton) findViewById(R.id.rk1);
        btn_rk2 = (RadioButton) findViewById(R.id.rk2);}
    public void calcular (View view){
        try {
            mostrarresultado = (TextView) findViewById(R.id.resultado_temp);
            EditText numero1 = findViewById(R.id.numerousertemp);
            calcular = Float.parseFloat(numero1.getText() + "");
            //kelvin
            if (btn_kelvin1.isChecked() && btn_kelvin2.isChecked()) {
                kelvin = calcular;
                String resultado = String.valueOf(kelvin);
                mostrarresultado.setText(resultado);
            }
            //calculos de kelvin a celsius
            if (btn_kelvin1.isChecked() && btn_celsius2.isChecked()) {
                celsius = calcular -273.15f;
                String resultado = String.valueOf(celsius);
                mostrarresultado.setText(resultado);
            }
            //calculos de kelvin a fh
            if (btn_kelvin1.isChecked() && btn_fh2.isChecked()) {
                farenheit = (calcular - 273.15f) * 9 / 5f + 32;
                String resultado = String.valueOf(farenheit);
                mostrarresultado.setText(resultado);
            }
            //calculos de kelvin a rk
            if (btn_kelvin1.isChecked() && btn_rk2.isChecked()) {
                rk = calcular * 1.8f;
                String resultado = String.valueOf(rk);
                mostrarresultado.setText(resultado);
            }
            //calculos de celsius
            if (btn_celsius1.isChecked() && btn_kelvin2.isChecked()) {
                kelvin = calcular +273.15f;
                String resultado = String.valueOf(kelvin);
                mostrarresultado.setText(resultado);
            }
            if (btn_celsius1.isChecked() && btn_celsius2.isChecked()) {
                celsius = calcular;
                String resultado = String.valueOf(celsius);
                mostrarresultado.setText(resultado);
            }
            if (btn_celsius1.isChecked() && btn_fh2.isChecked()) {
                farenheit = calcular *9 / 5f + 32f;
                String resultado = String.valueOf(farenheit);
                mostrarresultado.setText(resultado);
            }
            if (btn_celsius1.isChecked() && btn_rk2.isChecked()) {
                rk = calcular *9 / 5f + 491.67f;
                String resultado = String.valueOf(rk);
                mostrarresultado.setText(resultado);
            }
            //calculos de las farenheit
            if (btn_fh1.isChecked() && btn_kelvin2.isChecked()) {
                kelvin = (calcular-32f) *5/9f+273f;
                String resultado = String.valueOf(kelvin);
                mostrarresultado.setText(resultado);
            }
            if (btn_fh1.isChecked() && btn_celsius2.isChecked()) {
                celsius = (calcular-32f) *5/9f;
                String resultado = String.valueOf(celsius);
                mostrarresultado.setText(resultado);
            }
            if (btn_fh1.isChecked() && btn_fh2.isChecked()) {
                farenheit = calcular;
                String resultado = String.valueOf(farenheit);
                mostrarresultado.setText(resultado);
            }
            if (btn_fh1.isChecked() && btn_rk2.isChecked()) {
                rk = calcular + 459.67f;
                String resultado = String.valueOf(rk);
                mostrarresultado.setText(resultado);
            }

            //calculos de rk
            if (btn_rk1.isChecked() && btn_kelvin2.isChecked()) {
                kelvin = calcular * 5 / 9f;
                String resultado = String.valueOf(kelvin);
                mostrarresultado.setText(resultado);
            }
            if (btn_rk1.isChecked() && btn_celsius2.isChecked()) {
                celsius = (calcular - 491.67f) * 5 / 9f;
                String resultado = String.valueOf(celsius);
                mostrarresultado.setText(resultado);
            }
            if (btn_rk1.isChecked() && btn_fh2.isChecked()) {
                farenheit = calcular - 459.67f;
                String resultado = String.valueOf(farenheit);
                mostrarresultado.setText(resultado);
            }
            if (btn_rk1.isChecked() && btn_rk2.isChecked()) {
                rk = calcular;
                String resultado = String.valueOf(rk);
                mostrarresultado.setText(resultado);
            }
        } catch (NumberFormatException e){
            Toast.makeText(this, "Escribe el valor a convertir y selecciona las unidades", Toast.LENGTH_LONG).show();
        }
    }
}