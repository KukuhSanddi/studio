package com.kukuh.studio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainEmployee extends AppCompatActivity {

    String[] listArr = {"Visitor 1", "Visitor 2", "Visitor 3", "Visitor 4",
            "Visitor 5", "Visitor 6", "Visitor 7"};
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_employee);

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.activity_list_view, R.id.label, listArr);

        context = this;

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int positon, long id){
                Toast.makeText(context,"Item clicked", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void info_Employee(View view){
        Button btn = (Button) view;
        Toast.makeText(this, "Button"+ btn.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
