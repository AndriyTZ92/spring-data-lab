package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.Company

interface CompanyService {
    fun createCompany(company: Company): Company
    fun retrieveCompany(id: Long): Company?
    fun updateCompany(company: Company): Company
    fun deleteCompany(id: Long)
}
