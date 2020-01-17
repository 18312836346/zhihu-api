package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Section;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class SectionMapperTest {
    @Resource
    private SectionMapper sectionMapper;

    @Test
    void getSectionsBySpecialId() {
        List<Section> sections = sectionMapper.getSectionsBySpecialId("19564641");
        sections.forEach(section -> System.out.println(section));
    }
}