package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjingyanfenxiangDao;
import com.entity.DiscussjingyanfenxiangEntity;
import com.service.DiscussjingyanfenxiangService;
import com.entity.vo.DiscussjingyanfenxiangVO;
import com.entity.view.DiscussjingyanfenxiangView;

@Service("discussjingyanfenxiangService")
public class DiscussjingyanfenxiangServiceImpl extends ServiceImpl<DiscussjingyanfenxiangDao, DiscussjingyanfenxiangEntity> implements DiscussjingyanfenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingyanfenxiangEntity> page = this.selectPage(
                new Query<DiscussjingyanfenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussjingyanfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingyanfenxiangEntity> wrapper) {
		  Page<DiscussjingyanfenxiangView> page =new Query<DiscussjingyanfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingyanfenxiangVO> selectListVO(Wrapper<DiscussjingyanfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingyanfenxiangVO selectVO(Wrapper<DiscussjingyanfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingyanfenxiangView> selectListView(Wrapper<DiscussjingyanfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingyanfenxiangView selectView(Wrapper<DiscussjingyanfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
