package com.botao.mapper;

import com.botao.pojo.Person;

public interface PersonMapper {

    Person selectPersonById(Integer id);
}