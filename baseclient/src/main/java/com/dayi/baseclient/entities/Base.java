package com.dayi.baseclient.entities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Base {
    protected Timestamp created_at;
    protected Timestamp updated_at;
    protected int id;

    public void setId(int id){
        this.id = id;
    }

    public void setCreated_at(Timestamp created_at){
        this.created_at = created_at;
    }

    public void setUpdated_at(Timestamp updated_at){
        this.updated_at = updated_at;
    }

    public int getId(){
        return id;
    }

    public String getCreated_at(){
        return created_at != null ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(created_at) : created_at+"";
    }

    public String getUpdated_at(){
        return updated_at != null ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(updated_at) : updated_at+"";
    }
}
