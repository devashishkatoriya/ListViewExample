package devashish.listviewexample;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public ListView l1;
    public ArrayAdapter <String>arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = (ListView) findViewById(R.id.listView);

        String []StringArray = {"Shushil","Devashish"};
        arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_listview,StringArray);

        Handler h1 = new Handler();
        h1.postDelayed(new Runnable() {
            @Override
            public void run() {
                l1.setAdapter(arrayAdapter);
            }
        },2000);

    }
}
