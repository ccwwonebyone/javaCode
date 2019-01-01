package com.dayi.baseclient.mapper;

import com.dayi.baseclient.entities.CraftCode;
import com.dayi.baseclient.provider.CraftCodeProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CraftCodeMapper {

    @InsertProvider(type = CraftCodeProvider.class, method = "InsertSql")
    int store(@Param("craft_name") String craft_name, @Param("add_persion_name") String add_persion_name);

    @SelectProvider(type=CraftCodeProvider.class, method = "get")
    List<CraftCode> get(@Param("craft_name") String craft_name);
}
