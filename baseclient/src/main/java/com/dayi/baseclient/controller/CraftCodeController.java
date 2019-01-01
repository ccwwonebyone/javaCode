package com.dayi.baseclient.controller;

import com.dayi.baseclient.entities.CraftCode;
import com.dayi.baseclient.entities.ResultRespone;
import com.dayi.baseclient.service.CraftCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/craft_code")
public class CraftCodeController {

    @Autowired
    private CraftCodeService craftCodeService;

    @RequestMapping(method = RequestMethod.POST)
    public void store(@RequestParam String craft_name, @RequestParam String add_persion_name)throws Exception {
        craftCodeService.store(craft_name, add_persion_name);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<CraftCode> get(@RequestParam(value = "craft_name", required = false) String craft_name)throws Exception {
        System.out.print(craft_name+"");
        return craftCodeService.get(craft_name);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public  void update(@PathVariable String id) {

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public  void read(@PathVariable String id) {

    }
}
