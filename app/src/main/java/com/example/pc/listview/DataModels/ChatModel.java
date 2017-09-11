package com.example.pc.listview.DataModels;

/**
 * Created by pc on 11/09/2017.
 */

public class ChatModel {

    String name,body;

    @Override
    public String toString() {
        return "ChatModel{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ChatModel(String name, String body) {
        this.name = name;
        this.body = body;
    }
}
