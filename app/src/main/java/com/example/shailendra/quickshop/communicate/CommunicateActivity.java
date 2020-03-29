package com.example.shailendra.quickshop.communicate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.shailendra.quickshop.R;
import com.example.shailendra.quickshop.database.StaticValues;

public class CommunicateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_communicate );

        Toolbar toolbar = findViewById( R.id.x_ToolBar );
        setSupportActionBar( toolbar );
        try {
            getSupportActionBar().setDisplayShowTitleEnabled( true );
            getSupportActionBar().setTitle( "Communicate" );
            getSupportActionBar( ).setDisplayHomeAsUpEnabled( true );
        }catch (NullPointerException ignored){ }

        String type = getIntent().getStringExtra( "MENU_TYPE" );

        if (type.equals( "HELP" )){
            TextView version = findViewById( R.id.sample_text );
            version.setText( "First Order \n Version : "+ StaticValues.APP_VERSION );
        }

        // TODO : In this Class We have to write code of Communicate ...

        /**
         * TODO : Help Fragment
         * TODO : Report a Problem
         * TODO : Rate and Review...
         */

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home ){
            finish();
            return true;
        }
        return super.onOptionsItemSelected( item );
    }

}
