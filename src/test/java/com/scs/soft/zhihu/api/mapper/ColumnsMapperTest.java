package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Columns;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnsMapperTest {

    @Resource
    private  ColumnsMapper columnsMapper;

    @Test
    void testSelectRecentColumns(){

        List<Columns> columns = columnsMapper.selectColumns();
        columns.forEach(System.out::println);
    }

    @Test
    void testSelectRecentAllColumns(){
        List<Map> columns = columnsMapper.selectAllColumns();
        columns.forEach(System.out::println);
    }

}