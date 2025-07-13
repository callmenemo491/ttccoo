package p164j6;

/* renamed from: j6.h */
/* loaded from: classes.dex */
public final class C3434h implements p124h7.InterfaceC2885u3 {

    /* renamed from: d0 */
    public static p164j6.C3434h f14890d0;

    /* renamed from: Y */
    public final /* synthetic */ int f14891Y;

    /* renamed from: Z */
    public final java.lang.Object f14892Z;

    /* renamed from: a0 */
    public final java.lang.Object f14893a0;

    /* renamed from: b0 */
    public java.lang.Object f14894b0;

    /* renamed from: c0 */
    public int f14895c0;

    public C3434h(android.content.Context r3, java.util.concurrent.ScheduledExecutorService r4) {
            r2 = this;
            r0 = 0
            r2.f14891Y = r0
            r2.<init>()
            j6.i r0 = new j6.i
            r1 = 0
            r0.<init>(r2, r1)
            r2.f14894b0 = r0
            r0 = 1
            r2.f14895c0 = r0
            r2.f14893a0 = r4
            android.content.Context r3 = r3.getApplicationContext()
            r2.f14892Z = r3
            return
    }

    public C3434h(java.lang.String r6, java.security.Key r7) {
            r5 = this;
            r0 = 1
            r5.f14891Y = r0
            r5.<init>()
            h7.a8 r1 = new h7.a8
            r1.<init>(r5)
            r5.f14892Z = r1
            r5.f14893a0 = r6
            r5.f14894b0 = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L8e
            int r7 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r7) {
                case -1823053428: goto L4d;
                case 392315023: goto L43;
                case 392315118: goto L39;
                case 392316170: goto L2f;
                case 392317873: goto L25;
                default: goto L24;
            }
        L24:
            goto L57
        L25:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L57
            r7 = 4
            goto L58
        L2f:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L57
            r7 = 3
            goto L58
        L39:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L57
            r7 = 2
            goto L58
        L43:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L57
            r7 = 1
            goto L58
        L4d:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L57
            r7 = 0
            goto L58
        L57:
            r7 = -1
        L58:
            if (r7 == 0) goto L86
            if (r7 == r0) goto L83
            if (r7 == r4) goto L80
            if (r7 == r3) goto L7d
            if (r7 == r2) goto L7a
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r6.length()
            if (r1 == 0) goto L71
            java.lang.String r6 = r0.concat(r6)
            goto L76
        L71:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L76:
            r7.<init>(r6)
            throw r7
        L7a:
            r6 = 64
            goto L88
        L7d:
            r6 = 48
            goto L88
        L80:
            r6 = 32
            goto L88
        L83:
            r6 = 28
            goto L88
        L86:
            r6 = 20
        L88:
            r5.f14895c0 = r6
            r1.get()
            return
        L8e:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
    }

    public C3434h(mc.C4529a r2, mc.C4531c r3) {
            r1 = this;
            r0 = 2
            r1.f14891Y = r0
            r1.<init>()
            r1.f14892Z = r2
            int r2 = r2.f18418b
            r1.f14895c0 = r2
            r1.f14894b0 = r3
            int r2 = r2 + r0
            hb.h[] r2 = new p128hb.C3003h[r2]
            r1.f14893a0 = r2
            return
    }

    /* renamed from: c */
    public static int m7888c(int r3, int r4, mc.C4529a r5) {
            boolean r0 = r5.m10434a()
            r1 = 0
            if (r0 != 0) goto L1d
            r0 = -1
            if (r3 == r0) goto L14
            int r0 = r5.f18420d
            int r2 = r3 % 3
            int r2 = r2 * 3
            if (r0 != r2) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1b
            r5.f18422f = r3
            r4 = 0
            goto L1d
        L1b:
            int r4 = r4 + 1
        L1d:
            return r4
    }

    /* renamed from: m */
    public static synchronized p164j6.C3434h m7889m(android.content.Context r4) {
            java.lang.Class<j6.h> r0 = p164j6.C3434h.class
            monitor-enter(r0)
            j6.h r1 = p164j6.C3434h.f14890d0     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1e
            j6.h r1 = new j6.h     // Catch: java.lang.Throwable -> L22
            v6.a r2 = new v6.a     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "MessengerIpcClient"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r3 = 1
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r2)     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r2)     // Catch: java.lang.Throwable -> L22
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L22
            p164j6.C3434h.f14890d0 = r1     // Catch: java.lang.Throwable -> L22
        L1e:
            j6.h r4 = p164j6.C3434h.f14890d0     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            return r4
        L22:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // p124h7.InterfaceC2885u3
    /* renamed from: a */
    public byte[] mo1269a(byte[] r2, int r3) {
            r1 = this;
            int r0 = r1.f14895c0
            if (r3 > r0) goto L24
            java.lang.Object r0 = r1.f14892Z
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            java.lang.Object r0 = r0.get()
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            r0.update(r2)
            java.lang.Object r2 = r1.f14892Z
            java.lang.ThreadLocal r2 = (java.lang.ThreadLocal) r2
            java.lang.Object r2 = r2.get()
            javax.crypto.Mac r2 = (javax.crypto.Mac) r2
            byte[] r2 = r2.doFinal()
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
        L24:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too big"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: b */
    public void m7890b(p128hb.C3003h r14) {
            r13 = this;
            if (r14 == 0) goto L92
            mc.e r14 = (mc.C4533e) r14
            java.lang.Object r0 = r13.f14892Z
            mc.a r0 = (mc.C4529a) r0
            java.util.Map<java.lang.String, java.lang.String> r1 = r14.f12119c
            mc.a[] r1 = (mc.C4529a[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = 0
        Lf:
            if (r4 >= r2) goto L1b
            r5 = r1[r4]
            if (r5 == 0) goto L18
            r5.m10435b()
        L18:
            int r4 = r4 + 1
            goto Lf
        L1b:
            r14.m10442B(r1, r0)
            wa.b<s9.a> r2 = r14.f12118b
            mc.c r2 = (mc.C4531c) r2
            boolean r4 = r14.f18437d
            if (r4 == 0) goto L29
            sb.q r5 = r2.f18425b
            goto L2b
        L29:
            sb.q r5 = r2.f18427d
        L2b:
            if (r4 == 0) goto L30
            sb.q r2 = r2.f18426c
            goto L32
        L30:
            sb.q r2 = r2.f18428e
        L32:
            float r4 = r5.f23223b
            int r4 = (int) r4
            int r4 = r14.m7391r(r4)
            float r2 = r2.f23223b
            int r2 = (int) r2
            int r14 = r14.m7391r(r2)
            r2 = -1
            r5 = 1
            r6 = 0
            r7 = 1
        L44:
            if (r4 >= r14) goto L92
            r8 = r1[r4]
            if (r8 == 0) goto L8f
            r8 = r1[r4]
            int r9 = r8.f18422f
            int r10 = r9 - r2
            if (r10 != 0) goto L55
            int r6 = r6 + 1
            goto L8f
        L55:
            if (r10 != r5) goto L5d
            int r2 = java.lang.Math.max(r7, r6)
            r7 = r2
            goto L89
        L5d:
            r11 = 0
            if (r10 < 0) goto L8d
            int r12 = r0.f18422f
            if (r9 >= r12) goto L8d
            if (r10 <= r4) goto L67
            goto L8d
        L67:
            r9 = 2
            if (r7 <= r9) goto L6e
            int r9 = r7 + (-2)
            int r10 = r10 * r9
        L6e:
            if (r10 < r4) goto L72
            r9 = 1
            goto L73
        L72:
            r9 = 0
        L73:
            r12 = 1
        L74:
            if (r12 > r10) goto L84
            if (r9 != 0) goto L84
            int r9 = r4 - r12
            r9 = r1[r9]
            if (r9 == 0) goto L80
            r9 = 1
            goto L81
        L80:
            r9 = 0
        L81:
            int r12 = r12 + 1
            goto L74
        L84:
            if (r9 == 0) goto L89
            r1[r4] = r11
            goto L8f
        L89:
            int r2 = r8.f18422f
            r6 = 1
            goto L8f
        L8d:
            r1[r4] = r11
        L8f:
            int r4 = r4 + 1
            goto L44
        L92:
            return
    }

    /* renamed from: d */
    public int m7891d() {
            r7 = this;
            int r0 = r7.m7893f()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 1
            r3 = 1
        La:
            int r4 = r7.f14895c0
            int r4 = r4 + r2
            if (r3 >= r4) goto L32
            java.lang.Object r4 = r7.f14893a0
            hb.h[] r4 = (p128hb.C3003h[]) r4
            r4 = r4[r3]
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f12119c
            mc.a[] r4 = (mc.C4529a[]) r4
            r5 = 0
        L1a:
            int r6 = r4.length
            if (r5 >= r6) goto L2f
            r6 = r4[r5]
            if (r6 == 0) goto L2c
            r6 = r4[r5]
            boolean r6 = r6.m10434a()
            if (r6 != 0) goto L2c
            r7.m7892e(r3, r5, r4)
        L2c:
            int r5 = r5 + 1
            goto L1a
        L2f:
            int r3 = r3 + 1
            goto La
        L32:
            return r0
    }

    /* renamed from: e */
    public void m7892e(int r11, int r12, mc.C4529a[] r13) {
            r10 = this;
            r0 = r13[r12]
            java.lang.Object r1 = r10.f14893a0
            hb.h[] r1 = (p128hb.C3003h[]) r1
            int r2 = r11 + (-1)
            r2 = r1[r2]
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f12119c
            mc.a[] r2 = (mc.C4529a[]) r2
            r3 = 1
            int r11 = r11 + r3
            r4 = r1[r11]
            if (r4 == 0) goto L1b
            r11 = r1[r11]
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.f12119c
            mc.a[] r11 = (mc.C4529a[]) r11
            goto L1c
        L1b:
            r11 = r2
        L1c:
            r1 = 14
            mc.a[] r4 = new mc.C4529a[r1]
            r5 = r2[r12]
            r6 = 2
            r4[r6] = r5
            r5 = 3
            r7 = r11[r12]
            r4[r5] = r7
            r5 = 0
            if (r12 <= 0) goto L3d
            int r7 = r12 + (-1)
            r8 = r13[r7]
            r4[r5] = r8
            r8 = 4
            r9 = r2[r7]
            r4[r8] = r9
            r8 = 5
            r7 = r11[r7]
            r4[r8] = r7
        L3d:
            if (r12 <= r3) goto L53
            r7 = 8
            int r8 = r12 + (-2)
            r9 = r13[r8]
            r4[r7] = r9
            r7 = 10
            r9 = r2[r8]
            r4[r7] = r9
            r7 = 11
            r8 = r11[r8]
            r4[r7] = r8
        L53:
            int r7 = r13.length
            int r7 = r7 - r3
            if (r12 >= r7) goto L67
            int r7 = r12 + 1
            r8 = r13[r7]
            r4[r3] = r8
            r8 = 6
            r9 = r2[r7]
            r4[r8] = r9
            r8 = 7
            r7 = r11[r7]
            r4[r8] = r7
        L67:
            int r7 = r13.length
            int r7 = r7 - r6
            if (r12 >= r7) goto L7e
            r7 = 9
            int r12 = r12 + r6
            r13 = r13[r12]
            r4[r7] = r13
            r13 = 12
            r2 = r2[r12]
            r4[r13] = r2
            r13 = 13
            r11 = r11[r12]
            r4[r13] = r11
        L7e:
            r11 = 0
        L7f:
            if (r11 >= r1) goto L9f
            r12 = r4[r11]
            if (r12 != 0) goto L86
            goto L98
        L86:
            boolean r13 = r12.m10434a()
            if (r13 == 0) goto L98
            int r13 = r12.f18420d
            int r2 = r0.f18420d
            if (r13 != r2) goto L98
            int r12 = r12.f18422f
            r0.f18422f = r12
            r12 = 1
            goto L99
        L98:
            r12 = 0
        L99:
            if (r12 == 0) goto L9c
            return
        L9c:
            int r11 = r11 + 1
            goto L7f
        L9f:
            return
    }

    /* renamed from: f */
    public int m7893f() {
            r2 = this;
            r2.m7894g()
            int r0 = r2.m7895h()
            int r1 = r2.m7896i()
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: g */
    public void m7894g() {
            r7 = this;
            java.lang.Object r0 = r7.f14893a0
            r1 = r0
            hb.h[] r1 = (p128hb.C3003h[]) r1
            r2 = 0
            r1 = r1[r2]
            if (r1 == 0) goto L70
            r1 = r0
            hb.h[] r1 = (p128hb.C3003h[]) r1
            int r3 = r7.f14895c0
            int r4 = r3 + 1
            r1 = r1[r4]
            if (r1 != 0) goto L16
            goto L70
        L16:
            r1 = r0
            hb.h[] r1 = (p128hb.C3003h[]) r1
            r1 = r1[r2]
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f12119c
            mc.a[] r1 = (mc.C4529a[]) r1
            hb.h[] r0 = (p128hb.C3003h[]) r0
            r4 = 1
            int r3 = r3 + r4
            r0 = r0[r3]
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f12119c
            mc.a[] r0 = (mc.C4529a[]) r0
        L29:
            int r3 = r1.length
            if (r2 >= r3) goto L70
            r3 = r1[r2]
            if (r3 == 0) goto L6d
            r3 = r0[r2]
            if (r3 == 0) goto L6d
            r3 = r1[r2]
            int r3 = r3.f18422f
            r5 = r0[r2]
            int r5 = r5.f18422f
            if (r3 != r5) goto L6d
            r3 = 1
        L3f:
            int r5 = r7.f14895c0
            if (r3 > r5) goto L6d
            java.lang.Object r5 = r7.f14893a0
            hb.h[] r5 = (p128hb.C3003h[]) r5
            r5 = r5[r3]
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f12119c
            mc.a[] r5 = (mc.C4529a[]) r5
            r5 = r5[r2]
            if (r5 == 0) goto L6a
            r6 = r1[r2]
            int r6 = r6.f18422f
            r5.f18422f = r6
            boolean r5 = r5.m10434a()
            if (r5 != 0) goto L6a
            java.lang.Object r5 = r7.f14893a0
            hb.h[] r5 = (p128hb.C3003h[]) r5
            r5 = r5[r3]
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f12119c
            mc.a[] r5 = (mc.C4529a[]) r5
            r6 = 0
            r5[r2] = r6
        L6a:
            int r3 = r3 + 1
            goto L3f
        L6d:
            int r2 = r2 + 1
            goto L29
        L70:
            return
    }

    /* renamed from: h */
    public int m7895h() {
            r9 = this;
            java.lang.Object r0 = r9.f14893a0
            r1 = r0
            hb.h[] r1 = (p128hb.C3003h[]) r1
            r2 = 0
            r1 = r1[r2]
            if (r1 != 0) goto Lb
            return r2
        Lb:
            hb.h[] r0 = (p128hb.C3003h[]) r0
            r0 = r0[r2]
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f12119c
            mc.a[] r0 = (mc.C4529a[]) r0
            r1 = 0
            r3 = 0
        L15:
            int r4 = r0.length
            if (r1 >= r4) goto L4b
            r4 = r0[r1]
            if (r4 == 0) goto L48
            r4 = r0[r1]
            int r4 = r4.f18422f
            r5 = 1
            r6 = 1
            r7 = 0
        L23:
            int r8 = r9.f14895c0
            int r8 = r8 + r5
            if (r6 >= r8) goto L48
            r8 = 2
            if (r7 >= r8) goto L48
            java.lang.Object r8 = r9.f14893a0
            hb.h[] r8 = (p128hb.C3003h[]) r8
            r8 = r8[r6]
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f12119c
            mc.a[] r8 = (mc.C4529a[]) r8
            r8 = r8[r1]
            if (r8 == 0) goto L45
            int r7 = m7888c(r4, r7, r8)
            boolean r8 = r8.m10434a()
            if (r8 != 0) goto L45
            int r3 = r3 + 1
        L45:
            int r6 = r6 + 1
            goto L23
        L48:
            int r1 = r1 + 1
            goto L15
        L4b:
            return r3
    }

    /* renamed from: i */
    public int m7896i() {
            r8 = this;
            java.lang.Object r0 = r8.f14893a0
            r1 = r0
            hb.h[] r1 = (p128hb.C3003h[]) r1
            int r2 = r8.f14895c0
            int r3 = r2 + 1
            r1 = r1[r3]
            r3 = 0
            if (r1 != 0) goto Lf
            return r3
        Lf:
            hb.h[] r0 = (p128hb.C3003h[]) r0
            int r2 = r2 + 1
            r0 = r0[r2]
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f12119c
            mc.a[] r0 = (mc.C4529a[]) r0
            r1 = 0
            r2 = 0
        L1b:
            int r4 = r0.length
            if (r1 >= r4) goto L50
            r4 = r0[r1]
            if (r4 == 0) goto L4d
            r4 = r0[r1]
            int r4 = r4.f18422f
            int r5 = r8.f14895c0
            int r5 = r5 + 1
            r6 = 0
        L2b:
            if (r5 <= 0) goto L4d
            r7 = 2
            if (r6 >= r7) goto L4d
            java.lang.Object r7 = r8.f14893a0
            hb.h[] r7 = (p128hb.C3003h[]) r7
            r7 = r7[r5]
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f12119c
            mc.a[] r7 = (mc.C4529a[]) r7
            r7 = r7[r1]
            if (r7 == 0) goto L4a
            int r6 = m7888c(r4, r6, r7)
            boolean r7 = r7.m10434a()
            if (r7 != 0) goto L4a
            int r2 = r2 + 1
        L4a:
            int r5 = r5 + (-1)
            goto L2b
        L4d:
            int r1 = r1 + 1
            goto L1b
        L50:
            return r2
    }

    /* renamed from: j */
    public int m7897j() {
            r1 = this;
            java.lang.Object r0 = r1.f14892Z
            mc.a r0 = (mc.C4529a) r0
            int r0 = r0.f18422f
            return r0
    }

    /* renamed from: k */
    public p128hb.C3003h m7898k(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.f14893a0
            hb.h[] r0 = (p128hb.C3003h[]) r0
            r2 = r0[r2]
            return r2
    }

    /* renamed from: l */
    public void m7899l(int r2, p128hb.C3003h r3) {
            r1 = this;
            java.lang.Object r0 = r1.f14893a0
            hb.h[] r0 = (p128hb.C3003h[]) r0
            r0[r2] = r3
            return
    }

    /* renamed from: n */
    public synchronized <T> p327s7.AbstractC5985i<T> m7900n(p164j6.AbstractC3440n<T> r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "MessengerIpcClient"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L2a
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L45
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + 9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "Queueing "
            r3.append(r2)     // Catch: java.lang.Throwable -> L45
            r3.append(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L45
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L45
        L2a:
            java.lang.Object r0 = r4.f14894b0     // Catch: java.lang.Throwable -> L45
            j6.i r0 = (p164j6.ServiceConnectionC3435i) r0     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.m7902b(r5)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L3f
            j6.i r0 = new j6.i     // Catch: java.lang.Throwable -> L45
            r1 = 0
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L45
            r4.f14894b0 = r0     // Catch: java.lang.Throwable -> L45
            r0.m7902b(r5)     // Catch: java.lang.Throwable -> L45
        L3f:
            s7.j<T> r5 = r5.f14906b     // Catch: java.lang.Throwable -> L45
            s7.q<TResult> r5 = r5.f23075a     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            return r5
        L45:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public java.lang.String toString() {
            r10 = this;
            int r0 = r10.f14891Y
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r10.f14893a0
            hb.h[] r0 = (p128hb.C3003h[]) r0
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L19
            int r2 = r10.f14895c0
            int r2 = r2 + r3
            r2 = r0[r2]
        L19:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L1f:
            java.util.Map<java.lang.String, java.lang.String> r5 = r2.f12119c
            mc.a[] r5 = (mc.C4529a[]) r5
            int r5 = r5.length
            if (r4 >= r5) goto L7e
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5[r1] = r6
            java.lang.String r6 = "CW %3d:"
            r0.format(r6, r5)
            r5 = 0
        L34:
            int r6 = r10.f14895c0
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L74
            java.lang.Object r6 = r10.f14893a0
            hb.h[] r6 = (p128hb.C3003h[]) r6
            r8 = r6[r5]
            java.lang.String r9 = "    |   "
            if (r8 != 0) goto L4a
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r0.format(r9, r6)
            goto L71
        L4a:
            r6 = r6[r5]
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f12119c
            mc.a[] r6 = (mc.C4529a[]) r6
            r6 = r6[r4]
            if (r6 != 0) goto L5a
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r0.format(r9, r6)
            goto L71
        L5a:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r6.f18422f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r1] = r8
            int r6 = r6.f18421e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r3] = r6
            java.lang.String r6 = " %3d|%3d"
            r0.format(r6, r7)
        L71:
            int r5 = r5 + 1
            goto L34
        L74:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "%n"
            r0.format(r6, r5)
            int r4 = r4 + 1
            goto L1f
        L7e:
            java.lang.String r1 = r0.toString()
            r0.close()
            return r1
    }
}
