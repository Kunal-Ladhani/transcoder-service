package com.transcoder.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FileFormatConstants {

    public static final String FILE_METADATA = "file_metadata";

    // UPLOAD FILE METADATA FIELDS
    public static final String UPLOAD_KEY = "upload_key";
    public static final String UPLOAD_BUCKET = "upload_bucket";
    public static final String UPLOAD_FILE_FORMAT = "uploaded_file_format";

    // DOWNLOAD FILE METADATA FIELDS
    public static final String DOWNLOAD_KEY = "download_key";
    public static final String DOWNLOAD_BUCKET = "download_bucket";
    public static final String DOWNLOAD_FILE_FORMAT = "downloaded_file_format";

}
