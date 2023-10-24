package com.example.vknewsclient.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vknewsclient.R
import com.example.vknewsclient.ui.theme.VkNewsClientTheme

@Composable
fun PostCard(
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
    ) {
        Column(
            Modifier.padding(8.dp)
        ) {
            PostHeader()
            Spacer(
                modifier = Modifier
                    .height(8.dp)
            )
            Text(text = "Some text")
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                painter = painterResource(R.drawable.post_comunity_thumbnail),
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
            Spacer(
                modifier = Modifier
                .height(8.dp)
            )
            Statistics()
        }
    }
}

@Composable
fun PostHeader() {
    Row(
        Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment . CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            imageVector = Icons.Rounded.AccountCircle,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier
                .width(8.dp)
        )
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "Dev/null",
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(
                modifier = Modifier
                    .height(4.dp)
            )
            Text(
                text = "14:00",
                color = MaterialTheme.colorScheme.onSecondary
            )

        }
        Icon(
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSecondary
        )
    }
}

@Composable
fun Statistics() {
    Row() {
        Row(
            modifier =  Modifier.weight(1f)
        ) {
            IconWithText(iconResId = R.drawable.ic_views_count, text = "966")
        }

        Row(
            modifier =  Modifier.weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconWithText(iconResId = R.drawable.ic_share, text = "9")
            IconWithText(iconResId = R.drawable.ic_comment, text = "8")
            IconWithText(iconResId = R.drawable.ic_like, text = "9")
        }
    }
}

@Composable
fun IconWithText(iconResId: Int, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSecondary
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onSecondary
        )
    }
}

@Preview
@Composable
private fun PreviewLight() {
    VkNewsClientTheme(false) {
        PostCard()
    }
}

@Preview
@Composable
private fun PreviewDark() {
    VkNewsClientTheme(true) {
        PostCard()
    }
}