package com.example.kingkwane.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.TextView;
import android.widget.Toast;


public class CRUSADER extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.susqu.edu/crusader/section.cfm?IssueID=287&SectionID=1");
                //Intent i = new Intent(CRUSADER.this, NewsActivity.class);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);

            }
        });
        TextView y = (TextView) findViewById(R.id.textView3);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri1 = Uri.parse("http://thesucrusader.com/?cat=4");
                Intent j = new Intent(Intent.ACTION_VIEW, uri1);
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
        TextView m = (TextView) findViewById(R.id.textView5);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(CRUSADER.this, TopStories.class);
                startActivity(s);

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

