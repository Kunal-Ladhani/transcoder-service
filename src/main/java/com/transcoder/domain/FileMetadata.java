package com.transcoder.domain;

import com.transcoder.constants.FileFormatConstants;
import com.transcoder.enums.FileFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document(FileFormatConstants.FILE_METADATA)
public class FileMetadata extends AbstractAuditEntity {
  @Id
  private String id;

  private String name;

  // UPLOAD FILE METADATA FIELDS

  @Field(FileFormatConstants.UPLOAD_KEY)
  private String uploadKey;

  @Field(FileFormatConstants.UPLOAD_BUCKET)
  private String uploadBucket;

  @Field(FileFormatConstants.UPLOAD_FILE_FORMAT)
  private FileFormat uploadedFileFormat;

  // DOWNLOAD FILE METADATA FIELDS

  @Field(FileFormatConstants.DOWNLOAD_KEY)
  private String downloadKey;

  @Field(FileFormatConstants.DOWNLOAD_BUCKET)
  private String downloadBucket;

  @Field(FileFormatConstants.DOWNLOAD_FILE_FORMAT)
  private FileFormat downloadedFileFormat;
}
