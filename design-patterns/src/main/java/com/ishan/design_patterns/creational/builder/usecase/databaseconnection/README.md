# Builder Pattern Implementation for a database configuration class

## Problem Statement

You are tasked with creating a system-wide database configuration for a complex software suite. The configuration is
responsible for managing various configuration settings that affect the data layer. To ensure a flexible and readable
way to create configuration instances that are immutable, you decide to implement the Builder pattern.

## Assignment

Your task is to implement the Builder pattern to create instances of a configuration manager class. The Builder pattern
allows for step-by-step construction of complex objects while keeping the creation process separate from the main
object.

## Implementing the Builder Pattern

1. `Review the original class` - You have been provided with a class that represents the database configuration
   `DatabaseConfiguration`. The class has a number of properties that are used to configure the database connection.
   Your task is to implement the Builder pattern to create instances of a class with the same properties.

## Instructions

1. Implement the builder pattern within your class.