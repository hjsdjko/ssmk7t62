package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiujieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiujieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiujieguoView;


/**
 * 维修结果
 *
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public interface WeixiujieguoService extends IService<WeixiujieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiujieguoVO> selectListVO(Wrapper<WeixiujieguoEntity> wrapper);
   	
   	WeixiujieguoVO selectVO(@Param("ew") Wrapper<WeixiujieguoEntity> wrapper);
   	
   	List<WeixiujieguoView> selectListView(Wrapper<WeixiujieguoEntity> wrapper);
   	
   	WeixiujieguoView selectView(@Param("ew") Wrapper<WeixiujieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiujieguoEntity> wrapper);
   	
}

