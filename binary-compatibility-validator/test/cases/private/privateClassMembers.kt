/*
 * Copyright 2016-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package cases.private

private open class PrivateClass public constructor() {
    internal val internalVal = 1

    protected fun protectedFun() = internalVal
}
