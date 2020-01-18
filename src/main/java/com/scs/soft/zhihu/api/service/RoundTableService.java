package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author lenovo
 */
public interface RoundTableService {
    /**
     * 查询所有圆桌
     * @return
     */
    List<Map> selectAllRoundTable();

    /**
     * 查询最新圆桌
     * @return
     */

    List<RoundTable> selectRecentRoundTable();
}
