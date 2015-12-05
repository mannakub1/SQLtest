package com.example.manny.sqltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intent i = new Intent(this,Main2Activity.class);
        //startActivity(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        /*if (id == R.id.action_call) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0860278298"));
            startActivity(intent);
            return true;
        }else if(id == R.id.action_camera) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_CAMERA_BUTTON);
            startActivity(intent);
            return true;
        }
        ...
        */
        return super.onOptionsItemSelected(item);
    }
}
