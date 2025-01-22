package com.example.demo.domain.mapper.generated;

import com.example.demo.domain.dto.AppointmentDto;
import com.example.demo.domain.mapper.AppointmentMapper;
import com.example.demo.domain.model.Appointment;
import com.example.demo.domain.model.Appointment.AppointmentBuilder;
import com.example.demo.domain.model.Patient;
import com.example.demo.domain.model.Patient.PatientBuilder;
import com.example.demo.domain.model.User;
import com.example.demo.domain.model.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-12T20:33:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.3 (Amazon.com Inc.)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Override
    public Appointment toEntity(AppointmentDto appointmentDto) {
        if ( appointmentDto == null ) {
            return null;
        }

        AppointmentBuilder<?, ?> appointment = Appointment.builder();

        appointment.patient( appointmentDtoToPatient( appointmentDto ) );
        appointment.vet( appointmentDtoToUser( appointmentDto ) );
        appointment.id( appointmentDto.getId() );
        appointment.date( appointmentDto.getDate() );
        appointment.reason( appointmentDto.getReason() );

        return appointment.build();
    }

    @Override
    public AppointmentDto toDto(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentDto appointmentDto = new AppointmentDto();

        appointmentDto.setPatientId( appointmentPatientId( appointment ) );
        appointmentDto.setVetId( appointmentVetId( appointment ) );
        appointmentDto.setId( appointment.getId() );
        appointmentDto.setDate( appointment.getDate() );
        appointmentDto.setReason( appointment.getReason() );

        return appointmentDto;
    }

    protected Patient appointmentDtoToPatient(AppointmentDto appointmentDto) {
        if ( appointmentDto == null ) {
            return null;
        }

        PatientBuilder<?, ?> patient = Patient.builder();

        patient.id( appointmentDto.getPatientId() );

        return patient.build();
    }

    protected User appointmentDtoToUser(AppointmentDto appointmentDto) {
        if ( appointmentDto == null ) {
            return null;
        }

        UserBuilder<?, ?> user = User.builder();

        user.id( appointmentDto.getVetId() );

        return user.build();
    }

    private Long appointmentPatientId(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        Patient patient = appointment.getPatient();
        if ( patient == null ) {
            return null;
        }
        Long id = patient.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long appointmentVetId(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        User vet = appointment.getVet();
        if ( vet == null ) {
            return null;
        }
        Long id = vet.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
