package com.kanban.models

import org.squeryl.Schema

/**
 * Created by IntelliJ IDEA.
 * User: enduser
 * Date: 1/23/12
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 */

object KanbanSchema extends Schema {
  val stories = table[Story]("STORIES")

}