package com.neighbor.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neighbor.test.vo.User;

@Repository
public class UserDAO {
      
      @Autowired
      private SqlSession SqlSession;
      
      public List<User> getUserList(){
            return SqlSession.selectList("com.neighbor.test.getUserList");
      }
}