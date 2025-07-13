package p162j4;

/* renamed from: j4.v */
/* loaded from: classes.dex */
public final class C3417v implements p162j4.InterfaceC3419x {

    /* renamed from: a */
    public final p352u5.InterfaceC6333v f14766a;

    /* renamed from: b */
    public final java.lang.String f14767b;

    /* renamed from: c */
    public final boolean f14768c;

    /* renamed from: d */
    public final java.util.Map<java.lang.String, java.lang.String> f14769d;

    public C3417v(java.lang.String r2, boolean r3, p352u5.InterfaceC6333v r4) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            p371v5.C6549a.m13288b(r0)
            r1.f14766a = r4
            r1.f14767b = r2
            r1.f14768c = r3
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f14769d = r2
            return
    }

    /* renamed from: b */
    public static byte[] m7854b(p352u5.InterfaceC6333v r34, java.lang.String r35, byte[] r36, java.util.Map<java.lang.String, java.lang.String> r37) {
            u5.f0 r1 = new u5.f0
            r0 = r34
            u5.q$b r0 = (p352u5.C6328q.b) r0
            u5.q r0 = r0.m12981b()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r35)
            java.lang.String r15 = "The uri must be set."
            if (r3 == 0) goto Lde
            u5.l r17 = new u5.l
            r16 = 0
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r14 = 1
            r0 = 0
            r2 = r17
            r7 = r36
            r8 = r37
            r18 = r15
            r15 = r0
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15, r16)
            r2 = 0
            r3 = r17
            r4 = 0
        L36:
            u5.k r5 = new u5.k     // Catch: java.lang.Exception -> Lc8
            r5.<init>(r1, r3)     // Catch: java.lang.Exception -> Lc8
            byte[] r0 = p371v5.C6552b0.m13305I(r5)     // Catch: java.lang.Throwable -> L45 p352u5.C6336y -> L48
            int r2 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> Lc8
            r5.close()     // Catch: java.io.IOException -> L44 java.lang.Exception -> Lc8
        L44:
            return r0
        L45:
            r0 = move-exception
            goto Lc2
        L48:
            r0 = move-exception
            r6 = r0
            int r0 = r6.f24785a0     // Catch: java.lang.Throwable -> L45
            r7 = 307(0x133, float:4.3E-43)
            if (r0 == r7) goto L54
            r7 = 308(0x134, float:4.32E-43)
            if (r0 != r7) goto L59
        L54:
            r0 = 5
            if (r4 >= r0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            r7 = 0
            if (r0 != 0) goto L5e
            goto L79
        L5e:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r6.f24786b0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L79
            java.lang.String r8 = "Location"
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L45
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L79
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L45
            if (r8 != 0) goto L79
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L45
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L45
        L79:
            if (r7 == 0) goto Lc1
            int r4 = r4 + 1
            long r8 = r3.f24705b     // Catch: java.lang.Throwable -> L45
            int r0 = r3.f24706c     // Catch: java.lang.Throwable -> L45
            byte[] r6 = r3.f24707d     // Catch: java.lang.Throwable -> L45
            java.util.Map<java.lang.String, java.lang.String> r10 = r3.f24708e     // Catch: java.lang.Throwable -> L45
            long r11 = r3.f24709f     // Catch: java.lang.Throwable -> L45
            long r13 = r3.f24710g     // Catch: java.lang.Throwable -> L45
            java.lang.String r15 = r3.f24711h     // Catch: java.lang.Throwable -> L45
            int r2 = r3.f24712i     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r3.f24713j     // Catch: java.lang.Throwable -> L45
            android.net.Uri r20 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L45
            if (r20 == 0) goto Lb9
            u5.l r7 = new u5.l     // Catch: java.lang.Throwable -> L45
            r33 = 0
            r19 = r7
            r21 = r8
            r23 = r0
            r24 = r6
            r25 = r10
            r26 = r11
            r28 = r13
            r30 = r15
            r31 = r2
            r32 = r3
            r19.<init>(r20, r21, r23, r24, r25, r26, r28, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L45
            int r0 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> Lc8
            r5.close()     // Catch: java.io.IOException -> Lb5 java.lang.Exception -> Lc8
        Lb5:
            r3 = r7
            r2 = 0
            goto L36
        Lb9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            r2 = r18
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        Lc1:
            throw r6     // Catch: java.lang.Throwable -> L45
        Lc2:
            int r2 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> Lc8
            r5.close()     // Catch: java.io.IOException -> Lc7 java.lang.Exception -> Lc8
        Lc7:
            throw r0     // Catch: java.lang.Exception -> Lc8
        Lc8:
            r0 = move-exception
            r10 = r0
            j4.y r0 = new j4.y
            android.net.Uri r6 = r1.f24681c
            java.util.Objects.requireNonNull(r6)
            java.util.Map r7 = r1.mo6022g()
            long r8 = r1.f24680b
            r4 = r0
            r5 = r17
            r4.<init>(r5, r6, r7, r8, r10)
            throw r0
        Lde:
            r2 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: a */
    public byte[] m7855a(java.util.UUID r19, p162j4.InterfaceC3412q.a r20) {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            java.lang.String r3 = r2.f14752b
            boolean r4 = r1.f14768c
            if (r4 != 0) goto L12
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L14
        L12:
            java.lang.String r3 = r1.f14767b
        L14:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L5e
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.UUID r5 = p088f4.C2017j.f8968e
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L2a
            java.lang.String r6 = "text/xml"
            goto L37
        L2a:
            java.util.UUID r6 = p088f4.C2017j.f8966c
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            java.lang.String r6 = "application/json"
            goto L37
        L35:
            java.lang.String r6 = "application/octet-stream"
        L37:
            java.lang.String r7 = "Content-Type"
            r4.put(r7, r6)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = "SOAPAction"
            java.lang.String r5 = "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense"
            r4.put(r0, r5)
        L49:
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.f14769d
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f14769d     // Catch: java.lang.Throwable -> L5b
            r4.putAll(r0)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5b
            u5.v r0 = r1.f14766a
            byte[] r2 = r2.f14751a
            byte[] r0 = m7854b(r0, r3, r2, r4)
            return r0
        L5b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5b
            throw r0
        L5e:
            j4.y r0 = new j4.y
            r15 = 0
            r14 = 0
            r13 = 0
            r9 = 0
            r7 = 0
            r4 = 0
            r6 = 1
            java.util.Map r8 = java.util.Collections.emptyMap()
            r11 = -1
            android.net.Uri r3 = android.net.Uri.EMPTY
            if (r3 == 0) goto L90
            u5.l r17 = new u5.l
            r16 = 0
            r2 = r17
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15, r16)
            android.net.Uri r8 = android.net.Uri.EMPTY
            b9.o<java.lang.Object, java.lang.Object> r9 = p026b9.C0695d0.f3901e0
            r10 = 0
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r2 = "No license URL"
            r12.<init>(r2)
            r6 = r0
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r12)
            throw r0
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "The uri must be set."
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: c */
    public byte[] m7856c(java.util.UUID r3, p162j4.InterfaceC3412q.d r4) {
            r2 = this;
            java.lang.String r3 = r4.f14754b
            byte[] r4 = r4.f14753a
            java.lang.String r4 = p371v5.C6552b0.m13319l(r4)
            r0 = 15
            int r0 = p064e.C1489c.m4038a(r3, r0)
            int r1 = r4.length()
            int r1 = r1 + r0
            java.lang.String r0 = "&signedRequest="
            java.lang.String r3 = p088f4.C2035p.m5377a(r1, r3, r0, r4)
            u5.v r4 = r2.f14766a
            r0 = 0
            java.util.Map r1 = java.util.Collections.emptyMap()
            byte[] r3 = m7854b(r4, r3, r0, r1)
            return r3
    }
}
