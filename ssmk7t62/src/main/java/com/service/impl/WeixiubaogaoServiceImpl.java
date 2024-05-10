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


import com.dao.WeixiubaogaoDao;
import com.entity.WeixiubaogaoEntity;
import com.service.WeixiubaogaoService;
import com.entity.vo.WeixiubaogaoVO;
import com.entity.view.WeixiubaogaoView;

@Service("weixiubaogaoService")
public class WeixiubaogaoServiceImpl extends ServiceImpl<WeixiubaogaoDao, WeixiubaogaoEntity> implements WeixiubaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiubaogaoEntity> page = this.selectPage(
                new Query<WeixiubaogaoEntity>(params).getPage(),
                new EntityWrapper<WeixiubaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiubaogaoEntity> wrapper) {
		  Page<WeixiubaogaoView> page =new Query<WeixiubaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiubaogaoVO> selectListVO(Wrapper<WeixiubaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiubaogaoVO selectVO(Wrapper<WeixiubaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiubaogaoView> selectListView(Wrapper<WeixiubaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiubaogaoView selectView(Wrapper<WeixiubaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
