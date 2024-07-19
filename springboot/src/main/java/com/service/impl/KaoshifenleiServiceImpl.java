package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KaoshifenleiDao;
import com.entity.KaoshifenleiEntity;
import com.service.KaoshifenleiService;
import com.entity.vo.KaoshifenleiVO;
import com.entity.view.KaoshifenleiView;

@Service("kaoshifenleiService")
public class KaoshifenleiServiceImpl extends ServiceImpl<KaoshifenleiDao, KaoshifenleiEntity> implements KaoshifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshifenleiEntity> page = this.selectPage(
                new Query<KaoshifenleiEntity>(params).getPage(),
                new EntityWrapper<KaoshifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshifenleiEntity> wrapper) {
		  Page<KaoshifenleiView> page =new Query<KaoshifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<KaoshifenleiVO> selectListVO(Wrapper<KaoshifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshifenleiVO selectVO(Wrapper<KaoshifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshifenleiView> selectListView(Wrapper<KaoshifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshifenleiView selectView(Wrapper<KaoshifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
