package p411x9;

/* renamed from: x9.c0 */
/* loaded from: classes.dex */
public final class C6979c0 extends p270p6.AbstractC5367a implements p375v9.InterfaceC6628z {
    public static final android.os.Parcelable.Creator<p411x9.C6979c0> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f27249Y;

    /* renamed from: Z */
    public final java.lang.String f27250Z;

    /* renamed from: a0 */
    public final java.lang.String f27251a0;

    /* renamed from: b0 */
    public java.lang.String f27252b0;

    /* renamed from: c0 */
    public final java.lang.String f27253c0;

    /* renamed from: d0 */
    public final java.lang.String f27254d0;

    /* renamed from: e0 */
    public final boolean f27255e0;

    /* renamed from: f0 */
    public final java.lang.String f27256f0;

    static {
            x9.d0 r0 = new x9.d0
            r0.<init>()
            p411x9.C6979c0.CREATOR = r0
            return
    }

    public C6979c0(p124h7.C2644ge r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r3 = "firebase"
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            java.lang.String r0 = r2.f11544Y
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f27249Y = r0
            r1.f27250Z = r3
            java.lang.String r3 = r2.f11545Z
            r1.f27253c0 = r3
            java.lang.String r3 = r2.f11547b0
            r1.f27251a0 = r3
            java.lang.String r3 = r2.f11548c0
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r0 = 0
            if (r3 != 0) goto L29
            java.lang.String r3 = r2.f11548c0
            android.net.Uri r3 = android.net.Uri.parse(r3)
            goto L2a
        L29:
            r3 = r0
        L2a:
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.toString()
            r1.f27252b0 = r3
        L32:
            boolean r3 = r2.f11546a0
            r1.f27255e0 = r3
            r1.f27256f0 = r0
            java.lang.String r2 = r2.f11551f0
            r1.f27254d0 = r2
            return
    }

    public C6979c0(p124h7.C2824qe r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = r2.f11864Y
            r1.f27249Y = r0
            java.lang.String r0 = r2.f11867b0
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f27250Z = r0
            java.lang.String r0 = r2.f11865Z
            r1.f27251a0 = r0
            java.lang.String r0 = r2.f11866a0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.f11866a0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L2f
            java.lang.String r0 = r0.toString()
            r1.f27252b0 = r0
        L2f:
            java.lang.String r0 = r2.f11870e0
            r1.f27253c0 = r0
            java.lang.String r0 = r2.f11869d0
            r1.f27254d0 = r0
            r0 = 0
            r1.f27255e0 = r0
            java.lang.String r2 = r2.f11868c0
            r1.f27256f0 = r2
            return
    }

    public C6979c0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.f27249Y = r1
            r0.f27250Z = r2
            r0.f27253c0 = r3
            r0.f27254d0 = r4
            r0.f27251a0 = r5
            r0.f27252b0 = r6
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L1a
            java.lang.String r1 = r0.f27252b0
            android.net.Uri.parse(r1)
        L1a:
            r0.f27255e0 = r7
            r0.f27256f0 = r8
            return
    }

    @Override // p375v9.InterfaceC6628z
    /* renamed from: T */
    public final java.lang.String mo13479T() {
            r1 = this;
            java.lang.String r0 = r1.f27250Z
            return r0
    }

    /* renamed from: X */
    public final java.lang.String m14139X() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "userId"
            java.lang.String r2 = r3.f27249Y     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "providerId"
            java.lang.String r2 = r3.f27250Z     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "displayName"
            java.lang.String r2 = r3.f27251a0     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "photoUrl"
            java.lang.String r2 = r3.f27252b0     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "email"
            java.lang.String r2 = r3.f27253c0     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "phoneNumber"
            java.lang.String r2 = r3.f27254d0     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "isEmailVerified"
            boolean r2 = r3.f27255e0     // Catch: org.json.JSONException -> L46
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "rawUserInfo"
            java.lang.String r2 = r3.f27256f0     // Catch: org.json.JSONException -> L46
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L46
            return r0
        L46:
            r0 = move-exception
            java.lang.String r1 = "DefaultAuthUserInfo"
            java.lang.String r2 = "Failed to jsonify this object"
            android.util.Log.d(r1, r2)
            h7.g8 r1 = new h7.g8
            r1.<init>(r0)
            throw r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            java.lang.String r1 = r4.f27249Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r4.f27250Z
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r4.f27251a0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            java.lang.String r0 = r4.f27252b0
            r1 = 4
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            r0 = 5
            java.lang.String r3 = r4.f27253c0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 6
            java.lang.String r3 = r4.f27254d0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 7
            boolean r3 = r4.f27255e0
            p270p6.C5369c.m11724l(r5, r0, r1)
            r5.writeInt(r3)
            r0 = 8
            java.lang.String r1 = r4.f27256f0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
