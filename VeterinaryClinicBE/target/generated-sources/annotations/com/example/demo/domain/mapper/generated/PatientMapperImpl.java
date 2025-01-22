package com.example.demo.domain.mapper.generated;

import com.example.demo.domain.dto.MedicalRecordDto;
import com.example.demo.domain.dto.PatientDto;
import com.example.demo.domain.dto.PatientMedicalRecordDto;
import com.example.demo.domain.dto.UserDto;
import com.example.demo.domain.mapper.PatientMapper;
import com.example.demo.domain.model.MedicalRecord;
import com.example.demo.domain.model.Patient;
import com.example.demo.domain.model.Patient.PatientBuilder;
import com.example.demo.domain.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-12T20:33:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.3 (Amazon.com Inc.)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient toEntity(PatientDto patientDto) {
        if ( patientDto == null ) {
            return null;
        }

        PatientBuilder<?, ?> patient = Patient.builder();

        patient.id( patientDto.getId() );
        patient.name( patientDto.getName() );
        patient.microchip( patientDto.getMicrochip() );
        patient.species( patientDto.getSpecies() );
        patient.breed( patientDto.getBreed() );
        patient.birthDate( patientDto.getBirthDate() );
        patient.gender( patientDto.getGender() );
        patient.weight( patientDto.getWeight() );
        patient.isNeutered( patientDto.getIsNeutered() );

        return patient.build();
    }

    @Override
    public PatientDto toDto(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientDto patientDto = new PatientDto();

        patientDto.setId( patient.getId() );
        patientDto.setName( patient.getName() );
        patientDto.setMicrochip( patient.getMicrochip() );
        patientDto.setSpecies( patient.getSpecies() );
        patientDto.setBreed( patient.getBreed() );
        patientDto.setBirthDate( patient.getBirthDate() );
        patientDto.setGender( patient.getGender() );
        patientDto.setWeight( patient.getWeight() );
        patientDto.setIsNeutered( patient.getIsNeutered() );

        return patientDto;
    }

    @Override
    public List<PatientDto> toListViewDto(List<Patient> patientList) {
        if ( patientList == null ) {
            return null;
        }

        List<PatientDto> list = new ArrayList<PatientDto>( patientList.size() );
        for ( Patient patient : patientList ) {
            list.add( toDto( patient ) );
        }

        return list;
    }

    @Override
    public PatientMedicalRecordDto patientMedicalRecordDto(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientMedicalRecordDto patientMedicalRecordDto = new PatientMedicalRecordDto();

        patientMedicalRecordDto.setName( patient.getName() );
        patientMedicalRecordDto.setMicrochip( patient.getMicrochip() );
        patientMedicalRecordDto.setSpecies( patient.getSpecies() );
        patientMedicalRecordDto.setBreed( patient.getBreed() );
        patientMedicalRecordDto.setBirthDate( patient.getBirthDate() );
        patientMedicalRecordDto.setGender( patient.getGender() );
        patientMedicalRecordDto.setWeight( patient.getWeight() );
        patientMedicalRecordDto.setIsNeutered( patient.getIsNeutered() );
        patientMedicalRecordDto.setMedicalRecords( medicalRecordListToMedicalRecordDtoSet( patient.getMedicalRecords() ) );

        return patientMedicalRecordDto;
    }

    @Override
    public MedicalRecordDto toMedicalRecordDto(MedicalRecord medicalRecord) {
        if ( medicalRecord == null ) {
            return null;
        }

        MedicalRecordDto medicalRecordDto = new MedicalRecordDto();

        medicalRecordDto.setRecordDate( medicalRecord.getRecordDate() );
        medicalRecordDto.setVetNotes( medicalRecord.getVetNotes() );
        medicalRecordDto.setVetInCharge( userToUserDto( medicalRecord.getVetInCharge() ) );

        return medicalRecordDto;
    }

    protected Set<MedicalRecordDto> medicalRecordListToMedicalRecordDtoSet(List<MedicalRecord> list) {
        if ( list == null ) {
            return null;
        }

        Set<MedicalRecordDto> set = new HashSet<MedicalRecordDto>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( MedicalRecord medicalRecord : list ) {
            set.add( toMedicalRecordDto( medicalRecord ) );
        }

        return set;
    }

    protected UserDto userToUserDto(User user) {
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
}
