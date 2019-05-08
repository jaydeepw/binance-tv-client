package net.the4thdimension.cryptoreadertv.presenters

import net.the4thdimension.cryptoreadertv.contracts.MainContractInterface
import net.the4thdimension.cryptoreadertv.models.datasource.MainDataSource
import net.the4thdimension.cryptoreadertv.models.datasource.mock.MainMockModel

class MainPresenter(_view: MainContractInterface.View?) : BasePresenter(), MainContractInterface.Presenter {

    var view = _view
    val mainModel : MainDataSource = MainMockModel()

    override fun onData() {
        view?.showData(mainModel.getData())
    }
}