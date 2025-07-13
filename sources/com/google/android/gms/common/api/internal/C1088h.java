package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public final class C1088h implements com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.common.api.internal.C1082b f5612a;

    public C1088h(com.google.android.gms.common.api.internal.C1082b r1) {
            r0 = this;
            r0.f5612a = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a
    /* renamed from: a */
    public final void mo3053a(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.b r0 = r2.f5612a
            android.os.Handler r0 = r0.f5573k0
            r1 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }
}
