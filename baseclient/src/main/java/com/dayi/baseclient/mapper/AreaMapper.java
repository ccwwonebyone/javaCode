package com.dayi.baseclient.mapper;

import com.dayi.baseclient.entities.Area;
import com.dayi.baseclient.provider.AreaProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface AreaMapper {
    @SelectProvider(type = AreaProvider.class,method = "get")
    List<Area> get(@Param("area_bh") String area_bh);
}
