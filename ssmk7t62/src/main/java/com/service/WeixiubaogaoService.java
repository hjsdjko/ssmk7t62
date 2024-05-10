package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiubaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiubaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiubaogaoView;


/**
 * 维修报告
 *
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface WeixiubaogaoService extends IService<WeixiubaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiubaogaoVO> selectListVO(Wrapper<WeixiubaogaoEntity> wrapper);
   	
   	WeixiubaogaoVO selectVO(@Param("ew") Wrapper<WeixiubaogaoEntity> wrapper);
   	
   	List<WeixiubaogaoView> selectListView(Wrapper<WeixiubaogaoEntity> wrapper);
   	
   	WeixiubaogaoView selectView(@Param("ew") Wrapper<WeixiubaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiubaogaoEntity> wrapper);
   	
}

