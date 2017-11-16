package com.arizmendi43.sfernandez.sharebuyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arizmendi43.sfernandez.sharebuyapp.formulario.FormularioActivity;
import com.arizmendi43.sfernandez.sharebuyapp.login.LoginActivity;
import com.arizmendi43.sfernandez.sharebuyapp.principal.ActivityPrincipal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Redireccion al login directamente

        if(true){
            startActivity(new Intent(MainActivity.this, ActivityPrincipal.class));
            finish();
            return;
        }

    }
}
