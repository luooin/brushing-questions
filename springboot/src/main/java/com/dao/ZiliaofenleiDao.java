package com.dao;

import com.entity.ZiliaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiliaofenleiVO;
import com.entity.view.ZiliaofenleiView;


/**
 * 资料分类
 * 
 
 * @date 2024-03-15 09:34:28
 */
public interface ZiliaofenleiDao extends BaseMapper<ZiliaofenleiEntity> {
	
	List<ZiliaofenleiVO> selectListVO(@Param("ew") Wrapper<ZiliaofenleiEntity> wrapper);
	
	ZiliaofenleiVO selectVO(@Param("ew") Wrapper<ZiliaofenleiEntity> wrapper);
	
	List<ZiliaofenleiView> selectListView(@Param("ew") Wrapper<ZiliaofenleiEntity> wrapper);

	List<ZiliaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiliaofenleiEntity> wrapper);

	
	ZiliaofenleiView selectView(@Param("ew") Wrapper<ZiliaofenleiEntity> wrapper);
	

}
