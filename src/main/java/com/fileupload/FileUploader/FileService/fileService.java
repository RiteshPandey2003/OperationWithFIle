package com.fileupload.FileUploader.FileService;

import com.fileupload.FileUploader.DTO.FileDto;
import com.fileupload.FileUploader.FileRepository.FileRepository;
import com.fileupload.FileUploader.model.entity.FileTable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class fileService {

    private final FileRepository fileRepository;

    // Constructor injection (preferred)
    public fileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public FileTable uploadFile(FileDto fileDto) throws IOException {
        MultipartFile file = fileDto.getFile();
        String uploadDir = "C:/Users/rites/uploads/"; // folder relative to project or working dir

        File uploadPath = new File(uploadDir);
        if (!uploadPath.exists()) uploadPath.mkdirs();

        String filePath = uploadDir + file.getOriginalFilename();
        file.transferTo(new File(filePath)); // save file

        FileTable fileTable = new FileTable();
        fileTable.setFilepath(filePath);
        fileTable.setUpdateId(fileDto.getUpdateId());

        return fileRepository.save(fileTable);
    }

}
