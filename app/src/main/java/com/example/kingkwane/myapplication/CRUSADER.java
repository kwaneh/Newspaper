package com.example.kingkwane.myapplication;


import android.content.Intent;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.webkit.WebView;
import android.widget.TextView;



public class CRUSADER extends ActionBarActivity {
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRetainInstance(true);
        //mUrl = getActivity().getIntent().getData().toString();
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.loadUrl("https://www.susqu.edu/crusader/default.cfm?IssueID=288");

        TextView t = (TextView) findViewById(R.id.textView2);
        t.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       Intent i = new Intent(CRUSADER.this, NewsActivity.class);
       startActivity(i);

            }
     });
     TextView y = (TextView) findViewById(R.id.textView3);
        y.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick(View v) {
                Intent j = new Intent(CRUSADER.this, Sports.class);
                startActivity(j);

            }
        });
        TextView h = (TextView) findViewById(R.id.textView4);
        h.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick(View v) {
                Intent b = new Intent(CRUSADER.this, LivingArt.class);
                startActivity(b);

            }
        });

        TextView z = (TextView) findViewById(R.id.textView6);
        z.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick(View v) {
                Intent k = new Intent(CRUSADER.this, Forum.class);
                startActivity(k);

            }
        });

    }

    /*@Override
    public View nCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        //mWebView = (WebView)v.findViewById(R.id.webview);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

