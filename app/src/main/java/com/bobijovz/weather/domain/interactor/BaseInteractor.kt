package com.bobijovz.weather.domain.interactor

abstract class BaseInteractor<out R>{
    abstract suspend fun<P> executeAsync(vararg params: P):R
}