package p124h7;

/* renamed from: h7.ee */
/* loaded from: classes.dex */
public final class C2608ee extends p270p6.AbstractC5367a implements p124h7.InterfaceC2553bd<p124h7.C2608ee> {
    public static final android.os.Parcelable.Creator<p124h7.C2608ee> CREATOR = null;

    /* renamed from: Z */
    public static final java.lang.String f11489Z = null;

    /* renamed from: Y */
    public p124h7.C2680ie f11490Y;

    static {
            java.lang.Class<h7.ee> r0 = p124h7.C2608ee.class
            java.lang.String r0 = r0.getSimpleName()
            p124h7.C2608ee.f11489Z = r0
            h7.fe r0 = new h7.fe
            r0.<init>()
            p124h7.C2608ee.CREATOR = r0
            return
    }

    public C2608ee() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2608ee(p124h7.C2680ie r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Lb
            h7.ie r3 = new h7.ie
            r3.<init>()
            goto L20
        Lb:
            java.util.List<h7.ge> r3 = r3.f11641Y
            h7.ie r0 = new h7.ie
            r0.<init>()
            if (r3 == 0) goto L1f
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L1f
            java.util.List<h7.ge> r1 = r0.f11641Y
            r1.addAll(r3)
        L1f:
            r3 = r0
        L20:
            r2.f11490Y = r3
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r26) {
            r25 = this;
            r1 = r25
            r2 = r26
            java.lang.String r0 = "users"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r3.<init>(r2)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            boolean r4 = r3.has(r0)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            if (r4 != 0) goto L1a
            h7.ie r0 = new h7.ie     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r0.<init>()     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
        L16:
            r1.f11490Y = r0     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            goto Le4
        L1a:
            org.json.JSONArray r0 = r3.optJSONArray(r0)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            if (r0 == 0) goto Ld8
            int r3 = r0.length()     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            if (r3 != 0) goto L28
            goto Ld8
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            int r4 = r0.length()     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r3.<init>(r4)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r4 = 0
            r5 = 0
        L33:
            int r6 = r0.length()     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            if (r5 >= r6) goto Ld1
            org.json.JSONObject r6 = r0.getJSONObject(r5)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            if (r6 != 0) goto L48
            h7.ge r6 = new h7.ge     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r6.<init>()     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r24 = r5
            goto Lc9
        L48:
            h7.ge r23 = new h7.ge     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "localId"
            r8 = 0
            java.lang.String r7 = r6.optString(r7, r8)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r9 = p353u6.C6347j.m12998a(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "email"
            java.lang.String r7 = r6.optString(r7, r8)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r10 = p353u6.C6347j.m12998a(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "emailVerified"
            boolean r11 = r6.optBoolean(r7, r4)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "displayName"
            java.lang.String r7 = r6.optString(r7, r8)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r12 = p353u6.C6347j.m12998a(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "photoUrl"
            java.lang.String r7 = r6.optString(r7, r8)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r13 = p353u6.C6347j.m12998a(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "providerUserInfo"
            org.json.JSONArray r7 = r6.optJSONArray(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            h7.se r14 = p124h7.C2860se.m7138X(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "rawPassword"
            java.lang.String r7 = r6.optString(r7, r8)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r15 = p353u6.C6347j.m12998a(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "phoneNumber"
            java.lang.String r7 = r6.optString(r7, r8)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r16 = p353u6.C6347j.m12998a(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "createdAt"
            r24 = r5
            r4 = 0
            long r17 = r6.optLong(r7, r4)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.lang.String r7 = "lastLoginAt"
            long r4 = r6.optLong(r7, r4)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r20 = 0
            r21 = 0
            java.lang.String r7 = "mfaInfo"
            org.json.JSONArray r6 = r6.optJSONArray(r7)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.util.List r22 = p124h7.C2788oe.m7023Y(r6)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r7 = r23
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r6 = r23
        Lc9:
            r3.add(r6)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            int r5 = r24 + 1
            r4 = 0
            goto L33
        Ld1:
            h7.ie r0 = new h7.ie     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r0.<init>(r3)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            goto L16
        Ld8:
            h7.ie r0 = new h7.ie     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r3.<init>()     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            r0.<init>(r3)     // Catch: java.lang.NullPointerException -> Le5 org.json.JSONException -> Le7
            goto L16
        Le4:
            return r1
        Le5:
            r0 = move-exception
            goto Le8
        Le7:
            r0 = move-exception
        Le8:
            java.lang.String r3 = p124h7.C2608ee.f11489Z
            h7.kb r0 = p036c6.C0906q0.m2613a(r0, r3, r2)
            throw r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 2
            h7.ie r2 = r4.f11490Y
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
