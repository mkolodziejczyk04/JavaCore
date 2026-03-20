Stream API Processing Project

#A technical project focused on implementing and testing various data processing patterns. The main objective is to demonstrate the practical application of the Stream API in handling collections, transforming data structures, and ensuring code reliability through comprehensive unit testing.

#Tech Stack & Tools
- Language: Java 25.0.2
- Build Tool: Maven 3.9.14
- Testing Framework: JUnit Jupiter 6.0.3
- Assertion Library: AssertJ 3.27.7

#Features & Stream Operations
The project implements several methods for data manipulation, focusing on the following Stream API capabilities:
-Grouping & Partitioning: Organizing data into Maps using groupingBy and partitioningBy.
-Data Aggregation: Counting and summarizing elements within collections.
-Duplicate Management: Identifying and handling redundant data using distinct() and specialized collectors.
-Flattening & Transformation: Processing nested structures with flatMap and mapping objects between types.
-Element Extraction: Using findFirst and findAny for precise data retrieval.
-General Filtering: Implementing logic to sift through datasets based on specific criteria.

#How to run it:
- clone repository: git clone https://github.com/mkolodziejczyk04/JavaCore3.git
- navigate to project folder: cd JavaCore3
- build project: mvn clean install

#Testing:
The project puts a strong emphasis on testing. The test suite uses JUnit 6.0.3 and AssertJ to verify the correctness of the stream-based logic through fluent and readable assertions.

To run the tests use: mvn test


