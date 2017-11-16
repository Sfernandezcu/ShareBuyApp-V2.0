package com.arizmendi43.sfernandez.sharebuyapp.formulario;

import android.content.Intent;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.arizmendi43.sfernandez.sharebuyapp.MainActivity;
import com.arizmendi43.sfernandez.sharebuyapp.R;
import com.arizmendi43.sfernandez.sharebuyapp.login.LoginActivity;

public class FormularioActivity extends AppCompatActivity {


    private EditText textName;
    private EditText textApellido;
    private EditText textUsuario;
    private EditText textPassword;
    private EditText textVerificarPassword;
    private Button btn_registro;


    //hola marica


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);


        textName = (EditText) findViewById(R.id.text_name);
        textApellido=(EditText) findViewById(R.id.text_apellido);
        textUsuario = (EditText) findViewById(R.id.text_usuario);
        textPassword = (EditText) findViewById(R.id.text_contraseña);
        textVerificarPassword = (EditText) findViewById(R.id.text_verificarcontraseña);
        btn_registro = (Button) findViewById(R.id.button_registrarse_form);




    }
    public boolean verificarPass(String pass1, String pass2){

        if(pass1.equals(pass2)){
            return true;
        }
        return false;

    }






    public void onClickButton(View view){

        String name = textName.getText().toString();
        String apellido = textApellido.getText().toString();
        String usuario = textUsuario.getText().toString();
        String pass = textPassword.getText().toString();
        String vefpass = textVerificarPassword.getText().toString();




        if(verificarPass(pass,vefpass)){

            Toast.makeText(this," contraseña correcta ", Toast.LENGTH_LONG).show();
            startActivity(new Intent(FormularioActivity.this, LoginActivity.class));
            return;

        }else{
            Toast.makeText(this," contraseña incorrecta ", Toast.LENGTH_LONG).show();
        }



    }
}
