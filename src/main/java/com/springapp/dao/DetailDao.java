package com.springapp.dao;

import com.springapp.entity.GbtbProductInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
@Repository
public interface DetailDao {

    GbtbProductInfoEntity getProductDetail(Integer pid);
}
