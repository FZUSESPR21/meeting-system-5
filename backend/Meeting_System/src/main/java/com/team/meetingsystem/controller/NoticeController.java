package com.team.meetingsystem.controller;

import com.team.meetingsystem.model.Notice;
import com.team.meetingsystem.model.ResponseMessage;
import com.team.meetingsystem.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/forum")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @PostMapping("/setnotice")
    public ResponseMessage get(HttpServletRequest request, @RequestBody Notice notice) {
        Date publishtime = notice.getPublishTime();
        String content = notice.getContent();
        Integer forumId = notice.getForumId();
        HttpSession session = request.getSession();
        Object object = session.getAttribute("userName");
        if (null == object) {
            return new ResponseMessage(201, "授权已过期", object);//用户授权已经过期，设置为201
        } else {
            if (Integer.parseInt(session.getAttribute("status").toString()) == 2||Integer.parseInt(session.getAttribute("status").toString()) <0) {
                noticeService.insert(publishtime, content,forumId);
                all(forumId);
                return ResponseMessage.success("发布成功");
            }
            return new ResponseMessage(202, "用户没有权限", object);
        }
    }
    @GetMapping("/notice")
    public ResponseMessage all(Integer forumId){
        return ResponseMessage.success(noticeService.selectAll(forumId));
    }
}