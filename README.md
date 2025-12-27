# Campus-Resource-Optimizer
Smart Campus Resource Optimizer is a Java-based system that recommends optimal campus resources by analyzing availability, crowd levels, and proximity. It uses clean object-oriented design and linear-time algorithms for efficient decision-making.

## Problem Statement
Students often struggle to find available campus resources such as libraries,
labs, or sports facilities during peak hours. This project helps identify the
best available resource based on real-time constraints.

## Features
- Filters resources by type and time slot
- Checks real-time availability
- Ranks resources using crowd utilization and location proximity
- Handles edge cases such as no availability
- Implements clean object-oriented design

## Tech Stack
- Java
- Core Data Structures (List, ArrayList)
- Object-Oriented Programming

## How It Works
1. Resources are stored in a manager class
2. User preferences (type, time, location) are applied
3. Available resources are filtered
4. A combined score based on utilization and proximity is calculated
5. The best resource is recommended in linear time

## Time Complexity
- Filtering: O(n)
- Selection: O(n)
- Overall: O(n)

## Project Structure
SmartCampusResourceOptimizer/ ├── src/ │   ├── Main.java │   ├── Resource.java │   ├── ResourceManager.java │   └── UserRequest.java └── README.md

## Sample Output
Best Resource Recommendation: Name: Reading Room Location: Block A Crowd Ratio: 0.2

## Outcome
Developed a Java-based system that efficiently recommends optimal campus resources by analyzing availability, crowd utilization, and proximity. Demonstrated strong object-oriented design, modular programming, and linear-time algorithms, making the solution scalable and suitable for real-world applications.

## Future Improvements
- Add GUI for better user interaction
- Allow multiple time slots and batch requests
- Integrate with real-time campus data
