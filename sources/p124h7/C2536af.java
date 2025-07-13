package p124h7;

/* renamed from: h7.af */
/* loaded from: classes.dex */
public final class C2536af implements p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public java.lang.String f11380Y;

    /* renamed from: Z */
    public java.lang.String f11381Z;

    /* renamed from: a0 */
    public java.lang.String f11382a0;

    /* renamed from: b0 */
    public java.lang.String f11383b0;

    /* renamed from: c0 */
    public java.lang.String f11384c0;

    /* renamed from: d0 */
    public java.lang.String f11385d0;

    /* renamed from: e0 */
    public final p124h7.C2645gf f11386e0;

    /* renamed from: f0 */
    public final p124h7.C2645gf f11387f0;

    /* renamed from: g0 */
    public java.lang.String f11388g0;

    public C2536af() {
            r2 = this;
            r2.<init>()
            h7.gf r0 = new h7.gf
            r1 = 0
            r0.<init>(r1)
            r2.f11386e0 = r0
            h7.gf r0 = new h7.gf
            r0.<init>(r1)
            r2.f11387f0 = r0
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public final java.lang.String mo27a() {
            r11 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "returnSecureToken"
            r2 = 1
            r0.put(r1, r2)
            h7.gf r1 = r11.f11387f0
            java.util.List<java.lang.String> r1 = r1.f11558Z
            boolean r1 = r1.isEmpty()
            r3 = 0
            if (r1 != 0) goto L35
            h7.gf r1 = r11.f11387f0
            java.util.List<java.lang.String> r1 = r1.f11558Z
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = 0
        L20:
            int r6 = r1.size()
            if (r5 >= r6) goto L30
            java.lang.Object r6 = r1.get(r5)
            r4.put(r6)
            int r5 = r5 + 1
            goto L20
        L30:
            java.lang.String r1 = "deleteProvider"
            r0.put(r1, r4)
        L35:
            h7.gf r1 = r11.f11386e0
            java.util.List<java.lang.String> r1 = r1.f11558Z
            int r4 = r1.size()
            int[] r5 = new int[r4]
            r6 = 0
        L40:
            int r7 = r1.size()
            if (r6 >= r7) goto L93
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -333046776: goto L74;
                case 66081660: goto L6a;
                case 1939891618: goto L60;
                case 1999612571: goto L56;
                default: goto L55;
            }
        L55:
            goto L7e
        L56:
            java.lang.String r8 = "PASSWORD"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7e
            r7 = 2
            goto L7f
        L60:
            java.lang.String r8 = "PHOTO_URL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7e
            r7 = 3
            goto L7f
        L6a:
            java.lang.String r8 = "EMAIL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7e
            r7 = 0
            goto L7f
        L74:
            java.lang.String r8 = "DISPLAY_NAME"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7e
            r7 = 1
            goto L7f
        L7e:
            r7 = -1
        L7f:
            if (r7 == 0) goto L8d
            if (r7 == r2) goto L8e
            if (r7 == r10) goto L8b
            if (r7 == r9) goto L89
            r10 = 0
            goto L8e
        L89:
            r10 = 4
            goto L8e
        L8b:
            r10 = 5
            goto L8e
        L8d:
            r10 = 1
        L8e:
            r5[r6] = r10
            int r6 = r6 + 1
            goto L40
        L93:
            if (r4 <= 0) goto La9
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L9a:
            if (r3 >= r4) goto La4
            r2 = r5[r3]
            r1.put(r2)
            int r3 = r3 + 1
            goto L9a
        La4:
            java.lang.String r2 = "deleteAttribute"
            r0.put(r2, r1)
        La9:
            java.lang.String r1 = r11.f11380Y
            if (r1 == 0) goto Lb2
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        Lb2:
            java.lang.String r1 = r11.f11382a0
            if (r1 == 0) goto Lbb
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        Lbb:
            java.lang.String r1 = r11.f11383b0
            if (r1 == 0) goto Lc4
            java.lang.String r2 = "password"
            r0.put(r2, r1)
        Lc4:
            java.lang.String r1 = r11.f11381Z
            if (r1 == 0) goto Lcd
            java.lang.String r2 = "displayName"
            r0.put(r2, r1)
        Lcd:
            java.lang.String r1 = r11.f11385d0
            if (r1 == 0) goto Ld6
            java.lang.String r2 = "photoUrl"
            r0.put(r2, r1)
        Ld6:
            java.lang.String r1 = r11.f11384c0
            if (r1 == 0) goto Ldf
            java.lang.String r2 = "oobCode"
            r0.put(r2, r1)
        Ldf:
            java.lang.String r1 = r11.f11388g0
            if (r1 == 0) goto Le8
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        Le8:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: b */
    public final p124h7.C2536af m6468b(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto Lc
            h7.gf r2 = r1.f11386e0
            java.util.List<java.lang.String> r2 = r2.f11558Z
            java.lang.String r0 = "EMAIL"
            r2.add(r0)
            goto Le
        Lc:
            r1.f11382a0 = r2
        Le:
            return r1
    }

    /* renamed from: c */
    public final p124h7.C2536af m6469c(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto Lc
            h7.gf r2 = r1.f11386e0
            java.util.List<java.lang.String> r2 = r2.f11558Z
            java.lang.String r0 = "PASSWORD"
            r2.add(r0)
            goto Le
        Lc:
            r1.f11383b0 = r2
        Le:
            return r1
    }

    /* renamed from: d */
    public final boolean m6470d(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            h7.gf r0 = r1.f11386e0
            java.util.List<java.lang.String> r0 = r0.f11558Z
            boolean r2 = r0.contains(r2)
            return r2
    }
}
