package ua.kpi.its.lab.data.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class Company(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val industry: String,
    val address: String,
    val numOfDepartments: Int,
    val foundingDate: String,
    val numOfWorkers: Int,
    val isVatPayer: Boolean
)
