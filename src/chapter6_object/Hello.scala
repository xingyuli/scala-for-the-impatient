package chapter6_object

object Hello extends App {

  if (args.length > 0)
    println("Hello, " + args(0))
  else
    println("Hello, world!")

}