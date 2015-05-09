package com.springapp.mvc;

import com.springapp.dao.ListDao;
import com.springapp.entity.GbtbProductInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
@RequestMapping("/list*")
public class ListController {

    @Autowired
    public ListDao listDao;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        List<GbtbProductInfoEntity> list = listDao.getProductList();

        model.addAttribute("list", list);

        return "list";
    }
}