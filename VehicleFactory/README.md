# VehicleFactory
Vehicle Factory ex for Structural and Creational Design Patterns
Brief explantion:
The exercise includes a Vehicle Factory in charge of sending orders for different types of vehicles and building those vehicles for clients
types of vehicles :
index : H->Hover,S->Sport,F->Field,E->Electric
Car : H,S,E
Truck : H,F
Motorcycle : S,H,F

As defined there are two Factories Herzelia and Petah Tikva (model.Bridge)
The client has control over which vehicles to order in which case an order is sent to VehicleCommand(model.Bridge) 
and VehicleCommand sends the order to the appropriate Factory.

The chain of commands is from Main->Menu(this is the user/client)->VehicleCommand->HerzeliaFactory/PetahTikvaFactory

Every order is send first to the warehouse(model.ObjectPoolPatternAndSingleton) to see if the car is already in stock

The Engine(model.BuilderPattern) class is created with the builder pattern

The MotorcycleWindsheild(model.Decorator) class is created with the decorater pattern

Every Engine made is stored in a cache of Engines(model.Flywieght) so not to rebuild Engines.

Proxy,Facade,Prototype,Adapter,Composite are all in seperate folders and are seperate from the vehicle factory exercise.
