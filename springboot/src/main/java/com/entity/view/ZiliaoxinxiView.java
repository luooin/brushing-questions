package com.entity.view;

import com.entity.ZiliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 资料信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 
 * @date 2024-03-15 09:34:28
 */
@TableName("ziliaoxinxi")
public class ZiliaoxinxiView  extends ZiliaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZiliaoxinxiView(){
	}
 
 	public ZiliaoxinxiView(ZiliaoxinxiEntity ziliaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ziliaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
