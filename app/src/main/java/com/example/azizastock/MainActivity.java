package com.example.azizastock;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*------------Hooks-------------*/

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        /*-------tool-bar-support-------*/
        setSupportActionBar(toolbar);
        /*----navigation-Drawer-Menu----*/
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        Menu menu = navigationView.getMenu();
        menu.findItem(R.id.nav_logout).setVisible(false);
        menu.findItem(R.id.nav_rate).setVisible(false);
        menu.findItem(R.id.nav_message).setVisible(false);


    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.nav_home) {
        } else if (id == R.id.nav_stocks) {
            startActivity(new Intent(MainActivity.this, StocksActivity.class));
        }else if (id == R.id.nav_money) {
            startActivity(new Intent(MainActivity.this, CalculateActivity.class));
        }else if (id == R.id.nav_login) {
            Toast.makeText(this, "You logged in", Toast.LENGTH_SHORT).show();
            Menu menu = navigationView.getMenu();
            menu.findItem(R.id.nav_logout).setVisible(true);
            menu.findItem(R.id.nav_rate).setVisible(true);
            menu.findItem(R.id.nav_message).setVisible(true);
        } else if (id == R.id.nav_logout) {
            Toast.makeText(this, "You logged out", Toast.LENGTH_SHORT).show();
            Menu logoutMenu = navigationView.getMenu();
            logoutMenu.findItem(R.id.nav_logout).setVisible(false);
            logoutMenu.findItem(R.id.nav_rate).setVisible(false);
            logoutMenu.findItem(R.id.nav_message).setVisible(false);
        } else if (id == R.id.nav_rate) {
            startActivity(new Intent(MainActivity.this, RateActivity.class));
        }else if (id == R.id.nav_message) {
            startActivity(new Intent(MainActivity.this, MessageActivity.class));
        } else {
            Toast.makeText(this, "dude what did you do :O", Toast.LENGTH_SHORT).show();
        }

        return true;
    }

}
