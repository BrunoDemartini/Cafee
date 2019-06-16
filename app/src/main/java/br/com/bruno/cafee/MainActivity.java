package br.com.bruno.cafee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int precoUni = 0;
    int cont = 1 ;
    String bazinga = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.botao);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);

                // Tipo do conteúdo.
                sendEmail.setType("text/plain");

                // Para passar os destinatários deve-se utilizar um array com
                // os endreços de e-mails.
                String[] addresses = {"brunorisso86@gmail.com"};
                sendEmail.putExtra(Intent.EXTRA_EMAIL, addresses);

                // Corpo do e-mail.
                sendEmail.putExtra(Intent.EXTRA_TEXT, "Olá, quero um café!");

                // Assunto do e-mail.
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Café!");

                // Verifica se existe algum app que resolve a intent
                if (sendEmail.resolveActivity(getPackageManager()) != null) {

                    // Inicia a intent
                    startActivity(sendEmail);

                    Log.i("E-mail", "Enviei o intent!");
                }
                Log.i("E-mail", "Botão pressionado!");

            }
        });

    }

    public void cafe(View view){
         precoUni= 3;
         cont = 1;
         TextView quantidade = findViewById(R.id.quant);
         quantidade.setText(""+cont);
         TextView preco = findViewById(R.id.total);
         preco.setText("Preço Total: "+precoUni);

         bazinga = texto(cont,precoUni);
         TextView pedido = findViewById(R.id.pedido);
         pedido.setText(bazinga);
    }

    public void cafeleite(View view){
        precoUni= 4;
        cont = 1;
        TextView quantidade = findViewById(R.id.quant);
        quantidade.setText(""+cont);
        TextView preco = findViewById(R.id.total);
        preco.setText("Preço Total: "+precoUni);

        bazinga = texto(cont,precoUni);
        TextView pedido = findViewById(R.id.pedido);
        pedido.setText(bazinga);
    }

    public void capuccino(View view){
        precoUni= 5;
        cont = 1;
        TextView quantidade = findViewById(R.id.quant);
        quantidade.setText(""+cont);
        TextView preco = findViewById(R.id.total);
        preco.setText("Preço Total: "+precoUni);

        bazinga = texto(cont,precoUni);
        TextView pedido = findViewById(R.id.pedido);
        pedido.setText(bazinga);

    }

    public void mais(View view){
        if (precoUni != 0) {
            cont++;
            TextView quantidade = findViewById(R.id.quant);
            quantidade.setText("" + cont);
            TextView preco = findViewById(R.id.total);
            preco.setText("Preço Total: "+precoUni*cont);

            bazinga = texto(cont,precoUni);
            TextView pedido = findViewById(R.id.pedido);
            pedido.setText(bazinga);
        } else {}
    }

    public void menos(View view){
        if (cont > 1){
            cont--;
            TextView quantidade = findViewById(R.id.quant);
            quantidade.setText(""+cont);
            TextView preco = findViewById(R.id.total);
            preco.setText("Preço Total: "+precoUni*cont);

            bazinga = texto(cont,precoUni);
            TextView pedido = findViewById(R.id.pedido);
            pedido.setText(bazinga);
        } else{}

    }

    public String texto(int a, int b){

        int preco = b*cont;
        if (a == 1){
            return "Gostaria de "+a+" cafe, por favor. O valor total será de R$ "+preco+". Vlw karai!!";
        }
        else{
            return "Gostaria de "+a+" cafés, por favor. O valor total será de R$ "+preco+". Vlw karai!!";
        }
    }
}
