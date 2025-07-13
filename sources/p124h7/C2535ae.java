package p124h7;

/* renamed from: h7.ae */
/* loaded from: classes.dex */
public final class C2535ae implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public final /* synthetic */ int f11374Y;

    /* renamed from: Z */
    public final java.lang.String f11375Z;

    /* renamed from: a0 */
    public java.lang.String f11376a0;

    /* renamed from: b0 */
    public final java.lang.String f11377b0;

    /* renamed from: c0 */
    public final java.lang.String f11378c0;

    /* renamed from: d0 */
    public final java.lang.String f11379d0;

    public C2535ae(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 0
            r1.f11374Y = r0
            r1.<init>()
            java.lang.String r0 = "phone"
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f11375Z = r0
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11376a0 = r2
            r1.f11377b0 = r3
            r1.f11379d0 = r4
            r1.f11378c0 = r5
            return
    }

    public C2535ae(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            r0 = 1
            r1.f11374Y = r0
            r1.<init>()
            r1.f11375Z = r2
            r1.f11376a0 = r3
            r1.f11377b0 = r4
            r1.f11378c0 = r5
            r1.f11379d0 = r6
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public final java.lang.String mo27a() {
            r4 = this;
            int r0 = r4.f11374Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L47
        L6:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r4.f11376a0
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f11375Z
            java.util.Objects.requireNonNull(r1)
            r1 = 1
            java.lang.String r2 = "mfaProvider"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f11378c0
            if (r1 == 0) goto L26
            java.lang.String r2 = "displayName"
            r0.put(r2, r1)
        L26:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = r4.f11377b0
            if (r2 == 0) goto L34
            java.lang.String r3 = "sessionInfo"
            r1.put(r3, r2)
        L34:
            java.lang.String r2 = r4.f11379d0
            if (r2 == 0) goto L3d
            java.lang.String r3 = "code"
            r1.put(r3, r2)
        L3d:
            java.lang.String r2 = "phoneVerificationInfo"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L47:
            java.lang.String r0 = r4.f11379d0
            return r0
    }
}
