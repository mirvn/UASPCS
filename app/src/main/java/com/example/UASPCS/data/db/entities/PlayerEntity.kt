package com.ahmaddudayef.UASPCS.data.db.entities


data class PlayerEntity(val id: Long?, val playerId: String?, val playerImageUrl: String?, val playerPosition: String?){
    companion object {
        const val TABLE_PLAYER: String = "TABLE_PLAYER"
        const val ID: String = "ID_"
        const val PLAYER_ID: String = "PLAYER_ID"
        const val PLAYER_IMAGE_URL: String = "IMAGE_ID"
        const val PLAYER_POSITION: String = "PLAYER_POSITION"
    }
}