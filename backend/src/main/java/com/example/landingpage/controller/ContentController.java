package com.example.landingpage.controller;

import com.example.landingpage.model.PageContent;
import com.example.landingpage.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/content")
@CrossOrigin(origins = "*")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping
    public PageContent getContent() {
        return contentService.getPageContent();
    }
}