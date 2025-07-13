package p052d6;

/* renamed from: d6.f0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1306f0 {
    /* renamed from: a */
    public static int m3772a(java.util.Set<?> r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r1 + r2
            goto L6
        L1a:
            return r1
    }

    /* renamed from: b */
    public static int m3773b(byte[] r2, int r3, p124h7.C2915vf r4) {
            int r3 = m3792u(r2, r3, r4)
            int r0 = r4.f11968a
            if (r0 < 0) goto L20
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            h7.cg r2 = p124h7.AbstractC2574cg.f11427Z
            r4.f11970c = r2
            return r3
        L13:
            h7.cg r2 = p124h7.AbstractC2574cg.m6534A(r2, r3, r0)
            r4.f11970c = r2
            int r3 = r3 + r0
            return r3
        L1b:
            h7.f r2 = p124h7.C2611f.m6687g()
            throw r2
        L20:
            h7.f r2 = p124h7.C2611f.m6685e()
            throw r2
    }

    /* renamed from: c */
    public static p124h7.C2793p1 m3774c(java.lang.String r3) {
            java.lang.Class<h7.h2> r0 = p124h7.C2650h2.class
            java.util.logging.Logger r1 = p124h7.C2650h2.f11568a
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.p1> r1 = p124h7.C2650h2.f11573f     // Catch: java.lang.Throwable -> L3a
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L2a
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "cannot find key template: "
            int r2 = r3.length()
            if (r2 == 0) goto L21
            java.lang.String r3 = r1.concat(r3)
            goto L26
        L21:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L26:
            r0.<init>(r3)
            throw r0
        L2a:
            monitor-enter(r0)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            java.lang.Object r3 = r1.get(r3)
            h7.p1 r3 = (p124h7.C2793p1) r3
            return r3
        L37:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L3a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* renamed from: d */
    public static p124h7.C2789of m3775d(p375v9.C6624v r3) {
            java.lang.String r0 = r3.f25802d0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = r3.f25800b0
            java.lang.String r1 = r3.f25802d0
            boolean r3 = r3.f25801c0
            h7.of r2 = new h7.of
            r2.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r2.f11811Y = r0
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r2.f11814b0 = r1
            r2.f11816d0 = r3
            return r2
        L20:
            java.lang.String r0 = r3.f25797Y
            java.lang.String r1 = r3.f25798Z
            boolean r3 = r3.f25801c0
            h7.of r2 = new h7.of
            r2.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r2.f11812Z = r0
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r2.f11813a0 = r1
            r2.f11816d0 = r3
            return r2
    }

    /* renamed from: e */
    public static <V> V m3776e(p185k7.InterfaceC3729a4<V> r2) {
            java.lang.Object r2 = r2.mo811a()     // Catch: java.lang.SecurityException -> L5
            goto L10
        L5:
            long r0 = android.os.Binder.clearCallingIdentity()
            java.lang.Object r2 = r2.mo811a()     // Catch: java.lang.Throwable -> L11
            android.os.Binder.restoreCallingIdentity(r0)
        L10:
            return r2
        L11:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r0)
            throw r2
    }

    /* renamed from: f */
    public static p185k7.InterfaceC3916o m3777f(p185k7.C3972s3 r3) {
            if (r3 != 0) goto L5
            k7.o r3 = p185k7.InterfaceC3916o.f16782G
            return r3
        L5:
            int r0 = r3.m8952B()
            int r0 = r0 + (-1)
            r1 = 1
            if (r0 == r1) goto L7f
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L65
            r1 = 3
            if (r0 == r1) goto L4b
            r1 = 4
            if (r0 != r1) goto L43
            java.util.List r0 = r3.m8956w()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            k7.s3 r2 = (p185k7.C3972s3) r2
            k7.o r2 = m3777f(r2)
            r1.add(r2)
            goto L25
        L39:
            java.lang.String r3 = r3.m8954u()
            k7.p r0 = new k7.p
            r0.<init>(r3, r1)
            return r0
        L43:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type found. Cannot convert entity"
            r3.<init>(r0)
            throw r3
        L4b:
            boolean r0 = r3.m8958y()
            if (r0 == 0) goto L5f
            k7.e r0 = new k7.e
            boolean r3 = r3.m8957x()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.<init>(r3)
            return r0
        L5f:
            k7.e r3 = new k7.e
            r3.<init>(r2)
            return r3
        L65:
            boolean r0 = r3.m8959z()
            if (r0 == 0) goto L79
            k7.g r0 = new k7.g
            double r1 = r3.m8953s()
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            r0.<init>(r3)
            return r0
        L79:
            k7.g r3 = new k7.g
            r3.<init>(r2)
            return r3
        L7f:
            boolean r0 = r3.m8951A()
            if (r0 == 0) goto L8f
            k7.r r0 = new k7.r
            java.lang.String r3 = r3.m8955v()
            r0.<init>(r3)
            return r0
        L8f:
            k7.o r3 = p185k7.InterfaceC3916o.f16789N
            return r3
    }

    /* renamed from: g */
    public static byte[] m3778g(byte[] r56, byte[] r57) {
            r0 = r56
            r1 = r57
            int r2 = r0.length
            r3 = 32
            if (r2 != r3) goto L227
            r2 = 0
            long r4 = m3782k(r0, r2)
            long r4 = r4 >> r2
            r6 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r4 = r4 & r6
            r8 = 3
            long r9 = m3782k(r0, r8)
            r11 = 2
            long r9 = r9 >> r11
            long r9 = r9 & r6
            r12 = 67108611(0x3ffff03, double:3.3156059E-316)
            long r9 = r9 & r12
            r12 = 6
            long r13 = m3782k(r0, r12)
            r15 = 4
            long r13 = r13 >> r15
            long r13 = r13 & r6
            r16 = 67092735(0x3ffc0ff, double:3.31482154E-316)
            long r13 = r13 & r16
            r3 = 9
            long r17 = m3782k(r0, r3)
            long r17 = r17 >> r12
            long r17 = r17 & r6
            r19 = 66076671(0x3f03fff, double:3.2646213E-316)
            long r17 = r17 & r19
            r3 = 12
            long r20 = m3782k(r0, r3)
            r3 = 8
            long r20 = r20 >> r3
            long r20 = r20 & r6
            r22 = 1048575(0xfffff, double:5.18065E-318)
            long r20 = r20 & r22
            r22 = 5
            long r24 = r9 * r22
            long r26 = r13 * r22
            long r28 = r17 * r22
            long r30 = r20 * r22
            r3 = 17
            byte[] r15 = new byte[r3]
            r33 = 0
            r35 = r33
            r37 = r35
            r39 = r37
            r41 = r39
            r12 = 0
        L65:
            int r11 = r1.length
            r44 = 26
            r8 = 16
            if (r12 >= r11) goto L154
            int r11 = r11 - r12
            int r11 = java.lang.Math.min(r8, r11)
            java.lang.System.arraycopy(r1, r12, r15, r2, r11)
            r45 = 1
            r15[r11] = r45
            if (r11 == r8) goto L7f
            int r11 = r11 + 1
            java.util.Arrays.fill(r15, r11, r3, r2)
        L7f:
            long r45 = m3782k(r15, r2)
            long r45 = r45 >> r2
            long r45 = r45 & r6
            long r41 = r41 + r45
            r11 = 3
            long r45 = m3782k(r15, r11)
            r43 = 2
            long r45 = r45 >> r43
            long r45 = r45 & r6
            long r33 = r33 + r45
            r3 = 6
            long r45 = m3782k(r15, r3)
            r32 = 4
            long r45 = r45 >> r32
            long r45 = r45 & r6
            long r35 = r35 + r45
            r11 = 9
            long r46 = m3782k(r15, r11)
            long r46 = r46 >> r3
            long r46 = r46 & r6
            long r37 = r37 + r46
            r3 = 12
            long r46 = m3782k(r15, r3)
            r3 = 8
            long r46 = r46 >> r3
            long r46 = r46 & r6
            r3 = r15[r8]
            r8 = 24
            int r3 = r3 << r8
            long r2 = (long) r3
            long r2 = r46 | r2
            long r39 = r39 + r2
            long r2 = r41 * r4
            long r46 = r33 * r30
            long r46 = r46 + r2
            long r2 = r35 * r28
            long r2 = r2 + r46
            long r46 = r37 * r26
            long r46 = r46 + r2
            long r2 = r39 * r24
            long r2 = r2 + r46
            long r46 = r41 * r9
            long r48 = r33 * r4
            long r48 = r48 + r46
            long r46 = r35 * r30
            long r46 = r46 + r48
            long r48 = r37 * r28
            long r48 = r48 + r46
            long r46 = r39 * r26
            long r46 = r46 + r48
            long r48 = r2 >> r44
            long r46 = r46 + r48
            long r48 = r41 * r13
            long r50 = r33 * r9
            long r50 = r50 + r48
            long r48 = r35 * r4
            long r48 = r48 + r50
            long r50 = r37 * r30
            long r50 = r50 + r48
            long r48 = r39 * r28
            long r48 = r48 + r50
            long r50 = r46 >> r44
            long r48 = r48 + r50
            long r50 = r48 & r6
            long r52 = r41 * r17
            long r54 = r33 * r13
            long r54 = r54 + r52
            long r52 = r35 * r9
            long r52 = r52 + r54
            long r54 = r37 * r4
            long r54 = r54 + r52
            long r52 = r39 * r30
            long r52 = r52 + r54
            long r48 = r48 >> r44
            long r52 = r52 + r48
            long r48 = r52 & r6
            long r41 = r41 * r20
            long r33 = r33 * r17
            long r33 = r33 + r41
            long r35 = r35 * r13
            long r35 = r35 + r33
            long r37 = r37 * r9
            long r37 = r37 + r35
            long r39 = r39 * r4
            long r39 = r39 + r37
            long r33 = r52 >> r44
            long r39 = r39 + r33
            long r33 = r39 & r6
            long r2 = r2 & r6
            long r35 = r39 >> r44
            long r35 = r35 * r22
            long r35 = r35 + r2
            long r41 = r35 & r6
            long r2 = r46 & r6
            long r35 = r35 >> r44
            long r2 = r2 + r35
            int r12 = r12 + 16
            r39 = r33
            r37 = r48
            r35 = r50
            r8 = 3
            r33 = r2
            r2 = 0
            r3 = 17
            goto L65
        L154:
            long r1 = r33 >> r44
            long r35 = r35 + r1
            long r1 = r35 & r6
            long r3 = r35 >> r44
            long r37 = r37 + r3
            long r3 = r37 & r6
            long r9 = r37 >> r44
            long r39 = r39 + r9
            long r9 = r39 & r6
            long r11 = r39 >> r44
            long r11 = r11 * r22
            long r11 = r11 + r41
            long r13 = r11 & r6
            long r17 = r33 & r6
            long r11 = r11 >> r44
            long r17 = r17 + r11
            long r22 = r13 + r22
            long r11 = r22 >> r44
            long r11 = r17 + r11
            long r20 = r11 >> r44
            long r20 = r1 + r20
            long r24 = r20 >> r44
            long r24 = r3 + r24
            long r26 = r24 >> r44
            long r26 = r9 + r26
            r28 = -67108864(0xfffffffffc000000, double:NaN)
            long r26 = r26 + r28
            r5 = 63
            r28 = r9
            long r8 = r26 >> r5
            r30 = r13
            long r13 = ~r8
            long r17 = r17 & r8
            long r10 = r11 & r6
            long r10 = r10 & r13
            long r10 = r17 | r10
            long r1 = r1 & r8
            long r17 = r20 & r6
            long r17 = r17 & r13
            long r1 = r1 | r17
            long r3 = r3 & r8
            long r17 = r24 & r6
            long r17 = r17 & r13
            long r3 = r3 | r17
            long r17 = r30 & r8
            long r5 = r22 & r6
            long r5 = r5 & r13
            long r5 = r17 | r5
            long r17 = r10 << r44
            long r5 = r5 | r17
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r17
            r7 = 16
            long r20 = m3782k(r0, r7)
            long r20 = r20 + r5
            r5 = 6
            long r5 = r10 >> r5
            r7 = 20
            long r10 = r1 << r7
            long r5 = r5 | r10
            long r5 = r5 & r17
            long r10 = m3782k(r0, r7)
            long r10 = r10 + r5
            r5 = 32
            long r6 = r20 >> r5
            long r10 = r10 + r6
            r6 = 12
            long r1 = r1 >> r6
            r6 = 14
            long r6 = r3 << r6
            long r1 = r1 | r6
            long r1 = r1 & r17
            r6 = 24
            long r6 = m3782k(r0, r6)
            long r6 = r6 + r1
            long r1 = r10 >> r5
            long r6 = r6 + r1
            r1 = 28
            long r0 = m3782k(r0, r1)
            r2 = 16
            byte[] r2 = new byte[r2]
            r56 = r0
            long r0 = r20 & r17
            r5 = 0
            m3784m(r2, r0, r5)
            long r0 = r10 & r17
            r5 = 4
            m3784m(r2, r0, r5)
            long r0 = r6 & r17
            r5 = 8
            m3784m(r2, r0, r5)
            r0 = 18
            long r0 = r3 >> r0
            long r3 = r28 & r8
            long r8 = r26 & r13
            long r3 = r3 | r8
            long r3 = r3 << r5
            long r0 = r0 | r3
            long r0 = r0 & r17
            r3 = r56
            long r0 = r0 + r3
            r3 = 32
            long r3 = r6 >> r3
            long r0 = r0 + r3
            long r0 = r0 & r17
            r3 = 12
            m3784m(r2, r0, r3)
            return r2
        L227:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The key length in bytes must be 32."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: h */
    public static int m3779h(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    /* renamed from: i */
    public static p185k7.InterfaceC3916o m3780i(java.lang.Object r5) {
            if (r5 != 0) goto L5
            k7.o r5 = p185k7.InterfaceC3916o.f16783H
            return r5
        L5:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L11
            k7.r r0 = new k7.r
            java.lang.String r5 = (java.lang.String) r5
            r0.<init>(r5)
            return r0
        L11:
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 == 0) goto L1d
            k7.g r0 = new k7.g
            java.lang.Double r5 = (java.lang.Double) r5
            r0.<init>(r5)
            return r0
        L1d:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L31
            k7.g r0 = new k7.g
            java.lang.Long r5 = (java.lang.Long) r5
            double r1 = r5.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r0.<init>(r5)
            return r0
        L31:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L45
            k7.g r0 = new k7.g
            java.lang.Integer r5 = (java.lang.Integer) r5
            double r1 = r5.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r0.<init>(r5)
            return r0
        L45:
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L51
            k7.e r0 = new k7.e
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r0.<init>(r5)
            return r0
        L51:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L87
            k7.l r0 = new k7.l
            r0.<init>()
            java.util.Map r5 = (java.util.Map) r5
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r5.get(r2)
            k7.o r3 = m3780i(r3)
            if (r2 == 0) goto L64
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L80
            java.lang.String r2 = r2.toString()
        L80:
            java.lang.String r2 = (java.lang.String) r2
            r0.mo8356h(r2, r3)
            goto L64
        L86:
            return r0
        L87:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto Lad
            k7.d r0 = new k7.d
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L96:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r5.next()
            k7.o r1 = m3780i(r1)
            int r2 = r0.m8359m()
            r0.m8350C(r2, r1)
            goto L96
        Lac:
            return r0
        Lad:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid value type"
            r5.<init>(r0)
            throw r5
    }

    /* renamed from: j */
    public static int m3781j(p124h7.InterfaceC2666i0 r8, byte[] r9, int r10, int r11, int r12, p124h7.C2915vf r13) {
            h7.a0 r8 = (p124h7.C2521a0) r8
            java.lang.Object r7 = r8.mo6441d()
            r0 = r8
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r9 = r0.m6429E(r1, r2, r3, r4, r5, r6)
            r8.mo6440c(r7)
            r13.f11970c = r7
            return r9
    }

    /* renamed from: k */
    public static long m3782k(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    /* renamed from: l */
    public static int m3783l(p124h7.InterfaceC2666i0 r6, byte[] r7, int r8, int r9, p124h7.C2915vf r10) {
            int r0 = r8 + 1
            r8 = r7[r8]
            if (r8 >= 0) goto Lc
            int r0 = m3793v(r8, r7, r0, r10)
            int r8 = r10.f11968a
        Lc:
            r3 = r0
            if (r8 < 0) goto L25
            int r9 = r9 - r3
            if (r8 > r9) goto L25
            java.lang.Object r9 = r6.mo6441d()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo6446i(r1, r2, r3, r4, r5)
            r6.mo6440c(r9)
            r10.f11970c = r9
            return r8
        L25:
            h7.f r6 = p124h7.C2611f.m6687g()
            throw r6
    }

    /* renamed from: m */
    public static void m3784m(byte[] r4, long r5, int r7) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L13
            int r1 = r7 + r0
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r5
            int r3 = (int) r2
            byte r2 = (byte) r3
            r4[r1] = r2
            int r0 = r0 + 1
            r1 = 8
            long r5 = r5 >> r1
            goto L1
        L13:
            return
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m3785n(byte r0) {
            if (r0 < 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    /* renamed from: o */
    public static int m3786o(p124h7.InterfaceC2666i0<?> r2, int r3, byte[] r4, int r5, int r6, p124h7.InterfaceC2557c<?> r7, p124h7.C2915vf r8) {
            int r5 = m3783l(r2, r4, r5, r6, r8)
        L4:
            java.lang.Object r0 = r8.f11970c
            r7.add(r0)
            if (r5 >= r6) goto L19
            int r0 = m3792u(r4, r5, r8)
            int r1 = r8.f11968a
            if (r3 == r1) goto L14
            goto L19
        L14:
            int r5 = m3783l(r2, r4, r0, r6, r8)
            goto L4
        L19:
            return r5
    }

    /* renamed from: p */
    public static boolean m3787p(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    /* renamed from: q */
    public static int m3788q(byte[] r2, int r3, p124h7.InterfaceC2557c<?> r4, p124h7.C2915vf r5) {
            h7.zg r4 = (p124h7.C2988zg) r4
            int r3 = m3792u(r2, r3, r5)
            int r0 = r5.f11968a
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = m3792u(r2, r3, r5)
            int r1 = r5.f11968a
            r4.m7360h(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            h7.f r2 = p124h7.C2611f.m6687g()
            throw r2
    }

    /* renamed from: r */
    public static int m3789r(byte[] r3, int r4, p124h7.C2915vf r5) {
            int r4 = m3792u(r3, r4, r5)
            int r0 = r5.f11968a
            if (r0 < 0) goto L1a
            if (r0 != 0) goto Lf
            java.lang.String r3 = ""
            r5.f11970c = r3
            return r4
        Lf:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p124h7.C2575d.f11429a
            r1.<init>(r3, r4, r0, r2)
            r5.f11970c = r1
            int r4 = r4 + r0
            return r4
        L1a:
            h7.f r3 = p124h7.C2611f.m6685e()
            throw r3
    }

    /* renamed from: s */
    public static int m3790s(byte[] r1, int r2, p124h7.C2915vf r3) {
            int r2 = m3792u(r1, r2, r3)
            int r0 = r3.f11968a
            if (r0 < 0) goto L17
            if (r0 != 0) goto Lf
            java.lang.String r1 = ""
            r3.f11970c = r1
            return r2
        Lf:
            java.lang.String r1 = p124h7.C2631g1.m6745d(r1, r2, r0)
            r3.f11970c = r1
            int r2 = r2 + r0
            return r2
        L17:
            h7.f r1 = p124h7.C2611f.m6685e()
            throw r1
    }

    /* renamed from: t */
    public static int m3791t(int r9, byte[] r10, int r11, int r12, p124h7.C2936x0 r13, p124h7.C2915vf r14) {
            int r0 = r9 >>> 3
            if (r0 == 0) goto L96
            r0 = r9 & 7
            if (r0 == 0) goto L88
            r1 = 1
            if (r0 == r1) goto L7a
            r1 = 2
            if (r0 == r1) goto L56
            r1 = 3
            if (r0 == r1) goto L27
            r12 = 5
            if (r0 != r12) goto L22
            int r10 = m3779h(r10, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.m7248c(r9, r10)
            int r11 = r11 + 4
            return r11
        L22:
            h7.f r9 = p124h7.C2611f.m6682b()
            throw r9
        L27:
            r0 = r9 & (-8)
            r0 = r0 | 4
            h7.x0 r7 = p124h7.C2936x0.m7246b()
            r1 = 0
        L30:
            if (r11 >= r12) goto L49
            int r3 = m3792u(r10, r11, r14)
            int r11 = r14.f11968a
            r1 = r11
            if (r11 != r0) goto L3d
            r11 = r3
            goto L49
        L3d:
            r2 = r10
            r4 = r12
            r5 = r7
            r6 = r14
            int r1 = m3791t(r1, r2, r3, r4, r5, r6)
            r8 = r1
            r1 = r11
            r11 = r8
            goto L30
        L49:
            if (r11 > r12) goto L51
            if (r1 != r0) goto L51
            r13.m7248c(r9, r7)
            return r11
        L51:
            h7.f r9 = p124h7.C2611f.m6686f()
            throw r9
        L56:
            int r11 = m3792u(r10, r11, r14)
            int r12 = r14.f11968a
            if (r12 < 0) goto L75
            int r14 = r10.length
            int r14 = r14 - r11
            if (r12 > r14) goto L70
            if (r12 != 0) goto L67
            h7.cg r10 = p124h7.AbstractC2574cg.f11427Z
            goto L6b
        L67:
            h7.cg r10 = p124h7.AbstractC2574cg.m6534A(r10, r11, r12)
        L6b:
            r13.m7248c(r9, r10)
            int r11 = r11 + r12
            return r11
        L70:
            h7.f r9 = p124h7.C2611f.m6687g()
            throw r9
        L75:
            h7.f r9 = p124h7.C2611f.m6685e()
            throw r9
        L7a:
            long r0 = m3796y(r10, r11)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r13.m7248c(r9, r10)
            int r11 = r11 + 8
            return r11
        L88:
            int r10 = m3795x(r10, r11, r14)
            long r11 = r14.f11969b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.m7248c(r9, r11)
            return r10
        L96:
            h7.f r9 = p124h7.C2611f.m6682b()
            throw r9
    }

    /* renamed from: u */
    public static int m3792u(byte[] r1, int r2, p124h7.C2915vf r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.f11968a = r2
            return r0
        L9:
            int r1 = m3793v(r2, r1, r0, r3)
            return r1
    }

    /* renamed from: v */
    public static int m3793v(int r1, byte[] r2, int r3, p124h7.C2915vf r4) {
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto Lb
            int r2 = r3 << 7
            goto L26
        Lb:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 7
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L19
            int r2 = r0 << 14
            goto L37
        L19:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 14
            r1 = r1 | r0
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto L2a
            int r2 = r3 << 21
        L26:
            r1 = r1 | r2
            r4.f11968a = r1
            return r0
        L2a:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 21
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L3b
            int r2 = r0 << 28
        L37:
            r1 = r1 | r2
            r4.f11968a = r1
            return r3
        L3b:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 28
            r1 = r1 | r0
        L40:
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L48
            r3 = r0
            goto L40
        L48:
            r4.f11968a = r1
            return r0
    }

    /* renamed from: w */
    public static int m3794w(int r2, byte[] r3, int r4, int r5, p124h7.InterfaceC2557c<?> r6, p124h7.C2915vf r7) {
            h7.zg r6 = (p124h7.C2988zg) r6
            int r4 = m3792u(r3, r4, r7)
        L6:
            int r0 = r7.f11968a
            r6.m7360h(r0)
            if (r4 >= r5) goto L1b
            int r0 = m3792u(r3, r4, r7)
            int r1 = r7.f11968a
            if (r2 == r1) goto L16
            goto L1b
        L16:
            int r4 = m3792u(r3, r0, r7)
            goto L6
        L1b:
            return r4
    }

    /* renamed from: x */
    public static int m3795x(byte[] r9, int r10, p124h7.C2915vf r11) {
            int r0 = r10 + 1
            r10 = r9[r10]
            long r1 = (long) r10
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 >= 0) goto L2c
            int r10 = r0 + 1
            r0 = r9[r0]
            r3 = 127(0x7f, double:6.27E-322)
            long r1 = r1 & r3
            r3 = r0 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r1 = r1 | r3
            r3 = 7
        L19:
            if (r0 >= 0) goto L29
            int r0 = r10 + 1
            r10 = r9[r10]
            int r3 = r3 + r5
            r4 = r10 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r1 = r1 | r6
            r8 = r0
            r0 = r10
            r10 = r8
            goto L19
        L29:
            r11.f11969b = r1
            return r10
        L2c:
            r11.f11969b = r1
            return r0
    }

    /* renamed from: y */
    public static long m3796y(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }
}
