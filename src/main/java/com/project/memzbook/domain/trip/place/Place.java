package com.project.memzbook.domain.trip.place;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.time.OffsetDateTime;

/**
 *  Database model of Place table
 * */
@Builder
@Data
@Value
public class Place {

    /* Identifier */
    Long placeId;
    /* Place's creator login */
    String creatorLogin;
    /* Place's name*/
    String name;
    /* Place's country */
    String country;
    /* Place's city */
    String city;
    /* Place's street */
    String street;
    /* Place's building number */
    String buildingNumber;

}
