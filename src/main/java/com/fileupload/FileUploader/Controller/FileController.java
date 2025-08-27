package com.fileupload.FileUploader.Controller;

import com.fileupload.FileUploader.DTO.FileDto;
import com.fileupload.FileUploader.FileService.fileService;
import com.fileupload.FileUploader.model.entity.FileTable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files") // optional base path
public class FileController {

    private final fileService fileService;

    // Constructor injection
    public FileController(fileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/check")
    public String checking(){
        return "checking";
    }

//    @PostMapping("/upload")
//    public ResponseEntity<FileTable> uploadFile(@RequestParam("file") MultipartFile file,
//                                                @RequestParam("updateId") Long updateId) {
//        try {
//            FileDto fileDto = new FileDto(file, updateId);
//            FileTable savedFile = fileService.uploadFile(fileDto); // call instance method
//            return ResponseEntity.ok(savedFile);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(500).build();
//        }
//    }
}
