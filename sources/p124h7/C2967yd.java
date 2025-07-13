package p124h7;

/* renamed from: h7.yd */
/* loaded from: classes.dex */
public final class C2967yd implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public final java.lang.String f12040Y;

    /* renamed from: Z */
    public final java.lang.String f12041Z;

    /* renamed from: a0 */
    public final java.lang.String f12042a0;

    static {
            java.lang.Class<h7.yd> r0 = p124h7.C2967yd.class
            java.lang.String r0 = r0.getSimpleName()
            r6.a r1 = new r6.a
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r1.<init>(r0, r2)
            return
    }

    public C2967yd(p375v9.C6594e r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.f25775Y
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f12040Y = r0
            java.lang.String r2 = r2.f25777a0
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f12041Z = r2
            r1.f12042a0 = r3
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public final java.lang.String mo27a() {
            r5 = this;
            java.lang.String r0 = r5.f12041Z
            int r1 = p375v9.C6588b.f25772c
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1 = 0
            v9.b r2 = new v9.b     // Catch: java.lang.IllegalArgumentException -> Le
            r2.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> Le
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L14
            java.lang.String r0 = r2.f25773a
            goto L15
        L14:
            r0 = r1
        L15:
            if (r2 == 0) goto L19
            java.lang.String r1 = r2.f25774b
        L19:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r5.f12040Y
            java.lang.String r4 = "email"
            r2.put(r4, r3)
            if (r0 == 0) goto L2c
            java.lang.String r3 = "oobCode"
            r2.put(r3, r0)
        L2c:
            if (r1 == 0) goto L33
            java.lang.String r0 = "tenantId"
            r2.put(r0, r1)
        L33:
            java.lang.String r0 = r5.f12042a0
            if (r0 == 0) goto L3c
            java.lang.String r1 = "idToken"
            r2.put(r1, r0)
        L3c:
            java.lang.String r0 = r2.toString()
            return r0
    }
}
