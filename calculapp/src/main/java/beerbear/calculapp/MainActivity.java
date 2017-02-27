package beerbear.calculapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static beerbear.calculapp.R.id.activity_main;
import static beerbear.calculapp.R.id.b1;
import static beerbear.calculapp.R.id.bDiv;
import static beerbear.calculapp.R.id.bEq;
import static beerbear.calculapp.R.id.eAcum;

public class MainActivity extends AppCompatActivity {

    EditText eNumero,eAcum;
    String acum = "",op1,op2,now=null,show;
    String[] aux;
    double result=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bMas,bMenos,bPor,bPunto,bDiv,bEq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero = (EditText) findViewById(R.id.eNumero);
        eAcum = (EditText) findViewById(R.id.eAcum);
        b0 = (Button) findViewById(R.id.b0);
        b1 =(Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bMas = (Button) findViewById(R.id.bMas);
        bMenos = (Button) findViewById(R.id.bMenos);
        bPor = (Button)findViewById(R.id.bPor);
        bPunto = (Button)findViewById(R.id.bPunto);
        bDiv = (Button) findViewById(R.id.bDiv);
        bEq = (Button) findViewById(R.id.bEq);


    }

    public void click (View View){
        int id = View.getId();
        switch (id){
            case R.id.b0:
                if (now == "=")
                    acum = "";
                now = "0";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b1:
                if (now == "=")
                    acum = "";
                now = "1";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b2:
                if (now == "=")
                    acum = "";
                now = "2";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b3:
                if (now == "=")
                    acum = "";
                now = "3";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b4:
                if (now == "=")
                    acum = "";
                now = "4";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b5:
                if (now == "=")
                    acum = "";
                now = "5";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b6:
                if (now == "=")
                    acum = "";
                now = "6";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b7:
                if (now == "=")
                    acum = "";
                now = "7";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b8:
                if (now == "=")
                    acum = "";
                now = "8";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.b9:
                if (now == "=")
                    acum = "";
                now = "9";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.bC:
                eNumero.setText("0");
                eAcum.setText("");
                acum = "";
                now = null;
                result=0;
                break;
            case R.id.bPunto:
                now = ".";
                acum = acum + bPunto.getText();
                eNumero.setText(acum);
                break;
            case R.id.bMas:
                if (result<0){
                    Toast.makeText(MainActivity.this,"No puede operar numeros negativos", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (now == "+")
                    break;
                if (now == "-" ||now == "*" ||now == "/"||now == "." ||now==null||now == "=") {
                    Toast.makeText(MainActivity.this, "Operación no válida", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (acum.contains("+")){
                    aux = acum.split("\\+");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)+Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("-")){
                    aux = acum.split("\\-");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)- Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("*")){
                    aux = acum.split("\\*");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)* Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("/")){
                    aux = acum.split("/");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)/ Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }
                now = "+";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.bMenos:
                if (result<0) {
                    Toast.makeText(MainActivity.this, "No puede operar numeros negativos", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (now == "-")
                    break;
                if (now == "+" ||now == "*" ||now == "/" ||now == "." ||now==null||now == "=") {
                    Toast.makeText(MainActivity.this, "Operación no válida", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (acum.contains("+")){
                    aux = acum.split("\\+");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)+Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("-")){
                    aux = acum.split("\\-");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)- Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("*")){
                    aux = acum.split("\\*");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)* Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("/")){
                    aux = acum.split("/");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)/ Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }
                now = "-";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.bPor:
                if (result<0) {
                    Toast.makeText(MainActivity.this, "No puede operar numeros negativos", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (now == "*")
                    break;
                if (now == "-" ||now == "+" ||now == "/"||now == "." ||now==null||now == "=") {
                    Toast.makeText(MainActivity.this, "Operación no válida", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (acum.contains("+")){
                    aux = acum.split("\\+");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)+Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("-")){
                    aux = acum.split("\\-");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)- Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("*")){
                    aux = acum.split("\\*");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)* Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("/")){
                    aux = acum.split("/");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)/ Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }
                now = "*";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.bDiv:
                if (result<0) {
                    Toast.makeText(MainActivity.this, "No puede operar numeros negativos", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (now == "/")
                    break;
                if (now == "-" ||now == "*" ||now == "+" ||now == "." ||now==null||now == "=") {
                    Toast.makeText(MainActivity.this, "Operación no válida", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (acum.contains("+")){
                    aux = acum.split("\\+");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)+Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("-")){
                    aux = acum.split("\\-");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)- Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("*")){
                    aux = acum.split("\\*");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)* Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }else if (acum.contains("/")){
                    aux = acum.split("/");
                    op1 = aux[0];
                    op2 = aux [1];
                    result = Double.parseDouble(op1)/ Double.parseDouble(op2);
                    eAcum.setText(String.valueOf(result));
                    acum = String.valueOf(result);
                }
                now = "/";
                acum = acum + now;
                eNumero.setText(acum);
                break;
            case R.id.bEq:
                if (result<0) {
                    Toast.makeText(MainActivity.this, "No puede operar numeros negativos", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (now == "=")
                    break;
                if (now == "-" ||now == "*" ||now == "/" ||now == "+" ||now == "." ||now==null) {
                    Toast.makeText(MainActivity.this, "Operación no válida", Toast.LENGTH_SHORT).show();
                    break;
                }
                    if (acum.contains("+")){
                        aux = acum.split("\\+");
                        op1 = aux[0];
                        op2 = aux [1];
                        result = Double.parseDouble(op1)+Double.parseDouble(op2);
                        eAcum.setText(String.valueOf(result));
                        acum = String.valueOf(result);
                    }else if (acum.contains("-")){
                        aux = acum.split("\\-");
                        op1 = aux[0];
                        op2 = aux [1];
                        result = Double.parseDouble(op1)- Double.parseDouble(op2);
                        eAcum.setText(String.valueOf(result));
                        acum = String.valueOf(result);
                    }else if (acum.contains("*")){
                        aux = acum.split("\\*");
                        op1 = aux[0];
                        op2 = aux [1];
                        result = Double.parseDouble(op1)* Double.parseDouble(op2);
                        eAcum.setText(String.valueOf(result));
                        acum = String.valueOf(result);
                    }else if (acum.contains("/")){
                        aux = acum.split("/");
                        op1 = aux[0];
                        op2 = aux [1];
                        result = Double.parseDouble(op1)/ Double.parseDouble(op2);
                        eAcum.setText(String.valueOf(result));
                        acum = String.valueOf(result);
                    }

                eNumero.setText(String.valueOf(result));
                eAcum.setText("");
                acum = "";
                result = 0;
                now = "=";
                break;



        }


    }
}
