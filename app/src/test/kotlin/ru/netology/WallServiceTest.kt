package ru.netology

import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun addPost_updatedPost() {
        val service = WallService()
        val expected = Post(
            0L,
            "test text",
            "12.12.2020",
            "title"
        )

        val result = service.add(expected)

        assertEquals(expected, result)
    }

    @Test
    fun likePost_true() {
        val service = WallService()
        val expected = Post(
            0L,
            "test text",
            "12.12.2020",
            "title",
            likes = 1
        )

        service.add(expected.copy(likes = 0))
        val result = service.likeById(0L)

        assertTrue(result)
    }
}