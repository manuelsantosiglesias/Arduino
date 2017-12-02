package es.santos.manu.arduino;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mainDrawerLayout;
    private ActionBarDrawerToggle mainActionBarDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainDrawerLayout =(DrawerLayout) findViewById(R.id.main_activity);
        mainActionBarDrawerToggle = new ActionBarDrawerToggle(this,mainDrawerLayout,R.string.abrir,R.string.cerrar);
        mainDrawerLayout.addDrawerListener(mainActionBarDrawerToggle);
        mainActionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mainActionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
