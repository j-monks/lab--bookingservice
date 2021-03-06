package com.codeclan.example.bookingservice.repositories;

import com.codeclan.example.bookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseName(String name);
    List<Customer> findByBookingsCourseNameAndBookingsCourseTown(String courseName, String townName);
    List<Customer> findByAgeGreaterThanAndBookingsCourseNameAndBookingsCourseTown(int age, String courseName, String townName);
}
