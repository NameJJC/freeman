package com.eumier.dao;


import java.util.List;
import java.util.Map;

import com.eumier.param.PageParameter;

/**
 * @author dongbin.yu
 * @from 2016-04-05
 * @since V1.0
 */
public interface SqlSessionHandler {

    <E> List<E> selectList(String statement, Map param, PageParameter page);

    <E> List<E> selectList(String statement, Object param);

    <E> List<E> selectList_np(String statement);

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object param);

    int insert(String statement);

    int insert(String statement, Object param);

    int update(String statement);

    int update(String statement, Object param);

    <K,V> Map<K,V> selectMap(String statement, String mapKey);

    <K,V> Map<K,V> selectMap(String statement, String mapKey, Object param);
}
