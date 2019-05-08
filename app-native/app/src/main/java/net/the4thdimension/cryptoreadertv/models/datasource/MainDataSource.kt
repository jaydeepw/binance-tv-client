package net.the4thdimension.cryptoreadertv.models.datasource

interface MainDataSource {

    fun getData() : List<String>
}