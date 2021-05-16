package com.yitong.seckill_demo1.db.dao;

import com.yitong.seckill_demo1.db.mappers.SeckillCommodityMapper;
import com.yitong.seckill_demo1.db.po.SeckillCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SeckillCommodityDaoImpl implements SeckillCommodityDao {

    @Resource
    private SeckillCommodityMapper seckillCommodityMapper;

    @Override
    public SeckillCommodity querySeckillCommodityById(long commodityId) {
        return seckillCommodityMapper.selectByPrimaryKey(commodityId);
    }
}
