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

import com.entity.KaoshifenleiEntity;
import com.entity.view.KaoshifenleiView;

import com.service.KaoshifenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 考试分类
 * 后端接口
 
 * @date 2024-03-15 09:34:28
 */
@RestController
@RequestMapping("/kaoshifenlei")
public class KaoshifenleiController {
    @Autowired
    private KaoshifenleiService kaoshifenleiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoshifenleiEntity kaoshifenlei,
		HttpServletRequest request){
        EntityWrapper<KaoshifenleiEntity> ew = new EntityWrapper<KaoshifenleiEntity>();

		PageUtils page = kaoshifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshifenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoshifenleiEntity kaoshifenlei, 
		HttpServletRequest request){
        EntityWrapper<KaoshifenleiEntity> ew = new EntityWrapper<KaoshifenleiEntity>();

		PageUtils page = kaoshifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshifenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoshifenleiEntity kaoshifenlei){
       	EntityWrapper<KaoshifenleiEntity> ew = new EntityWrapper<KaoshifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoshifenlei, "kaoshifenlei")); 
        return R.ok().put("data", kaoshifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoshifenleiEntity kaoshifenlei){
        EntityWrapper< KaoshifenleiEntity> ew = new EntityWrapper< KaoshifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoshifenlei, "kaoshifenlei")); 
		KaoshifenleiView kaoshifenleiView =  kaoshifenleiService.selectView(ew);
		return R.ok("查询考试分类成功").put("data", kaoshifenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoshifenleiEntity kaoshifenlei = kaoshifenleiService.selectById(id);
        return R.ok().put("data", kaoshifenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoshifenleiEntity kaoshifenlei = kaoshifenleiService.selectById(id);
        return R.ok().put("data", kaoshifenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoshifenleiEntity kaoshifenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kaoshifenlei);
        kaoshifenleiService.insert(kaoshifenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoshifenleiEntity kaoshifenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kaoshifenlei);
        kaoshifenleiService.insert(kaoshifenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaoshifenleiEntity kaoshifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoshifenlei);
        kaoshifenleiService.updateById(kaoshifenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoshifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
