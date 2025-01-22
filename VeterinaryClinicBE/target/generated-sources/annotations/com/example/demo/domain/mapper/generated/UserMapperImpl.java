package com.example.demo.domain.mapper.generated;

import com.example.demo.domain.dto.UserDto;
import com.example.demo.domain.mapper.UserMapper;
import com.example.demo.domain.model.User;
import com.example.demo.domain.model.User.UserBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-12T20:33:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.3 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserBuilder<?, ?> user = User.builder();

        user.id( userDto.getId() );
        user.userName( userDto.getUserName() );
        user.password( userDto.getPassword() );
        user.firstName( userDto.getFirstName() );
        user.lastName( userDto.getLastName() );
        user.email( userDto.getEmail() );
        user.phone( userDto.getPhone() );
        user.userType( userDto.getUserType() );

        return user.build();
    }

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setUserName( user.getUserName() );
        userDto.setPassword( user.getPassword() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setEmail( user.getEmail() );
        userDto.setPhone( user.getPhone() );
        userDto.setUserType( user.getUserType() );

        return userDto;
    }

    @Override
    public List<UserDto> toDtos(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( users.size() );
        for ( User user : users ) {
            list.add( toDto( user ) );
        }

        return list;
    }
}
