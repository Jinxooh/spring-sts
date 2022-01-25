package com.neighbor.test.service;

import java.util.List;

import com.neighbor.test.vo.TestVO;

public interface TestService {
    
    public List<TestVO> getTestValue(TestVO testVO);
}