package net.the4thdimension.cryptoreadertv.contracts

import net.the4thdimension.cryptoreadertv.models.datasource.MainDataSource
import net.the4thdimension.cryptoreadertv.views.BaseView

interface MainContractInterface {

    interface View: BaseView {
        fun initView()
        fun showData(list: List<String>?)
    }

    interface Presenter {
        fun onData()
    }

    interface Model : MainDataSource
}