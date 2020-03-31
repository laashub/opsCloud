package com.baiyi.opscloud.service.jumpserver.impl;

import com.baiyi.opscloud.domain.generator.jumpserver.AssetsSystemuserAssets;
import com.baiyi.opscloud.mapper.jumpserver.AssetsSystemuserAssetsMapper;
import com.baiyi.opscloud.service.jumpserver.AssetsSystemuserAssetsService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @Author baiyi
 * @Date 2020/3/9 5:29 下午
 * @Version 1.0
 */
@Service
public class AssetsSystemuserAssetsServiceImpl implements AssetsSystemuserAssetsService {

    @Resource
    private AssetsSystemuserAssetsMapper assetsSystemuserAssetsMapper;

    @Override
    public AssetsSystemuserAssets queryAssetsSystemuserAssetsByUniqueKey(AssetsSystemuserAssets assetsSystemuserAssets) {
        Example example = new Example(AssetsSystemuserAssets.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("assetId", assetsSystemuserAssets.getAssetId());
        criteria.andEqualTo("systemuserId", assetsSystemuserAssets.getSystemuserId());
        return assetsSystemuserAssetsMapper.selectOneByExample(example);
    }

    @Override
    public void addAssetsSystemuserAssets(AssetsSystemuserAssets assetsSystemuserAssets){
        assetsSystemuserAssetsMapper.insert(assetsSystemuserAssets);
    }

}
