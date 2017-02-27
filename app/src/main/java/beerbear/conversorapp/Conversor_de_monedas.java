package beerbear.conversorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Conversor_de_monedas extends AppCompatActivity {

    EditText ePesos, eDolares;
    Button bConvertir, bClear;

    Double pesos, dolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_de_monedas);

        ePesos = (EditText) findViewById(R.id.pesos);
        eDolares = (EditText) findViewById(R.id.dolares);
        bConvertir = (Button) findViewById(R.id.bConvert);
        bClear = (Button) findViewById(R.id.bClear);

        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (!ePesos.getText().toString().equals("") && !eDolares.getText().toString().equals("")){
                    Toast.makeText(Conversor_de_monedas.this, "Ambos campos están llenos", Toast.LENGTH_SHORT).show();
                }
                if (ePesos.getText().toString().equals("") && eDolares.getText().toString().equals("")){
                    Toast.makeText(Conversor_de_monedas.this, "Digite una cantidad", Toast.LENGTH_SHORT).show();
                }
                if (ePesos.getText().toString().equals("")  && !eDolares.getText().toString().equals("")){
                    dolares = Double.parseDouble(eDolares.getText().toString());
                    pesos = dolares*3000;
                    ePesos.setText(pesos.toString());
                }
                if (!ePesos.getText().toString().equals("")  && eDolares.getText().toString().equals("")){
                    pesos = Double.parseDouble(ePesos.getText().toString());
                    dolares = pesos/3000;
                    eDolares.setText(dolares.toString());
                    }


            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eDolares.setText("");
                ePesos.setText("");
            }
        });


    }
}
