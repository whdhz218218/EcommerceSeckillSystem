package com.yitong.seckill_demo1.db.dao;

import com.yitong.seckill_demo1.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityDao {

    public List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    public void inertSeckillActivity(SeckillActivity seckillActivity);

    public SeckillActivity querySeckillActivityById(long activityId);

    public void updateSeckillActivity(SeckillActivity seckillActivity);

    public boolean lockStock(Long activityId);

    public boolean deductStock(Long seckillActivityId);

    void revertStock(Long seckillActivityId);
}
