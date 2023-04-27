package group.int221project.controllers;

import group.int221project.entities.Announce;
import group.int221project.services.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sj3/api")
public class AnnounceController {
    @Autowired
    private AnnounceService announceService;

    @GetMapping("/announcements")
    public List<Announce> getAnnounce(){
        return announceService.getAnnounce();
    }

    @GetMapping("/announcements/{announcementId}")
    public Announce getAnnounceById(@PathVariable Integer announcementId) {
        return announceService.getAnnounceById(announcementId);
    }
}
