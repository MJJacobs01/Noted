package za.co.mjjacobs.noted.dto

import java.util.UUID

/**
 * Created by MJ Jacobs on 2024/11/23 at 15:26
 */

data class NoteDto(
    val id: UUID,
    val title: String,
    val comment: CommentDto,
    val timestamp: Long,
    val importance: Int
)