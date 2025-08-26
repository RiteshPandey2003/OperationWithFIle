package com.fileupload.FileUploader.FileRepository;

import com.fileupload.FileUploader.model.entity.FileTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileTable, Long> {
}
