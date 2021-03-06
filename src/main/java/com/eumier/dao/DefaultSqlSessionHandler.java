package com.eumier.dao;

import org.apache.ibatis.session.SqlSession;

import com.eumier.param.PageParameter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jcJiang
 * @from 2017-5-21 14:31:58
 * @since V1.0
 */
public class DefaultSqlSessionHandler implements SqlSessionHandler {

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    public <E> List<E> selectList(String statement, Map param, PageParameter page) {

        if (param == null) {
            param = new HashMap();
        }

        param.put("page", page);
        return sqlSession.selectList(statement, param);
    }

    public <E> List <E> selectList_np(String statement){

        return sqlSession.selectList(statement);
    }
    public <E> List<E> selectList(String statement, Object param) {

        return sqlSession.selectList(statement, param);
    }

    public <T> T selectOne(String statement) {

        return sqlSession.selectOne(statement);
    }

    public <T> T selectOne(String statement, Object param) {

        return sqlSession.selectOne(statement,param);
    }

    public int insert(String statement) {

        return sqlSession.insert(statement);
    }

    public int insert(String statement, Object param) {

        return sqlSession.insert(statement, param);
    }

    public int update(String statement) {

        return sqlSession.update(statement);
    }

    public int update(String statement, Object param) {

        return sqlSession.update(statement, param);
    }

    public <K,V> Map<K,V> selectMap(String statement,String mapKey) {

        return sqlSession.selectMap(statement, mapKey);
    }

    public <K,V> Map<K,V> selectMap(String statement,String mapKey,Object param) {

        return sqlSession.selectMap(statement, param, mapKey);
    }
}
