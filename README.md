# Design Magical Arena

## Description
This project simulates a magical arena where two players fight until one of them dies. Each player has attributes for health, strength, and attack. Players take turns attacking each other based on their attributes and random dice rolls.

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Ant (for building the project)

### Steps
1. Clone the repository:
    sh
    git clone <repository_url>
    cd magical-arena
    

2. Build the project using Ant:
    sh
    ant compile
    

3. Run the main application:
    sh
    ant run
    

4. Run the tests:
    sh
    ant test
    

### Project Structure
- src/main/java/com/example/Design Magical Arena/Player.java: Player class representing a player in the arena.
- src/main/java/com/example/Design Magical Arena/Arena.java: Arena class to manage the fight between two players.
- src/main/java/com/example//Main.java: Main class to run the application.
- src/test/java/com/example/Design Magical Arena/PlayerTest.java: Unit tests for the Player class.
- src/test/java/com/example/Design Magical Arena/ArenaTest.java: Unit tests for the Arena class.
- build.xml: Ant build file for compiling and running the project.

## Commit History
Commit frequently with meaningful commit messages to keep track of the progress and changes.