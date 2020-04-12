package com.csye.ToyApplication.toy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class ToyService {

    //



    @Autowired
    private ToyRepository toyRepository;


    public List<Toy> getAll() {
        //  get all toys and return them as List<Toy>
        return toyRepository.findAll();
    }

//    public List<Toy> getByName(String name) {
//        //  get a toy by name
//        return toyRepository.findAll().stream()
//                .filter(toy -> toy.getToy_Name().toLowerCase().contains(name.toLowerCase()) )
//                .collect(Collectors.toList());
//    }


    public Optional<Toy> getByID(Long id) {
        //  get a toy by ID if it exists
        return toyRepository.findById(id);
    }

    public Toy create(Toy newToy) {
        //  save the toy to DB and return the saved post
        return toyRepository.save(newToy);
    }

    public Toy update(Toy updatedToy) {
        //  update the toy if it exists in DB and return the updated post.
        return toyRepository.save(updatedToy);
    }

    public void deleteById(Long id) {
        //  delete the toy by id
        toyRepository.deleteById(id);
    }


    public List<Toy> getAllByUserId(Long id){

        return toyRepository.findAllByUserId(id);
    }

    public List<Toy> exploreAllToys(Long id){

        return toyRepository.find(id);
    }
}
