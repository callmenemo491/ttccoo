package p340t8;

/* renamed from: t8.e */
/* loaded from: classes.dex */
public class C6188e implements p425y2.InterfaceC7105b, ec.InterfaceC1814b, sb.InterfaceC6025s {

    /* renamed from: Y */
    public final /* synthetic */ int f24033Y;

    public C6188e(int r1) {
            r0 = this;
            r0.f24033Y = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static java.lang.String m12755a(java.lang.CharSequence r8, int r9) {
            int r0 = r8.length()
            int r0 = r0 - r9
            if (r0 == 0) goto L57
            char r1 = r8.charAt(r9)
            r2 = 2
            r3 = 0
            if (r0 < r2) goto L16
            int r4 = r9 + 1
            char r4 = r8.charAt(r4)
            goto L17
        L16:
            r4 = 0
        L17:
            r5 = 3
            if (r0 < r5) goto L21
            int r6 = r9 + 2
            char r6 = r8.charAt(r6)
            goto L22
        L21:
            r6 = 0
        L22:
            r7 = 4
            if (r0 < r7) goto L2a
            int r9 = r9 + r5
            char r3 = r8.charAt(r9)
        L2a:
            int r8 = r1 << 18
            int r9 = r4 << 12
            int r8 = r8 + r9
            int r9 = r6 << 6
            int r8 = r8 + r9
            int r8 = r8 + r3
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            char r9 = (char) r9
            int r1 = r8 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r9)
            if (r0 < r2) goto L4d
            r3.append(r1)
        L4d:
            if (r0 < r5) goto L52
            r3.append(r8)
        L52:
            java.lang.String r8 = r3.toString()
            return r8
        L57:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StringBuilder must not be empty"
            r8.<init>(r9)
            throw r8
    }

    /* renamed from: b */
    public void m12756b(float r1, float r2, float r3, p340t8.C6195l r4) {
            r0 = this;
            r2 = 0
            r4.m12800d(r1, r2)
            return
    }

    /* renamed from: c */
    public int m12757c() {
            r1 = this;
            int r0 = r1.f24033Y
            switch(r0) {
                case 4: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 4
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r25, sb.EnumC6007a r26, int r27, int r28, java.util.Map<sb.EnumC6011e, ?> r29) {
            r24 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            boolean r5 = r25.isEmpty()
            if (r5 != 0) goto L67c
            sb.a r5 = sb.EnumC6007a.f23162j0
            if (r1 != r5) goto L668
            if (r2 < 0) goto L64a
            if (r3 < 0) goto L64a
            rc.d r1 = p312rc.EnumC5809d.f22502Z
            if (r4 == 0) goto L45
            sb.e r6 = sb.EnumC6011e.f23182Y
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L30
            java.lang.Object r1 = r4.get(r6)
            java.lang.String r1 = r1.toString()
            rc.d r1 = p312rc.EnumC5809d.valueOf(r1)
        L30:
            sb.e r6 = sb.EnumC6011e.f23187d0
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L45
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = r6.toString()
            int r6 = java.lang.Integer.parseInt(r6)
            goto L46
        L45:
            r6 = 4
        L46:
            rc.f r7 = p312rc.EnumC5811f.f22513e0
            java.lang.String r8 = "ISO-8859-1"
            if (r4 == 0) goto L5d
            sb.e r9 = sb.EnumC6011e.f23183Z
            boolean r10 = r4.containsKey(r9)
            if (r10 == 0) goto L5d
            java.lang.Object r9 = r4.get(r9)
            java.lang.String r9 = r9.toString()
            goto L5e
        L5d:
            r9 = r8
        L5e:
            java.lang.String r10 = "Shift_JIS"
            boolean r11 = r10.equals(r9)
            r12 = -1
            if (r11 == 0) goto L94
            byte[] r11 = r0.getBytes(r10)     // Catch: java.io.UnsupportedEncodingException -> L8e
            int r15 = r11.length
            int r16 = r15 % 2
            if (r16 == 0) goto L71
            goto L8e
        L71:
            r14 = 0
        L72:
            if (r14 >= r15) goto L8c
            r13 = r11[r14]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r5 = 129(0x81, float:1.81E-43)
            if (r13 < r5) goto L80
            r5 = 159(0x9f, float:2.23E-43)
            if (r13 <= r5) goto L89
        L80:
            r5 = 224(0xe0, float:3.14E-43)
            if (r13 < r5) goto L8e
            r5 = 235(0xeb, float:3.3E-43)
            if (r13 <= r5) goto L89
            goto L8e
        L89:
            int r14 = r14 + 2
            goto L72
        L8c:
            r5 = 1
            goto L8f
        L8e:
            r5 = 0
        L8f:
            if (r5 == 0) goto L94
            rc.f r5 = p312rc.EnumC5811f.f22515g0
            goto Lc0
        L94:
            r5 = 0
            r11 = 0
            r13 = 0
        L97:
            int r14 = r25.length()
            if (r13 >= r14) goto Lb5
            char r14 = r0.charAt(r13)
            r15 = 48
            if (r14 < r15) goto Lab
            r15 = 57
            if (r14 > r15) goto Lab
            r11 = 1
            goto Lb2
        Lab:
            int r5 = tc.C6211b.m12813b(r14)
            if (r5 == r12) goto Lbf
            r5 = 1
        Lb2:
            int r13 = r13 + 1
            goto L97
        Lb5:
            if (r5 == 0) goto Lba
            rc.f r5 = p312rc.EnumC5811f.f22511c0
            goto Lc0
        Lba:
            if (r11 == 0) goto Lbf
            rc.f r5 = p312rc.EnumC5811f.f22510b0
            goto Lc0
        Lbf:
            r5 = r7
        Lc0:
            zb.a r11 = new zb.a
            r11.<init>()
            r13 = 8
            r14 = 7
            if (r5 != r7) goto Lea
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto Lea
            java.util.Map<java.lang.String, zb.d> r8 = p453zb.EnumC7272d.f27910b0
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r9)
            zb.d r8 = (p453zb.EnumC7272d) r8
            if (r8 == 0) goto Lea
            r15 = 4
            r11.m14362c(r14, r15)
            int[] r8 = r8.f27912Y
            r16 = 0
            r8 = r8[r16]
            r11.m14362c(r8, r13)
            goto Leb
        Lea:
            r15 = 4
        Leb:
            int r8 = r5.f22521Z
            r11.m14362c(r8, r15)
            zb.a r8 = new zb.a
            r8.<init>()
            int r14 = r5.ordinal()
            r12 = 2
            r13 = 1
            if (r14 == r13) goto L1c6
            r13 = 6
            if (r14 == r12) goto L189
            if (r14 == r15) goto L16f
            if (r14 != r13) goto L15b
            byte[] r9 = r0.getBytes(r10)     // Catch: java.io.UnsupportedEncodingException -> L153
            int r10 = r9.length
            r13 = 0
        L10a:
            if (r13 >= r10) goto L20b
            r14 = r9[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r13 + 1
            r15 = r9[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r19 = 8
            int r14 = r14 << 8
            r14 = r14 | r15
            r15 = 33088(0x8140, float:4.6366E-41)
            if (r14 < r15) goto L129
            r15 = 40956(0x9ffc, float:5.7392E-41)
            if (r14 > r15) goto L129
            r15 = 33088(0x8140, float:4.6366E-41)
            goto L136
        L129:
            r15 = 57408(0xe040, float:8.0446E-41)
            if (r14 < r15) goto L138
            r15 = 60351(0xebbf, float:8.457E-41)
            if (r14 > r15) goto L138
            r15 = 49472(0xc140, float:6.9325E-41)
        L136:
            int r14 = r14 - r15
            goto L139
        L138:
            r14 = -1
        L139:
            r15 = -1
            if (r14 == r15) goto L14b
            int r15 = r14 >> 8
            int r15 = r15 * 192
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r14
            r14 = 13
            r8.m14362c(r15, r14)
            int r13 = r13 + 2
            goto L10a
        L14b:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Invalid byte sequence"
            r0.<init>(r1)
            throw r0
        L153:
            r0 = move-exception
            r1 = r0
            sb.t r0 = new sb.t
            r0.<init>(r1)
            throw r0
        L15b:
            sb.t r0 = new sb.t
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid mode: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L16f:
            byte[] r9 = r0.getBytes(r9)     // Catch: java.io.UnsupportedEncodingException -> L181
            int r10 = r9.length
            r13 = 0
        L175:
            if (r13 >= r10) goto L20b
            r14 = r9[r13]
            r15 = 8
            r8.m14362c(r14, r15)
            int r13 = r13 + 1
            goto L175
        L181:
            r0 = move-exception
            r1 = r0
            sb.t r0 = new sb.t
            r0.<init>(r1)
            throw r0
        L189:
            int r9 = r25.length()
            r10 = 0
        L18e:
            if (r10 >= r9) goto L20b
            char r14 = r0.charAt(r10)
            int r14 = tc.C6211b.m12813b(r14)
            r15 = -1
            if (r14 == r15) goto L1c0
            int r12 = r10 + 1
            if (r12 >= r9) goto L1ba
            char r12 = r0.charAt(r12)
            int r12 = tc.C6211b.m12813b(r12)
            if (r12 == r15) goto L1b4
            int r14 = r14 * 45
            int r14 = r14 + r12
            r12 = 11
            r8.m14362c(r14, r12)
            int r10 = r10 + 2
            goto L1be
        L1b4:
            sb.t r0 = new sb.t
            r0.<init>()
            throw r0
        L1ba:
            r8.m14362c(r14, r13)
            r10 = r12
        L1be:
            r12 = 2
            goto L18e
        L1c0:
            sb.t r0 = new sb.t
            r0.<init>()
            throw r0
        L1c6:
            int r9 = r25.length()
            r10 = 0
        L1cb:
            if (r10 >= r9) goto L20b
            char r12 = r0.charAt(r10)
            int r12 = r12 + (-48)
            int r13 = r10 + 2
            if (r13 >= r9) goto L1f3
            int r14 = r10 + 1
            char r14 = r0.charAt(r14)
            int r14 = r14 + (-48)
            char r13 = r0.charAt(r13)
            int r13 = r13 + (-48)
            int r12 = r12 * 100
            r15 = 10
            int r14 = r14 * 10
            int r14 = r14 + r12
            int r14 = r14 + r13
            r8.m14362c(r14, r15)
            int r10 = r10 + 3
            goto L1cb
        L1f3:
            int r10 = r10 + 1
            if (r10 >= r9) goto L206
            char r10 = r0.charAt(r10)
            int r10 = r10 + (-48)
            int r12 = r12 * 10
            int r12 = r12 + r10
            r10 = 7
            r8.m14362c(r12, r10)
            r10 = r13
            goto L1cb
        L206:
            r13 = 4
            r8.m14362c(r12, r13)
            goto L1cb
        L20b:
            if (r4 == 0) goto L23e
            sb.e r9 = sb.EnumC6011e.f23192i0
            boolean r10 = r4.containsKey(r9)
            if (r10 == 0) goto L23e
            java.lang.Object r4 = r4.get(r9)
            java.lang.String r4 = r4.toString()
            int r4 = java.lang.Integer.parseInt(r4)
            rc.h r4 = p312rc.C5813h.m12186d(r4)
            int r9 = r11.f27901Z
            int r10 = r5.m12183e(r4)
            int r10 = r10 + r9
            int r9 = r8.f27901Z
            int r10 = r10 + r9
            boolean r9 = tc.C6211b.m12814c(r10, r4, r1)
            if (r9 == 0) goto L236
            goto L25f
        L236:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Data too big for requested version"
            r0.<init>(r1)
            throw r0
        L23e:
            r4 = 1
            rc.h r9 = p312rc.C5813h.m12186d(r4)
            int r4 = r11.f27901Z
            int r9 = r5.m12183e(r9)
            int r9 = r9 + r4
            int r4 = r8.f27901Z
            int r9 = r9 + r4
            rc.h r4 = tc.C6211b.m12812a(r9, r1)
            int r9 = r11.f27901Z
            int r4 = r5.m12183e(r4)
            int r4 = r4 + r9
            int r9 = r8.f27901Z
            int r4 = r4 + r9
            rc.h r4 = tc.C6211b.m12812a(r4, r1)
        L25f:
            zb.a r9 = new zb.a
            r9.<init>()
            r9.m14361b(r11)
            if (r5 != r7) goto L26e
            int r0 = r8.m14367j()
            goto L272
        L26e:
            int r0 = r25.length()
        L272:
            int r5 = r5.m12183e(r4)
            r7 = 1
            int r10 = r7 << r5
            if (r0 >= r10) goto L62e
            r9.m14362c(r0, r5)
            r9.m14361b(r8)
            rc.h$b[] r0 = r4.f22527c
            int r5 = r1.ordinal()
            r0 = r0[r5]
            int r5 = r4.f22528d
            int r7 = r0.f22531a
            int r8 = r0.m12188a()
            int r8 = r8 * r7
            int r5 = r5 - r8
            int r7 = r5 << 3
            int r8 = r9.f27901Z
            if (r8 > r7) goto L610
            r8 = 0
            r10 = 4
        L29c:
            if (r8 >= r10) goto L2a9
            int r11 = r9.f27901Z
            if (r11 >= r7) goto L2a9
            r11 = 0
            r9.m14360a(r11)
            int r8 = r8 + 1
            goto L29c
        L2a9:
            r11 = 0
            int r8 = r9.f27901Z
            r10 = 7
            r8 = r8 & r10
            if (r8 <= 0) goto L2bd
            r10 = 8
        L2b2:
            if (r8 >= r10) goto L2bd
            r9.m14360a(r11)
            int r8 = r8 + 1
            r10 = 8
            r11 = 0
            goto L2b2
        L2bd:
            int r8 = r9.m14367j()
            int r8 = r5 - r8
            r10 = 0
        L2c4:
            if (r10 >= r8) goto L2d7
            r11 = r10 & 1
            if (r11 != 0) goto L2cd
            r11 = 236(0xec, float:3.31E-43)
            goto L2cf
        L2cd:
            r11 = 17
        L2cf:
            r12 = 8
            r9.m14362c(r11, r12)
            int r10 = r10 + 1
            goto L2c4
        L2d7:
            int r8 = r9.f27901Z
            if (r8 != r7) goto L608
            int r7 = r4.f22528d
            int r0 = r0.m12188a()
            int r8 = r9.m14367j()
            if (r8 != r5) goto L600
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L2f0:
            if (r10 >= r0) goto L3d2
            r14 = 1
            int[] r15 = new int[r14]
            int[] r3 = new int[r14]
            if (r10 >= r0) goto L3ca
            int r14 = r7 % r0
            int r2 = r0 - r14
            int r17 = r7 / r0
            int r18 = r17 + 1
            int r20 = r5 / r0
            int r21 = r20 + 1
            r22 = r6
            int r6 = r17 - r20
            r17 = r1
            int r1 = r18 - r21
            if (r6 != r1) goto L3c2
            r18 = r4
            int r4 = r2 + r14
            if (r0 != r4) goto L3ba
            int r4 = r20 + r6
            int r4 = r4 * r2
            int r23 = r21 + r1
            int r23 = r23 * r14
            int r4 = r23 + r4
            if (r7 != r4) goto L3b2
            if (r10 >= r2) goto L329
            r2 = 0
            r15[r2] = r20
            r3[r2] = r6
            goto L32e
        L329:
            r2 = 0
            r15[r2] = r21
            r3[r2] = r1
        L32e:
            r1 = r15[r2]
            byte[] r2 = new byte[r1]
            int r4 = r11 << 3
            r6 = 0
        L335:
            r25 = r0
            r20 = r7
            r0 = 0
            if (r6 >= r1) goto L361
            r7 = 8
            r14 = 0
        L33f:
            if (r14 >= r7) goto L355
            boolean r7 = r9.m14364e(r4)
            if (r7 == 0) goto L34e
            int r7 = 7 - r14
            r21 = 1
            int r7 = r21 << r7
            r0 = r0 | r7
        L34e:
            int r4 = r4 + 1
            int r14 = r14 + 1
            r7 = 8
            goto L33f
        L355:
            int r7 = r6 + 0
            byte r0 = (byte) r0
            r2[r7] = r0
            int r6 = r6 + 1
            r0 = r25
            r7 = r20
            goto L335
        L361:
            r3 = r3[r0]
            int r0 = r1 + r3
            int[] r0 = new int[r0]
            r4 = 0
        L368:
            if (r4 >= r1) goto L373
            r6 = r2[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0[r4] = r6
            int r4 = r4 + 1
            goto L368
        L373:
            hb.h r4 = new hb.h
            ac.a r6 = ac.C0055a.f135l
            r4.<init>(r6)
            r4.m7383i(r0, r3)
            byte[] r4 = new byte[r3]
            r6 = 0
        L380:
            if (r6 >= r3) goto L38c
            int r7 = r1 + r6
            r7 = r0[r7]
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r6 + 1
            goto L380
        L38c:
            tc.a r0 = new tc.a
            r0.<init>(r2, r4)
            r8.add(r0)
            int r12 = java.lang.Math.max(r12, r1)
            int r13 = java.lang.Math.max(r13, r3)
            r0 = 0
            r1 = r15[r0]
            int r11 = r11 + r1
            int r10 = r10 + 1
            r0 = r25
            r2 = r27
            r3 = r28
            r1 = r17
            r4 = r18
            r7 = r20
            r6 = r22
            goto L2f0
        L3b2:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Total bytes mismatch"
            r0.<init>(r1)
            throw r0
        L3ba:
            sb.t r0 = new sb.t
            java.lang.String r1 = "RS blocks mismatch"
            r0.<init>(r1)
            throw r0
        L3c2:
            sb.t r0 = new sb.t
            java.lang.String r1 = "EC bytes mismatch"
            r0.<init>(r1)
            throw r0
        L3ca:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Block ID too large"
            r0.<init>(r1)
            throw r0
        L3d2:
            r17 = r1
            r18 = r4
            r22 = r6
            r20 = r7
            if (r5 != r11) goto L5f8
            zb.a r0 = new zb.a
            r0.<init>()
            r1 = 0
        L3e2:
            if (r1 >= r12) goto L404
            java.util.Iterator r2 = r8.iterator()
        L3e8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L401
            java.lang.Object r3 = r2.next()
            tc.a r3 = (tc.C6210a) r3
            byte[] r3 = r3.f24161a
            int r4 = r3.length
            if (r1 >= r4) goto L3e8
            r3 = r3[r1]
            r4 = 8
            r0.m14362c(r3, r4)
            goto L3e8
        L401:
            int r1 = r1 + 1
            goto L3e2
        L404:
            r1 = 0
        L405:
            if (r1 >= r13) goto L427
            java.util.Iterator r2 = r8.iterator()
        L40b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L424
            java.lang.Object r3 = r2.next()
            tc.a r3 = (tc.C6210a) r3
            byte[] r3 = r3.f24162b
            int r4 = r3.length
            if (r1 >= r4) goto L40b
            r3 = r3[r1]
            r4 = 8
            r0.m14362c(r3, r4)
            goto L40b
        L424:
            int r1 = r1 + 1
            goto L405
        L427:
            int r1 = r0.m14367j()
            r2 = r20
            if (r2 != r1) goto L5d3
            int r1 = r18.m12187c()
            w5.c r2 = new w5.c
            r2.<init>(r1, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = 8
            r15 = -1
        L43f:
            r5 = r17
            r6 = r18
            if (r3 >= r4) goto L588
            tc.C6212c.m12815a(r0, r5, r6, r3, r2)
            r7 = 1
            int r8 = p185k7.C3828h5.m8586a(r2, r7)
            r7 = 0
            int r9 = p185k7.C3828h5.m8586a(r2, r7)
            int r9 = r9 + r8
            java.lang.Object r8 = r2.f26411d
            byte[][] r8 = (byte[][]) r8
            int r10 = r2.f26409b
            int r11 = r2.f26410c
            r12 = 0
            r13 = -1
            r16 = 0
        L45f:
            int r14 = r11 + (-1)
            if (r12 >= r14) goto L48e
            r14 = 0
        L464:
            int r4 = r10 + (-1)
            if (r14 >= r4) goto L488
            r4 = r8[r12]
            r4 = r4[r14]
            r17 = r8[r12]
            int r18 = r14 + 1
            r7 = r17[r18]
            if (r4 != r7) goto L484
            int r7 = r12 + 1
            r17 = r8[r7]
            r14 = r17[r14]
            if (r4 != r14) goto L484
            r7 = r8[r7]
            r7 = r7[r18]
            if (r4 != r7) goto L484
            int r16 = r16 + 1
        L484:
            r14 = r18
            r7 = 0
            goto L464
        L488:
            int r12 = r12 + 1
            r4 = 8
            r7 = 0
            goto L45f
        L48e:
            int r16 = r16 * 3
            int r16 = r16 + r9
            java.lang.Object r4 = r2.f26411d
            byte[][] r4 = (byte[][]) r4
            int r7 = r2.f26409b
            int r8 = r2.f26410c
            r9 = 0
            r10 = 0
        L49c:
            if (r9 >= r8) goto L542
            r11 = 0
        L49f:
            if (r11 >= r7) goto L53b
            r12 = r4[r9]
            int r14 = r11 + 6
            if (r14 >= r7) goto L4e5
            r13 = r12[r11]
            r17 = r7
            r7 = 1
            if (r13 != r7) goto L4e7
            int r13 = r11 + 1
            r13 = r12[r13]
            if (r13 != 0) goto L4e7
            int r13 = r11 + 2
            r13 = r12[r13]
            if (r13 != r7) goto L4e7
            int r13 = r11 + 3
            r13 = r12[r13]
            if (r13 != r7) goto L4e7
            int r13 = r11 + 4
            r13 = r12[r13]
            if (r13 != r7) goto L4e7
            int r13 = r11 + 5
            r13 = r12[r13]
            if (r13 != 0) goto L4e7
            r13 = r12[r14]
            if (r13 != r7) goto L4e7
            int r7 = r11 + (-4)
            boolean r7 = p185k7.C3828h5.m8606u(r12, r7, r11)
            if (r7 != 0) goto L4e2
            int r7 = r11 + 7
            int r13 = r11 + 11
            boolean r7 = p185k7.C3828h5.m8606u(r12, r7, r13)
            if (r7 == 0) goto L4e7
        L4e2:
            int r10 = r10 + 1
            goto L4e7
        L4e5:
            r17 = r7
        L4e7:
            int r7 = r9 + 6
            if (r7 >= r8) goto L534
            r12 = r4[r9]
            r12 = r12[r11]
            r13 = 1
            if (r12 != r13) goto L534
            int r12 = r9 + 1
            r12 = r4[r12]
            r12 = r12[r11]
            if (r12 != 0) goto L534
            int r12 = r9 + 2
            r12 = r4[r12]
            r12 = r12[r11]
            if (r12 != r13) goto L534
            int r12 = r9 + 3
            r12 = r4[r12]
            r12 = r12[r11]
            if (r12 != r13) goto L534
            int r12 = r9 + 4
            r12 = r4[r12]
            r12 = r12[r11]
            if (r12 != r13) goto L534
            int r12 = r9 + 5
            r12 = r4[r12]
            r12 = r12[r11]
            if (r12 != 0) goto L534
            r7 = r4[r7]
            r7 = r7[r11]
            if (r7 != r13) goto L534
            int r7 = r9 + (-4)
            boolean r7 = p185k7.C3828h5.m8607v(r4, r11, r7, r9)
            if (r7 != 0) goto L532
            int r7 = r9 + 7
            int r12 = r9 + 11
            boolean r7 = p185k7.C3828h5.m8607v(r4, r11, r7, r12)
            if (r7 == 0) goto L534
        L532:
            int r10 = r10 + 1
        L534:
            int r11 = r11 + 1
            r7 = r17
            r13 = -1
            goto L49f
        L53b:
            r17 = r7
            int r9 = r9 + 1
            r13 = -1
            goto L49c
        L542:
            int r10 = r10 * 40
            int r10 = r10 + r16
            java.lang.Object r4 = r2.f26411d
            byte[][] r4 = (byte[][]) r4
            int r7 = r2.f26409b
            int r8 = r2.f26410c
            r9 = 0
            r16 = 0
        L551:
            if (r9 >= r8) goto L565
            r11 = r4[r9]
            r12 = 0
        L556:
            if (r12 >= r7) goto L562
            r13 = r11[r12]
            r14 = 1
            if (r13 != r14) goto L55f
            int r16 = r16 + 1
        L55f:
            int r12 = r12 + 1
            goto L556
        L562:
            int r9 = r9 + 1
            goto L551
        L565:
            int r4 = r2.f26410c
            int r7 = r2.f26409b
            int r4 = r4 * r7
            int r7 = r16 << 1
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            r8 = 10
            int r7 = r7 * 10
            int r7 = r7 / r4
            int r7 = r7 * 10
            int r7 = r7 + r10
            if (r7 >= r1) goto L57e
            r15 = r3
            r1 = r7
        L57e:
            int r3 = r3 + 1
            r17 = r5
            r18 = r6
            r4 = 8
            goto L43f
        L588:
            tc.C6212c.m12815a(r0, r5, r6, r15, r2)
            int r0 = r2.f26409b
            int r1 = r2.f26410c
            r3 = 1
            int r4 = r22 << 1
            int r3 = r0 + r4
            int r4 = r4 + r1
            r5 = r27
            int r5 = java.lang.Math.max(r5, r3)
            r6 = r28
            int r6 = java.lang.Math.max(r6, r4)
            int r3 = r5 / r3
            int r4 = r6 / r4
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r0 * r3
            int r4 = r5 - r4
            r7 = 2
            int r4 = r4 / r7
            int r8 = r1 * r3
            int r8 = r6 - r8
            int r8 = r8 / r7
            zb.b r7 = new zb.b
            r7.<init>(r5, r6)
            r5 = 0
        L5ba:
            if (r5 >= r1) goto L5d2
            r9 = r4
            r6 = 0
        L5be:
            if (r6 >= r0) goto L5ce
            byte r10 = r2.m13833b(r6, r5)
            r11 = 1
            if (r10 != r11) goto L5ca
            r7.m14377g(r9, r8, r3, r3)
        L5ca:
            int r6 = r6 + 1
            int r9 = r9 + r3
            goto L5be
        L5ce:
            int r5 = r5 + 1
            int r8 = r8 + r3
            goto L5ba
        L5d2:
            return r7
        L5d3:
            sb.t r1 = new sb.t
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Interleaving error: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " and "
            r3.append(r2)
            int r0 = r0.m14367j()
            r3.append(r0)
            java.lang.String r0 = " differ."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L5f8:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Data bytes does not match offset"
            r0.<init>(r1)
            throw r0
        L600:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Number of bits and data bytes does not match"
            r0.<init>(r1)
            throw r0
        L608:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Bits size does not equal capacity"
            r0.<init>(r1)
            throw r0
        L610:
            sb.t r0 = new sb.t
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "data bits cannot fit in the QR Code"
            r1.<init>(r2)
            int r2 = r9.f27901Z
            r1.append(r2)
            java.lang.String r2 = " > "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L62e:
            sb.t r1 = new sb.t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is bigger than "
            r2.append(r0)
            r0 = 1
            int r10 = r10 - r0
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L64a:
            r5 = r2
            r6 = r3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested dimensions are too small: "
            r1.<init>(r2)
            r1.append(r5)
            r2 = 120(0x78, float:1.68E-43)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L668:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can only encode QR_CODE, but got "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L67c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
    }

    @Override // ec.InterfaceC1814b
    /* renamed from: f */
    public void mo4569f(ec.C1815c r11) {
            r10 = this;
            int r0 = r10.f24033Y
            r1 = 0
            r2 = 1
            r3 = 4
            r4 = 3
            r5 = 2
            switch(r0) {
                case 4: goto Lc;
                default: goto La;
            }
        La:
            goto Lf1
        Lc:
            java.lang.String r0 = r11.f7924a
            int r6 = r11.f7929f
            int r7 = r0.length()
            if (r6 >= r7) goto L29
        L16:
            char r8 = r0.charAt(r6)
        L1a:
            boolean r9 = p185k7.C3828h5.m8602q(r8)
            if (r9 == 0) goto L29
            if (r6 >= r7) goto L29
            int r1 = r1 + 1
            int r6 = r6 + 1
            if (r6 >= r7) goto L1a
            goto L16
        L29:
            if (r1 < r5) goto L76
            java.lang.String r0 = r11.f7924a
            int r1 = r11.f7929f
            char r0 = r0.charAt(r1)
            java.lang.String r1 = r11.f7924a
            int r3 = r11.f7929f
            int r3 = r3 + r2
            char r1 = r1.charAt(r3)
            boolean r2 = p185k7.C3828h5.m8602q(r0)
            if (r2 == 0) goto L5f
            boolean r2 = p185k7.C3828h5.m8602q(r1)
            if (r2 == 0) goto L5f
            int r0 = r0 + (-48)
            int r0 = r0 * 10
            r2 = -48
            r3 = 130(0x82, float:1.82E-43)
            int r0 = androidx.appcompat.widget.C0267d.m705a(r1, r2, r0, r3)
            char r0 = (char) r0
            java.lang.StringBuilder r1 = r11.f7928e
            r1.append(r0)
            int r0 = r11.f7929f
            int r0 = r0 + r5
            goto Lee
        L5f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "not digits: "
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0)
            throw r11
        L76:
            char r0 = r11.m4571b()
            java.lang.String r1 = r11.f7924a
            int r6 = r11.f7929f
            int r7 = r10.m12757c()
            int r1 = p185k7.C3828h5.m8572A(r1, r6, r7)
            int r6 = r10.m12757c()
            if (r1 == r6) goto Ld5
            if (r1 == r2) goto Lcb
            if (r1 == r5) goto Lc1
            if (r1 == r4) goto Lb7
            if (r1 == r3) goto Lad
            r0 = 5
            if (r1 != r0) goto La1
            r1 = 231(0xe7, float:3.24E-43)
            java.lang.StringBuilder r2 = r11.f7928e
            r2.append(r1)
            r11.f7930g = r0
            goto Lf0
        La1:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Illegal mode: "
            java.lang.String r0 = p422y.C7094d.m14209a(r0, r1)
            r11.<init>(r0)
            throw r11
        Lad:
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.StringBuilder r1 = r11.f7928e
            r1.append(r0)
            r11.f7930g = r3
            goto Lf0
        Lb7:
            r0 = 238(0xee, float:3.34E-43)
            java.lang.StringBuilder r1 = r11.f7928e
            r1.append(r0)
            r11.f7930g = r4
            goto Lf0
        Lc1:
            r0 = 239(0xef, float:3.35E-43)
            java.lang.StringBuilder r1 = r11.f7928e
            r1.append(r0)
            r11.f7930g = r5
            goto Lf0
        Lcb:
            r0 = 230(0xe6, float:3.22E-43)
            java.lang.StringBuilder r1 = r11.f7928e
            r1.append(r0)
            r11.f7930g = r2
            goto Lf0
        Ld5:
            boolean r1 = p185k7.C3828h5.m8603r(r0)
            if (r1 == 0) goto Le4
            r1 = 235(0xeb, float:3.3E-43)
            java.lang.StringBuilder r3 = r11.f7928e
            r3.append(r1)
            int r0 = r0 + (-128)
        Le4:
            int r0 = r0 + r2
            char r0 = (char) r0
            java.lang.StringBuilder r1 = r11.f7928e
            r1.append(r0)
            int r0 = r11.f7929f
            int r0 = r0 + r2
        Lee:
            r11.f7929f = r0
        Lf0:
            return
        Lf1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        Lf6:
            boolean r6 = r11.m4573d()
            r7 = 0
            if (r6 == 0) goto L148
            char r6 = r11.m4571b()
            r8 = 32
            if (r6 < r8) goto L10a
            r8 = 63
            if (r6 > r8) goto L10a
            goto L115
        L10a:
            r8 = 64
            if (r6 < r8) goto L144
            r8 = 94
            if (r6 > r8) goto L144
            int r6 = r6 + (-64)
            char r6 = (char) r6
        L115:
            r0.append(r6)
            int r6 = r11.f7929f
            int r6 = r6 + r2
            r11.f7929f = r6
            int r6 = r0.length()
            if (r6 < r3) goto Lf6
            java.lang.String r6 = m12755a(r0, r1)
            java.lang.StringBuilder r8 = r11.f7928e
            r8.append(r6)
            r0.delete(r1, r3)
            java.lang.String r6 = r11.f7924a
            int r8 = r11.f7929f
            int r9 = r10.m12757c()
            int r6 = p185k7.C3828h5.m8572A(r6, r8, r9)
            int r8 = r10.m12757c()
            if (r6 == r8) goto Lf6
            r11.f7930g = r1
            goto L148
        L144:
            p185k7.C3828h5.m8601p(r6)
            throw r7
        L148:
            r6 = 31
            r0.append(r6)
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L1b9
            if (r6 != 0) goto L154
            goto L1ae
        L154:
            if (r6 != r2) goto L16b
            r11.m4574e()     // Catch: java.lang.Throwable -> L1b9
            ec.e r8 = r11.f7931h     // Catch: java.lang.Throwable -> L1b9
            int r8 = r8.f7939b     // Catch: java.lang.Throwable -> L1b9
            int r9 = r11.m4570a()     // Catch: java.lang.Throwable -> L1b9
            int r8 = r8 - r9
            int r9 = r11.m4572c()     // Catch: java.lang.Throwable -> L1b9
            if (r9 != 0) goto L16b
            if (r8 > r5) goto L16b
            goto L1ae
        L16b:
            if (r6 > r3) goto L1b1
            int r6 = r6 - r2
            java.lang.String r0 = m12755a(r0, r1)     // Catch: java.lang.Throwable -> L1b9
            boolean r3 = r11.m4573d()     // Catch: java.lang.Throwable -> L1b9
            r3 = r3 ^ r2
            if (r3 == 0) goto L17c
            if (r6 > r5) goto L17c
            goto L17d
        L17c:
            r2 = 0
        L17d:
            if (r6 > r5) goto L19f
            int r3 = r11.m4570a()     // Catch: java.lang.Throwable -> L1b9
            int r3 = r3 + r6
            r11.m4575f(r3)     // Catch: java.lang.Throwable -> L1b9
            ec.e r3 = r11.f7931h     // Catch: java.lang.Throwable -> L1b9
            int r3 = r3.f7939b     // Catch: java.lang.Throwable -> L1b9
            int r5 = r11.m4570a()     // Catch: java.lang.Throwable -> L1b9
            int r3 = r3 - r5
            if (r3 < r4) goto L19f
            int r2 = r11.m4570a()     // Catch: java.lang.Throwable -> L1b9
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L1b9
            int r2 = r2 + r3
            r11.m4575f(r2)     // Catch: java.lang.Throwable -> L1b9
            r2 = 0
        L19f:
            if (r2 == 0) goto L1a9
            r11.f7931h = r7     // Catch: java.lang.Throwable -> L1b9
            int r0 = r11.f7929f     // Catch: java.lang.Throwable -> L1b9
            int r0 = r0 - r6
            r11.f7929f = r0     // Catch: java.lang.Throwable -> L1b9
            goto L1ae
        L1a9:
            java.lang.StringBuilder r2 = r11.f7928e     // Catch: java.lang.Throwable -> L1b9
            r2.append(r0)     // Catch: java.lang.Throwable -> L1b9
        L1ae:
            r11.f7930g = r1
            return
        L1b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r2 = "Count must not exceed 4"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1b9
            throw r0     // Catch: java.lang.Throwable -> L1b9
        L1b9:
            r0 = move-exception
            r11.f7930g = r1
            throw r0
    }

    @Override // p425y2.InterfaceC7105b
    /* renamed from: g */
    public p214m2.InterfaceC4345w<byte[]> mo1272g(p214m2.InterfaceC4345w<p404x2.C6914c> r5, p180k2.C3673e r6) {
            r4 = this;
            java.lang.Object r5 = r5.get()
            x2.c r5 = (p404x2.C6914c) r5
            x2.c$a r5 = r5.f26903Y
            x2.e r5 = r5.f26913a
            j2.a r5 = r5.f26915a
            java.nio.ByteBuffer r5 = r5.getData()
            java.nio.ByteBuffer r5 = r5.asReadOnlyBuffer()
            u2.b r6 = new u2.b
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = p106g3.C2229a.f10188a
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L36
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L36
            g3.a$b r0 = new g3.a$b
            byte[] r1 = r5.array()
            int r2 = r5.arrayOffset()
            int r3 = r5.limit()
            r0.<init>(r1, r2, r3)
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L49
            int r1 = r0.f10191a
            if (r1 != 0) goto L49
            int r1 = r0.f10192b
            byte[] r0 = r0.f10193c
            int r0 = r0.length
            if (r1 != r0) goto L49
            byte[] r5 = r5.array()
            goto L5b
        L49:
            java.nio.ByteBuffer r5 = r5.asReadOnlyBuffer()
            int r0 = r5.limit()
            byte[] r0 = new byte[r0]
            r1 = 0
            r5.position(r1)
            r5.get(r0)
            r5 = r0
        L5b:
            r6.<init>(r5)
            return r6
    }
}
