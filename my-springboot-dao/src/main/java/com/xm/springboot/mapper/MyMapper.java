package com.xm.springboot.mapper;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * author: caoxingming
 * date: 2018/3/28
 * time: 15:51
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public interface MyMapper<T> extends Mapper<T>,IdsMapper<T> {
}
