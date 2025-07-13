package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.i */
/* loaded from: classes.dex */
public final class C1072i implements p123h6.InterfaceC2504k {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1065b f5505a;

    public /* synthetic */ C1072i(com.google.android.gms.cast.framework.media.C1065b r1) {
            r0 = this;
            r0.f5505a = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final void m3037a(int[] r3) {
            r2 = this;
            com.google.android.gms.cast.framework.media.b r0 = r2.f5505a
            java.util.List<com.google.android.gms.cast.framework.media.b$a> r0 = r0.f5495h
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.gms.cast.framework.media.b$a r1 = (com.google.android.gms.cast.framework.media.C1065b.a) r1
            r1.mo3017o(r3)
            goto L8
        L18:
            return
    }
}
