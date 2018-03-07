package com.asd.puffin.modules.mapper;

import com.asd.puffin.modules.pojo.Fzacc;
import org.springframework.stereotype.Repository;

@Repository
public interface FzaccMapper {
    int deleteByPrimaryKey(String accno);

    int insert(Fzacc record);

    int insertSelective(Fzacc record);

    Fzacc selectByPrimaryKey(String accno);

    int updateByPrimaryKeySelective(Fzacc record);

    int updateByPrimaryKey(Fzacc record);
}