package p124h7;

/* renamed from: h7.de */
/* loaded from: classes.dex */
public final class C2590de implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public final /* synthetic */ int f11464Y;

    /* renamed from: Z */
    public final java.lang.String f11465Z;

    /* renamed from: a0 */
    public final java.lang.String f11466a0;

    public C2590de(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f11464Y = r0
            r1.<init>()
            java.lang.String r0 = "refresh_token"
            r1.f11465Z = r0
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11466a0 = r2
            return
    }

    public C2590de(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.f11464Y = r4
            r0 = 2
            if (r4 == r0) goto L10
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11465Z = r2
            r1.f11466a0 = r3
            return
        L10:
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11465Z = r2
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r1.f11466a0 = r3
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public final java.lang.String mo27a() {
            r3 = this;
            int r0 = r3.f11464Y
            switch(r0) {
                case 0: goto L26;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L3e
        L6:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.f11465Z
            java.lang.String r2 = "token"
            r0.put(r2, r1)
            r1 = 1
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f11466a0
            if (r1 == 0) goto L21
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L21:
            java.lang.String r0 = r0.toString()
            return r0
        L26:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.f11465Z
            java.lang.String r2 = "grantType"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f11466a0
            java.lang.String r2 = "refreshToken"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3e:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.f11465Z
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f11466a0
            java.lang.String r2 = "mfaEnrollmentId"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
