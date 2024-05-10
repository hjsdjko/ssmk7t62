package com.dao;

import com.entity.WeixiubaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiubaogaoVO;
import com.entity.view.WeixiubaogaoView;


/**
 * 维修报告
 * 
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface WeixiubaogaoDao extends BaseMapper<WeixiubaogaoEntity> {
	
	List<WeixiubaogaoVO> selectListVO(@Param("ew") Wrapper<WeixiubaogaoEntity> wrapper);
	
	WeixiubaogaoVO selectVO(@Param("ew") Wrapper<WeixiubaogaoEntity> wrapper);
	
	List<WeixiubaogaoView> selectListView(@Param("ew") Wrapper<WeixiubaogaoEntity> wrapper);

	List<WeixiubaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiubaogaoEntity> wrapper);
	
	WeixiubaogaoView selectView(@Param("ew") Wrapper<WeixiubaogaoEntity> wrapper);
	
}
