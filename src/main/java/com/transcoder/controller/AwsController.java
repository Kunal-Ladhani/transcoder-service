package com.transcoder.controller;

import com.transcoder.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1/aws")
public class AwsController {

    @Autowired
    private AwsService awsService;

    @PostMapping("/upload")
    public ResponseEntity<String> upload() {
        return ResponseEntity.ok("uploaded");
    }

    @PostMapping("/download")
    public ResponseEntity<String> download() {
        return ResponseEntity.ok("downloaded");
    }

}
