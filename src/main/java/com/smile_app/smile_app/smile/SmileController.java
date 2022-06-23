package com.smile_app.smile_app.smile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class SmileController {

    @Autowired
    private SmileRepository smileRepository;

    @GetMapping("api/smiles")
    public Iterable<Smile> getAllSmiles() {
        return smileRepository.findAll();
    }

    @GetMapping("api/smiles/{id}")
    public Smile getSmile(@PathVariable Long id) {
        return smileRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "No Smile exists with id " + id));
    }

    @PostMapping("api/smiles")
    public Smile createSmile(@RequestBody Smile smile) {
        smileRepository.save(smile);
        return smile;
    }

}
