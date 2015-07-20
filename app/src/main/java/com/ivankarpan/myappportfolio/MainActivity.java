package com.ivankarpan.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    protected Toast toast;

    public void onButtonClick(View view) {
        if (toast != null) {
            toast.cancel();
        }

        Button button = (Button)view;
        toast = Toast.makeText(
                this,
                getString(R.string.button_toast, button.getText()),
                Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
