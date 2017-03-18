package com.lmy.tin_ker;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by LMY on 2017/3/18.
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.lmy.tin_ker.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
