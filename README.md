# Y2S1-Java-Project

# Student Management System

This project is a Java-based student management system developed for CPT105 Introduction to Programming in Java. It consists of three parts: Part A, B, and C, each focusing on different aspects of the system's functionality and documentation.

### Contributor
- **Name**: Changqing Lin
- **ID**: 2039153  

## Description  
A comprehensive Java-based student management system developed for the CPT105 Introduction to Programming in Java course. This system features GUI data encapsulation, management of students, courses, teachers, and grades, along with robust encryption for sensitive data. It embodies the principles of object-oriented programming and showcases serialization for data persistence.  

## Features

- GUI simulation of data encapsulation and transmission.
- Management of student, course, teacher, and grade information.
- Persistent storage of objects using serialization.
- Encryption and decryption of sensitive information.
- Extensive error handling and custom exceptions.

## Part A: GUI Program for Data Encapsulation

Part A involves the development of a GUI program to simulate the encapsulation and transmission of data over the internet. It's subdivided into two sections:

### Part A.1: DataPacket

Tasks include converting strings to hexadecimal, CRC code calculation, and data packet assembly. For instance, the string "123A" is converted to a data packet "AA04313233417BD7BB".

### Part A.2: MultiDataPacket

Enhances Part A.1 by allowing multiple data strings to be encapsulated within a single data packet. It includes custom exception handling with `DataPacketException` for any validation errors.

## Part B: Student Management System

Part B is the core of the project, where a fully-fledged student management system is developed. It includes:

- `Course`: Represents course information with `courseId` and `courseName`.
- `Person`: An abstract base class with `name` and `gender`.
- `Student`: Inherits from `Person`, with an additional `stuId`.
- `Teacher`: Inherits from `Person`, including `teacherId`, `loginName`, and `password`.
- `Grade`: Represents a student's grade in a course with `stuId`, `courseId`, and `grade`.
- `Encryption`: Handles the encryption and decryption of teachers' passwords.
- `FileUtils`: Manages file operations for object persistence.
- `DataAccess`: Provides data retrieval and storage functionality.
- `Q3`: Implements a command-line interface for interacting with the system.

## Part C: Documentation

Part C focuses on the design documentation:

- Javadoc comments and HTML generation for `FileUtils`.
- UML class diagrams for `Person`, `Teacher`, and `DataAccess`.

## Installation

To set up the project on your local machine:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-github-username/student-management-system.git  
2. Open the project in your preferred Java IDE.  
3. Ensure you have the Java Development Kit (JDK) installed and properly configured.
   
