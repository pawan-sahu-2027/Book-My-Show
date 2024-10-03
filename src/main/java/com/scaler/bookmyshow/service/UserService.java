package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.dto.Userdto;
import com.scaler.bookmyshow.exception.UserAlreadyExistException;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User singInService (Userdto user) throws UserAlreadyExistException {
          Optional <User> userOptional = userRepository.findById(user.getId());
          if (userOptional.isPresent()){
            throw new UserAlreadyExistException(" All ready exist no need to create new id ");
        }
          User currentUser = new User ();

               currentUser.setId(user.getId());
               currentUser.setEmail(user.getEmail());
               currentUser.setPassword(user.getPassword());
               currentUser.setPhonenumber(user.getPhonenumber());
               userRepository.save(currentUser);


           return currentUser;
    }

}
