package p124h7;

/* renamed from: h7.ef */
/* loaded from: classes.dex */
public final class C2609ef implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public final java.lang.Object f11491Y;

    /* renamed from: Z */
    public final java.lang.Object f11492Z;

    /* renamed from: a0 */
    public final java.lang.Object f11493a0;

    /* renamed from: b0 */
    public final java.lang.Object f11494b0;

    /* renamed from: c0 */
    public final java.lang.Object f11495c0;

    /* renamed from: d0 */
    public final java.lang.Object f11496d0;

    /* renamed from: e0 */
    public final java.lang.Object f11497e0;

    /* renamed from: f0 */
    public java.lang.Object f11498f0;

    public C2609ef(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            java.lang.Class<com.google.android.material.datepicker.f> r0 = com.google.android.material.datepicker.C1161f.class
            java.lang.String r0 = r0.getCanonicalName()
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            int r0 = p288q8.C5598b.m11874c(r5, r1, r0)
            int[] r1 = p339t7.C6183a.f24025v
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r0, r1)
            r1 = 3
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.b r1 = com.google.android.material.datepicker.C1156b.m3401a(r5, r1)
            r4.f11491Y = r1
            r1 = 1
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.b r1 = com.google.android.material.datepicker.C1156b.m3401a(r5, r1)
            r4.f11497e0 = r1
            r1 = 2
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.b r1 = com.google.android.material.datepicker.C1156b.m3401a(r5, r1)
            r4.f11492Z = r1
            r1 = 4
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.b r1 = com.google.android.material.datepicker.C1156b.m3401a(r5, r1)
            r4.f11493a0 = r1
            r1 = 6
            android.content.res.ColorStateList r1 = p288q8.C5599c.m11875a(r5, r0, r1)
            r3 = 8
            int r3 = r0.getResourceId(r3, r2)
            com.google.android.material.datepicker.b r3 = com.google.android.material.datepicker.C1156b.m3401a(r5, r3)
            r4.f11494b0 = r3
            r3 = 7
            int r3 = r0.getResourceId(r3, r2)
            com.google.android.material.datepicker.b r3 = com.google.android.material.datepicker.C1156b.m3401a(r5, r3)
            r4.f11495c0 = r3
            r3 = 9
            int r2 = r0.getResourceId(r3, r2)
            com.google.android.material.datepicker.b r5 = com.google.android.material.datepicker.C1156b.m3401a(r5, r2)
            r4.f11496d0 = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.f11498f0 = r5
            int r1 = r1.getDefaultColor()
            r5.setColor(r1)
            r0.recycle()
            return
    }

    public C2609ef(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "phone"
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f11491Y = r0
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f11492Z = r2
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r1.f11493a0 = r3
            r1.f11495c0 = r4
            r1.f11494b0 = r5
            r1.f11496d0 = r6
            r1.f11497e0 = r7
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public java.lang.String mo27a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.Object r1 = r4.f11492Z
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "mfaPendingCredential"
            r0.put(r2, r1)
            java.lang.Object r1 = r4.f11493a0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "mfaEnrollmentId"
            r0.put(r2, r1)
            java.lang.Object r1 = r4.f11491Y
            java.lang.String r1 = (java.lang.String) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = "mfaProvider"
            r2 = 1
            r0.put(r1, r2)
            java.lang.Object r1 = r4.f11495c0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L72
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.Object r2 = r4.f11495c0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "phoneNumber"
            r1.put(r3, r2)
            java.lang.Object r2 = r4.f11496d0
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L4b
            java.lang.Object r2 = r4.f11496d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "recaptchaToken"
            r1.put(r3, r2)
        L4b:
            java.lang.Object r2 = r4.f11497e0
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L5e
            java.lang.Object r2 = r4.f11497e0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "safetyNetToken"
            r1.put(r3, r2)
        L5e:
            java.lang.Object r2 = r4.f11498f0
            h7.fd r2 = (p124h7.C2625fd) r2
            if (r2 == 0) goto L6d
            org.json.JSONObject r2 = r2.m6721b()
            java.lang.String r3 = "autoRetrievalInfo"
            r1.put(r3, r2)
        L6d:
            java.lang.String r2 = "phoneSignInInfo"
            r0.put(r2, r1)
        L72:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
