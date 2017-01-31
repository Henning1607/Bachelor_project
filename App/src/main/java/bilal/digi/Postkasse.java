package bilal.digi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Postkasse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postkasse);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /** Called when the user clicks the Send button */
    public void btnmail1(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, bilal.digi.Mail1.class);
        startActivity(intent);

    }
    public void btnmail2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, bilal.digi.Mail2.class);
        startActivity(intent);

    }
    public void btnmail3(View view) {
        // Do somethingin response to button
        Intent intent = new Intent(this, bilal.digi.Mail3.class);
        startActivity(intent);

    }
    public void btnmail4(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, bilal.digi.Mail4.class);
        startActivity(intent);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(getApplicationContext(),Mailside.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}



