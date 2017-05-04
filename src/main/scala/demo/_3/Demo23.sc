object Demo23 {

  import akka.actor._


  object Employee {

    def props(id: String): Props = Props(new Employee(id))
  }


  class Employee(id: String) extends Actor with ActorLogging {

    override def receive: Receive = {
      case s: String => log.info(s" Received : $s")
    }

  }

}