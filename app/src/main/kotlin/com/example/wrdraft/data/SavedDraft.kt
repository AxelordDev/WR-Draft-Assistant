package com.example.wrdraft.data

data class SavedDraft(
    val id: Long,
    val ownChampionSlug: String,
    val wonAgainstSlugs: List<String>,
    val lostAgainstSlugs: List<String>,
)
