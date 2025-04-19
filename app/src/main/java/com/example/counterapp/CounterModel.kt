package com.example.counterapp

data class CounterModel(var count: Int)

class CounterRepository{
    private var _counterModel = CounterModel(0)

    fun getCounter() = _counterModel.count

    fun increment(){
        _counterModel.count++
    }

    fun decrement(){
        _counterModel.count--
    }
}