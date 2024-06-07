sealed interface Context {

    data object Foo : Context

    data class Bar(val name: String) : Context
}

interface ParentInterface {

    context(Context)
    fun doSomething()
}

interface ChildInterface : ParentInterface {

    context(Context.Bar)
    override fun doSomething()
}


interface OtherChildInterface : ParentInterface {

    context(Context.Foo)
    override fun doSomething()
}
