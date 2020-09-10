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
        Course course2 = new Course("Intro To JavaScript", "Glasgow",2);
        courseRepository.save(course2);
        Course course3 = new Course("Intro To Ruby", "Edinburgh",3);
        courseRepository.save(course3);

        Customer customer1 = new Customer("James", "Dundee", 26);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Cal", "Edinburgh", 16);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Bob", "Glasgow", 36);
        customerRepository.save(customer3);


        Booking booking1 = new Booking("23-09-21", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("21-05-20", course1, customer2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("27-04-22", course3, customer3);
        bookingRepository.save(booking3);
    }
}
