package kotlinx.coroutines.android;

/* loaded from: classes.dex */
public final class AndroidDispatcherFactory implements kotlinx.coroutines.internal.MainDispatcherFactory {
    public AndroidDispatcherFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public /* bridge */ /* synthetic */ p379vh.AbstractC6714k1 createDispatcher(java.util.List r1) {
            r0 = this;
            wh.a r1 = r0.createDispatcher(r1)
            return r1
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public p398wh.C6883a createDispatcher(java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r4) {
            r3 = this;
            wh.a r4 = new wh.a
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1 = 1
            android.os.Handler r0 = p398wh.C6885c.m13947a(r0, r1)
            r1 = 0
            r2 = 0
            r4.<init>(r0, r1, r2)
            return r4
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
            r1 = this;
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            return r0
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public java.lang.String hintOnError() {
            r1 = this;
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            return r0
    }
}
