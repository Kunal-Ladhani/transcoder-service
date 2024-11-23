package com.transcoder.domain;

import java.io.Serializable;
import java.time.Instant;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

public class AbstractAuditEntity implements Serializable {
  @CreatedBy
  private String createdBy;

  @CreatedDate
  private Instant createdAt;

  @LastModifiedBy
  private String lastModifiedBy;

  @LastModifiedDate
  private Instant lastModifiedDate;
}
