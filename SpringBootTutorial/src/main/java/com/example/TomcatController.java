package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatController {
 
    @GetMapping("/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10)
          .mapToObj(i -> "Hello number " + i)
          .collect(Collectors.toList());
    }
    
    @GetMapping("/empleado")
    public List<Empleado> getEmpleados() {
    	List<Empleado> empleados = new ArrayList<Empleado>();
    	empleados.add(new Empleado(123,"123",123));
    	return empleados;
    }
}