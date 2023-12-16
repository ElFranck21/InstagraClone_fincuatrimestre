package com.example.instagraclone.profile

data class User(
    val username: String,
    val profileImageUrl: String,
    val followers: Int,
    val following: Int,
    val name: String,
    val description: String,
    val stories: List<Story>,
    val posts: List<String>

)
data class Story(
    val image: String,
    val text: String
)
