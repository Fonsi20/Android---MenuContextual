package com.example.a16alfonsofa.menucontextual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView lbl = (TextView) findViewById(R.id.txtEntrada);
        registerForContextMenu(lbl);

        ImageView img = (ImageView) findViewById(R.id.imglbl);
        registerForContextMenu(img);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        switch (v.getId()) {
            case R.id.txtEntrada:
                MenuInflater inflater = getMenuInflater();
                inflater.inflate(R.menu.menu_contextual, menu);
                break;
            case R.id.imglbl:
                MenuInflater inflater2 = getMenuInflater();
                inflater2.inflate(R.menu.menu_contextual_imagen, menu);
                break;
        }

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.item1:
                Toast.makeText(this, "Opción: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Opción: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Opción: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4:
                Toast.makeText(this, "Opción: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.itema:
                Toast.makeText(this, "Opción: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.itemb:
                Toast.makeText(this, "Opción: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
