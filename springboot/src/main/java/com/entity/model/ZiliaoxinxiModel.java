package com.entity.model;

import com.entity.ZiliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资料信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 
 * @date 2024-03-15 09:34:28
 */
public class ZiliaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资料分类
	 */
	
	private String ziliaofenlei;
		
	/**
	 * 资料封面
	 */
	
	private String ziliaofengmian;
		
	/**
	 * 讲师
	 */
	
	private String jiangshi;
		
	/**
	 * 重点难点
	 */
	
	private String zhongdiannandian;
		
	/**
	 * 资料简介
	 */
	
	private String ziliaojianjie;
		
	/**
	 * 资料详情
	 */
	
	private String ziliaoxiangqing;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：资料分类
	 */
	 
	public void setZiliaofenlei(String ziliaofenlei) {
		this.ziliaofenlei = ziliaofenlei;
	}
	
	/**
	 * 获取：资料分类
	 */
	public String getZiliaofenlei() {
		return ziliaofenlei;
	}
				
	
	/**
	 * 设置：资料封面
	 */
	 
	public void setZiliaofengmian(String ziliaofengmian) {
		this.ziliaofengmian = ziliaofengmian;
	}
	
	/**
	 * 获取：资料封面
	 */
	public String getZiliaofengmian() {
		return ziliaofengmian;
	}
				
	
	/**
	 * 设置：讲师
	 */
	 
	public void setJiangshi(String jiangshi) {
		this.jiangshi = jiangshi;
	}
	
	/**
	 * 获取：讲师
	 */
	public String getJiangshi() {
		return jiangshi;
	}
				
	
	/**
	 * 设置：重点难点
	 */
	 
	public void setZhongdiannandian(String zhongdiannandian) {
		this.zhongdiannandian = zhongdiannandian;
	}
	
	/**
	 * 获取：重点难点
	 */
	public String getZhongdiannandian() {
		return zhongdiannandian;
	}
				
	
	/**
	 * 设置：资料简介
	 */
	 
	public void setZiliaojianjie(String ziliaojianjie) {
		this.ziliaojianjie = ziliaojianjie;
	}
	
	/**
	 * 获取：资料简介
	 */
	public String getZiliaojianjie() {
		return ziliaojianjie;
	}
				
	
	/**
	 * 设置：资料详情
	 */
	 
	public void setZiliaoxiangqing(String ziliaoxiangqing) {
		this.ziliaoxiangqing = ziliaoxiangqing;
	}
	
	/**
	 * 获取：资料详情
	 */
	public String getZiliaoxiangqing() {
		return ziliaoxiangqing;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
