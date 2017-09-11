package com.example.pc.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pc.listview.Adapters.ChatAdapter;
import com.example.pc.listview.DataModels.ChatModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listView);
        ArrayList<ChatModel> items=new ArrayList<>();

//        items.add("samsung");
//        items.add("apple");
//        items.add("samsung");
//        items.add("apple");
//        items.add("samsung");
//        items.add("apple");
//        items.add("samsung");
//        items.add("apple");

        for (int i = 0; i < 10; i++) {
            items.add(new ChatModel("zamel "+ i,"welcome to isi "+i));
        }
        //ArrayAdapter<ChatModel> comArrayAdapter=new ArrayAdapter<ChatModel>(this,R.layout.item_row,R.id.button,items);
        ChatAdapter comArrayAdapter=new ChatAdapter(this,items);

        listView.setAdapter(comArrayAdapter);


    }
}
