package com.yalemang.wankotlinandroid.base

/**
 * 状态监听
 */
class StateManager {



}

//Activity状态
enum class ActivityState{
    NOT_NET_NOT_SD,//无网络SD卡
    NOT_NET_SD,//无网络有SD卡
    NET_WIFI,//WIFI状态
    NET_FLOW,//流量状态
    NET_ERROR,//网络加载失败状态
}