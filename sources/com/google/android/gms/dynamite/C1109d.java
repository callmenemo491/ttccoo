package com.google.android.gms.dynamite;

/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
public final class C1109d implements com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b {
    public C1109d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b
    /* renamed from: a */
    public final com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.a mo3119a(android.content.Context r5, java.lang.String r6, com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b r7) {
            r4 = this;
            com.google.android.gms.dynamite.DynamiteModule$b$a r0 = new com.google.android.gms.dynamite.DynamiteModule$b$a
            r0.<init>()
            int r1 = r7.mo3121b(r5, r6)
            r0.f5644a = r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            int r5 = r7.mo3120a(r5, r6, r2)
            goto L18
        L14:
            int r5 = r7.mo3120a(r5, r6, r3)
        L18:
            r0.f5645b = r5
            int r5 = r0.f5644a
            if (r5 != 0) goto L25
            int r6 = r0.f5645b
            if (r6 != 0) goto L25
            r0.f5646c = r2
            goto L2f
        L25:
            int r6 = r0.f5645b
            if (r5 < r6) goto L2d
            r5 = -1
            r0.f5646c = r5
            goto L2f
        L2d:
            r0.f5646c = r3
        L2f:
            return r0
    }
}
