package com.entity.view;

import com.entity.DiscussjingyanfenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 经验分享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
@TableName("discussjingyanfenxiang")
public class DiscussjingyanfenxiangView  extends DiscussjingyanfenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingyanfenxiangView(){
	}
 
 	public DiscussjingyanfenxiangView(DiscussjingyanfenxiangEntity discussjingyanfenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingyanfenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
