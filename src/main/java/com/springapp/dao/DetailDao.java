package com.springapp.dao;

import com.springapp.entity.GbtbProductInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
@Repository
public interface DetailDao {

    public GbtbProductInfoEntity getProductDetail(Integer pid);
}
