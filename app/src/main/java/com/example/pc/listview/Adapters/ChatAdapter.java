package com.example.pc.listview.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.pc.listview.DataModels.ChatModel;
import com.example.pc.listview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 11/09/2017.
 */

public class ChatAdapter extends ArrayAdapter<ChatModel> {
    public ChatAdapter(@NonNull Context context, @NonNull List<ChatModel> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
ChatModel chatModel=getItem(position);

        if (convertView==null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);

        }
            TextView textView=(TextView) convertView.findViewById(R.id.textView);
            Button button=(Button)convertView.findViewById(R.id.button);
            textView.setText(chatModel.getName());
           button.setText(chatModel.getBody());

        






        return convertView;

    }
}
