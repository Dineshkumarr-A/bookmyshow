package com.demo.bookmyshow.services;

import com.demo.bookmyshow.models.Booking;
import com.demo.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;

import java.util.List;

@Service
public class BookingService {
    private UserRepository userRepository;
    @Autowired
    public BookingService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(Long userId, List<Long> seatsIds, Long showId)
    {
       /*
       * 1. Check if the user exist and get user info
       * 2. Get show details
       * ----- make a lock----
       * 3. Get show seat with show set ids
       * 4. Check if show seat are available
       * 5. if not throw error
       * 6. if they are available then lock the seats
       * 7. Update the show seats in DB
       * --- release lock ---
       * 8. return
       * */
        return null;
    }
}
