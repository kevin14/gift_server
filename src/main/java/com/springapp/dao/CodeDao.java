package com.springapp.dao;

import com.springapp.entity.GbtbCodeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhuoyangzong on 15/5/23.
 */
@Repository
public interface CodeDao {

    // 获取共通列表
    List<GbtbCodeEntity> getCodeList(String code);
}
