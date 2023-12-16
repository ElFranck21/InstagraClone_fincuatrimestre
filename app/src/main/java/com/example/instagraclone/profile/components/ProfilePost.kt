package com.example.instagraclone.profile.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kotlinx.coroutines.ExperimentalCoroutinesApi

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProfilePost(images: List<String>, modifier: Modifier =Modifier){
    LazyVerticalGrid(cells= GridCells.Fixed(3),modifier= modifier){
        items(images){
                ProfileImage(imageUrl=it, modifier= Modifier.padding(1.dp))       }
    }
}

@Composable
private fun ProfileImage(imageUrl: String,modifier: Modifier=Modifier){
    Box(modifier = modifier) {
        AsyncImage(model = imageUrl, contentDescription = "user post")
    }
}

@Composable
@Preview(showBackground = true)
fun ProfilePostPreview(){
        ProfilePost(emptyList())
}