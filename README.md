# Olympic Gold Medal Data Analysis API

## Project Description
This Spring Boot application provides an API for analyzing Olympic Gold Medal data across different countries. It allows users to query historical Olympic performance data, including statistics about summer and winter games, gender distribution of medals, and country-specific details.

## Features
- Country-specific medal statistics
- Summer and Winter Olympics data analysis
- Gender distribution of medal wins
- Country GDP and population correlation with Olympic performance
- Sorting capabilities for various metrics (year, season, city)

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven/Gradle

## Getting Started

### Prerequisites
- Java JDK 11 or higher
- Maven or Gradle
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation
1. Clone the repository
\```bash
git clone [repository-url]
\```

2. Navigate to the project directory
\```bash
cd goldmedal
\```

3. Build the project
\```bash
mvn clean install
\```

4. Run the application
\```bash
mvn spring-boot:run
\```

## API Endpoints

### Countries
- `GET /country/{country}` - Get detailed statistics for a specific country
- `GET /countries` - Get list of countries with sorting options
  - Query Parameters:
    - `sort_by`: name, gdp, population, medals
    - `ascending`: true/false

### Medals
- `GET /medals/{country}` - Get medal details for a specific country
  - Query Parameters:
    - `sort_by`: year, season, city
    - `ascending`: true/false

## Data Structure

### Country Details Response
- Name
- GDP
- Population
- Number of Medals
- Summer Olympics Statistics
  - Number of wins
  - Percentage of total summer wins
  - Year of first win
- Winter Olympics Statistics
  - Number of wins
  - Percentage of total winter wins
  - Year of first win
- Gender Distribution
  - Female athlete wins
  - Male athlete wins

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
This project is licensed under the MIT License - see the LICENSE.md file for details

## Acknowledgments
- Olympic historical data providers
- Codecademy project structure
