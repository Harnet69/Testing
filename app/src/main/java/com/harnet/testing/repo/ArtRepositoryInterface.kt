package com.harnet.testing.repo

import androidx.lifecycle.LiveData
import com.harnet.testing.model.ImageResponse
import com.harnet.testing.roomdb.Art
import com.harnet.testing.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}