/**
 * 决定需要开启哪些库的使用，有些库是有关联的，比如 bindingCollection 引用了 recyclerView。
 * 因此即使禁用掉 recyclerView，开启 bindingCollection，也会导入 recyclerView
 *
 * 禁用掉的库，就不能使用该库的内容，正常来说在 release 打包的时候会从包中移除
 */
include {
    // 内存泄露
    leakCanary2=true
    // 应用前后台监听
    lifecycleProcess=true

    // 通常来说以上都需要为 true

    recyclerView=true

    room=true
    roomRxJava=false
    swipeRefreshLayout=false
    retrofit2=true
    glide=true
    retrofit2RxJava2=true
    livePermissions=true
    rxJava2=false
    rxKotlin=false

    loadSir=true
}

SDKVersion {
    compileSdkVersion=29
    minSdkVersion=21
    targetSdkVersion=29
}