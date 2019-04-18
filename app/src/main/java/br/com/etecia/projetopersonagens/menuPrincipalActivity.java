package br.com.etecia.projetopersonagens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal_layout);
    }

    public void abriPersonagem(View view) {

        switch (view.getId()){
            case R.id.idAquaman:
                Intent intent = new Intent(menuPrincipalActivity.this,AquamanActivity.class);
                startActivity(intent);
                break;

        }
    }
}
