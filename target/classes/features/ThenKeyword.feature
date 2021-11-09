# Then steps are used to describe an expected outcome, or result.
#The step definition of a Then step should use an assertion to compare the actual outcome (what the system actually does) 
#to the expected outcome (what the step says the system is supposed to do).
#An outcome should be on an observable output. 
#That is, something that comes out of the system (report, user interface, message), 
#and not a behaviour deeply buried inside the system (like a record in a database).

Examples:

See that the guessed word was wrong
Receive an invitation
Card should be swallowed

You should only verify an outcome that is observable for the user (or external system), and changes to a database are usually not.
