package com.nploi.tipjs_course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nploi.tipjs_course.dto.request.FeedRequestDto;
import com.nploi.tipjs_course.entity.FeedEntity;
import com.nploi.tipjs_course.entity.user.UserEntity;
import com.nploi.tipjs_course.repository.FeedRepository;
import com.nploi.tipjs_course.repository.UserRepository;

@RestController
@RequestMapping("/api/feeds")
public class FeedResource {

    @Autowired
    private FeedRepository feedRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<FeedEntity> getFeeds() {
        // This method would typically return a list of feeds.
        // For now, we return a simple message.
        return feedRepository.findAll();
    }

    @PostMapping
    public String createFeed(@RequestBody FeedEntity feed) {
        // UserEntity user = userRepository.findById(feed.getUserId())
        // .orElseThrow(() -> new RuntimeException("User not found"));
        // FeedEntity feedEntity = new FeedEntity();
        // feedEntity.setTitle(feed.getTitle());
        // user.getFeeds().add(feedEntity);
        // feedEntity.setUser(user);
        // userRepository.save(user);
        feedRepository.save(feed);
        // This method would typically handle feed creation.
        // For now, we return the created feed.
        return "OK";
    }
}
