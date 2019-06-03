package com.legou.controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.legou.pojo.TbItem;
import com.legou.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService ItemService;
	
	@RequestMapping("/item/{itemid}")
   @ResponseBody
	public TbItem getItemById(@PathVariable Long itemid) {
		
		return ItemService.getItemById(itemid);
		
	}

}
