package com.transcoder.enums;

import lombok.Getter;

@Getter
public enum FileFormat {

  MP4("mp4"),
  AVI("avi"),
  MPEG("mpeg");

  private final String extension;

  FileFormat(String extension) {
    this.extension = extension;
  }

}
