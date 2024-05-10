package com.dao;

import com.entity.JingyanfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingyanfenxiangVO;
import com.entity.view.JingyanfenxiangView;


/**
 * 经验分享
 * 
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface JingyanfenxiangDao extends BaseMapper<JingyanfenxiangEntity> {
	
	List<JingyanfenxiangVO> selectListVO(@Param("ew") Wrapper<JingyanfenxiangEntity> wrapper);
	
	JingyanfenxiangVO selectVO(@Param("ew") Wrapper<JingyanfenxiangEntity> wrapper);
	
	List<JingyanfenxiangView> selectListView(@Param("ew") Wrapper<JingyanfenxiangEntity> wrapper);

	List<JingyanfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<JingyanfenxiangEntity> wrapper);
	
	JingyanfenxiangView selectView(@Param("ew") Wrapper<JingyanfenxiangEntity> wrapper);
	
}
