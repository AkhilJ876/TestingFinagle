package com.badgeville.newtest

/**
  * Created by Akhil Jain on 4/6/16.
  */
import java.net.InetSocketAddress

import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.util.{Await, Future}

object Test extends App {
  val port = new InetSocketAddress(2002)
 // val client:Service[Request,Response]=Http.newService("www.google.com:80")
  val service= new SimpleService
  val server = Http.serve(port, service)
  Await.ready(server)
}
