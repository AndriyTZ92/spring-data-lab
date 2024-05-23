package ua.kpi.its.lab.data.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.Employee
import ua.kpi.its.lab.data.repo.EmployeeRepository
import ua.kpi.its.lab.data.svc.EmployeeService

@Service
class EmployeeServiceImpl(private val employeeRepository: EmployeeRepository) : EmployeeService {
    override fun createEmployee(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    override fun retrieveEmployee(id: Long): Employee? {
        return employeeRepository.findById(id).orElse(null)
    }

    override fun updateEmployee(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    override fun deleteEmployee(id: Long) {
        employeeRepository.deleteById(id)
    }
}
