package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @author Happiness
 */

public interface FavoriteService {

    /**
     * 查看最新收藏
     *
     * @return
     */

    List<Favorite> selectFavorite();

    /**
     * 查看所有收藏
     *
     * @return
     */

    List<Map> selectAllFavorite();
}
