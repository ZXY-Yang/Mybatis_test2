package com.qf.myBatis.test.service;

import com.qf.myBatis.test.mapper.AddressMapper;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class AddressMapperTest {
    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(AddressMapperTest.class.getClassLoader()
    .getResourceAsStream("mybatis-config.xml"));
    SqlSession sqlSession=ssf.openSession(true);
    AddressMapper mapper=sqlSession.getMapper(AddressMapper.class);
    Address address= mapper.selectUserByName();
    System.out.println(address);
}
