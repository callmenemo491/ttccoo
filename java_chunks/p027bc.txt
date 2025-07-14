package p027bc;

/* renamed from: bc.a */
/* loaded from: classes.dex */
public final class C0732a implements sb.InterfaceC6019m {

    /* renamed from: b */
    public static final sb.C6023q[] f4011b = null;

    /* renamed from: a */
    public final cc.C0944c f4012a;

    static {
            r0 = 0
            sb.q[] r0 = new sb.C6023q[r0]
            p027bc.C0732a.f4011b = r0
            return
    }

    public C0732a() {
            r2 = this;
            r2.<init>()
            cc.c r0 = new cc.c
            r1 = 0
            r0.<init>(r1)
            r2.f4012a = r0
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: a */
    public sb.C6021o mo2335a(p128hb.C3003h r2) {
            r1 = this;
            r0 = 0
            sb.o r2 = r1.mo2337c(r2, r0)
            return r2
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: b */
    public void mo2336b() {
            r0 = this;
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: c */
    public sb.C6021o mo2337c(p128hb.C3003h r25, java.util.Map<sb.EnumC6009c, ?> r26) {
            r24 = this;
            r0 = r24
            r1 = r26
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L84
            sb.c r4 = sb.EnumC6009c.f23170Z
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L84
            zb.b r1 = r25.m7387m()
            int[] r4 = r1.m14375e()
            int[] r5 = r1.m14373c()
            if (r4 == 0) goto L81
            if (r5 == 0) goto L81
            int r6 = r1.f27902Y
            r7 = r4[r2]
            r8 = r4[r3]
        L26:
            if (r7 >= r6) goto L31
            boolean r9 = r1.m14372b(r7, r8)
            if (r9 == 0) goto L31
            int r7 = r7 + 1
            goto L26
        L31:
            if (r7 == r6) goto L7e
            r6 = r4[r2]
            int r7 = r7 - r6
            if (r7 == 0) goto L7b
            r6 = r4[r3]
            r8 = r5[r3]
            r4 = r4[r2]
            r5 = r5[r2]
            int r5 = r5 - r4
            int r5 = r5 + r3
            int r5 = r5 / r7
            int r8 = r8 - r6
            int r8 = r8 + r3
            int r8 = r8 / r7
            if (r5 <= 0) goto L78
            if (r8 <= 0) goto L78
            int r3 = r7 / 2
            int r6 = r6 + r3
            int r4 = r4 + r3
            zb.b r3 = new zb.b
            r3.<init>(r5, r8)
            r9 = 0
        L54:
            if (r9 >= r8) goto L6e
            int r10 = r9 * r7
            int r10 = r10 + r6
            r11 = 0
        L5a:
            if (r11 >= r5) goto L6b
            int r12 = r11 * r7
            int r12 = r12 + r4
            boolean r12 = r1.m14372b(r12, r10)
            if (r12 == 0) goto L68
            r3.m14376f(r11, r9)
        L68:
            int r11 = r11 + 1
            goto L5a
        L6b:
            int r9 = r9 + 1
            goto L54
        L6e:
            cc.c r1 = r0.f4012a
            zb.e r1 = r1.m2668c(r3)
            sb.q[] r2 = p027bc.C0732a.f4011b
            goto L2fe
        L78:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L7b:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L7e:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L81:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L84:
            dc.a r1 = new dc.a
            zb.b r4 = r25.m7387m()
            r1.<init>(r4)
            w4.b r4 = r1.f7109b
            sb.q[] r4 = r4.m13820c()
            r5 = r4[r2]
            r6 = r4[r3]
            r7 = 2
            r8 = r4[r7]
            r9 = 3
            r4 = r4[r9]
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 4
            r10.<init>(r11)
            dc.a$b r12 = r1.m3970e(r5, r6)
            r10.add(r12)
            dc.a$b r12 = r1.m3970e(r5, r8)
            r10.add(r12)
            dc.a$b r12 = r1.m3970e(r6, r4)
            r10.add(r12)
            dc.a$b r12 = r1.m3970e(r8, r4)
            r10.add(r12)
            dc.a$c r12 = new dc.a$c
            r13 = 0
            r12.<init>(r13)
            java.util.Collections.sort(r10, r12)
            java.lang.Object r12 = r10.get(r2)
            dc.a$b r12 = (p058dc.C1426a.b) r12
            java.lang.Object r10 = r10.get(r3)
            dc.a$b r10 = (p058dc.C1426a.b) r10
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            sb.q r15 = r12.f7110a
            p058dc.C1426a.m3967b(r14, r15)
            sb.q r12 = r12.f7111b
            p058dc.C1426a.m3967b(r14, r12)
            sb.q r12 = r10.f7110a
            p058dc.C1426a.m3967b(r14, r12)
            sb.q r10 = r10.f7111b
            p058dc.C1426a.m3967b(r14, r10)
            java.util.Set r10 = r14.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r12 = r13
            r15 = r12
            r16 = r15
        Lf9:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto L123
            java.lang.Object r17 = r10.next()
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17
            java.lang.Object r18 = r17.getKey()
            sb.q r18 = (sb.C6023q) r18
            java.lang.Object r17 = r17.getValue()
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r13 = r17.intValue()
            if (r13 != r7) goto L11a
            r15 = r18
            goto L121
        L11a:
            if (r12 != 0) goto L11f
            r12 = r18
            goto L121
        L11f:
            r16 = r18
        L121:
            r13 = 0
            goto Lf9
        L123:
            if (r12 == 0) goto L324
            if (r15 == 0) goto L324
            if (r16 == 0) goto L324
            sb.q[] r10 = new sb.C6023q[r9]
            r10[r2] = r12
            r10[r3] = r15
            r10[r7] = r16
            sb.C6023q.m12502b(r10)
            r12 = r10[r2]
            r13 = r10[r3]
            r10 = r10[r7]
            boolean r15 = r14.containsKey(r5)
            if (r15 != 0) goto L141
            goto L152
        L141:
            boolean r5 = r14.containsKey(r6)
            if (r5 != 0) goto L149
            r5 = r6
            goto L152
        L149:
            boolean r5 = r14.containsKey(r8)
            if (r5 != 0) goto L151
            r5 = r8
            goto L152
        L151:
            r5 = r4
        L152:
            dc.a$b r4 = r1.m3970e(r10, r5)
            int r4 = r4.f7112c
            dc.a$b r6 = r1.m3970e(r12, r5)
            int r6 = r6.f7112c
            r8 = r4 & 1
            if (r8 != r3) goto L164
            int r4 = r4 + 1
        L164:
            int r4 = r4 + r7
            r8 = r6 & 1
            if (r8 != r3) goto L16b
            int r6 = r6 + 1
        L16b:
            int r6 = r6 + r7
            int r8 = r4 * 4
            int r14 = r6 * 7
            if (r8 >= r14) goto L227
            int r8 = r6 * 4
            int r14 = r4 * 7
            if (r8 < r14) goto L17a
            goto L227
        L17a:
            int r4 = java.lang.Math.min(r6, r4)
            int r6 = p058dc.C1426a.m3966a(r13, r12)
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            int r8 = p058dc.C1426a.m3966a(r10, r5)
            float r14 = r5.f23222a
            float r15 = r10.f23222a
            float r15 = r14 - r15
            float r8 = (float) r8
            float r15 = r15 / r8
            float r9 = r5.f23223b
            float r7 = r10.f23223b
            float r7 = r9 - r7
            float r7 = r7 / r8
            sb.q r8 = new sb.q
            float r15 = r15 * r6
            float r15 = r15 + r14
            float r6 = r6 * r7
            float r6 = r6 + r9
            r8.<init>(r15, r6)
            int r6 = p058dc.C1426a.m3966a(r13, r10)
            float r6 = (float) r6
            float r6 = r6 / r4
            int r4 = p058dc.C1426a.m3966a(r12, r5)
            float r7 = r5.f23222a
            float r9 = r12.f23222a
            float r9 = r7 - r9
            float r4 = (float) r4
            float r9 = r9 / r4
            float r14 = r5.f23223b
            float r15 = r12.f23223b
            float r15 = r14 - r15
            float r15 = r15 / r4
            sb.q r4 = new sb.q
            float r9 = r9 * r6
            float r9 = r9 + r7
            float r6 = r6 * r15
            float r6 = r6 + r14
            r4.<init>(r9, r6)
            boolean r6 = r1.m3969c(r8)
            if (r6 != 0) goto L1d6
            boolean r6 = r1.m3969c(r4)
            if (r6 == 0) goto L1d4
            goto L202
        L1d4:
            r4 = 0
            goto L202
        L1d6:
            boolean r6 = r1.m3969c(r4)
            if (r6 != 0) goto L1dd
            goto L201
        L1dd:
            dc.a$b r6 = r1.m3970e(r10, r8)
            int r6 = r6.f7112c
            dc.a$b r7 = r1.m3970e(r12, r8)
            int r7 = r7.f7112c
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            dc.a$b r7 = r1.m3970e(r10, r4)
            int r7 = r7.f7112c
            dc.a$b r9 = r1.m3970e(r12, r4)
            int r9 = r9.f7112c
            int r7 = r7 - r9
            int r7 = java.lang.Math.abs(r7)
            if (r6 > r7) goto L202
        L201:
            r4 = r8
        L202:
            if (r4 != 0) goto L205
            goto L206
        L205:
            r5 = r4
        L206:
            dc.a$b r4 = r1.m3970e(r10, r5)
            int r4 = r4.f7112c
            dc.a$b r6 = r1.m3970e(r12, r5)
            int r6 = r6.f7112c
            int r4 = java.lang.Math.max(r4, r6)
            int r4 = r4 + r3
            r6 = r4 & 1
            if (r6 != r3) goto L21d
            int r4 = r4 + 1
        L21d:
            zb.b r1 = r1.f7108a
            r17 = r1
            r22 = r4
            r23 = r22
            goto L2de
        L227:
            int r7 = p058dc.C1426a.m3966a(r13, r12)
            float r7 = (float) r7
            float r8 = (float) r4
            float r7 = r7 / r8
            int r8 = p058dc.C1426a.m3966a(r10, r5)
            float r9 = r5.f23222a
            float r14 = r10.f23222a
            float r14 = r9 - r14
            float r8 = (float) r8
            float r14 = r14 / r8
            float r15 = r5.f23223b
            float r2 = r10.f23223b
            float r2 = r15 - r2
            float r2 = r2 / r8
            sb.q r8 = new sb.q
            float r14 = r14 * r7
            float r14 = r14 + r9
            float r7 = r7 * r2
            float r7 = r7 + r15
            r8.<init>(r14, r7)
            int r2 = p058dc.C1426a.m3966a(r13, r10)
            float r2 = (float) r2
            float r7 = (float) r6
            float r2 = r2 / r7
            int r7 = p058dc.C1426a.m3966a(r12, r5)
            float r9 = r5.f23222a
            float r14 = r12.f23222a
            float r14 = r9 - r14
            float r7 = (float) r7
            float r14 = r14 / r7
            float r15 = r5.f23223b
            float r11 = r12.f23223b
            float r11 = r15 - r11
            float r11 = r11 / r7
            sb.q r7 = new sb.q
            float r14 = r14 * r2
            float r14 = r14 + r9
            float r2 = r2 * r11
            float r2 = r2 + r15
            r7.<init>(r14, r2)
            boolean r2 = r1.m3969c(r8)
            if (r2 != 0) goto L280
            boolean r2 = r1.m3969c(r7)
            if (r2 == 0) goto L27e
            goto L2ba
        L27e:
            r7 = 0
            goto L2ba
        L280:
            boolean r2 = r1.m3969c(r7)
            if (r2 != 0) goto L287
            goto L2b9
        L287:
            dc.a$b r2 = r1.m3970e(r10, r8)
            int r2 = r2.f7112c
            int r2 = r4 - r2
            int r2 = java.lang.Math.abs(r2)
            dc.a$b r9 = r1.m3970e(r12, r8)
            int r9 = r9.f7112c
            int r9 = r6 - r9
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 + r2
            dc.a$b r2 = r1.m3970e(r10, r7)
            int r2 = r2.f7112c
            int r4 = r4 - r2
            int r2 = java.lang.Math.abs(r4)
            dc.a$b r4 = r1.m3970e(r12, r7)
            int r4 = r4.f7112c
            int r6 = r6 - r4
            int r4 = java.lang.Math.abs(r6)
            int r4 = r4 + r2
            if (r9 > r4) goto L2ba
        L2b9:
            r7 = r8
        L2ba:
            if (r7 != 0) goto L2bd
            goto L2be
        L2bd:
            r5 = r7
        L2be:
            dc.a$b r2 = r1.m3970e(r10, r5)
            int r2 = r2.f7112c
            dc.a$b r4 = r1.m3970e(r12, r5)
            int r4 = r4.f7112c
            r6 = r2 & 1
            if (r6 != r3) goto L2d0
            int r2 = r2 + 1
        L2d0:
            r6 = r4 & 1
            if (r6 != r3) goto L2d6
            int r4 = r4 + 1
        L2d6:
            zb.b r1 = r1.f7108a
            r17 = r1
            r22 = r2
            r23 = r4
        L2de:
            r18 = r10
            r19 = r13
            r20 = r12
            r21 = r5
            zb.b r1 = p058dc.C1426a.m3968d(r17, r18, r19, r20, r21, r22, r23)
            r2 = 4
            sb.q[] r2 = new sb.C6023q[r2]
            r4 = 0
            r2[r4] = r10
            r2[r3] = r13
            r3 = 2
            r2[r3] = r12
            r3 = 3
            r2[r3] = r5
            cc.c r3 = r0.f4012a
            zb.e r1 = r3.m2668c(r1)
        L2fe:
            sb.o r3 = new sb.o
            java.lang.Object r4 = r1.f27916c
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.f27914a
            byte[] r5 = (byte[]) r5
            sb.a r6 = sb.EnumC6007a.f23156d0
            r3.<init>(r4, r5, r2, r6)
            java.util.List<byte[]> r2 = r1.f27917d
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L318
            sb.p r4 = sb.EnumC6022p.f23212Z
            r3.m12500b(r4, r2)
        L318:
            java.lang.Object r1 = r1.f27918e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L323
            sb.p r2 = sb.EnumC6022p.f23213a0
            r3.m12500b(r2, r1)
        L323:
            return r3
        L324:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
    }
}
