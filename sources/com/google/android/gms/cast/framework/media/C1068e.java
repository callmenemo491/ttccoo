package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.e */
/* loaded from: classes.dex */
public final class C1068e implements p123h6.InterfaceC2509p {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.AbstractC1070g f5499Y;

    public C1068e(com.google.android.gms.cast.framework.media.AbstractC1070g r1) {
            r0 = this;
            r0.f5499Y = r1
            r0.<init>()
            return
    }

    @Override // p123h6.InterfaceC2509p
    /* renamed from: m */
    public final void mo3032m(long r3) {
            r2 = this;
            com.google.android.gms.cast.framework.media.g r3 = r2.f5499Y     // Catch: java.lang.IllegalStateException -> L13
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status     // Catch: java.lang.IllegalStateException -> L13
            r0 = 2103(0x837, float:2.947E-42)
            r1 = 0
            r4.<init>(r0, r1)     // Catch: java.lang.IllegalStateException -> L13
            com.google.android.gms.cast.framework.media.f r0 = new com.google.android.gms.cast.framework.media.f     // Catch: java.lang.IllegalStateException -> L13
            r0.<init>(r4)     // Catch: java.lang.IllegalStateException -> L13
            r3.m3047f(r0)     // Catch: java.lang.IllegalStateException -> L13
            return
        L13:
            r3 = move-exception
            java.lang.String r4 = "RemoteMediaClient"
            java.lang.String r0 = "Result already set when calling onRequestReplaced"
            android.util.Log.e(r4, r0, r3)
            return
    }

    @Override // p123h6.InterfaceC2509p
    /* renamed from: t */
    public final void mo3033t(long r3, int r5, java.lang.Object r6) {
            r2 = this;
            boolean r3 = r6 instanceof p123h6.C2506m
            r4 = 0
            r0 = 1
            if (r0 == r3) goto L7
            r6 = r4
        L7:
            com.google.android.gms.cast.framework.media.g r3 = r2.f5499Y     // Catch: java.lang.IllegalStateException -> L26
            com.google.android.gms.cast.framework.media.h r0 = new com.google.android.gms.cast.framework.media.h     // Catch: java.lang.IllegalStateException -> L26
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: java.lang.IllegalStateException -> L26
            r1.<init>(r5, r4)     // Catch: java.lang.IllegalStateException -> L26
            if (r6 == 0) goto L18
            r5 = r6
            h6.m r5 = (p123h6.C2506m) r5     // Catch: java.lang.IllegalStateException -> L26
            org.json.JSONObject r5 = r5.f11301a     // Catch: java.lang.IllegalStateException -> L26
            goto L19
        L18:
            r5 = r4
        L19:
            if (r6 == 0) goto L1f
            h6.m r6 = (p123h6.C2506m) r6     // Catch: java.lang.IllegalStateException -> L26
            com.google.android.gms.cast.MediaError r4 = r6.f11302b     // Catch: java.lang.IllegalStateException -> L26
        L1f:
            r0.<init>(r1, r5, r4)     // Catch: java.lang.IllegalStateException -> L26
            r3.m3047f(r0)     // Catch: java.lang.IllegalStateException -> L26
            return
        L26:
            r3 = move-exception
            java.lang.String r4 = "RemoteMediaClient"
            java.lang.String r5 = "Result already set when calling onRequestCompleted"
            android.util.Log.e(r4, r5, r3)
            return
    }
}
