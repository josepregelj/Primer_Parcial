package ar.edu.frba.utn.primer_parcial.activities;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ar.edu.frba.utn.primer_parcial.R;

//Definición de activity
public class Login extends AppCompatActivity {

    //VARIABLES VIEW OBJECTS
    public TextView text_view_error;
    public EditText edit_text_user;
    public EditText edit_text_pass;
    public Button button_login;

    //VARIABLES LOCALES
    public String user;
    public String pass;
    public Context context;
    public String prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Defino orientación
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Seteamos la vista
        setContentView(R.layout.activity_login);

        //Busco los views a utilizar
        text_view_error = (TextView) findViewById(R.id.textVievError);
        button_login =(Button)findViewById(R.id.buttonLogin);
        edit_text_user = (EditText) findViewById(R.id.editTextUser);
        edit_text_pass = (EditText) findViewById(R.id.editTextPass);

        //TODO context??



    }
}
