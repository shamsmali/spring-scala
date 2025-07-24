package com.shams.ss.web

import com.shams.ss.service.{HotelRepository, TestBean}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

@Controller
@RequestMapping(Array("/hotels"))
class HotelController @Autowired()(private val hotelRepository: HotelRepository, private val testBean:TestBean ) {

  @RequestMapping(Array("/ls"))
  @ResponseBody
  def ls() = {
    testBean.sayHello()
    hotelRepository.findAll().toList.asJava
  }

}