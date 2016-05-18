# akka-mon
Set of traits, objects and tools to make monitoring akka systems easy.



This project was cloned from https://github.com/josdirksen/akka-mon.

Due to the development of akka, the original implementation can not support the latest version (2.4.5). Therefore, I modified it to support the latest akka. 

Even though I do some modifications to suuport the new version, it is still very basic and simple. Currently, it only support very simple key counter and message processing time counter. I am using it to learn the profiling of the performance of Akka programms and I also plan to enrich it during the learning process. 


# Plan

First, I will trying to integrate Actor Metrics (time-in-mailbox, processing-time, mailbox-size), Router Metrics (routing-time, time-in-mailbox, processing-time) and Dispatcher Metrics (Fork Join Pool Dispatchers: parallelism, pool-size, active-threads, running-threads, queued-task-count) as http://kamon.io/integrations/akka/actor-router-and-dispatcher-metrics/ does.

Then, I plan to Add VM instrument monitoring.


# Run

The demo Akka programm (SimpleAkkaSystem.scala) is simplily used to show how to virsual its metrics with grafana. These metrics are actually sent to statsd which can be eventually visualized in grafana.

First, you can run SimpleAkkaSystem.

Second, you need to setup your virstual enviroments. This setup is very simple with the help of the docker image provided by https://github.com/muuki88/activator-akka-kamon#master. You just need to install docker engine and execute this command: 

docker run -v /etc/localtime:/etc/localtime:ro -p 80:80 -p 8125:8125/udp -p 8126:8126 -p 8083:8083 -p 8086:8086 -p 8084:8084 --name kamon-grafana-dashboard muuki88/grafana_graphite:latest

Then, you can see the virsual results at localhost:80 in your browser.

![vistualdemo](https://github.com/hustnn/akka-mon/blob/master/images/dashboard.png)




