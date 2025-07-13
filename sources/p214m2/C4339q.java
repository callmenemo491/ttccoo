package p214m2;

/* renamed from: m2.q */
/* loaded from: classes.dex */
public class C4339q implements p180k2.InterfaceC3675g, p445z2.InterfaceC7233g, p072e7.InterfaceC1589d6, p188ka.InterfaceC4077d, ec.InterfaceC1814b {

    /* renamed from: Y */
    public static p214m2.C4339q f17791Y;

    public C4339q(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static boolean m9701a(java.lang.Double r2, double r3) {
            if (r2 == 0) goto Lc
            double r0 = r2.doubleValue()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: c */
    public static boolean m9702c(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    /* renamed from: h */
    public static void m9703h(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = " must not be null"
            java.lang.String r2 = p064e.C1493g.m4049a(r2, r0)
            r1.<init>(r2)
            java.lang.Class<m2.q> r2 = p214m2.C4339q.class
            java.lang.String r2 = r2.getName()
            m9710t(r1, r2)
            throw r1
    }

    /* renamed from: i */
    public static void m9704i(java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>()
            java.lang.Class<m2.q> r0 = p214m2.C4339q.class
            java.lang.String r0 = r0.getName()
            m9710t(r1, r0)
            throw r1
    }

    /* renamed from: j */
    public static void m9705j(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = " must not be null"
            java.lang.String r2 = p064e.C1493g.m4049a(r2, r0)
            r1.<init>(r2)
            java.lang.Class<m2.q> r2 = p214m2.C4339q.class
            java.lang.String r2 = r2.getName()
            m9710t(r1, r2)
            throw r1
    }

    /* renamed from: k */
    public static void m9706k(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = m9709n(r1)
            r0.<init>(r1)
            java.lang.Class<m2.q> r1 = p214m2.C4339q.class
            java.lang.String r1 = r1.getName()
            m9710t(r0, r1)
            throw r0
    }

    /* renamed from: l */
    public static void m9707l(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = m9709n(r1)
            r0.<init>(r1)
            java.lang.Class<m2.q> r1 = p214m2.C4339q.class
            java.lang.String r1 = r1.getName()
            m9710t(r0, r1)
            throw r0
    }

    /* renamed from: m */
    public static int m9708m(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            goto L9
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    /* renamed from: n */
    public static java.lang.String m9709n(java.lang.String r4) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parameter specified as non-null is null: method "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", parameter "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    /* renamed from: t */
    public static <T extends java.lang.Throwable> T m9710t(T r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return r5
    }

    /* renamed from: u */
    public static java.lang.String m9711u(java.lang.String r0, java.lang.Object r1) {
            java.lang.String r0 = p214m2.C4338p.m9700a(r0, r1)
            return r0
    }

    /* renamed from: v */
    public static void m9712v() {
            ch.b r0 = new ch.b
            r0.<init>()
            java.lang.Class<m2.q> r1 = p214m2.C4339q.class
            java.lang.String r1 = r1.getName()
            m9710t(r0, r1)
            throw r0
    }

    /* renamed from: w */
    public static void m9713w(java.lang.String r2) {
            java.lang.String r0 = "lateinit property "
            java.lang.String r1 = " has not been initialized"
            java.lang.String r2 = android.support.v4.media.C0145d.m257a(r0, r2, r1)
            ch.k r0 = new ch.k
            r0.<init>(r2)
            java.lang.Class<m2.q> r2 = p214m2.C4339q.class
            java.lang.String r2 = r2.getName()
            m9710t(r0, r2)
            throw r0
    }

    /* renamed from: x */
    public static void m9714x(ec.C1815c r6, java.lang.StringBuilder r7) {
            r0 = 0
            char r1 = r7.charAt(r0)
            r2 = 1
            char r3 = r7.charAt(r2)
            r4 = 2
            char r5 = r7.charAt(r4)
            int r1 = r1 * 1600
            int r3 = r3 * 40
            int r3 = r3 + r1
            int r3 = r3 + r5
            int r3 = r3 + r2
            int r1 = r3 / 256
            char r1 = (char) r1
            int r3 = r3 % 256
            char r3 = (char) r3
            java.lang.String r5 = new java.lang.String
            char[] r4 = new char[r4]
            r4[r0] = r1
            r4[r2] = r3
            r5.<init>(r4)
            java.lang.StringBuilder r6 = r6.f7928e
            r6.append(r5)
            r6 = 3
            r7.delete(r0, r6)
            return
    }

    @Override // p188ka.InterfaceC4077d
    /* renamed from: b */
    public la.C4236d mo9173b(p214m2.C4339q r22, org.json.JSONObject r23) {
            r21 = this;
            r0 = r23
            java.lang.String r1 = "settings_version"
            r2 = 0
            int r9 = r0.optInt(r1, r2)
            java.lang.String r1 = "cache_duration"
            r3 = 3600(0xe10, float:5.045E-42)
            int r10 = r0.optInt(r1, r3)
            java.lang.String r1 = "fabric"
            org.json.JSONObject r1 = r0.getJSONObject(r1)
            java.lang.String r3 = "app"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            java.lang.String r4 = "status"
            java.lang.String r12 = r3.getString(r4)
            java.lang.String r4 = "new"
            boolean r4 = r4.equals(r12)
            java.lang.String r5 = "bundle_id"
            java.lang.String r16 = r1.getString(r5)
            java.lang.String r5 = "org_id"
            java.lang.String r17 = r1.getString(r5)
            r1 = 1
            if (r4 == 0) goto L3b
            java.lang.String r4 = "https://update.crashlytics.com/spi/v1/platforms/android/apps"
            goto L47
        L3b:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r16
            java.lang.String r6 = "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s"
            java.lang.String r4 = java.lang.String.format(r4, r6, r5)
        L47:
            r13 = r4
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r16
            java.lang.String r6 = "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports"
            java.lang.String r14 = java.lang.String.format(r4, r6, r5)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r16
            java.lang.String r6 = "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps"
            java.lang.String r15 = java.lang.String.format(r4, r6, r5)
            java.lang.String r4 = "update_required"
            boolean r18 = r3.optBoolean(r4, r2)
            java.lang.String r4 = "report_upload_variant"
            int r19 = r3.optInt(r4, r2)
            java.lang.String r4 = "native_report_upload_variant"
            int r20 = r3.optInt(r4, r2)
            la.a r6 = new la.a
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            n0.k r7 = new n0.k
            r3 = 8
            r4 = 4
            r7.<init>(r3, r4)
            java.lang.String r3 = "features"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            java.lang.String r4 = "collect_reports"
            boolean r1 = r3.optBoolean(r4, r1)
            java.lang.String r4 = "collect_anrs"
            boolean r2 = r3.optBoolean(r4, r2)
            la.b r8 = new la.b
            r8.<init>(r1, r2)
            long r1 = (long) r10
            java.lang.String r3 = "expires_at"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto La4
            long r0 = r0.optLong(r3)
            r4 = r0
            goto Lb1
        La4:
            java.util.Objects.requireNonNull(r22)
            long r3 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r11
            long r1 = r1 + r3
            r4 = r1
        Lb1:
            la.d r0 = new la.d
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // p180k2.InterfaceC3669a
    /* renamed from: d */
    public boolean mo814d(java.lang.Object r1, java.io.File r2, p180k2.C3673e r3) {
            r0 = this;
            m2.w r1 = (p214m2.InterfaceC4345w) r1
            java.lang.Object r1 = r1.get()
            x2.c r1 = (p404x2.C6914c) r1
            x2.c$a r1 = r1.f26903Y     // Catch: java.io.IOException -> L1b
            x2.e r1 = r1.f26913a     // Catch: java.io.IOException -> L1b
            j2.a r1 = r1.f26915a     // Catch: java.io.IOException -> L1b
            java.nio.ByteBuffer r1 = r1.getData()     // Catch: java.io.IOException -> L1b
            java.nio.ByteBuffer r1 = r1.asReadOnlyBuffer()     // Catch: java.io.IOException -> L1b
            p106g3.C2229a.m5828b(r1, r2)     // Catch: java.io.IOException -> L1b
            r1 = 1
            goto L2b
        L1b:
            r1 = move-exception
            r2 = 5
            java.lang.String r3 = "GifEncoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L2a
            java.lang.String r2 = "Failed to encode GIF drawable data"
            android.util.Log.w(r3, r2, r1)
        L2a:
            r1 = 0
        L2b:
            return r1
    }

    /* renamed from: e */
    public int m9715e(ec.C1815c r2, java.lang.StringBuilder r3, java.lang.StringBuilder r4, int r5) {
            r1 = this;
            int r0 = r3.length()
            int r5 = r0 - r5
            r3.delete(r5, r0)
            int r3 = r2.f7929f
            int r3 = r3 + (-1)
            r2.f7929f = r3
            char r3 = r2.m4571b()
            int r3 = r1.mo4584o(r3, r4)
            r4 = 0
            r2.f7931h = r4
            return r3
    }

    /* renamed from: f */
    public void mo4569f(ec.C1815c r9) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r9.m4573d()
            if (r1 == 0) goto L74
            char r1 = r9.m4571b()
            int r2 = r9.f7929f
            r3 = 1
            int r2 = r2 + r3
            r9.f7929f = r2
            int r1 = r8.mo4584o(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.m4570a()
            int r5 = r5 + r2
            r9.m4575f(r5)
            ec.e r2 = r9.f7931h
            int r2 = r2.f7939b
            int r2 = r2 - r5
            boolean r5 = r9.m4573d()
            if (r5 != 0) goto L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L46
            if (r2 < r7) goto L44
            if (r2 <= r7) goto L46
        L44:
            r6 = r8
            goto L54
        L46:
            r6 = r8
        L47:
            int r7 = r0.length()
            int r7 = r7 % r4
            if (r7 != r3) goto L75
            if (r1 > r4) goto L52
            if (r2 != r3) goto L54
        L52:
            if (r1 <= r4) goto L75
        L54:
            int r1 = r6.m9715e(r9, r0, r5, r1)
            goto L47
        L59:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L5
            java.lang.String r1 = r9.f7924a
            int r2 = r9.f7929f
            int r3 = r8.mo4585p()
            int r1 = p185k7.C3828h5.m8572A(r1, r2, r3)
            int r2 = r8.mo4585p()
            if (r1 == r2) goto L5
            r9.f7930g = r1
        L74:
            r6 = r8
        L75:
            r6.mo4586q(r9, r0)
            return
    }

    @Override // p445z2.InterfaceC7233g
    /* renamed from: g */
    public void mo9716g(android.app.Activity r1) {
            r0 = this;
            return
    }

    /* renamed from: o */
    public int mo4584o(char r5, java.lang.StringBuilder r6) {
            r4 = this;
            r0 = 1
            r1 = 32
            if (r5 != r1) goto La
            r5 = 3
        L6:
            r6.append(r5)
            return r0
        La:
            r1 = 48
            if (r5 < r1) goto L17
            r2 = 57
            if (r5 > r2) goto L17
            int r5 = r5 - r1
            int r5 = r5 + 4
        L15:
            char r5 = (char) r5
            goto L6
        L17:
            r1 = 65
            if (r5 < r1) goto L23
            r2 = 90
            if (r5 > r2) goto L23
            int r5 = r5 - r1
            int r5 = r5 + 14
            goto L15
        L23:
            r1 = 2
            if (r5 < 0) goto L32
            r2 = 31
            if (r5 > r2) goto L32
            r0 = 0
            r6.append(r0)
        L2e:
            r6.append(r5)
            return r1
        L32:
            r2 = 33
            if (r5 < r2) goto L40
            r3 = 47
            if (r5 > r3) goto L40
            r6.append(r0)
            int r5 = r5 - r2
        L3e:
            char r5 = (char) r5
            goto L2e
        L40:
            r2 = 58
            if (r5 < r2) goto L4f
            r3 = 64
            if (r5 > r3) goto L4f
            r6.append(r0)
            int r5 = r5 - r2
            int r5 = r5 + 15
            goto L3e
        L4f:
            r2 = 91
            if (r5 < r2) goto L5e
            r3 = 95
            if (r5 > r3) goto L5e
            r6.append(r0)
            int r5 = r5 - r2
            int r5 = r5 + 22
            goto L3e
        L5e:
            r0 = 96
            if (r5 < r0) goto L6b
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 > r2) goto L6b
            r6.append(r1)
            int r5 = r5 - r0
            goto L3e
        L6b:
            r0 = 128(0x80, float:1.8E-43)
            if (r5 < r0) goto L7c
            java.lang.String r2 = "\u0001\u001e"
            r6.append(r2)
            int r5 = r5 - r0
            char r5 = (char) r5
            int r5 = r4.mo4584o(r5, r6)
            int r5 = r5 + r1
            return r5
        L7c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal character: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }

    /* renamed from: p */
    public int mo4585p() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: q */
    public void mo4586q(ec.C1815c r8, java.lang.StringBuilder r9) {
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.m4570a()
            int r4 = r4 + r0
            r8.m4575f(r4)
            ec.e r0 = r8.f7931h
            int r0 = r0.f7939b
            int r0 = r0 - r4
            r4 = 2
            r5 = 0
            r6 = 254(0xfe, float:3.56E-43)
            if (r3 != r4) goto L34
            r9.append(r5)
        L23:
            int r0 = r9.length()
            if (r0 < r1) goto L2d
            m9714x(r8, r9)
            goto L23
        L2d:
            boolean r9 = r8.m4573d()
            if (r9 == 0) goto L6c
            goto L67
        L34:
            if (r0 != r2) goto L53
            if (r3 != r2) goto L53
        L38:
            int r0 = r9.length()
            if (r0 < r1) goto L42
            m9714x(r8, r9)
            goto L38
        L42:
            boolean r9 = r8.m4573d()
            if (r9 == 0) goto L4d
            java.lang.StringBuilder r9 = r8.f7928e
            r9.append(r6)
        L4d:
            int r9 = r8.f7929f
            int r9 = r9 - r2
            r8.f7929f = r9
            goto L6c
        L53:
            if (r3 != 0) goto L6f
        L55:
            int r2 = r9.length()
            if (r2 < r1) goto L5f
            m9714x(r8, r9)
            goto L55
        L5f:
            if (r0 > 0) goto L67
            boolean r9 = r8.m4573d()
            if (r9 == 0) goto L6c
        L67:
            java.lang.StringBuilder r9 = r8.f7928e
            r9.append(r6)
        L6c:
            r8.f7930g = r5
            return
        L6f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
    }

    /* renamed from: r */
    public byte[] m9717r(java.math.BigInteger r4, int r5) {
            r3 = this;
            byte[] r4 = r4.toByteArray()
            int r0 = r4.length
            r1 = 0
            if (r5 >= r0) goto L10
            byte[] r0 = new byte[r5]
            int r2 = r4.length
            int r2 = r2 - r5
            java.lang.System.arraycopy(r4, r2, r0, r1, r5)
            return r0
        L10:
            int r0 = r4.length
            if (r5 <= r0) goto L1c
            byte[] r0 = new byte[r5]
            int r2 = r4.length
            int r5 = r5 - r2
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r5, r2)
            return r0
        L1c:
            return r4
    }

    @Override // p180k2.InterfaceC3675g
    /* renamed from: s */
    public com.bumptech.glide.load.EnumC1010c mo827s(p180k2.C3673e r1) {
            r0 = this;
            com.bumptech.glide.load.c r1 = com.bumptech.glide.load.EnumC1010c.f5189Y
            return r1
    }
}
