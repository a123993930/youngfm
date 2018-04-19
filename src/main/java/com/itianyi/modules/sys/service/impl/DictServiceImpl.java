package com.itianyi.modules.sys.service.impl;

import com.itianyi.core.common.service.impl.CommonServiceImpl;
import com.itianyi.modules.sys.entity.Dict;
import com.itianyi.modules.sys.mapper.DictMapper;
import com.itianyi.modules.sys.service.IDictService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("dictService")
public class DictServiceImpl extends CommonServiceImpl<DictMapper, Dict> implements IDictService {

	@Override
	public List<Dict> selectDictList() {
		return baseMapper.selectDictList();
	}

}
