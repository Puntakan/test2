package group.int221project.services;

import group.int221project.entities.Announce;
import group.int221project.repositories.AnnounceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnounceService {
    @Autowired
    private AnnounceRepository announceRepository;

    public List<Announce> getAnnounce() {
        return announceRepository.findAll();
    }

    public Announce getAnnounceById(Integer announcementId){
        return announceRepository.findById(announcementId).orElseThrow(
                () -> new ResourceNotFoundException(announcementId + "do not exist")
        );
    }
}
