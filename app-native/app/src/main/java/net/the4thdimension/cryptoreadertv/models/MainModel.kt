package net.the4thdimension.cryptoreadertv.models

import net.the4thdimension.cryptoreadertv.contracts.ContractInterface
import java.util.*

class MainModel: ContractInterface.Model {

    override fun getData(): List<String> {
        return Arrays.asList("stirng1","stirng2")
    }
}