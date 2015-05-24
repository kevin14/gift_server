package com.springapp.mvc;

import com.springapp.common.CONST;
import com.springapp.common.Util;
import com.springapp.dao.CodeDao;
import com.springapp.dao.ListDao;
import com.springapp.entity.Condition;
import com.springapp.entity.GbtbCodeEntity;
import com.springapp.entity.GbtbProductInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
@RequestMapping("/list*")
public class ListController {

    @Autowired
    ListDao listDao;

    @Autowired
    CodeDao codeDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(method = RequestMethod.GET)
    public String search(ModelMap model) {

        // 获取当前页
        int currentPage = 0;
        if (request.getParameter("currentPage") != null && request.getParameter("currentPage").length() > 0) {
            currentPage = Integer.parseInt(request.getParameter("currentPage"));
        }

        // 获取页面查询条件
        Condition condition = new Condition();
        condition.setRegion(request.getParameter("region"));
        condition.setKeyWord(request.getParameter("keyWord"));
        String price = request.getParameter("price");
        condition.setCategory(request.getParameter("category"));
        condition.setRate(request.getParameter("rate"));

        // 检查查询条件
        if (condition.getRegion() == null || condition.getRegion().length() == 0) {
            // TODO 没有传地区
            return "";
        }
        if (price == null || !Util.isNumeric(price)) {
            // TODO 价格没传或者不是数字
            return "";
        } else {
            condition.setPrice(Integer.parseInt(price));
        }

        List<GbtbProductInfoEntity> list = listDao.getProductList(condition);

        if ((currentPage - 1) * CONST.PAGESIZE >= list.size()) {
            // TODO 传来的页面数超过查询总数，用户在瞎搞
            return "";
        }

        int endIndex = 0;
        if ((currentPage + 1) * CONST.PAGESIZE > list.size()) {
            endIndex = list.size();
        } else {
            endIndex = (currentPage + 1) * CONST.PAGESIZE;
        }
        model.addAttribute("list", list.subList(currentPage * CONST.PAGESIZE, endIndex));

        // 总页数
        int totalPage = list.size() / CONST.PAGESIZE;
        if ((list.size() % CONST.PAGESIZE) > 0) {
            totalPage++;
        }
        model.addAttribute("totalPage", totalPage);

        // 设置下拉菜单
        HttpSession session = request.getSession();
        if (session.getAttribute("regionList") == null) {
            List<GbtbCodeEntity> regionList = codeDao.getCodeList(CONST.REGION);
            session.setAttribute("regionList", regionList);
        }
        if (session.getAttribute("categoryList") == null) {
            List<GbtbCodeEntity> categoryList = codeDao.getCodeList(CONST.CATEGORY);
            session.setAttribute("categoryList", categoryList);
        }

        return "list";
    }
}