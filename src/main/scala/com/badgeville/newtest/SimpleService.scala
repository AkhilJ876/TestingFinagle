package com.badgeville.newtest

import com.twitter.finagle.Service
import com.twitter.finagle.http.{Request, Response}
import com.twitter.util.Future

/**
  * Created by AkhilJain on 4/6/16.
  */
class SimpleService extends Service[Request,Response]{
  override def apply(request: Request):Future[Response]={
    val response = Response()
    response.setContentString("HI welcome to my world")
    Future.value(response)
  }
}
