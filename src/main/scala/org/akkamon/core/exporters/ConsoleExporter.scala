package org.akkamon.core.exporters

import akka.actor.{Props, Actor, ActorSystem}
import org.akkamon.core.InstrumentExporter
import org.akkamon.core.instruments.{TimingTrait, LoggingTrait}


object ConsoleExporter extends InstrumentExporter {

  val instrumentActor = system.actorOf(Props[LoggingActor])

  class LoggingActor extends Actor {

    def receive: Receive = {
      case msg: MessageEvent => println(msg.message);
      case timer: TimerEvent => println(s"Timer: ${timer.timer} Value: ${timer.value}")
      case counter: CounterEvent => println(s"Counter ${counter.key} at value ${counter.value}")
    }
  }
}

