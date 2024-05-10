package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingyanfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingyanfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingyanfenxiangView;


/**
 * 经验分享评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface DiscussjingyanfenxiangService extends IService<DiscussjingyanfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingyanfenxiangVO> selectListVO(Wrapper<DiscussjingyanfenxiangEntity> wrapper);
   	
   	DiscussjingyanfenxiangVO selectVO(@Param("ew") Wrapper<DiscussjingyanfenxiangEntity> wrapper);
   	
   	List<DiscussjingyanfenxiangView> selectListView(Wrapper<DiscussjingyanfenxiangEntity> wrapper);
   	
   	DiscussjingyanfenxiangView selectView(@Param("ew") Wrapper<DiscussjingyanfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingyanfenxiangEntity> wrapper);
   	
}

