package com.dayi.baseclient.controller;

import com.dayi.baseclient.entities.Brand;
import com.dayi.baseclient.entities.ResultRespone;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrandController {

    @RequestMapping(path = "/brand", method = RequestMethod.POST)
    public @ResponseBody
    ResultRespone store(@RequestParam String name,
                        @RequestParam Integer company_id,
                        @RequestParam Integer shop_id){
        Brand brand = new Brand();
        brand.setName(name);
        brand.setCompany_id(company_id);
        brand.setShop_id(shop_id);

        ResultRespone resultRespone = new ResultRespone();
        return resultRespone;
    }

    @RequestMapping(path = "/brand", method = RequestMethod.GET)
    public @ResponseBody
    ResultRespone list(){
        return new ResultRespone();
    }
}
