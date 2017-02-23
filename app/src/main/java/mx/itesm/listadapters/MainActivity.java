package mx.itesm.listadapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    // Array of strings...
    String[] myArray = {"List Element 1","List Element 2","List Element 3","List Element 4","List Element 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context mycontext;
        mycontext = getApplicationContext();

        ArrayAdapter adapter = new ArrayAdapter<String>(mycontext, R.layout.activity_listview, myArray);

        ListView listView = (ListView) findViewById(R.id.my_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listItem = (String)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "You Clicked " + listItem, Toast.LENGTH_LONG).show();

            }
        });

    }




}