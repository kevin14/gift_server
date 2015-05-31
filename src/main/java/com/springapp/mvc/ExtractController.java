package com.springapp.mvc;

import com.springapp.dao.DetailDao;
import com.springapp.dao.OrderDao;
import com.springapp.entity.GbtbProductInfoEntity;
import com.springapp.entity.GbtbTradeRecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhuoyangzong on 15/5/30.
 */
@Service
@RequestMapping("")
public class ExtractController {

    @Autowired
    OrderDao orderDao;

    @Autowired
    DetailDao detailDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(value = "/extract", method = RequestMethod.GET)
    public String extract(ModelMap model) {
        return "extract";
    }

    @RequestMapping(value = "/extract", method = RequestMethod.POST)
    public String fetch(ModelMap model) {

        // 获得提取码
        String fetchCode = request.getParameter("fetchCode");

        if (fetchCode == null || fetchCode.length() == 0) {
            // TODO 请输入提取码
            return "warning";
        } else {
            // 查找订单
            GbtbTradeRecordEntity recordEntity = orderDao.getByFetchCode(fetchCode);

            if (recordEntity == null) {
                // TODO 数据库连接失败
                return "error";
            } else if (recordEntity.getId() == 0) {
                // TODO 提取码不存在或已被使用
                return "warning";
            } else {

                // 获取订单内的商品详情
                GbtbProductInfoEntity product1 = detailDao.getProductDetail(recordEntity.getProductId1());
                GbtbProductInfoEntity product2 = detailDao.getProductDetail(recordEntity.getProductId2());
                GbtbProductInfoEntity product3 = detailDao.getProductDetail(recordEntity.getProductId3());
                GbtbProductInfoEntity product4 = detailDao.getProductDetail(recordEntity.getProductId4());
                GbtbProductInfoEntity product5 = detailDao.getProductDetail(recordEntity.getProductId5());
                GbtbProductInfoEntity product6 = detailDao.getProductDetail(recordEntity.getProductId6());
                // TODO 是只传部分内容还是全部

                // TODO 页面上存放fetchCode，提取操作都通过提取码来保持一致
                model.addAttribute("order", recordEntity);
                return "fetch";
            }
        }
    }
}
