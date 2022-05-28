package com.example.l10_arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listview;
    Button btn;
    EditText txt;
    ArrayAdapter<String> adapter;
    ArrayList<String> studentlist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.lst);
        btn=findViewById(R.id.button);
        txt=findViewById(R.id.editText);
        btn.setOnClickListener(this);

        studentlist.add("Sana");
        studentlist.add("Iqra");
        studentlist.add("Fiza");
        studentlist.add("Kinza");
        studentlist.add("Ahmed");

       adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,studentlist);
        listview.setAdapter(adapter);



    }

    @Override
    public void onClick(View view) {
        studentlist.add( txt.getText().toString());
        adapter.notifyDataSetChanged();

    }
}