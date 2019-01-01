package com.dayi.baseclient.provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class AreaProvider {
    private String table = "store_areas";

    public String get(Map<String, String> mao){

        return new SQL().SELECT("rec_id as id", "area_name", "areab_bh").FROM(table)
                .WHERE("area_bh like").toString();
    }
}
