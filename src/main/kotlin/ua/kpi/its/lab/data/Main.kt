package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.config.AppConfig
import ua.kpi.its.lab.data.entity.Company
import ua.kpi.its.lab.data.entity.Employee
import ua.kpi.its.lab.data.svc.CompanyService
import ua.kpi.its.lab.data.svc.EmployeeService

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val companyService = context.getBean(CompanyService::class.java)
    val employeeService = context.getBean(EmployeeService::class.java)

    // Create sample entities
    val company = Company(name = "Example Company", industry = "IT", address = "123 Main St", numOfDepartments = 5,
        foundingDate = "2024-01-01", numOfWorkers = 100, isVatPayer = true)
    val savedCompany = companyService.createCompany(company)

    val employee = Employee(name = "John Doe", hireDate = "2024-05-23", department = "Engineering", position = "Software Engineer",
        category = "Senior", salary = 5000.0, isPartTime = false)
    val savedEmployee = employeeService.createEmployee(employee)

    // Retrieve and delete entities
    val retrievedCompany = companyService.retrieveCompany(savedCompany.id)
    val retrievedEmployee = employeeService.retrieveEmployee(savedEmployee.id)

    if (retrievedCompany != null) {
        println("Retrieved Company: $retrievedCompany")
        companyService.deleteCompany(retrievedCompany.id)
        println("Company deleted successfully.")
    } else {
        println("Company not found.")
    }

    if (retrievedEmployee != null) {
        println("Retrieved Employee: $retrievedEmployee")
        employeeService.deleteEmployee(retrievedEmployee.id)
        println("Employee deleted successfully.")
    } else {
        println("Employee not found.")
    }

    context.close()
}
