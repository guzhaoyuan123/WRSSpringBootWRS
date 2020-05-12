package com.niit.vhrend.mapper;

import com.niit.vhrend.model.Renshixinxitongji;

public interface RenshixinxitongjiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Renshixinxitongji record);

    int insertSelective(Renshixinxitongji record);

    Renshixinxitongji selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Renshixinxitongji record);

    int updateByPrimaryKey(Renshixinxitongji record);
}