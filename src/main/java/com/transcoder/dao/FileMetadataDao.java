package com.transcoder.dao;

import com.transcoder.domain.FileMetadata;
import com.transcoder.repository.FileMetadataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FileMetadataDao {

    @Autowired
    private FileMetadataRepository fileMetadataRepository;

    public FileMetadata findById(String id) {
        var fileMetadataOptional = fileMetadataRepository.findById(id);
        if (fileMetadataOptional.isEmpty()) {
//            log.info("hello");
            return null;
        }
        return fileMetadataOptional.get();
    }
}
