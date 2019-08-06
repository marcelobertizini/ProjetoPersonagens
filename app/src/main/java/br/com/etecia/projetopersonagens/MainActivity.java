package br.com.etecia.projetopersonagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] namePersonagem = {"Aquaman", "Homem Aranha", "Asa Noturna", "Atomo", "Batman", "Capitão America", "Gambit", "Mulher Gavião", "Hulk", "Homem de Ferro", "Jean Gray", "Luke Cage", "Magneto", "Mistica", "Dead Pool"," Tempestade"," Thor", "Vampira", "Wolverine", "Pr.Xavier"}
    int[] imagePersonagem = {R.drawable.aquaman_dois, R.drawable.aranha_dois, R.drawable.asa_dois, R.drawable.atomo_dois, R.drawable.batiman_dois, R.drawable.capitao_dois, R.drawable.gambit_dois, R.drawable.gaviao_dois, R.drawable.hulk_dois, R.drawable.iron_dois, R.drawable.jean_dois, R.drawable.luke_dois, R.drawable.magneto_dois,R.drawable.mistica_dois,R.drawable.pool_dois,R.drawable.tempestade_dois,R.drawable.thor_dois,R.drawable.vampira_dois,R.drawable.wolverine_dois,R.drawable.xavier_dois}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lstPersonagem)

        CustomAdapter customAdapter = new CustomAdapter();

    }
}
