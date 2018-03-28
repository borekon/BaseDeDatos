package eu.vivancos.basededatos;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        DBLibros db = new DBLibros(this);
        Cursor c = db.recuperarLibros();
        String [] columns = new String[]{"titulo","autor","precio"};
        int [] views = new int[]{R.id.textView,R.id.textView2,R.id.textView3};
        SimpleCursorAdapter sc = new SimpleCursorAdapter(this,R.layout.list_controls,c,columns,views, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        ListView lista = (ListView) findViewById(R.id.listaLibros);
        lista.setAdapter(sc);
        db.close();
        findViewById(R.id.exitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        }
    }

