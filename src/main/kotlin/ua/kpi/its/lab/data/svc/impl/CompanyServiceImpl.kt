package ua.kpi.its.lab.data.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.Company
import ua.kpi.its.lab.data.repo.CompanyRepository
import ua.kpi.its.lab.data.svc.CompanyService

@Service
class CompanyServiceImpl(private val companyRepository: CompanyRepository) : CompanyService {
    override fun createCompany(company: Company): Company {
        return companyRepository.save(company)
    }

    override fun retrieveCompany(id: Long): Company? {
        return companyRepository.findById(id).orElse(null)
    }

    override fun updateCompany(company: Company): Company {
        return companyRepository.save(company)
    }

    override fun deleteCompany(id: Long) {
        companyRepository.deleteById(id)
    }
}
