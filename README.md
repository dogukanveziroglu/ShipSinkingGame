# Ship Sinking Game

A classic ship sinking game developed in Java, where players strategically place ships on a board and attempt to sink the opponent’s fleet by guessing their ship positions.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Setup](#setup)
- [How to Play](#how-to-play)
- [Class Structure](#class-structure)

## Overview

The **Ship Sinking Game** is a simple implementation of the popular battleship board game. This game uses a command-line interface where the player guesses the positions of ships and attempts to sink them.

## Features

- Board initialization with randomly or manually placed ships.
- Various ship sizes to choose from.
- User interaction via the command line to make guesses.
- A helper class to manage gameplay logic.
- Well-structured Java code for easy future extension.


## Setup

1. Clone the repository:
https://github.com/dogukanveziroglu/ShipSinkingGame.git
cd ShipSinkingGame

2. Compile the Java files:
javac Main.java

3. Run the game:
java Main

## How to Play

1. Players place their ships on the board in a hidden grid.
2. On each turn, a player makes a guess by providing coordinates.
3. If a ship is hit, it is marked on the board.
4. The goal is to sink all opponent ships before your fleet is destroyed.

## Class Structure

- **`Main.java`**: Contains the main method to start the game.
- **`Board.java`**: Manages the game board and ship placement.
- **`Ship.java`**: Defines the properties and state of ships.
- **`Helper.java`**: Contains utility functions for game management, such as validating coordinates.
