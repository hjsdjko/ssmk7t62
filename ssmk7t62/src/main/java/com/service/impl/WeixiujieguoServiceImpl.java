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


import com.dao.WeixiujieguoDao;
import com.entity.WeixiujieguoEntity;
import com.service.WeixiujieguoService;
import com.entity.vo.WeixiujieguoVO;
import com.entity.view.WeixiujieguoView;

@Service("weixiujieguoService")
public class WeixiujieguoServiceImpl extends ServiceImpl<WeixiujieguoDao, WeixiujieguoEntity> implements WeixiujieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiujieguoEntity> page = this.selectPage(
                new Query<WeixiujieguoEntity>(params).getPage(),
                new EntityWrapper<WeixiujieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiujieguoEntity> wrapper) {
		  Page<WeixiujieguoView> page =new Query<WeixiujieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiujieguoVO> selectListVO(Wrapper<WeixiujieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiujieguoVO selectVO(Wrapper<WeixiujieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiujieguoView> selectListView(Wrapper<WeixiujieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiujieguoView selectView(Wrapper<WeixiujieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
