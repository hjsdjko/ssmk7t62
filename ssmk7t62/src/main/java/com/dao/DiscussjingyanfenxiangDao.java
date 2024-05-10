package com.dao;

import com.entity.DiscussjingyanfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingyanfenxiangVO;
import com.entity.view.DiscussjingyanfenxiangView;


/**
 * 经验分享评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface DiscussjingyanfenxiangDao extends BaseMapper<DiscussjingyanfenxiangEntity> {
	
	List<DiscussjingyanfenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussjingyanfenxiangEntity> wrapper);
	
	DiscussjingyanfenxiangVO selectVO(@Param("ew") Wrapper<DiscussjingyanfenxiangEntity> wrapper);
	
	List<DiscussjingyanfenxiangView> selectListView(@Param("ew") Wrapper<DiscussjingyanfenxiangEntity> wrapper);

	List<DiscussjingyanfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingyanfenxiangEntity> wrapper);
	
	DiscussjingyanfenxiangView selectView(@Param("ew") Wrapper<DiscussjingyanfenxiangEntity> wrapper);
	
}
