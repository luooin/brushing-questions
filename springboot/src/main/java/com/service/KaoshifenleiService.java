package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshifenleiView;


/**
 * 考试分类
 *
 
 * @date 2024-03-15 09:34:28
 */
public interface KaoshifenleiService extends IService<KaoshifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshifenleiVO> selectListVO(Wrapper<KaoshifenleiEntity> wrapper);
   	
   	KaoshifenleiVO selectVO(@Param("ew") Wrapper<KaoshifenleiEntity> wrapper);
   	
   	List<KaoshifenleiView> selectListView(Wrapper<KaoshifenleiEntity> wrapper);
   	
   	KaoshifenleiView selectView(@Param("ew") Wrapper<KaoshifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshifenleiEntity> wrapper);

   	

}

