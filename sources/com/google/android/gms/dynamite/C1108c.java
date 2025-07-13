package com.google.android.gms.dynamite;

/* renamed from: com.google.android.gms.dynamite.c */
/* loaded from: classes.dex */
public final class C1108c implements com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b {
    public C1108c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b
    /* renamed from: a */
    public final com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.a mo3119a(android.content.Context r3, java.lang.String r4, com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b r5) {
            r2 = this;
            com.google.android.gms.dynamite.DynamiteModule$b$a r0 = new com.google.android.gms.dynamite.DynamiteModule$b$a
            r0.<init>()
            int r1 = r5.mo3121b(r3, r4)
            r0.f5644a = r1
            r1 = 1
            int r3 = r5.mo3120a(r3, r4, r1)
            r0.f5645b = r3
            int r4 = r0.f5644a
            if (r4 != 0) goto L1a
            if (r3 != 0) goto L1a
            r3 = 0
            goto L20
        L1a:
            if (r3 < r4) goto L1f
            r0.f5646c = r1
            goto L22
        L1f:
            r3 = -1
        L20:
            r0.f5646c = r3
        L22:
            return r0
    }
}
