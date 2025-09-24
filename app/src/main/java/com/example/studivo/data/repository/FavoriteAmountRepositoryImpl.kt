package com.example.studivo.data.repository

import com.example.studivo.data.local.FavoriteAmountDao
import com.example.studivo.domain.model.entity.FavoriteAmountEntity
import com.example.studivo.domain.repository.FavoriteAmountRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FavoriteAmountRepositoryImpl @Inject constructor(
	private val dao: FavoriteAmountDao
) : FavoriteAmountRepository {
	override fun getAllFavorites(): Flow<List<FavoriteAmountEntity>> = dao.getAllFavorites()
	
	override suspend fun insertFavorite(favorite: FavoriteAmountEntity) {
		dao.insertFavorite(favorite)
	}
	
	override suspend fun deleteFavorite(favorite: FavoriteAmountEntity) {
		dao.deleteFavorite(favorite)
	}
	
	override suspend fun updateFavorite(favorite: FavoriteAmountEntity) {
		dao.updateFavorite(favorite)
	}
	
}