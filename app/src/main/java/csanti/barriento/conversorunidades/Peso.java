package csanti.barriento.conversorunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
public class Peso extends AppCompatActivity {
    public RadioButton btn_kg1,btn_kg2,btn_libra1,btn_libra2,btn_onza1,btn_onza2,btn_stone1,btn_stone2;//declaramos variables
    TextView mostrarresultado;
    Float kilos, libras, onzas, stones, calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);
        btn_kg1 = (RadioButton) findViewById(R.id.kg1);
        btn_kg2 = (RadioButton) findViewById(R.id.kg2);
        btn_libra1 = (RadioButton) findViewById(R.id.libra1);
        btn_libra2 = (RadioButton) findViewById(R.id.libra2);
        btn_onza1 = (RadioButton) findViewById(R.id.onza1);
        btn_onza2 = (RadioButton) findViewById(R.id.onza2);
        btn_stone1 = (RadioButton) findViewById(R.id.st1);
        btn_stone2 = (RadioButton) findViewById(R.id.st2);
    }
    public void calcular (View view){
        try {
            mostrarresultado = (TextView) findViewById(R.id.resultado_peso);
             EditText numero1 = findViewById(R.id.numerousertemp);
            calcular = Float.parseFloat(numero1.getText() + "");
            //calculos de las kg a kg
            if (btn_kg1.isChecked() && btn_kg2.isChecked()) {
                kilos = calcular;
                String resultado = String.valueOf(kilos);
                mostrarresultado.setText(resultado);
            }
            //calculos de las kg a libra
            if (btn_kg1.isChecked() && btn_libra2.isChecked()) {
                libras = calcular *2.20462262f;
                String resultado = String.valueOf(libras);
                mostrarresultado.setText(resultado);
            }
            //calculos de las kg a onza
            if (btn_kg1.isChecked() && btn_onza2.isChecked()) {
                onzas = calcular * 	35.27396f;
                String resultado = String.valueOf(onzas);
                mostrarresultado.setText(resultado);
            }
            //calculos de las kg a stone
            if (btn_kg1.isChecked() && btn_stone2.isChecked()) {
                stones = calcular * 0.157473f;
                String resultado = String.valueOf(stones);
                mostrarresultado.setText(resultado);
            }
            //calculos de las libra
            if (btn_libra1.isChecked() && btn_kg2.isChecked()) {
                kilos = calcular *0.45359237f;
                String resultado = String.valueOf(kilos);
                mostrarresultado.setText(resultado);
            }

            if (btn_libra1.isChecked() && btn_libra2.isChecked()) {
                libras = calcular;
                String resultado = String.valueOf(libras);
                mostrarresultado.setText(resultado);
            }
            if (btn_libra1.isChecked() && btn_onza2.isChecked()) {
                onzas = calcular * 	16f;
                String resultado = String.valueOf(onzas);
                mostrarresultado.setText(resultado);
            }
            if (btn_libra1.isChecked() && btn_stone2.isChecked()) {
                stones = calcular * 0.07142857f;
                String resultado = String.valueOf(stones);
                mostrarresultado.setText(resultado);
            }
            //calculos de las onzas
            if (btn_onza1.isChecked() && btn_kg2.isChecked()) {
                kilos = calcular *0.02833f;
                String resultado = String.valueOf(kilos);
                mostrarresultado.setText(resultado);
            }
            if (btn_onza1.isChecked() && btn_libra2.isChecked()) {
                libras = calcular * 	0.0625f;
                String resultado = String.valueOf(libras);
                mostrarresultado.setText(resultado);
            }
            if (btn_onza1.isChecked() && btn_onza2.isChecked()) {
                onzas = calcular;
                String resultado = String.valueOf(onzas);
                mostrarresultado.setText(resultado);
            }
            if (btn_onza1.isChecked() && btn_stone2.isChecked()) {
                stones = calcular * 1/224f;
                String resultado = String.valueOf(stones);
                mostrarresultado.setText(resultado);
            }

            //calculos de stone
            if (btn_stone1.isChecked() && btn_kg2.isChecked()) {
                kilos = calcular * 6.35029318f;
                String resultado = String.valueOf(kilos);
                mostrarresultado.setText(resultado);
            }
            if (btn_stone1.isChecked() && btn_libra2.isChecked()) {
                libras = calcular *14f;
                String resultado = String.valueOf(libras);
                mostrarresultado.setText(resultado);
            }
            if (btn_stone1.isChecked() && btn_onza2.isChecked()) {
                onzas = calcular * 224f;
                String resultado = String.valueOf(onzas);
                mostrarresultado.setText(resultado);
            }
            if (btn_stone1.isChecked() && btn_stone2.isChecked()) {
                stones = calcular;
                String resultado = String.valueOf(stones);
                mostrarresultado.setText(resultado);
            }
        } catch (NumberFormatException e){
            Toast.makeText(this, "Escribe el valor a convertir y selecciona las unidades", Toast.LENGTH_LONG).show();

        }
    }
}