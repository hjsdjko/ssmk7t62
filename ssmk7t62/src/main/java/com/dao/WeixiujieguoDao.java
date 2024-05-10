package com.dao;

import com.entity.WeixiujieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiujieguoVO;
import com.entity.view.WeixiujieguoView;


/**
 * 维修结果
 * 
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface WeixiujieguoDao extends BaseMapper<WeixiujieguoEntity> {
	
	List<WeixiujieguoVO> selectListVO(@Param("ew") Wrapper<WeixiujieguoEntity> wrapper);
	
	WeixiujieguoVO selectVO(@Param("ew") Wrapper<WeixiujieguoEntity> wrapper);
	
	List<WeixiujieguoView> selectListView(@Param("ew") Wrapper<WeixiujieguoEntity> wrapper);

	List<WeixiujieguoView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiujieguoEntity> wrapper);
	
	WeixiujieguoView selectView(@Param("ew") Wrapper<WeixiujieguoEntity> wrapper);
	
}
