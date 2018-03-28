package eu.vivancos.basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AltaActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta);
        findViewById(R.id.okButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.okButton:
                String titulo = ((EditText) findViewById(R.id.titleText)).getText().toString();
                String autor = ((EditText) findViewById(R.id.authorText)).getText().toString();
                Double precio =  Double.parseDouble(((EditText) findViewById(R.id.priceText)).getText().toString());
                DBLibros adp = new DBLibros(this);
                adp.altaLibro(titulo,autor,precio);
                adp.close();
                finish();
                break;
            case R.id.cancelButton:
                finish();
                break;

        }

    }
}
