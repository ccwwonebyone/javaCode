package com.dayi.baseclient.provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;


public class CraftCodeProvider {

    private String table = "invoic_craft_code";
    public String InsertSql(Map<String, String> map){
        String craft_name = map.get("craft_name");
        String add_persion_name = map.get("add_persion_name");
        return new SQL().INSERT_INTO(table)
                            .INTO_COLUMNS("craft_name", "add_persion_name")
                            .INTO_VALUES("#{craft_name}","#{add_persion_name}").toString();
    }

    public String get(Map<String, Object> map){
        SQL sql = new SQL().SELECT("id,craft_name,status,created_at,updated_at,add_persion_name,update_persion_name").FROM(table);
        sql.WHERE("status = 1");
        if(map.get("craft_name") != null && map.get("craft_name") != ""){
            sql.WHERE("craft_name like '%#{craft_name}%'");
        }
        return sql.toString();
    }
}
