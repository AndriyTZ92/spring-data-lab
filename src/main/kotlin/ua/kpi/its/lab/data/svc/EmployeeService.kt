package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.Employee

interface EmployeeService {
    fun createEmployee(employee: Employee): Employee
    fun retrieveEmployee(id: Long): Employee?
    fun updateEmployee(employee: Employee): Employee
    fun deleteEmployee(id: Long)
}
