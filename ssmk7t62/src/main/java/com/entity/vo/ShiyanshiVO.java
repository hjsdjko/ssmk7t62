package com.entity.vo;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 实验室
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
public class ShiyanshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 实验室名称
	 */
	
	private String shiyanshimingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 实验室详情
	 */
	
	private String shiyanshixiangqing;
		
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 使用状态
	 */
	
	private String shiyongzhuangtai;
				
	
	/**
	 * 设置：实验室名称
	 */
	 
	public void setShiyanshimingcheng(String shiyanshimingcheng) {
		this.shiyanshimingcheng = shiyanshimingcheng;
	}
	
	/**
	 * 获取：实验室名称
	 */
	public String getShiyanshimingcheng() {
		return shiyanshimingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：实验室详情
	 */
	 
	public void setShiyanshixiangqing(String shiyanshixiangqing) {
		this.shiyanshixiangqing = shiyanshixiangqing;
	}
	
	/**
	 * 获取：实验室详情
	 */
	public String getShiyanshixiangqing() {
		return shiyanshixiangqing;
	}
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：使用状态
	 */
	 
	public void setShiyongzhuangtai(String shiyongzhuangtai) {
		this.shiyongzhuangtai = shiyongzhuangtai;
	}
	
	/**
	 * 获取：使用状态
	 */
	public String getShiyongzhuangtai() {
		return shiyongzhuangtai;
	}
			
}
