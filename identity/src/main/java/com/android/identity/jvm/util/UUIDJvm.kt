package com.android.identity.jvm.util

import com.android.identity.util.UUID

fun UUID.toJavaUuid(): java.util.UUID {
    return java.util.UUID(mostSignificantBits.toLong(), leastSignificantBits.toLong())
}

fun UUID.Companion.fromJavaUuid(javaUuid: java.util.UUID): UUID {
    return UUID(javaUuid.mostSignificantBits.toULong(), javaUuid.leastSignificantBits.toULong())
}
