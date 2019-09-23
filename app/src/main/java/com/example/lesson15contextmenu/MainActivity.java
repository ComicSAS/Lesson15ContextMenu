package com.example.lesson15contextmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvColor, tvSize;

//    final int MENU_COLOR_RED = 1;
//    final int MENU_COLOR_GREEN = 2;
//    final int MENU_COLOR_BLUE = 3;
//
//    final int MENU_SIZE_22 = 4;
//    final int MENU_SIZE_26 = 5;
//    final int MENU_SIZE_30 = 6;


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //using xml-menu named mymenu
        getMenuInflater().inflate(R.menu.mymenu, menu);

        switch (v.getId()) {
            case R.id.tvColor:
                menu.setGroupVisible(R.id.group2, false);
//                menu.add(0, MENU_COLOR_RED, 0, "RED");
//                menu.add(0, MENU_COLOR_GREEN, 0, "GREEN");
//                menu.add(0, MENU_COLOR_BLUE, 0, "BLUE");
                break;
            case R.id.tvSize:
                menu.setGroupVisible(R.id.group1, false);
//                menu.add(0, MENU_SIZE_22, 0, "22");
//                menu.add(0, MENU_SIZE_26, 0, "26");
//                menu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            // menu items for tvColor
            case R.id.menu_color_red:
                tvColor.setTextColor(Color.RED);
                tvColor.setText(R.string.txtColorRed);
                break;
            case R.id.menu_color_green:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText(R.string.txtColorGreen);
                break;
            case R.id.menu_color_blue:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText(R.string.txtColorBlue);
                break;
            // menu items for tvSize
            case R.id.menu_size_22:
                tvSize.setTextSize(22);
                tvSize.setText(R.string.txtSize22);
                break;
            case R.id.menu_size_26:
                tvSize.setTextSize(26);
                tvSize.setText(R.string.txtSize26);
                break;
            case R.id.menu_size_30:
                tvSize.setTextSize(30);
                tvSize.setText(R.string.txtSize30);
                break;
        }
//        switch (item.getItemId()) {
//            // menu items for tvColor
//            case MENU_COLOR_RED:
//                tvColor.setTextColor(Color.RED);
//                tvColor.setText("Text color = red");
//                break;
//            case MENU_COLOR_GREEN:
//                tvColor.setTextColor(Color.GREEN);
//                tvColor.setText("Text color = green");
//                break;
//            case MENU_COLOR_BLUE:
//                tvColor.setTextColor(Color.BLUE);
//                tvColor.setText("Text color = blue");
//                break;
//            // menu items for tvSize
//            case MENU_SIZE_22:
//                tvSize.setTextSize(22);
//                tvSize.setText("TextSize = 22");
//                break;
//            case MENU_SIZE_26:
//                tvSize.setTextSize(26);
//                tvSize.setText("TextSize = 26");
//                break;
//            case MENU_SIZE_30:
//                tvSize.setTextSize(30);
//                tvSize.setText("TextSize = 30");
//                break;
//        }

        return super.onContextItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor = findViewById(R.id.tvColor);
        tvSize = findViewById(R.id.tvSize);

        // для tvColor и tvSize необходимо создавать контекстное меню
        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
    }
}
