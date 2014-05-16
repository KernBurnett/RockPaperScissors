package com.example.rockpaperscissors.app;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


/* Calvin and Steven awesome app */
/*import statements that won't stay*/
/*import com.parse.Parse;
import com.parse.ParseAnalytics;*/
/* Ready to cover some rocks, smash some scissors, and cut up some paper! */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //So this needs to be added for parse
//        ParseObject parse;
//        Parse.initialize(this, "0kcY9uzMqnzKvUfOOnKbaXAb92ICEXnC2Uc1DPOU", "UVQglpY3SDI5j9thsaXp5DsdCGWhxokT37eXvUyt");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
