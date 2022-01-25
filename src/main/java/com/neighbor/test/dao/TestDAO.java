package com.neighbor.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import com.neighbor.test.vo.TestVO;

@Repository
public class TestDAO {
      
      @Autowired
      private SqlSession SqlSession;
      
      public List<TestVO> getTestValue(TestVO testVO){
            return SqlSession.selectList("com.neighbor.test.getTestValue", testVO);
      }
}