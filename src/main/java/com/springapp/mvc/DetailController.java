package com.springapp.mvc;

import com.springapp.dao.DetailDao;
import com.springapp.entity.GbtbProductInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
@Service
@RequestMapping("/detail*")
public class DetailController {

    @Autowired
    public DetailDao detailDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        Integer pid = Integer.parseInt(request.getParameter("pid"));

        GbtbProductInfoEntity productDetail = detailDao.getProductDetail(pid);

        model.addAttribute("productDetail", productDetail);

        return "detail";
    }
}
