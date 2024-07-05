package com.example.demo.endpoint;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping(value = {""})
public class Cookie {
    @GetMapping(value = {""})
    public ResponseEntity<String> find() throws IOException {
        String response = new String("hello");
        MessageGRPC.SimpleYesNo message = MessageGRPC.SimpleYesNo.newBuilder().setYes(true).build();
        String s = message.toString();
        System.out.println(s);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROTOBUF);
        headers.setContentLength(response.length());
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    @PostMapping(value = {""})
    public ResponseEntity<String> findPost(@RequestBody String body) throws IOException {
        String response = new String("hello there " + body);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROTOBUF);
        headers.setContentLength(response.length());
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }
}
