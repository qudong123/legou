package com.legou.service;

import com.legou.common.pojo.EasyUIDataGridResult;
import com.legou.common.utils.LegouResult;
import com.legou.pojo.TbItem;

public interface ItemService {
	
	TbItem getItemById(Long id);
	
	EasyUIDataGridResult getItemList(int page,int rows);
	LegouResult addItem(TbItem item, String desc);

}
