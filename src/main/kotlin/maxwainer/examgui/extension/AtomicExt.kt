package maxwainer.examgui.extension

import java.util.concurrent.atomic.AtomicInteger

operator fun AtomicInteger.compareTo(i: Int) = get().compareTo(i)