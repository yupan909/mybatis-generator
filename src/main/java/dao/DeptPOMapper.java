package dao;

import model.DeptPO;

public interface DeptPOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DeptPO record);

    int insertSelective(DeptPO record);

    DeptPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeptPO record);

    int updateByPrimaryKey(DeptPO record);
}