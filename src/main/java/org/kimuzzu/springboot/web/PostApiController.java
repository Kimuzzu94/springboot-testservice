package org.kimuzzu.springboot.web;

import lombok.RequiredArgsConstructor;
import org.kimuzzu.springboot.service.posts.PostsService;
import org.kimuzzu.springboot.web.dto.PostsResponseDto;
import org.kimuzzu.springboot.web.dto.PostsSaveRequestDto;
import org.kimuzzu.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestsDto) {
        return postsService.update(id, requestsDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }



}
