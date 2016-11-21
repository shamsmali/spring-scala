package com.shams.ss

import com.shams.ss.service.TestBean
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SampleConfig extends CommandLineRunner{

  override def run(args: String*): Unit = {
    println("Command line invoked ...... . . . . . .")
  }

  @Bean
  def helloBean(): TestBean ={
    new TestBean
  }

  
}