package com.rnandprimarymixed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by xiongxuesong-pc on 2016/3/15.
 */
public class OpenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void openRN(View view){
        Intent intent = new Intent(this, OpenRNJSByActivity.class);

        startActivity(intent);
    }

}
