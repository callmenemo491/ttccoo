package p124h7;

/* renamed from: h7.bb */
/* loaded from: classes.dex */
public final class C2551bb implements p124h7.InterfaceC2697jd<p124h7.C2608ee> {

    /* renamed from: Y */
    public java.lang.Object f11400Y;

    /* renamed from: Z */
    public java.lang.Object f11401Z;

    /* renamed from: a0 */
    public java.lang.Object f11402a0;

    /* renamed from: b0 */
    public java.lang.Object f11403b0;

    /* renamed from: c0 */
    public java.lang.Object f11404c0;

    public C2551bb() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2551bb(p083f.C1933t r1, p124h7.InterfaceC2697jd r2, p124h7.C2624fc r3, p124h7.C2752me r4, p124h7.C2536af r5) {
            r0 = this;
            r0.f11404c0 = r1
            r0.f11400Y = r2
            r0.f11401Z = r3
            r0.f11402a0 = r4
            r0.f11403b0 = r5
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static p124h7.C2551bb m6511a(java.lang.String r5) {
            h7.bb r0 = new h7.bb     // Catch: org.json.JSONException -> L40
            r0.<init>()     // Catch: org.json.JSONException -> L40
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r1.<init>(r5)     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = "iss"
            java.lang.String r5 = r1.optString(r5)     // Catch: org.json.JSONException -> L40
            r0.f11400Y = r5     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = "aud"
            java.lang.String r5 = r1.optString(r5)     // Catch: org.json.JSONException -> L40
            r0.f11401Z = r5     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = "sub"
            java.lang.String r5 = r1.optString(r5)     // Catch: org.json.JSONException -> L40
            r0.f11402a0 = r5     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = "iat"
            long r2 = r1.optLong(r5)     // Catch: org.json.JSONException -> L40
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L40
            r0.f11403b0 = r5     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = "exp"
            long r2 = r1.optLong(r5)     // Catch: org.json.JSONException -> L40
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L40
            r0.f11404c0 = r5     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = "is_anonymous"
            r1.optBoolean(r5)     // Catch: org.json.JSONException -> L40
            return r0
        L40:
            r5 = move-exception
            r0 = 3
            java.lang.String r1 = "JwtToken"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            java.lang.String r2 = "Failed to read JwtToken from JSONObject. "
            if (r0 != 0) goto L4d
            goto L69
        L4d:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r3 = r0.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 41
            r4.<init>(r3)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.d(r1, r0)
        L69:
            java.io.UnsupportedEncodingException r0 = new java.io.UnsupportedEncodingException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r1 = r5.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 41
            r3.<init>(r1)
            java.lang.String r5 = p346u.C6269n.m12888a(r3, r2, r5)
            r0.<init>(r5)
            throw r0
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public void mo28b(p124h7.C2608ee r8) {
            r7 = this;
            h7.ee r8 = (p124h7.C2608ee) r8
            h7.ie r8 = r8.f11490Y
            java.util.List<h7.ge> r8 = r8.f11641Y
            if (r8 == 0) goto L34
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto Lf
            goto L34
        Lf:
            java.lang.Object r0 = r7.f11404c0
            r1 = r0
            f.t r1 = (p083f.C1933t) r1
            java.lang.Object r0 = r7.f11401Z
            r2 = r0
            h7.fc r2 = (p124h7.C2624fc) r2
            java.lang.Object r0 = r7.f11402a0
            r3 = r0
            h7.me r3 = (p124h7.C2752me) r3
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            r4 = r8
            h7.ge r4 = (p124h7.C2644ge) r4
            java.lang.Object r8 = r7.f11403b0
            r5 = r8
            h7.af r5 = (p124h7.C2536af) r5
            java.lang.Object r8 = r7.f11400Y
            r6 = r8
            h7.jd r6 = (p124h7.InterfaceC2697jd) r6
            p083f.C1933t.m4779H(r1, r2, r3, r4, r5, r6)
            return
        L34:
            java.lang.Object r8 = r7.f11400Y
            h7.jd r8 = (p124h7.InterfaceC2697jd) r8
            java.lang.String r0 = "No users"
            r8.mo29e(r0)
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public void mo29e(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f11400Y
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
    }
}
