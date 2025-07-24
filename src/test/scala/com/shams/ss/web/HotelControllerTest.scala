package com.shams.ss.web

import com.shams.ss.domain.Hotel
import com.shams.ss.service.{HotelRepository, TestBean}
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.{when, doNothing}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

import java.util.Arrays
import scala.collection.JavaConverters._

@RunWith(classOf[SpringRunner])
@WebMvcTest(Array(classOf[HotelController]))
class HotelControllerTest {

  @Autowired var hotelController: HotelController = _

  @MockBean var hotelRepository: HotelRepository = _
  @MockBean var testBean: TestBean = _

  @Test
  def lsReturnsHotels(): Unit = {
    val h1 = new Hotel()
    h1.setName("HotelA")
    h1.setAddress("AddrA")
    h1.setZip("ZipA")

    val h2 = new Hotel()
    h2.setName("HotelB")
    h2.setAddress("AddrB")
    h2.setZip("ZipB")

    when(hotelRepository.findAll()).thenReturn(Arrays.asList(h1, h2))
    doNothing().when(testBean).sayHello()

    val result = hotelController.ls()
    assert(result.asScala.toList == List(h1, h2))
  }
}
