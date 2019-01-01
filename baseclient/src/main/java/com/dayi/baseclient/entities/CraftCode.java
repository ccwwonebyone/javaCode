package com.dayi.baseclient.entities;

public class CraftCode extends Base{

    private String craft_name;

    private String add_persion_name;

    private int status = 1;

    private String update_persion_name;

    public void setCraft_name(String craft_name){
        this.craft_name = craft_name;
    }

    public void setAdd_persion_name(String add_persion_name){
        this.add_persion_name = add_persion_name;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setUpdate_persion_name(String update_persion_name){
        this.update_persion_name = update_persion_name;
    }


    public String getAdd_persion_name()
    {
        return add_persion_name;
    }

    public String getCraft_name(){
        return craft_name;
    }

    public int getStatus(){
        return status;
    }

    public String getUpdate_persion_name(){
        return update_persion_name;
    }


}
