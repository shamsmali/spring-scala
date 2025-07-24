package com.shams.ss.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.ui.Model

@Controller
class TimeController {

  @RequestMapping(Array("/time"))
  def time(model: Model): String = {
    val serverTimeNs: Long = System.currentTimeMillis() * 1000000L
    model.addAttribute("serverTime", serverTimeNs)
    "time"
  }
}
