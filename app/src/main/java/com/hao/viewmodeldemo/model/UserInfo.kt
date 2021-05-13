package com.hao.viewmodeldemo.model

data class UserInfo(
    var loginStatus: Int = 0,
    var basicInfo: BasicInfo? = null,
    var incomeInfo: IncomeInfo? = null
) {

}

data class BasicInfo(

    var nickname: String = "",// string，用户昵称
    var phone: String = ""// string，用户手机号
)

data class IncomeInfo(
    var coins: Int = 0, // 当前金币
    var coinsCash: Int = 0,// 当前金币等价人民币，单位元
    var totalCoins: Int = 0,// 累计收益金币
    var todayCoins: Int = 0,// 今日收益积分
    var todayCoinsCash: Int = 0// 今日收益金币等价人民币，单位元
)