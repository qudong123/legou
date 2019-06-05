package com.legou.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.legou.mapper.TbItemMapper;
import com.legou.pojo.TbItem;
import com.legou.pojo.TbItemExample;

public class pageHelperTest {
	
	@Test
	public void testPageHelper() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		
		TbItemMapper tbItemMapper = applicationContext.getBean(TbItemMapper.class);
		
		//使用PageHelper的静态方法设置分页信息
		PageHelper.startPage(1, 30);
		TbItemExample example = new TbItemExample();
		List<TbItem> list= tbItemMapper.selectByExample(example);
		
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		
		System.out.println(pageInfo.getTotal());
		System.out.println(pageInfo.getPages());
		System.out.println(list.size());
		
		
		
		
	}

}
