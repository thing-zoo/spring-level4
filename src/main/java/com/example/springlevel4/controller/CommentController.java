package com.example.springlevel4.controller;

import com.example.springlevel4.dto.CommentRequestDto;
import com.example.springlevel4.dto.CommentResponseDto;
import com.example.springlevel4.dto.ErrorResponseDto;
import com.example.springlevel4.jwt.JwtUtil;
import com.example.springlevel4.security.UserDetailsImpl;
import com.example.springlevel4.service.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts/{postId}")
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comments")
    public ResponseEntity<CommentResponseDto> createComment(@AuthenticationPrincipal UserDetailsImpl userDetails,
                                                            @PathVariable Long postId,
                                                            @RequestBody @Valid CommentRequestDto requestDto) {
        return commentService.createComment(userDetails, postId, requestDto);
    }

    @PutMapping("/comments/{id}")
    public ResponseEntity<CommentResponseDto> updateComment(@AuthenticationPrincipal UserDetailsImpl userDetails,
                                                            @PathVariable Long postId,
                                                            @PathVariable Long id,
                                                            @RequestBody @Valid CommentRequestDto requestDto) {
        return commentService.updateComment(userDetails, postId, id, requestDto);
    }

    @DeleteMapping("/comments/{id}")
    public ResponseEntity<ErrorResponseDto> deleteComment(@AuthenticationPrincipal UserDetailsImpl userDetails,
                                                          @PathVariable Long postId,
                                                          @PathVariable Long id) {
        return commentService.deleteComment(userDetails, postId, id);
    }

}
