package com.codewithterry.store.mappers;

import com.codewithterry.store.dtos.RegisterUserRequest;
import com.codewithterry.store.dtos.UpdateUserRequest;
import com.codewithterry.store.dtos.UserDto;
import com.codewithterry.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest registerUserRequest);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
