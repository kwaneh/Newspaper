package com.example.kingkwane.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;


public class NewsActivity extends ActionBarActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_news);
    mWebView = (WebView) findViewById(R.id.webview);
    mWebView.loadUrl("https://www.susqu.edu/crusader/section.cfm?IssueID=288&SectionID=1");

    TextView t = (TextView) findViewById(R.id.textView12);
    t.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(NewsActivity.this, CRUSADER.class);
        startActivity(i);

        }
    });
    TextView y = (TextView) findViewById(R.id.textView16);
    y.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent j = new Intent(NewsActivity.this, LivingArt.class);
            startActivity(j);

        }
    });
    TextView h = (TextView) findViewById(R.id.textView13);
    h.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    Intent b = new Intent(NewsActivity.this, Sports.class);
    startActivity(b);

         }
    });

    TextView z = (TextView) findViewById(R.id.textView14);
    z.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent k = new Intent(NewsActivity.this, Forum.class);
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