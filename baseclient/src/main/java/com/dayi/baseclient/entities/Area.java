package com.dayi.baseclient.entities;

public class Area extends Base{

    private String area_name;

    private String area_bh;

    private int vildflag;

    public void setArea_name(String area_name){
        this.area_name = area_name;
    }

    public void setArea_bh(String area_bh){
        this.area_bh = area_bh;
    }

    public void setVildflag(int vildflag){
        this.vildflag = vildflag;
    }

    public String getArea_name()
    {
        return area_name;
    }

    public String getArea_bh(){
        return area_bh;
    }

    public int getVildflag(){
        return vildflag;
    }
}
