package za.co.mjjacobs.noted.dto

import java.util.*

/**
 * Created by MJ Jacobs on 2024/11/23 at 15:27
 */

data class CommentDto(
    val id: UUID,
    val content: String,
    val timestamp: Long,
    val noteId: UUID
)