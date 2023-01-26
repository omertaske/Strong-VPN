package com.liberty.apps.studio.strongvpn

class AppSettings {
    companion object {
        //this flag will be handled by subscription
        var isUserPaid = false

        // enable admob or facebook ads, by default admob ads are enable
        // set flags true or false
        val enableAdmobAds = true
        val enableFacebookAds = false

        //place your one signal id
        val oneSignalId = "6f66f47d-58ca-4117-96dc-57d62b847c8a"

        //Subscription id's
        val one_month_subscription_id = "put your one month subscription id here"
        val three_month_subscription_id = "put your three months subscription id here"
        val one_year_subscription_id = "put your one year subscription id here"
    }
}