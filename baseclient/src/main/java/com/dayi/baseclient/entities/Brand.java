package com.dayi.baseclient.entities;

public class Brand extends Base{

    private String name;

    private int company_id;

    private int status = 1;

    private int shop_id;

    public void setName(String name){
        this.name = name;
    }

    public void setCompany_id(int company_id){
        this.company_id = company_id;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setShop_id(int shop_id){
        this.shop_id = shop_id;
    }


    public int getCompany_id()
    {
        return company_id;
    }

    public String getName(){
        return name;
    }

    public int getStatus(){
        return status;
    }

    public int getShop_id(){
        return shop_id;
    }


}
