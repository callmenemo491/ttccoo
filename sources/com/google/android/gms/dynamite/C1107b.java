package com.google.android.gms.dynamite;

/* renamed from: com.google.android.gms.dynamite.b */
/* loaded from: classes.dex */
public final class C1107b implements com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b {
    public C1107b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b
    /* renamed from: a */
    public final com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.a mo3119a(android.content.Context r4, java.lang.String r5, com.google.android.gms.dynamite.DynamiteModule.InterfaceC1103b.b r6) {
            r3 = this;
            com.google.android.gms.dynamite.DynamiteModule$b$a r0 = new com.google.android.gms.dynamite.DynamiteModule$b$a
            r0.<init>()
            r1 = 1
            int r2 = r6.mo3120a(r4, r5, r1)
            r0.f5645b = r2
            if (r2 == 0) goto L11
            r0.f5646c = r1
            goto L1c
        L11:
            int r4 = r6.mo3121b(r4, r5)
            r0.f5644a = r4
            if (r4 == 0) goto L1c
            r4 = -1
            r0.f5646c = r4
        L1c:
            return r0
    }
}
