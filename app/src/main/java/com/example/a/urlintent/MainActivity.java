package com.example.a.urlintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.tiaozhuan);
        final EditText webrurl = (EditText) findViewById(R.id.et_url);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String web=webrurl.getText().toString();
                Uri uri=Uri.parse(web);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(web));
                startActivity(intent);
            }
        });

    }

}
