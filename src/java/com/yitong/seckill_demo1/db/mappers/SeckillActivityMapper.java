package com.yitong.seckill_demo1.db.mappers;

import com.yitong.seckill_demo1.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillActivity record);

    int insertSelective(SeckillActivity record);

    SeckillActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillActivity record);

    int updateByPrimaryKey(SeckillActivity record);

    List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    int lockStock(Long id);

    int deductStock(Long activityId);

    void revertStock(Long seckillActivityId);
}