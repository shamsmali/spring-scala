package com.shams.ss.service

import com.shams.ss.domain.Hotel
import org.springframework.data.repository.CrudRepository
import java.lang.Long

trait HotelRepository extends CrudRepository[Hotel, Long]