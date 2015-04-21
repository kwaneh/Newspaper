package com.example.kingkwane.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;


public class LivingArt extends ActionBarActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_art);
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.loadUrl("https://www.susqu.edu/crusader/section.cfm?IssueID=288&SectionID=4");

        TextView t = (TextView) findViewById(R.id.textView5);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LivingArt.this, CRUSADER.class);
                startActivity(i);

            }
        });
        TextView y = (TextView) findViewById(R.id.textView11);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(LivingArt.this, NewsActivity.class);
                startActivity(j);

            }
        });
        TextView h = (TextView) findViewById(R.id.textView8);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(LivingArt.this, Sports.class);
                startActivity(b);

            }
        });

        TextView z = (TextView) findViewById(R.id.textView10);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(LivingArt.this, Forum.class);
                startActivity(k);

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sports, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}