package com.itianyi.modules.codegen.service;

import java.util.List;
import com.itianyi.core.common.service.ICommonService;
import com.itianyi.modules.codegen.entity.Column;
import com.itianyi.core.common.service.ICommonService;

public interface IColumnService extends ICommonService<Column> {
	List<Column> selectListByTableId(String tableId);
}
