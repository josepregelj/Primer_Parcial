package ar.edu.frba.utn.primer_parcial.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import ar.edu.frba.utn.primer_parcial.R;
import ar.edu.frba.utn.primer_parcial.classes.DataBaseHelper;

//Definición de activity
public class SplashScreen extends AppCompatActivity {

    //VARIABLES LOCALES
    private static final long DURACION_SPLASH = 1500;

    //Inicio de activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Defino orientación activity
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Escondo el título de la app
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Seteo la vista de la activity
        setContentView(R.layout.activity_splash_screen);

        // Levanto la base de datos de usuarios
        DataBaseHelper UDbHelper = new DataBaseHelper(this, "users");
        UDbHelper.createDataBase();

        // Levanto la base de datos de alumnos
        DataBaseHelper CDbHelper = new DataBaseHelper(this, "alumnos");
        CDbHelper.createDataBase();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Voy a la nurva activity Login
                Intent LoginIntent = new Intent(SplashScreen.this,Login.class);
                startActivity(LoginIntent);

                //Finalizo la activity actual
                finish();
            }
        },DURACION_SPLASH);
    }
}
