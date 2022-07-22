package com.jptadros.jpsnewsapp.api.connection

interface ResultListener<T> {

    fun onSuccess(data: T)

    fun onError(error: Throwable)
}
