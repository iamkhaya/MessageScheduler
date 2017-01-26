package com.khayelihle.tshuma.messagescheduler;

/**
 * Created by kurama on 1/26/17.
 */

public class Message {
    private int id;
    private String content;
    private String category;

    public Message() {
    }

    public Message(int id,String content,String category)
    {
        this.id=id;
        this.content=content;
        this.category=category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

}