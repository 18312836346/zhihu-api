package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xxx
 */
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;
    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(roundTableService.selectAllRoundTable());
    }
    @GetMapping
    public Result getRecent(){
        return Result.success(roundTableService.selectRecentRoundTable());
    }
}
