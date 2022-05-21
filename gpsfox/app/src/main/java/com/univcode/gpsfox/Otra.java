package com.univcode.gpsfox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Otra extends AppCompatActivity {
    WebView wv;
    EditText et4;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);
        et4=(findViewById(R.id.et4));
        b5=(Button)findViewById(R.id.btnir);
        wv = (WebView) findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        //-------------------------obtener el extra de MainActivity-----------
        Bundle bun=getIntent().getExtras();
        et4.setText(bun.getString("ruta"));
    }
    public void ir(View v){
        wv.loadUrl("https://www.google.com.mx/maps/place/"+this.et4.getText().toString());
    }
}