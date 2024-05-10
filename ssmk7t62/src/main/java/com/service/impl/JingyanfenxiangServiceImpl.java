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


import com.dao.JingyanfenxiangDao;
import com.entity.JingyanfenxiangEntity;
import com.service.JingyanfenxiangService;
import com.entity.vo.JingyanfenxiangVO;
import com.entity.view.JingyanfenxiangView;

@Service("jingyanfenxiangService")
public class JingyanfenxiangServiceImpl extends ServiceImpl<JingyanfenxiangDao, JingyanfenxiangEntity> implements JingyanfenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingyanfenxiangEntity> page = this.selectPage(
                new Query<JingyanfenxiangEntity>(params).getPage(),
                new EntityWrapper<JingyanfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingyanfenxiangEntity> wrapper) {
		  Page<JingyanfenxiangView> page =new Query<JingyanfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingyanfenxiangVO> selectListVO(Wrapper<JingyanfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingyanfenxiangVO selectVO(Wrapper<JingyanfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingyanfenxiangView> selectListView(Wrapper<JingyanfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingyanfenxiangView selectView(Wrapper<JingyanfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
