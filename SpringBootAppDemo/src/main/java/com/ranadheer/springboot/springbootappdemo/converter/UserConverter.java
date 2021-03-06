package com.ranadheer.springboot.springbootappdemo.converter;

import com.ranadheer.springboot.springbootappdemo.dto.UserDTO;
import com.ranadheer.springboot.springbootappdemo.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserConverter {
    public UserDTO entityToDto(Optional<User> user)
    {
        UserDTO userDto =new UserDTO();
        userDto.setId(user.get().getId());
        userDto.setUserName(user.get().getUserName());
        userDto.setEmail(user.get().getEmail());
        userDto.setArticleList(user.get().getArticleList());
        userDto.setPhoneNo(user.get().getPhoneNo());
        userDto.setRoleList(user.get().getRoles());
        return userDto;
    }

    public UserDTO entityToDto(User user)
    {
        UserDTO userDto =new UserDTO();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setEmail(user.getEmail());
        userDto.setArticleList(user.getArticleList());
        userDto.setPhoneNo(user.getPhoneNo());
        userDto.setRoleList(user.getRoles());
        return userDto;
    }

    public User DTOtoEntity(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setUserName(userDTO.getUserName());
        user.setEmail(userDTO.getEmail());
        user.setArticleList(userDTO.getArticleList());
        user.setRoles(userDTO.getRoleList());
        user.setPhoneNo(userDTO.getPhoneNo());
        return user;
    }

    public List<UserDTO> entityToDto(List<User> users)
    {
        return users.stream().map(x->entityToDto(x)).collect(Collectors.toList());
    }

    public List<User> dtoToEntity(List<UserDTO> userDtos)
    {
        return userDtos.stream().map(x->DTOtoEntity(x)).collect(Collectors.toList());
    }
}
