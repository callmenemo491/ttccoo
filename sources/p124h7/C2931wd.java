package p124h7;

/* renamed from: h7.wd */
/* loaded from: classes.dex */
public final class C2931wd extends p270p6.AbstractC5367a implements p124h7.InterfaceC2553bd<p124h7.C2931wd> {
    public static final android.os.Parcelable.Creator<p124h7.C2931wd> CREATOR = null;

    /* renamed from: e0 */
    public static final java.lang.String f12002e0 = null;

    /* renamed from: Y */
    public java.lang.String f12003Y;

    /* renamed from: Z */
    public boolean f12004Z;

    /* renamed from: a0 */
    public java.lang.String f12005a0;

    /* renamed from: b0 */
    public boolean f12006b0;

    /* renamed from: c0 */
    public p124h7.C2645gf f12007c0;

    /* renamed from: d0 */
    public java.util.List<java.lang.String> f12008d0;

    static {
            java.lang.Class<h7.wd> r0 = p124h7.C2931wd.class
            java.lang.String r0 = r0.getSimpleName()
            p124h7.C2931wd.f12002e0 = r0
            h7.xd r0 = new h7.xd
            r0.<init>()
            p124h7.C2931wd.CREATOR = r0
            return
    }

    public C2931wd() {
            r2 = this;
            r2.<init>()
            h7.gf r0 = new h7.gf
            r1 = 0
            r0.<init>(r1)
            r2.f12007c0 = r0
            return
    }

    public C2931wd(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p124h7.C2645gf r5, java.util.List<java.lang.String> r6) {
            r0 = this;
            r0.<init>()
            r0.f12003Y = r1
            r0.f12004Z = r2
            r0.f12005a0 = r3
            r0.f12006b0 = r4
            if (r5 != 0) goto L14
            h7.gf r1 = new h7.gf
            r2 = 0
            r1.<init>(r2)
            goto L1c
        L14:
            java.util.List<java.lang.String> r1 = r5.f11558Z
            h7.gf r2 = new h7.gf
            r2.<init>(r1)
            r1 = r2
        L1c:
            r0.f12007c0 = r1
            r0.f12008d0 = r6
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "allProviders"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r1.<init>(r6)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            java.lang.String r2 = "authUri"
            r3 = 0
            java.lang.String r2 = r1.optString(r2, r3)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r5.f12003Y = r2     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            java.lang.String r2 = "registered"
            r4 = 0
            boolean r2 = r1.optBoolean(r2, r4)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r5.f12004Z = r2     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            java.lang.String r2 = "providerId"
            java.lang.String r2 = r1.optString(r2, r3)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r5.f12005a0 = r2     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            java.lang.String r2 = "forExistingProvider"
            boolean r2 = r1.optBoolean(r2, r4)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r5.f12006b0 = r2     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            boolean r2 = r1.has(r0)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            if (r2 != 0) goto L37
            h7.gf r0 = new h7.gf     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r0.<init>(r3)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r5.f12007c0 = r0     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            goto L47
        L37:
            h7.gf r2 = new h7.gf     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r3 = 1
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            java.util.List r0 = p036c6.C0906q0.m2620h(r0)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r2.<init>(r3, r0)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r5.f12007c0 = r2     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
        L47:
            java.lang.String r0 = "signinMethods"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            java.util.List r0 = p036c6.C0906q0.m2620h(r0)     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            r5.f12008d0 = r0     // Catch: java.lang.NullPointerException -> L54 org.json.JSONException -> L56
            return r5
        L54:
            r0 = move-exception
            goto L57
        L56:
            r0 = move-exception
        L57:
            java.lang.String r1 = p124h7.C2931wd.f12002e0
            h7.kb r6 = p036c6.C0906q0.m2613a(r0, r1, r6)
            throw r6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 2
            java.lang.String r2 = r5.f12003Y
            r3 = 0
            p270p6.C5369c.m11719g(r6, r1, r2, r3)
            r1 = 3
            boolean r2 = r5.f12004Z
            r4 = 4
            p270p6.C5369c.m11724l(r6, r1, r4)
            r6.writeInt(r2)
            java.lang.String r1 = r5.f12005a0
            p270p6.C5369c.m11719g(r6, r4, r1, r3)
            r1 = 5
            boolean r2 = r5.f12006b0
            p270p6.C5369c.m11724l(r6, r1, r4)
            r6.writeInt(r2)
            r1 = 6
            h7.gf r2 = r5.f12007c0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r7 = 7
            java.util.List<java.lang.String> r1 = r5.f12008d0
            p270p6.C5369c.m11720h(r6, r7, r1, r3)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
