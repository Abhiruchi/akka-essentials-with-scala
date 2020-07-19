package playground

import akka.actor.ActorSystem

object test extends App {
  val actorSystem = ActorSystem("hello")
  println(actorSystem.name)
}
