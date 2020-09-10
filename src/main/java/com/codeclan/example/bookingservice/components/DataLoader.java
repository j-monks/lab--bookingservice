package com.codeclan.example.bookingservice.components;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Course;
import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.repositories.BookingRepository;
import com.codeclan.example.bookingservice.repositories.CourseRepository;
import com.codeclan.example.bookingservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Course course1 = new Course("Intro To Python", "Dundee",5);
        courseRepository.save(course1);

        Customer customer1 = new Customer("James", "Dundee", 26);
        customerRepository.save(customer1);

        Booking booking1 = new Booking("21-05-20", course1, customer1);
        bookingRepository.save(booking1);
    }
}
