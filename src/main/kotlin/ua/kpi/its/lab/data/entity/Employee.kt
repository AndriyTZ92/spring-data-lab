package ua.kpi.its.lab.data.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val hireDate: String,
    val department: String,
    val position: String,
    val category: String,
    val salary: Double,
    val isPartTime: Boolean
)
