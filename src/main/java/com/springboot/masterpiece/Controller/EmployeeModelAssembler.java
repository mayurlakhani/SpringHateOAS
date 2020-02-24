package com.springboot.masterpiece.Controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.springboot.masterpiece.Controller.EmployeeController;
import com.springboot.masterpiece.Model.Employee;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public
class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {

        return new EntityModel<>(employee,
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
}