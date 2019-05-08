package net.the4thdimension.cryptoreadertv.models.datasource.mock

import net.the4thdimension.cryptoreadertv.contracts.MainContractInterface
import java.util.*

class MainMockModel: MainContractInterface.Model {

    override fun getData(): List<String> {
        return Arrays.asList("stirng1","stirng2")
    }
}