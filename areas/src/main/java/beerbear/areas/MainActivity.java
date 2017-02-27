package beerbear.areas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eLado, eRadio, eBase, eAlt, eResult;
    RadioButton rCirculo, rTriangulo, rCuadrado, rCubo, rPerim, rArea, rVolum;
    Button bCalc, bClear;
    Double area, perimetro, volumen, radio, lado, base, alto, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eLado = (EditText) findViewById(R.id.eLado);
        eRadio = (EditText) findViewById(R.id.eRadio);
        eBase = (EditText) findViewById(R.id.eBase);
        eAlt = (EditText) findViewById(R.id.eAlt);
        eResult = (EditText) findViewById(R.id.eResult);
        rCirculo = (RadioButton) findViewById(R.id.rCirculo);
        rTriangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rCuadrado = (RadioButton) findViewById(R.id.rCuadrado);
        rPerim = (RadioButton) findViewById(R.id.rPerim);
        rArea = (RadioButton) findViewById(R.id.rArea);
        rVolum = (RadioButton) findViewById(R.id.rVolum);
        rCubo = (RadioButton) findViewById(R.id.rCubo);
        bCalc = (Button) findViewById(R.id.bCalc);
        bClear = (Button) findViewById(R.id.bClear);

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eLado.setText("");
                eRadio.setText("");
                eAlt.setText("");
                eBase.setText("");
                eResult.setText("");
                result= 0.0;

            }
        });

        bCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rCirculo.isChecked() == false && rCubo.isChecked() == false && rTriangulo.isChecked() == false && rCuadrado.isChecked() == false) {
                    Toast.makeText(MainActivity.this, "Seleccione una Figura", Toast.LENGTH_SHORT).show();
                }
                if (rPerim.isChecked() == false && rArea.isChecked() == false && rVolum.isChecked() == false)
                    Toast.makeText(MainActivity.this, "Seleccione una operación", Toast.LENGTH_SHORT).show();
                if (rCirculo.isChecked() == true) {
                    if (rArea.isChecked() == true) {
                        radio = Double.parseDouble(eRadio.getText().toString());
                        area = radio * radio * 3.1416;
                        result = area;
                        eResult.setText(result.toString());

                    } else if (rPerim.isChecked() == true) {
                        radio = Double.parseDouble(eRadio.getText().toString());
                        perimetro = radio * 2 * 3.1416;
                        result = perimetro;
                        eResult.setText(result.toString());

                    } else if (rVolum.isChecked() == true)
                        Toast.makeText(MainActivity.this, "Esta figura no tiene volumen", Toast.LENGTH_SHORT).show();

                }
                if (rCuadrado.isChecked() == true) {
                    if (rArea.isChecked() == true) {
                        lado = Double.parseDouble(eLado.getText().toString());
                        area = lado * lado;
                        result=area;
                        eResult.setText(result.toString());

                    } else if (rPerim.isChecked() == true) {
                        lado = Double.parseDouble(eLado.getText().toString());
                        perimetro = lado * 4;
                        result = perimetro;
                        eResult.setText(result.toString());

                    } else if (rVolum.isChecked() == true)
                        Toast.makeText(MainActivity.this, "Esta figura no tiene volumen", Toast.LENGTH_SHORT).show();
                }
                if (rTriangulo.isChecked() == true) {
                    if (rArea.isChecked() == true) {
                        base = Double.parseDouble(eBase.getText().toString());
                        alto = Double.parseDouble(eAlt.getText().toString());
                        area = base * alto / 2;
                        result=area;
                        eResult.setText(result.toString());

                    } else if (rPerim.isChecked() == true) {
                        base = Double.parseDouble(eBase.getText().toString());
                        alto = Double.parseDouble(eAlt.getText().toString());
                        perimetro = base + (2 * Math.sqrt((base / 2) * (base / 2)) + (alto * alto));
                        result = perimetro;
                        eResult.setText(result.toString());

                    } else if (rVolum.isChecked() == true) {
                        Toast.makeText(MainActivity.this, "Esta figura no tiene volumen", Toast.LENGTH_SHORT).show();
                    }
                }
                if (rCubo.isChecked() == true) {
                    if (rArea.isChecked() == true) {
                        lado = Double.parseDouble(eLado.getText().toString());
                        area = lado * lado * 6;
                        result=area;
                        eResult.setText(result.toString());

                    } else if (rPerim.isChecked() == true) {
                        lado = Double.parseDouble(eLado.getText().toString());
                        perimetro = lado * 12;
                        result=perimetro;
                        eResult.setText(result.toString());

                    } else if (rVolum.isChecked() == true) {
                        lado = Double.parseDouble(eLado.getText().toString());
                        volumen = lado * lado * lado;
                        result=volumen;
                        eResult.setText(result.toString());
                    }
                }
            }


        });
    }
}

