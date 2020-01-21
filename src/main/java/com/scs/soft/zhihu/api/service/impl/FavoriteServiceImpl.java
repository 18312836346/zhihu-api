package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Happiness
 */

@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public List<Favorite> selectFavorite() {
        return favoriteMapper.selectFavorite();
    }

    @Override
    public List<Map> selectAllFavorite() {
        return favoriteMapper.selectAllFavorite();
    }
}
