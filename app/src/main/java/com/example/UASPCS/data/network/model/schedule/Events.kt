package com.ahmaddudayef.UASPCS.data.network.model.schedule

import com.google.gson.annotations.SerializedName

data class Events(
		@SerializedName("events") var events: MutableList<EventsItem>? = null)
