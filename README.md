# Dependency Injection

This repo contains code to study the notion of "dependency injection" from the ground up, without any framework.

## What do we have in the code?

We have a "pseudo system", which allows us to create a fisherman. We can ask the fisherman to get some fish for us. To do that, he will need some equipment: boots, a boat, bait and of course a fishing rod. It's a wonderful world: whenever the fisherman uses his fishing rod, he will get fresh fish.

We have a unit test that validates the behavior of the system. Let's fix the problem!

## Phase 1

* Fork the repo
* Open the project in the IDE
* Run the test and see it fail
* Read the code

##Phase 2

* Fix the code to make the test pass
* Open a pull request

##Phase 3

* Review the solutions
* Introduce the notion of dependency injection



## Explanations

* To do his job, our fisherman needs equipment. He **depends** on these objects to do his job. 
* How should he obtain these dependencies? There are at least 3 options:
  * He creates them himself. In the real world, this would mean crafting a fishing rod, building a boat. In OO, this means creating instances with `new`.
  * He asks "someone" to give him the objects. In the real world, this would mean going to the store and buy stuff. He is active and takes the initiative to go get the stuff. In OO, this could be achieved by doing a **lookup** in some sort of "**service registry**.
  * He lives in a "smart environment" and is auto-magically provided all he needs by an invisible Force. Maybe it's God, maybe it's the Matrix. In OO, this can be with a class that acts as the "**dependency injection container**" (some kind of orchestrator, mediator) and with **a constructor where every argument is an injected dependency**.
* See https://stackoverflow.com/questions/130794/what-is-dependency-injection/13005079#13005079 for lots of other descriptions of dependency injections.