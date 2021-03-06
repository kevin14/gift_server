package com.springapp.dao;

import com.springapp.entity.Condition;
import com.springapp.entity.GbtbProductInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhuoyangzong on 15/4/30.
 */
@Repository
public interface ListDao {

    List<GbtbProductInfoEntity> getProductList(Condition condition);
}
