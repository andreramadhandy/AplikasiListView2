package id.ac.poliban.mi.andre.aplikasilistview2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{
                {"Indonesia", "ASEAN", "indonesia"},
                {"Palestina", "Timur Tengah", "palestine"},
                {"Malaysia", "ASEAN", "malaysia"},
                {"Singapura", "ASEAN", "singapura"},
                {"Brunei Darussalam", "ASEAN", "brunei"},
                {"Myanmar","ASEAN", "myanmar"},
                {"Philippine", "ASEAN", "philippine"}
        };

        NegaraAdapter adapter = new NegaraAdapter(MainActivity.this, dataNegara);
        lvResult.setAdapter(adapter);

        lvResult.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Anda mengklik: " + dataNegara[position], Toast.LENGTH_LONG).show();
        });
    }
}
