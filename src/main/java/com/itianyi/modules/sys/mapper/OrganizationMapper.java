package com.itianyi.modules.sys.mapper;

import java.util.List;

import com.itianyi.core.common.mapper.BaseTreeMapper;
import com.itianyi.modules.sys.entity.Organization;

public interface OrganizationMapper extends BaseTreeMapper<Organization> {
	
	/**
	 * 
	 * @title: findListByUserId
	 * @description: 通过用户查找组织机构
	 * @param userId
	 * @return
	 * @return: List<Organization>
	 */
	List<Organization> findListByUserId(String userId);
}