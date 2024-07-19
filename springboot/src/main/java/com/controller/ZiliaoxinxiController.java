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

import com.entity.ZiliaoxinxiEntity;
import com.entity.view.ZiliaoxinxiView;

import com.service.ZiliaoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 资料信息
 * 后端接口
 
 * @date 2024-03-15 09:34:28
 */
@RestController
@RequestMapping("/ziliaoxinxi")
public class ZiliaoxinxiController {
    @Autowired
    private ZiliaoxinxiService ziliaoxinxiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZiliaoxinxiEntity ziliaoxinxi,
		HttpServletRequest request){
        EntityWrapper<ZiliaoxinxiEntity> ew = new EntityWrapper<ZiliaoxinxiEntity>();

		PageUtils page = ziliaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziliaoxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZiliaoxinxiEntity ziliaoxinxi, 
		HttpServletRequest request){
        EntityWrapper<ZiliaoxinxiEntity> ew = new EntityWrapper<ZiliaoxinxiEntity>();

		PageUtils page = ziliaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziliaoxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZiliaoxinxiEntity ziliaoxinxi){
       	EntityWrapper<ZiliaoxinxiEntity> ew = new EntityWrapper<ZiliaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ziliaoxinxi, "ziliaoxinxi")); 
        return R.ok().put("data", ziliaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZiliaoxinxiEntity ziliaoxinxi){
        EntityWrapper< ZiliaoxinxiEntity> ew = new EntityWrapper< ZiliaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ziliaoxinxi, "ziliaoxinxi")); 
		ZiliaoxinxiView ziliaoxinxiView =  ziliaoxinxiService.selectView(ew);
		return R.ok("查询资料信息成功").put("data", ziliaoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZiliaoxinxiEntity ziliaoxinxi = ziliaoxinxiService.selectById(id);
        return R.ok().put("data", ziliaoxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZiliaoxinxiEntity ziliaoxinxi = ziliaoxinxiService.selectById(id);
        return R.ok().put("data", ziliaoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZiliaoxinxiEntity ziliaoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ziliaoxinxi);
        ziliaoxinxiService.insert(ziliaoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZiliaoxinxiEntity ziliaoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ziliaoxinxi);
        ziliaoxinxiService.insert(ziliaoxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZiliaoxinxiEntity ziliaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ziliaoxinxi);
        ziliaoxinxiService.updateById(ziliaoxinxi);//全部更新
        return R.ok();
    }
    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ziliaoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
