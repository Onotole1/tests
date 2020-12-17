package ru.netology

class WallService {

    private var id = 0L
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val copy = post.copy(id = id++)
        posts += copy
        return copy
    }

    fun likeById(id: Long): Boolean {
        posts.forEachIndexed { index, post ->
            if (post.id == id) {
                val target = posts[index]
                val copy = target.copy(likes = target.likes + 1)
                posts[index] = copy
                return true
            }
        }

        return false
    }
}
