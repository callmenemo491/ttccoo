package p124h7;

/* renamed from: h7.vd */
/* loaded from: classes.dex */
public final class C2913vd implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public final /* synthetic */ int f11959Y;

    /* renamed from: Z */
    public java.lang.String f11960Z;

    /* renamed from: a0 */
    public java.lang.String f11961a0;

    /* renamed from: b0 */
    public final java.lang.String f11962b0;

    public C2913vd(java.lang.String r2) {
            r1 = this;
            r0 = 2
            r1.f11959Y = r0
            r1.<init>()
            r1.f11962b0 = r2
            return
    }

    public C2913vd(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f11959Y = r0
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11960Z = r2
            java.lang.String r2 = "http://localhost"
            r1.f11961a0 = r2
            r1.f11962b0 = r3
            return
    }

    public C2913vd(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            r1.f11959Y = r5
            r0 = 2
            if (r5 == r0) goto L25
            r0 = 3
            if (r5 == r0) goto L15
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11960Z = r2
            r1.f11961a0 = r3
            r1.f11962b0 = r4
            return
        L15:
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11960Z = r2
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r1.f11961a0 = r3
            r1.f11962b0 = r4
            return
        L25:
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11960Z = r2
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r1.f11961a0 = r3
            r1.f11962b0 = r4
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public final java.lang.String mo27a() {
            r5 = this;
            int r0 = r5.f11959Y
            java.lang.String r1 = "password"
            java.lang.String r2 = "email"
            java.lang.String r3 = "tenantId"
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L2b;
                case 2: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L6b
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r4 = r5.f11960Z
            if (r4 == 0) goto L18
            r0.put(r2, r4)
        L18:
            java.lang.String r2 = r5.f11961a0
            if (r2 == 0) goto L1f
            r0.put(r1, r2)
        L1f:
            java.lang.String r1 = r5.f11962b0
            if (r1 == 0) goto L26
            r0.put(r3, r1)
        L26:
            java.lang.String r0 = r0.toString()
            return r0
        L2b:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r5.f11960Z
            java.lang.String r2 = "oobCode"
            r0.put(r2, r1)
            java.lang.String r1 = r5.f11961a0
            if (r1 == 0) goto L40
            java.lang.String r2 = "newPassword"
            r0.put(r2, r1)
        L40:
            java.lang.String r1 = r5.f11962b0
            if (r1 == 0) goto L47
            r0.put(r3, r1)
        L47:
            java.lang.String r0 = r0.toString()
            return r0
        L4c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r5.f11960Z
            java.lang.String r2 = "identifier"
            r0.put(r2, r1)
            java.lang.String r1 = r5.f11961a0
            java.lang.String r2 = "continueUri"
            r0.put(r2, r1)
            java.lang.String r1 = r5.f11962b0
            if (r1 == 0) goto L66
            r0.put(r3, r1)
        L66:
            java.lang.String r0 = r0.toString()
            return r0
        L6b:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r4 = r5.f11960Z
            r0.put(r2, r4)
            java.lang.String r2 = r5.f11961a0
            r0.put(r1, r2)
            r1 = 1
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r5.f11962b0
            if (r1 == 0) goto L87
            r0.put(r3, r1)
        L87:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
