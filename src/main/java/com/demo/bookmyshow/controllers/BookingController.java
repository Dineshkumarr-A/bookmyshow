package com.demo.bookmyshow.controllers;

import com.demo.bookmyshow.dtos.BookMovieRequestDto;
import com.demo.bookmyshow.dtos.BookMovieResponseDto;
import com.demo.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService)
    {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto request)
    {
        return null;
    }
}
