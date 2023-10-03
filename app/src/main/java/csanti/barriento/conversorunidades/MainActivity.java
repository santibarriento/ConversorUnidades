package csanti.barriento.conversorunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void temp(View view) {
        Intent obj1 = new Intent(MainActivity.this, Temperatura.class);
        startActivity(obj1);
    }

    public void peso(View view) {
        Intent obj2 = new Intent(MainActivity.this, Peso.class);
        startActivity(obj2);
    }

    public void longi(View view) {
        Intent obj3 = new Intent(MainActivity.this, Longitud.class);
        startActivity(obj3);
    }
}
