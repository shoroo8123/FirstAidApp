package com.example.com.firstaid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class CommonCases extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_cases);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_common_cases, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void Gotobleeding(View view) {
        Intent intent = new Intent(getApplicationContext(),Bleeding.class);
        startActivity(intent);
    }
    public void Gotofainting(View view) {
        Intent intent = new Intent(getApplicationContext(),Fainting.class);
        startActivity(intent);
    }
    public void GotoHeartAttack(View view) {
        Intent intent = new Intent(getApplicationContext(),HeartAttack.class);
        startActivity(intent);
    }
    public void GotoBurns(View view) {
        Intent intent = new Intent(getApplicationContext(),Burns.class);
        startActivity(intent);
    }
    public void GotoBreaking(View view) {
        Intent intent = new Intent(getApplicationContext(),Breaking.class);
        startActivity(intent);
    }
    public void GotoDrowing(View view) {
        Intent intent = new Intent(getApplicationContext(),rowning.class);
        startActivity(intent);
    }
}
