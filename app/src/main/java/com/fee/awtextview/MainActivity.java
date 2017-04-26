package com.fee.awtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.free.autowraptextview.widget.AutoWrapTextView;

public class MainActivity extends AppCompatActivity {

    private String text = "text密码：jokG5456KL542356jsjdherGHS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AutoWrapTextView) findViewById(R.id.awtextview)).setText(text);
    }
}
