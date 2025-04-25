package com.codecademy.goldmedal.repositories;
import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {

  List<GoldMedal> findAllByOrderByYearAsc();
  List<GoldMedal> findAllByOrderByYearDesc();
  List<GoldMedal> findAllByOrderBySeasonAsc();
  List<GoldMedal> findAllByOrderBySeasonDesc();
  List<GoldMedal> findAllByOrderByCityAsc();
  List<GoldMedal> findAllByOrderByCityDesc();
  List<GoldMedal> findAllByOrderByNameAsc();
  List<GoldMedal> findAllByOrderByNameDesc();
  List<GoldMedal> findAllByOrderByEventAsc();
  List<GoldMedal> findAllByOrderByEventDesc();
  
  Integer countByCountry(String countryName);
  //get the collection of wins at the Summer Olympics, sorted by year in ascending order
  List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String countryName, String season);
  Integer countBySeason(String season);
  Integer countByGender(String gender);


  
  
}
