package p124h7;

/* renamed from: h7.lf */
/* loaded from: classes.dex */
public final class C2735lf extends p270p6.AbstractC5367a implements p124h7.InterfaceC2553bd<p124h7.C2735lf> {
    public static final android.os.Parcelable.Creator<p124h7.C2735lf> CREATOR = null;

    /* renamed from: c0 */
    public static final java.lang.String f11750c0 = null;

    /* renamed from: Y */
    public java.lang.String f11751Y;

    /* renamed from: Z */
    public java.lang.String f11752Z;

    /* renamed from: a0 */
    public long f11753a0;

    /* renamed from: b0 */
    public boolean f11754b0;

    static {
            java.lang.Class<h7.lf> r0 = p124h7.C2735lf.class
            java.lang.String r0 = r0.getSimpleName()
            p124h7.C2735lf.f11750c0 = r0
            h7.mf r0 = new h7.mf
            r0.<init>()
            p124h7.C2735lf.CREATOR = r0
            return
    }

    public C2735lf() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2735lf(java.lang.String r1, java.lang.String r2, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f11751Y = r1
            r0.f11752Z = r2
            r0.f11753a0 = r3
            r0.f11754b0 = r5
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            r0.<init>(r5)     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            java.lang.String r1 = "idToken"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            r4.f11751Y = r1     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            r4.f11752Z = r1     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            java.lang.String r1 = "expiresIn"
            r2 = 0
            long r1 = r0.optLong(r1, r2)     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            r4.f11753a0 = r1     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            java.lang.String r1 = "isNewUser"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            r4.f11754b0 = r0     // Catch: java.lang.NullPointerException -> L32 org.json.JSONException -> L34
            return r4
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            java.lang.String r1 = p124h7.C2735lf.f11750c0
            h7.kb r5 = p036c6.C0906q0.m2613a(r0, r1, r5)
            throw r5
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 2
            java.lang.String r1 = r4.f11751Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r4.f11752Z
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            long r0 = r4.f11753a0
            r2 = 8
            r3 = 4
            p270p6.C5369c.m11724l(r5, r3, r2)
            r5.writeLong(r0)
            r0 = 5
            boolean r1 = r4.f11754b0
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeInt(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
