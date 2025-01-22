package com.example.demo.domain.mapper.generated;

import com.example.demo.domain.dto.OwnerDto;
import com.example.demo.domain.dto.OwnerPatientDto;
import com.example.demo.domain.dto.PatientDto;
import com.example.demo.domain.mapper.OwnerMapper;
import com.example.demo.domain.model.Owner;
import com.example.demo.domain.model.Owner.OwnerBuilder;
import com.example.demo.domain.model.Patient;
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
public class OwnerMapperImpl implements OwnerMapper {

    @Override
    public OwnerDto toViewDto(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerDto ownerDto = new OwnerDto();

        if ( owner.getId() != null ) {
            ownerDto.setId( owner.getId().longValue() );
        }
        ownerDto.setFirstName( owner.getFirstName() );
        ownerDto.setLastName( owner.getLastName() );
        ownerDto.setEmail( owner.getEmail() );
        ownerDto.setPhone( owner.getPhone() );
        ownerDto.setAddress( owner.getAddress() );

        return ownerDto;
    }

    @Override
    public Owner toEntity(OwnerDto ownerDto) {
        if ( ownerDto == null ) {
            return null;
        }

        OwnerBuilder<?, ?> owner = Owner.builder();

        if ( ownerDto.getId() != null ) {
            owner.id( ownerDto.getId().intValue() );
        }
        owner.firstName( ownerDto.getFirstName() );
        owner.lastName( ownerDto.getLastName() );
        owner.email( ownerDto.getEmail() );
        owner.phone( ownerDto.getPhone() );
        owner.address( ownerDto.getAddress() );

        return owner.build();
    }

    @Override
    public List<OwnerPatientDto> toListViewOwnersPets(List<Owner> list) {
        if ( list == null ) {
            return null;
        }

        List<OwnerPatientDto> list1 = new ArrayList<OwnerPatientDto>( list.size() );
        for ( Owner owner : list ) {
            list1.add( ownerToOwnerPatientDto( owner ) );
        }

        return list1;
    }

    @Override
    public List<OwnerDto> toListViewDto(List<Owner> ownerList) {
        if ( ownerList == null ) {
            return null;
        }

        List<OwnerDto> list = new ArrayList<OwnerDto>( ownerList.size() );
        for ( Owner owner : ownerList ) {
            list.add( toViewDto( owner ) );
        }

        return list;
    }

    @Override
    public List<Owner> toListView(List<OwnerDto> ownerDtoList) {
        if ( ownerDtoList == null ) {
            return null;
        }

        List<Owner> list = new ArrayList<Owner>( ownerDtoList.size() );
        for ( OwnerDto ownerDto : ownerDtoList ) {
            list.add( toEntity( ownerDto ) );
        }

        return list;
    }

    protected PatientDto patientToPatientDto(Patient patient) {
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

    protected Set<PatientDto> patientListToPatientDtoSet(List<Patient> list) {
        if ( list == null ) {
            return null;
        }

        Set<PatientDto> set = new HashSet<PatientDto>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( Patient patient : list ) {
            set.add( patientToPatientDto( patient ) );
        }

        return set;
    }

    protected OwnerPatientDto ownerToOwnerPatientDto(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerPatientDto ownerPatientDto = new OwnerPatientDto();

        ownerPatientDto.setFirstName( owner.getFirstName() );
        ownerPatientDto.setLastName( owner.getLastName() );
        ownerPatientDto.setEmail( owner.getEmail() );
        ownerPatientDto.setPhone( owner.getPhone() );
        ownerPatientDto.setAddress( owner.getAddress() );
        ownerPatientDto.setPatients( patientListToPatientDtoSet( owner.getPatients() ) );

        return ownerPatientDto;
    }
}
