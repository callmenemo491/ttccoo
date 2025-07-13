package p052d6;

/* renamed from: d6.h0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1310h0 {
    /* renamed from: a */
    public static int m3799a(int r5, int r6, java.lang.String r7) {
            if (r5 < 0) goto L6
            if (r5 < r6) goto L5
            goto L6
        L5:
            return r5
        L6:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 < 0) goto L37
            if (r6 >= 0) goto L1f
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r7 = 26
            java.lang.String r0 = "negative size: "
            java.lang.String r6 = p064e.C1490d.m4039a(r7, r0, r6)
            r5.<init>(r6)
            throw r5
        L1f:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4[r3] = r5
            java.lang.String r5 = "%s (%s) must be less than size (%s)"
            java.lang.String r5 = p036c6.C0906q0.m2618f(r5, r4)
            goto L47
        L37:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r1] = r5
            java.lang.String r5 = "%s (%s) must not be negative"
            java.lang.String r5 = p036c6.C0906q0.m2618f(r5, r6)
        L47:
            r7.<init>(r5)
            throw r7
    }

    /* renamed from: b */
    public static long m3800b(java.lang.String r4) {
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            h7.v8 r0 = new h7.v8
            r0.<init>()
            h7.hd r1 = new h7.hd
            h7.rb r2 = new h7.rb
            r2.<init>(r0)
            r1.<init>(r2)
            java.util.List r0 = r1.m6809i(r4)
            int r1 = r0.size()
            r2 = 2
            if (r1 >= r2) goto L35
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Invalid idToken "
            int r2 = r4.length()
            if (r2 == 0) goto L2c
            java.lang.String r4 = r1.concat(r4)
            goto L31
        L2c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L31:
            r0.<init>(r4)
            throw r0
        L35:
            r4 = 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L63
            if (r4 != 0) goto L42
            r4 = 0
            goto L48
        L42:
            r1 = 11
            byte[] r4 = android.util.Base64.decode(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L63
        L48:
            java.lang.String r1 = "UTF-8"
            r0.<init>(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L63
            h7.bb r4 = p124h7.C2551bb.m6511a(r0)     // Catch: java.io.UnsupportedEncodingException -> L63
            java.lang.Object r0 = r4.f11404c0
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            java.lang.Object r4 = r4.f11403b0
            java.lang.Long r4 = (java.lang.Long) r4
            long r2 = r4.longValue()
            long r0 = r0 - r2
            return r0
        L63:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unable to decode token"
            r0.<init>(r1, r4)
            throw r0
    }

    /* renamed from: c */
    public static java.lang.String m3801c() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            m3804f(r1, r0)
            java.util.Locale r2 = java.util.Locale.US
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L22
            int r0 = r1.length()
            if (r0 <= 0) goto L1f
            java.lang.String r0 = ", "
            r1.append(r0)
        L1f:
            m3804f(r1, r2)
        L22:
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* renamed from: d */
    public static java.lang.String m3802d(p072e7.AbstractC1638i5 r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.mo4195h()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.mo4195h()
            if (r1 >= r2) goto L70
            byte r2 = r5.mo4193a(r1)
            r3 = 34
            if (r2 == r3) goto L6a
            r3 = 39
            if (r2 == r3) goto L67
            r3 = 92
            if (r2 == r3) goto L64
            switch(r2) {
                case 7: goto L5e;
                case 8: goto L5b;
                case 9: goto L58;
                case 10: goto L55;
                case 11: goto L52;
                case 12: goto L4f;
                case 13: goto L4c;
                default: goto L23;
            }
        L23:
            r4 = 32
            if (r2 < r4) goto L2c
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L2c
            goto L47
        L2c:
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
        L47:
            char r2 = (char) r2
            r0.append(r2)
            goto L6d
        L4c:
            java.lang.String r2 = "\\r"
            goto L60
        L4f:
            java.lang.String r2 = "\\f"
            goto L60
        L52:
            java.lang.String r2 = "\\v"
            goto L60
        L55:
            java.lang.String r2 = "\\n"
            goto L60
        L58:
            java.lang.String r2 = "\\t"
            goto L60
        L5b:
            java.lang.String r2 = "\\b"
            goto L60
        L5e:
            java.lang.String r2 = "\\a"
        L60:
            r0.append(r2)
            goto L6d
        L64:
            java.lang.String r2 = "\\\\"
            goto L60
        L67:
            java.lang.String r2 = "\\'"
            goto L60
        L6a:
            java.lang.String r2 = "\\\""
            goto L60
        L6d:
            int r1 = r1 + 1
            goto La
        L70:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* renamed from: e */
    public static boolean m3803e(java.lang.Object r2, java.lang.Object r3) {
            r0 = 0
            r1 = 1
            if (r2 == r3) goto Le
            if (r2 == 0) goto Lf
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            r0 = 1
        Lf:
            return r0
    }

    /* renamed from: f */
    public static void m3804f(java.lang.StringBuilder r1, java.util.Locale r2) {
            java.lang.String r0 = r2.getLanguage()
            if (r0 == 0) goto L17
            r1.append(r0)
            java.lang.String r2 = r2.getCountry()
            if (r2 == 0) goto L17
            java.lang.String r0 = "-"
            r1.append(r0)
            r1.append(r2)
        L17:
            return
    }

    /* renamed from: g */
    public static void m3805g(int r2, int r3, int r4) {
            if (r2 < 0) goto L8
            if (r3 < r2) goto L8
            if (r3 <= r4) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r2 < 0) goto L32
            if (r2 > r4) goto L32
            if (r3 < 0) goto L2b
            if (r3 <= r4) goto L13
            goto L2b
        L13:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r3] = r2
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r2 = p036c6.C0906q0.m2618f(r2, r4)
            goto L38
        L2b:
            java.lang.String r2 = "end index"
            java.lang.String r2 = m3806h(r3, r4, r2)
            goto L38
        L32:
            java.lang.String r3 = "start index"
            java.lang.String r2 = m3806h(r2, r4, r3)
        L38:
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: h */
    public static java.lang.String m3806h(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = p036c6.C0906q0.m2618f(r4, r5)
            return r4
        L16:
            if (r5 < 0) goto L30
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3[r2] = r4
            java.lang.String r4 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r4 = p036c6.C0906q0.m2618f(r4, r3)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r6 = 26
            java.lang.String r0 = "negative size: "
            java.lang.String r5 = p064e.C1490d.m4039a(r6, r0, r5)
            r4.<init>(r5)
            throw r4
    }
}
