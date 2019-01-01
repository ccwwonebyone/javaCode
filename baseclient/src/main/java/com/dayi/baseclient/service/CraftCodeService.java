package com.dayi.baseclient.service;

import com.dayi.baseclient.entities.CraftCode;
import com.dayi.baseclient.entities.ResultRespone;
import com.dayi.baseclient.mapper.CraftCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CraftCodeService {
    @Autowired
    CraftCodeMapper craftCodeMapper;

    public int store(String craft_name, String add_persion_name)
    {
        craftCodeMapper.store(craft_name, add_persion_name);
        return 1;
    }

    public List<CraftCode> get(String craft_name)
    {
        return craftCodeMapper.get(craft_name);
    }
}
