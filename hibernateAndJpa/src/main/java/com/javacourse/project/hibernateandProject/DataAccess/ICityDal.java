package com.javacourse.project.hibernateandProject.DataAccess;

import com.javacourse.project.hibernateandProject.Entities.City;

import java.util.List;

public interface ICityDal {

    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
}
