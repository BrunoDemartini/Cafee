package br.com.bruno.cafee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int precoUni = 0;
    int cont = 1 ;

    public void cafe(View view){
         precoUni= 3;
         cont = 1;
         TextView quantidade = findViewById(R.id.quant);
         quantidade.setText(""+cont);
         TextView preco = findViewById(R.id.total);
         preco.setText("Preço Total: "+precoUni);
    }

    public void cafeleite(View view){
        precoUni= 4;
        cont = 1;
        TextView quantidade = findViewById(R.id.quant);
        quantidade.setText(""+cont);
        TextView preco = findViewById(R.id.total);
        preco.setText("Preço Total: "+precoUni);
    }

    public void capuccino(View view){
        precoUni= 5;
        cont = 1;
        TextView quantidade = findViewById(R.id.quant);
        quantidade.setText(""+cont);
        TextView preco = findViewById(R.id.total);
        preco.setText("Preço Total: "+precoUni);

    }

    public void mais(View view){
        if (precoUni != 0) {
            cont++;
            TextView quantidade = findViewById(R.id.quant);
            quantidade.setText("" + cont);
            TextView preco = findViewById(R.id.total);
            preco.setText("Preço Total: "+precoUni*cont);
        } else {}
    }

    public void menos(View view){
        if (cont > 1){
            cont--;
            TextView quantidade = findViewById(R.id.quant);
            quantidade.setText(""+cont);
            TextView preco = findViewById(R.id.total);
            preco.setText("Preço Total: "+precoUni*cont);
        } else{}

    }
}
