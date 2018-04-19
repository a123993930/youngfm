package com.itianyi.modules.codegen.service.impl;

import java.util.List;

import com.itianyi.core.common.service.impl.CommonServiceImpl;
import com.itianyi.core.query.wrapper.EntityWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itianyi.core.common.service.impl.CommonServiceImpl;
import com.itianyi.core.query.wrapper.EntityWrapper;
import com.itianyi.modules.codegen.entity.Column;
import com.itianyi.modules.codegen.mapper.ColumnMapper;
import com.itianyi.modules.codegen.service.IColumnService;

@Transactional
@Service("columnService")
public class ColumnServiceImpl extends CommonServiceImpl<ColumnMapper, Column> implements IColumnService {

	@Override
	public List<Column> selectListByTableId(String tableId) {
		EntityWrapper<Column> columnWrapper = new EntityWrapper<Column>(Column.class);
		columnWrapper.eq("table.id", tableId);
		columnWrapper.orderBy("sort");
		List<Column> oldColumnList = selectList(columnWrapper);
		return oldColumnList;
	}

}
