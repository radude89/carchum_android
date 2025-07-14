package com.rdan.carchum.data

import com.rdan.carchum.model.Vehicle
import kotlinx.coroutines.flow.Flow

interface CarChumRepository {
    fun getAllVehicles(): Flow<List<Vehicle>>
    suspend fun insertVehicle(vehicle: Vehicle)
    suspend fun updateVehicle(vehicle: Vehicle)
    suspend fun deleteVehicle(vehicle: Vehicle)
}