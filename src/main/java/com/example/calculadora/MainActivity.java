package com.example.calculadora;


        import androidx.appcompat.app.AppCompatActivity;


        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private EditText valor1;
    private EditText valor2;
    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.cuadrito1);
        valor2 = findViewById(R.id.cuadrito2);
        resultado = findViewById(R.id.respuesta);
    }
    public void sumar(View view){
            if (!valor1.getText().toString().isEmpty() & !valor2.getText().toString().isEmpty()) {
            int suma = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
            resultado.setText(suma+"");
        } else {
            resultado.setText("Ingrese un valores.");
        }
    }

    public void restar(View view){
        if (!valor1.getText().toString().isEmpty() & !valor2.getText().toString().isEmpty()) {
            int resta = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
            resultado.setText(resta+"");
        } else {
        resultado.setText("Ingrese un valores.");
        }
    }

    public void multiplicar(View view){
        if (!valor1.getText().toString().isEmpty() & !valor2.getText().toString().isEmpty()) {
            int multiplicacion = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
            resultado.setText(multiplicacion+"");
        } else {
            resultado.setText("Ingrese un valores.");
        }
    }

    public void dividir(View view) {
        if (!valor1.getText().toString().isEmpty() & !valor2.getText().toString().isEmpty()) {
            double valorPrueba = Double.parseDouble(valor2.getText().toString());
            if (valorPrueba != 0) {
                double division = Double.parseDouble(valor1.getText().toString()) / valorPrueba;
                String resultadoFormato = String.format("%.3f", division);
                resultado.setText(resultadoFormato);
            } else {
                resultado.setText("No se puede dividir por cero");
            }
        } else {
            resultado.setText("Ingrese un valores.");
        }
    }

    public void factorial(View view) {
        if (!valor1.getText().toString().isEmpty()) {
            int valorPrueba = Integer.parseInt(valor1.getText().toString());
            int factorial = calcularFactorial(valorPrueba);
            resultado.setText(String.valueOf(factorial));
        } else {
            resultado.setText("Ingrese un valor en la primera casilla.");
        }
    }

    private int calcularFactorial(int valorPrueba) {
        if (valorPrueba == 0 | valorPrueba == 1) {
            return 1;
        } else {
            return valorPrueba * calcularFactorial(valorPrueba - 1);
        }
    }

    public void potencia(View view) {
        if (!valor1.getText().toString().isEmpty() & !valor2.getText().toString().isEmpty()) {
            int valorBase = Integer.parseInt(valor1.getText().toString());
            int valorPotencia = Integer.parseInt(valor2.getText().toString());
            int resultadoPotencia = calcularPotencia(valorBase, valorPotencia);
            resultado.setText(String.valueOf(resultadoPotencia));
        } else {
            resultado.setText("Ingrese un valores.");
        }
    }

    private int calcularPotencia(int valorBase, int valorPotencia) {
        if (valorPotencia == 0) {
            return 1;
        } else {
            return valorBase * calcularPotencia(valorBase, valorPotencia-1);
        }
    }

    public void fibonacci(View view) {
        if (!valor1.getText().toString().isEmpty()) {
            int valorPosicion = Integer.parseInt(valor1.getText().toString());
            int resultadoFibonacci = calcularFibonacci(valorPosicion);
            resultado.setText(String.valueOf(resultadoFibonacci));
        } else {
            resultado.setText("Ingrese un valor en la primera casilla.");
        }
    }

    private int calcularFibonacci(int valorPosicion) {
        if (valorPosicion <= 0) {
            return 0;
        } else if (valorPosicion == 1){
            return 1;
        } else {
            return calcularFibonacci(valorPosicion - 1) + calcularFibonacci(valorPosicion - 2);
        }
    }
}
