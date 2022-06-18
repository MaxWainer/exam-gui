package maxwainer.examgui.common.reflection

val Class<*>.isObject
    get() = objectInstance != null

val Class<*>.createInstance
    get() = this.getConstructor()?.newInstance()
        ?: throw UnsupportedOperationException("Missing empty constructor $this")

val Class<*>.objectInstance
    get() = fields
        .firstOrNull { it.name == "INSTANCE" || it.type == this }
        ?.get(null)