package net.the4thdimension.cryptoreadertv.models.datasource.network

import net.the4thdimension.cryptoreadertv.contracts.MainContractInterface
import java.util.*

class MainNetworkModel: MainContractInterface.Model {

    override fun getData(): List<String> {
        // todo: network call here.
        return Arrays.asList("stirng1","stirng2")
    }
}