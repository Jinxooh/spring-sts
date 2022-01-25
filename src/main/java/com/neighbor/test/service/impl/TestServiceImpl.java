package com.neighbor.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neighbor.test.dao.TestDAO;
import com.neighbor.test.service.TestService;
import com.neighbor.test.vo.TestVO;

@Repository
public class TestServiceImpl implements TestService {
      
      @Autowired
      TestDAO TestDAO;
      
      @Override
      public List<TestVO> getTestValue(TestVO testVO){
            return TestDAO.getTestValue(testVO);
      }
}