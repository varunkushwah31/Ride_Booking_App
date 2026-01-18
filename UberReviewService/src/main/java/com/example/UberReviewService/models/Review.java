package com.example.UberReviewService.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Date;


@Entity
@Table(name = "bookingReview")
public class Review {

    @Id // this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity means auto_increment;
    Long id;

    @Column(nullable = false)
    String content;

    Double rating;

    @Column(nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)  this annotation tells spring about the format of Date object to be stored i.e. Date ? Timestamp
    @CreatedDate // this annotation tells spring that only handle it for object creation
    Date createdAt;

    @Column(nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp // this annotation tells spring that only handle it for object update
    Date updatedAt;
}
