package com.ahmedspringlearn.learningspring;

import com.ahmedspringlearn.learningspring.data.entity.Room;
import com.ahmedspringlearn.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

	@RestController
	@RequestMapping("/rooms")
	public class RoomController {
		@Autowired
		private RoomRepository roomRepository;

		@GetMapping
		public Iterable<Room> getRooms() {
			return  this.roomRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/guests")
	public class GuestController {
		@Autowired
		private RoomRepository guestRepository;

		@GetMapping
		public Iterable<Room> getRooms() {
			return  this.guestRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/reservations")
	public class ReservationController {
		@Autowired
		private RoomRepository ReservationRepository;

		@GetMapping
		public Iterable<Room> getRooms() {
			return  this.ReservationRepository.findAll();
		}
	}

}
