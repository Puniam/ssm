package org.excelProject.dao;

import org.excelProject.pojo.TestPojo;

public interface TestPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestPojo record);

    int insertSelective(TestPojo record);

    TestPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestPojo record);

    int updateByPrimaryKey(TestPojo record);
}