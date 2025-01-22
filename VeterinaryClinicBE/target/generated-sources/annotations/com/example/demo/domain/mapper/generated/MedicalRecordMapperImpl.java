package com.example.demo.domain.mapper.generated;

import com.example.demo.domain.dto.MedicalRecordDto;
import com.example.demo.domain.dto.UserDto;
import com.example.demo.domain.mapper.MedicalRecordMapper;
import com.example.demo.domain.model.MedicalRecord;
import com.example.demo.domain.model.MedicalRecord.MedicalRecordBuilder;
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
public class MedicalRecordMapperImpl implements MedicalRecordMapper {

    @Override
    public MedicalRecordDto toDto(MedicalRecord medicalRecord) {
        if ( medicalRecord == null ) {
            return null;
        }

        MedicalRecordDto medicalRecordDto = new MedicalRecordDto();

        medicalRecordDto.setVetInCharge( toUserDto( medicalRecord.getVetInCharge() ) );
        medicalRecordDto.setRecordDate( medicalRecord.getRecordDate() );
        medicalRecordDto.setVetNotes( medicalRecord.getVetNotes() );

        return medicalRecordDto;
    }

    @Override
    public MedicalRecord toEntity(MedicalRecordDto medicalRecordDto) {
        if ( medicalRecordDto == null ) {
            return null;
        }

        MedicalRecordBuilder<?, ?> medicalRecord = MedicalRecord.builder();

        medicalRecord.vetInCharge( toUserEntity( medicalRecordDto.getVetInCharge() ) );
        medicalRecord.recordDate( medicalRecordDto.getRecordDate() );
        medicalRecord.vetNotes( medicalRecordDto.getVetNotes() );

        return medicalRecord.build();
    }

    @Override
    public List<MedicalRecordDto> toDtoList(List<MedicalRecord> medicalRecords) {
        if ( medicalRecords == null ) {
            return null;
        }

        List<MedicalRecordDto> list = new ArrayList<MedicalRecordDto>( medicalRecords.size() );
        for ( MedicalRecord medicalRecord : medicalRecords ) {
            list.add( toDto( medicalRecord ) );
        }

        return list;
    }

    @Override
    public List<MedicalRecord> toEntityList(List<MedicalRecordDto> medicalRecordDtos) {
        if ( medicalRecordDtos == null ) {
            return null;
        }

        List<MedicalRecord> list = new ArrayList<MedicalRecord>( medicalRecordDtos.size() );
        for ( MedicalRecordDto medicalRecordDto : medicalRecordDtos ) {
            list.add( toEntity( medicalRecordDto ) );
        }

        return list;
    }

    @Override
    public UserDto toUserDto(User user) {
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
    public User toUserEntity(UserDto userDto) {
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
}
