package com.example.menu_activity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuInflater;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.menu_activity.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.Music:
                    Toast.makeText(this, "Playing Music...", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.Desktop_Site:
                    Toast.makeText(this, "Opening in Desktop form...", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.Translate:
                    Toast.makeText(this, "Translating in English...", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.Add_To_HomeScreen:
                    Toast.makeText(this, "Adding to homescreen...", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.Open_In_Chrome:
                    Toast.makeText(this, "Opening In Chrome...", Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }


        }

}