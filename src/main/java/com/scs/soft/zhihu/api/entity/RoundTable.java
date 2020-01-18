package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoundTable {
   private String roundTableId;
   private String name;
   private String banner;
   private String urlToken;
   private Integer visitsCount;
   private Integer includeCount;



}
