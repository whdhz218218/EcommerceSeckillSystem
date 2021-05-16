package com.yitong.seckill_demo1.db.dao;

import com.yitong.seckill_demo1.db.mappers.SeckillActivityMapper;
import com.yitong.seckill_demo1.db.po.SeckillActivity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Repository
public class SeckillActivityDaoImpl implements SeckillActivityDao {

    @Resource
    private SeckillActivityMapper seckillActivityMapper;

    @Override
    public List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus) {
        return seckillActivityMapper.querySeckillActivitysByStatus(activityStatus);
    }

    @Override
    public void inertSeckillActivity(SeckillActivity seckillActivity) {
        seckillActivityMapper.insert(seckillActivity);
    }

    @Override
    public SeckillActivity querySeckillActivityById(long activityId) {
        return seckillActivityMapper.selectByPrimaryKey(activityId);
    }

    @Override
    public void updateSeckillActivity(SeckillActivity seckillActivity) {
        seckillActivityMapper.updateByPrimaryKey(seckillActivity);
    }

    @Override
    public boolean lockStock(Long seckillActivityId) {
        int result = seckillActivityMapper.lockStock(seckillActivityId);
        if (result < 1) {
            log.error("锁定库存失败");
            return false;
        }
        return true;
    }

    @Override
    public boolean deductStock(Long activityId) {
        int result = seckillActivityMapper.deductStock(activityId);
        if (result < 1) {
            log.error("扣减库存失败");
            return false;
        }
        return true;
    }

    @Override
    public void revertStock(Long seckillActivityId) {
        seckillActivityMapper.revertStock(seckillActivityId);
    }

}
