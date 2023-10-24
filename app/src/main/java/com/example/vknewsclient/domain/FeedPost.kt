package com.example.vknewsclient.domain

import com.example.vknewsclient.R

data class FeedPost(
    val communityName: String = "Dev/null",
    val publicationDate: String = "15:00",
    val avatarResId: Int = R.drawable.post_comunity_thumbnail,
    val contentText: String = "Some text for test",
    val contentImageResId: Int = R.drawable.post_content_image,
    val statistics: List<StatisticItem> = listOf(
        StatisticItem(type = StatisticsType.VIEWS, 966),
        StatisticItem(type = StatisticsType.SHARES, 7),
        StatisticItem(type = StatisticsType.COMMENTS, 8),
        StatisticItem(type = StatisticsType.LIKES, 27),
    )
) {
}