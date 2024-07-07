# Back Stone Scissors Paper Game

This is a Spring Boot Java back app to play the classic game of Stone Scissor Paper where you play against the machine.

This application obtains a random response from the computer and returns the move done by the user, the random
machine move and the calculated result by comparing the user and the machine moves.

## Installation

`mvn clean install`

## Usage

Go to boot directory and execute the following command: `mvn spring-boot:run -Dspring-boot.run.profiles=local`

This app is intended to be used as the back for the following Angular app: https://github.com/rdiab/front-stone-scissors-paper.
Steps of how to install and use the previous Angular app are explained in the README.md file.