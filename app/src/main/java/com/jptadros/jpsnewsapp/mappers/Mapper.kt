package com.jptadros.jpsnewsapp.mappers

interface Mapper<E, K> {
    fun map(model: E): K
}