package com.itianyi.modules.sys.service.impl;

import com.itianyi.core.common.service.impl.CommonServiceImpl;
import com.itianyi.modules.sys.entity.DictGroup;
import com.itianyi.modules.sys.mapper.DictGroupMapper;
import com.itianyi.modules.sys.service.IDictGroupService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("dictGroupService")
public class DictGroupServiceImpl extends CommonServiceImpl<DictGroupMapper,DictGroup> implements IDictGroupService {
}
