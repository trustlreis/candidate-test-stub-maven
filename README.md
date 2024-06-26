# candidate-test-stub-maven

## Description

This repository contains a stub Maven project set up with Java 17, Maven 3, and GitHub Actions to measure pull request (PR) size and complexity. The project includes configurations for Checkstyle, PMD, and SpotBugs to ensure code quality and maintainability.

## Features

- **Java 17**: The project is configured to use the latest LTS version of Java.
- **Maven 3**: Utilizes Maven for build automation and dependency management.
- **GitHub Actions**: Automated workflows for building the project and performing code quality checks on each pull request.
- **Checkstyle**: Enforces coding standards.
- **PMD**: Analyzes the source code for potential issues and duplicates.
- **SpotBugs**: Finds bugs in Java programs.
- **JUnit 5**: Integrated for writing and running tests.

## Getting Started

### Prerequisites

- Java 17
- Maven 3.x

### Setup

1. **Clone the repository:**

   ```sh
   git clone https://github.com/yourusername/my-maven-app.git
   cd my-maven-app
   ```

2. **Build the project:**

   ```sh
   mvn clean install
   ```

3. **Run code quality checks:**

   ```sh
   mvn checkstyle:checkstyle
   mvn pmd:pmd
   mvn spotbugs:spotbugs
   ```

4. **Run tests:**

   ```sh
   mvn test
   ```

## GitHub Actions

This project includes a GitHub Actions workflow configured to run on every pull request to the ` main` branch. The workflow performs the following steps:

1. Checks out the repository.
2. Sets up Java 17.
3. Builds the project using Maven.
4. Runs Checkstyle, PMD, and SpotBugs for code quality checks.

### Workflow File

The GitHub Actions workflow file is located at `.github/workflows/code_quality.yml`.

## Configuration

### Checkstyle

The Checkstyle configuration file is located at `checkstyle.xml`. This file defines the coding standards to be enforced.

### PMD

The PMD ruleset file is located at `rulesets.xml`. This file defines the rules for code analysis.

### SpotBugs

The SpotBugs exclusion file is located at `findbugs-exclude.xml`. This file defines which bugs to exclude from analysis.

### JUnit 5

JUnit 5 is included as a dependency for writing and running tests. Example test classes can be found in the `src/test/java` directory.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request if you have any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

Special thanks to the open-source community for providing excellent tools and resources for Java development.