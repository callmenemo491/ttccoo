package com.google.android.datatransport.cct;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements p405x3.InterfaceC6921c {
    public CctBackendFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p405x3.InterfaceC6921c
    public p405x3.InterfaceC6926h create(com.google.android.datatransport.runtime.backends.AbstractC1040d r4) {
            r3 = this;
            u3.c r0 = new u3.c
            android.content.Context r1 = r4.mo2806a()
            d4.a r2 = r4.mo2809d()
            d4.a r4 = r4.mo2808c()
            r0.<init>(r1, r2, r4)
            return r0
    }
}
