package com.ego.dubbo.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;

public interface TbItemDubboService {
	/**
	 * 商品分页查询
	 * @param page
	 * @param rows
	 * @return
	 */
	EasyUIDataGrid show(int page,int rows);
	/**
	 * 根据id修改状态
	 * @param id
	 * @param status
	 * @return
	 */
	int updItemStatus(TbItem tbItem);
	/**
	 * 商品新增
	 * @param tbItem
	 * @return
	 */
	int insTbItem(TbItem tbItem);
	
	/**
	 * 新增包含商品表和商品描述表
	 * @param tbItem
	 * @param desc
	 * @return
	 */
	int insTbItemDesc(TbItem tbItem,TbItemDesc desc)  throws Exception;
}
