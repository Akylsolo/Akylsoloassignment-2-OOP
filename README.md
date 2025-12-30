Vehicle Management System
Project Overview
This project shows how Object-Oriented Programming works in Java. 
We use inheritance, composition, aggregation, and abstraction.
The system manages different vehicles Car, Motorcycle, Truck and their drivers.
Each vehicle can start, stop, and show its information.
Each driver can drive one or more vehicles.

Class Hierarchy
Vehicle (abstract class)
Has brand and year
Has abstract methods startEngine and stopEngine
Has normal method displayInfo
Car, Motorcycle, Truck (subclasses)
Each one extends Vehicle
Each one overrides startEngine and stopEngine
Each one has its own fields like doors, fuel type, capacity, etc

Driver
Has name and license number
Used inside vehicles (composition) and can be shared between vehicles (aggregation)

How to Compile and Run
Open terminal inside src folder and type:

java Main
You will see output like
Toyota машина қозғала бастады
Brand: Toyota, Year: 2020
Doors: 4, Fuel Type: Petrol
Машина қозғалысын тоқтатты
Driver Name: Айбек, License: KZ12345

Screenshots
Put screenshots in docs/screenshots folder
For example
output1.png showing program run
output2.png showing another run
uml-diagram.png showing class diagram

Reflection
Inheritance made the project easier
Each vehicle uses the same base code but can change its own behavior
Method overriding helped make each vehicle start and stop in its own way
The challenge was to understand protected and default access but super() helped to use parent constructors


