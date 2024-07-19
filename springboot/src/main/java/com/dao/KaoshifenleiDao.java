package com.dao;

import com.entity.KaoshifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshifenleiVO;
import com.entity.view.KaoshifenleiView;


/**
 * 考试分类
 * 
 
 * @date 2024-03-15 09:34:28
 */
public interface KaoshifenleiDao extends BaseMapper<KaoshifenleiEntity> {
	
	List<KaoshifenleiVO> selectListVO(@Param("ew") Wrapper<KaoshifenleiEntity> wrapper);
	
	KaoshifenleiVO selectVO(@Param("ew") Wrapper<KaoshifenleiEntity> wrapper);
	
	List<KaoshifenleiView> selectListView(@Param("ew") Wrapper<KaoshifenleiEntity> wrapper);

	List<KaoshifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshifenleiEntity> wrapper);

	
	KaoshifenleiView selectView(@Param("ew") Wrapper<KaoshifenleiEntity> wrapper);
	

}
