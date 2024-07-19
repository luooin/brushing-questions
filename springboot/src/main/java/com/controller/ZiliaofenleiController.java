package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZiliaofenleiEntity;
import com.entity.view.ZiliaofenleiView;

import com.service.ZiliaofenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 资料分类
 * 后端接口
 
 * @date 2024-03-15 09:34:28
 */
@RestController
@RequestMapping("/ziliaofenlei")
public class ZiliaofenleiController {
    @Autowired
    private ZiliaofenleiService ziliaofenleiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZiliaofenleiEntity ziliaofenlei,
		HttpServletRequest request){
        EntityWrapper<ZiliaofenleiEntity> ew = new EntityWrapper<ZiliaofenleiEntity>();

		PageUtils page = ziliaofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziliaofenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZiliaofenleiEntity ziliaofenlei, 
		HttpServletRequest request){
        EntityWrapper<ZiliaofenleiEntity> ew = new EntityWrapper<ZiliaofenleiEntity>();

		PageUtils page = ziliaofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziliaofenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZiliaofenleiEntity ziliaofenlei){
       	EntityWrapper<ZiliaofenleiEntity> ew = new EntityWrapper<ZiliaofenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ziliaofenlei, "ziliaofenlei")); 
        return R.ok().put("data", ziliaofenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZiliaofenleiEntity ziliaofenlei){
        EntityWrapper< ZiliaofenleiEntity> ew = new EntityWrapper< ZiliaofenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ziliaofenlei, "ziliaofenlei")); 
		ZiliaofenleiView ziliaofenleiView =  ziliaofenleiService.selectView(ew);
		return R.ok("查询资料分类成功").put("data", ziliaofenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZiliaofenleiEntity ziliaofenlei = ziliaofenleiService.selectById(id);
        return R.ok().put("data", ziliaofenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZiliaofenleiEntity ziliaofenlei = ziliaofenleiService.selectById(id);
        return R.ok().put("data", ziliaofenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZiliaofenleiEntity ziliaofenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ziliaofenlei);
        ziliaofenleiService.insert(ziliaofenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZiliaofenleiEntity ziliaofenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ziliaofenlei);
        ziliaofenleiService.insert(ziliaofenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZiliaofenleiEntity ziliaofenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ziliaofenlei);
        ziliaofenleiService.updateById(ziliaofenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ziliaofenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
