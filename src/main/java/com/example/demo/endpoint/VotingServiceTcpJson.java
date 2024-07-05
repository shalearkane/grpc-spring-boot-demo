package com.example.demo.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


class VoteRequest {
    private String url;
    private Integer vote;

    VoteRequest(String url, Integer vote) {
        this.url = url;
        this.vote = vote;
    }

    public String getUrl() {return this.url;}
    public Integer getVote() {return this.vote;}
    public void setUrl(String url) { this.url=url;}
    public void setVote(Integer vote) { this.vote = vote;}
}


@RestController()
@RequestMapping("/rest")
public class VotingServiceTcpJson {
    @PostMapping("")
    public static ResponseEntity<Boolean> Vote(@RequestBody VoteRequest body) {
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
