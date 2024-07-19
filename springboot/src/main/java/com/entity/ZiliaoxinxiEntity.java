package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 资料信息
 * 数据库通用操作实体类（普通增删改查）
 
 * @date 2024-03-15 09:34:28
 */
@TableName("ziliaoxinxi")
public class ZiliaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZiliaoxinxiEntity() {
		
	}
	
	public ZiliaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 资料名称
	 */
					
	private String ziliaomingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资料名称
	 */
	public void setZiliaomingcheng(String ziliaomingcheng) {
		this.ziliaomingcheng = ziliaomingcheng;
	}
	/**
	 * 获取：资料名称
	 */
	public String getZiliaomingcheng() {
		return ziliaomingcheng;
	}
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
