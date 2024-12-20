package com.project.ProyectoFreshhome.service;

import java.util.List;
import java.util.Optional;

import com.project.ProyectoFreshhome.entities.Cliente;
import com.project.ProyectoFreshhome.entities.Empleado;

public interface EmpleadoService {
    List<Empleado> mostrarEmpleados();
    Optional<Empleado> buscarEmpleado(int id);
    Empleado agregar(Empleado empleado);
    void eliminar(Empleado emppleado);
    int tamaño();
    Empleado login(String correo,String contraseña);
    String token(Empleado empleado);
    Empleado actualizar(Empleado empleado);
    
}
