package com.project.memzbook.domain.trip;

import com.project.memzbook.domain.trip.place.Place;
import com.project.memzbook.domain.user.User;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.time.OffsetDateTime;
import java.util.Set;

/**
 *  Database model of Trip table
 * */
@Builder
@Data
@Value
public class Trip {
    /* Identifier */
    Long tripId;
    /* Trip's creator */
    String creatorLogin;
    /* Trip's name */
    String name;
    /* Trip's description */
    String description;
    /* Creation date */
    OffsetDateTime createdAt;
    /* Trip's Start Date */
    OffsetDateTime startDate;
    /* Trip's End Date */
    OffsetDateTime endDate;

    /* Trip's places */
    @MappedCollection(keyColumn = "TRIP_ID", idColumn = "TRIP_ID")
    Set<Place> places;
    /* Trip's users */
    @MappedCollection(keyColumn = "TRIP_ID", idColumn = "TRIP_ID")
    Set<User> users;
}
