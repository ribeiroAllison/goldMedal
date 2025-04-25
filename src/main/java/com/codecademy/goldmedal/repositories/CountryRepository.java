package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.Country;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {

  Optional<Country> findByName(String name);
  List<Country> findAllByOrderByNameAsc();
  List<Country> findAllByOrderByNameDesc();
  List<Country> findAllByOrderByGdpAsc();
  List<Country> findAllByOrderByGdpDesc();
  List<Country> findAllByOrderByPopulationAsc();
  List<Country> findAllByOrderByPopulationDesc();
  @Query("SELECT c, COUNT(g) as medalCount " +
           "FROM Country c " +
           "LEFT JOIN GoldMedal g ON c.name = g.country " +
           "GROUP BY c.id, c.name, c.gdp, c.population " +
           "ORDER BY medalCount DESC")
    List<Country> findCountriesOrderedByMedalCountDesc();

    @Query("SELECT c, COUNT(g) as medalCount " +
           "FROM Country c " +
           "LEFT JOIN GoldMedal g ON c.name = g.country " +
           "GROUP BY c.id, c.name, c.gdp, c.population " +
           "ORDER BY medalCount ASC")
    List<Country> findCountriesOrderedByMedalCountAsc();
}
