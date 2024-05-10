package com.dao;

import com.entity.ShiyanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshiVO;
import com.entity.view.ShiyanshiView;


/**
 * 实验室
 * 
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface ShiyanshiDao extends BaseMapper<ShiyanshiEntity> {
	
	List<ShiyanshiVO> selectListVO(@Param("ew") Wrapper<ShiyanshiEntity> wrapper);
	
	ShiyanshiVO selectVO(@Param("ew") Wrapper<ShiyanshiEntity> wrapper);
	
	List<ShiyanshiView> selectListView(@Param("ew") Wrapper<ShiyanshiEntity> wrapper);

	List<ShiyanshiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshiEntity> wrapper);
	
	ShiyanshiView selectView(@Param("ew") Wrapper<ShiyanshiEntity> wrapper);
	
}
