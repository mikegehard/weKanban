package com.kanban.application

import scalaz.http._
import response._
import request._
import servlet._
import HttpServlet._
import Slinky._

final class WeKanbanApplication extends StreamStreamServletApplication{
  val application = new ServletApplication[Stream, Stream] {
    def application(implicit servlet: HttpServlet, servletRequest: HttpServletRequest, request: Request[Stream]) = {
      def found(x: Iterator[Byte]): Response[Stream] = OK << x.toStream
      resource(found, NotFound.xhtml)
    }
  }
}
