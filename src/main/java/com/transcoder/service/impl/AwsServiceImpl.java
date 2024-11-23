package com.transcoder.service.impl;

import com.transcoder.service.AwsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;

@Service
@Slf4j
public class AwsServiceImpl implements AwsService {

    private S3Client s3Client;


}
