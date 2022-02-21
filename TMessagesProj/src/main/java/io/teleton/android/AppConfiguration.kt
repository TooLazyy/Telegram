package io.teleton.android

import android.content.ContentResolver

object AppConfiguration {

    const val FORK_NAME = "io.teleton"
    const val FORK_ITEM_TYPE_PREFIX = "${ContentResolver.CURSOR_ITEM_BASE_TYPE}/vnd.io.$FORK_NAME.android."
}