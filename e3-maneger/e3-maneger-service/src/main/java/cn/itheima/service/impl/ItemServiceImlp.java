package cn.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itheima.mapper.TbItemMapper;
import cn.itheima.pojo.TbItem;
import cn.itheima.service.ItemService;


@Service
@Transactional
public class ItemServiceImlp implements ItemService {
	
	@Autowired
	private TbItemMapper mapper;
	
	@Override
	public TbItem getItemById(Long id) {
		TbItem item = mapper.selectByPrimaryKey(id);
		return item;
	}

}
