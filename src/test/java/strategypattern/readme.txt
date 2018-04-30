/**
 *  Requirement:
 *
 * 	all duck can swim | constant behavior
 * 	all duck has display behavior | constant behavior
 *	a duck can fly, cannot fly, fly with rocket-power i.e. this behavior is changing most of the time
 *	there are more than 50 duck type which can exists with different behavior
 *
 *
 *	Strategy Pattern:
 *	pull out all that is changing very often with new requirement like fly behavior of duck
 *	Use composition(HAS-A) over Inheritance(IS-A) for fly behavior
 *
 *	Duck has three sub class (IS-A) relationship : White/Fat/RobotDuck
 *
 *	
 *	Design Principle Used:
 *	Separate the functionality from application which vary often 
 *	Favor Composition over Inheritance if some behavior changes often like fly in this case
 *  Program to interface rather implementation
 *
 */