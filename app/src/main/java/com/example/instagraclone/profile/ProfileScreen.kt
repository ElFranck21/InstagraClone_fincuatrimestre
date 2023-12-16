package com.example.instagraclone.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagraclone.profile.components.ProfileAction
import com.example.instagraclone.profile.components.ProfileDescription
import com.example.instagraclone.profile.components.ProfileHeader
import com.example.instagraclone.profile.components.ProfileInformation
import com.example.instagraclone.profile.components.ProfilePost
import com.example.instagraclone.profile.components.ProfilePostImage
import com.example.instagraclone.profile.components.ProfileStoryHighlight

@Composable
fun ProfileScreen() {
    val user = User(
        username = "El Franck",
        profileImageUrl = "https://via.placeholder.com/200",
        followers = 1388,
        following = 155,
        name = "El Franck",
        description = " Ptm no sale esta madreeeee",
        stories = listOf(
            Story(image = "https://via.placeholder.com/200", text = "Destacada1"),
            Story(image = "https://via.placeholder.com/200", text = "Destacada2"),
            Story(image = "https://via.placeholder.com/200", text = "Destacada3"),
        ),
        posts = listOf(
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000"
        )
    )
    val size = 3
    Column {
        ProfileHeader(
            backClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            optionClick = { /*TODO*/ },
            username = user.username
        )
        LazyVerticalGrid(cells = GridCells.Fixed(size)) {
            item(span = {
                GridItemSpan(size)
                }) {
                    ProfileInformation(
                        imageUrl = user.profileImageUrl,
                        posts = user.posts.size,
                        followers = user.followers,
                        following = user.following
                    )
                }
                item(span = {
                    GridItemSpan(size)
                }) {
                    ProfileDescription(
                        name = user.name,
                        description = user.description,
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 161.dp,
                            top = 4.dp,
                            bottom = 4.dp
                        )
                    )
                }
                item(span = {
                    GridItemSpan(size)
                }) {
                    ProfileAction(
                        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                    )
                }
                item(span = {
                    GridItemSpan(size)
                }) {
                    ProfileStoryHighlight(
                        stories = user.stories,
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 4.dp,
                            button = 4.dp
                        )
                    )
                }
                items(user.posts) {
                    ProfilePostImage(imageUrl = it)
                }
            }

        }

    }
}
@Preview(showBackground = true)
@Composable
fun ProfileScreenPrevew(){
    ProfileScreen()
}