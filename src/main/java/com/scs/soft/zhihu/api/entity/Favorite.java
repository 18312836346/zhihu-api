package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;
import springfox.documentation.service.ApiListing;

@Data
@Builder
public class Favorite {
    private String favouriteId;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Integer voteupCount;
    private Integer commentCount;

}
