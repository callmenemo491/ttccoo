package p343tb;

/* renamed from: tb.b */
/* loaded from: classes.dex */
public final class C6208b implements sb.InterfaceC6019m {

    /* renamed from: a */
    public final /* synthetic */ int f24159a;

    public C6208b(int r1) {
            r0 = this;
            r0.f24159a = r1
            r0.<init>()
            return
    }

    /* renamed from: d */
    public static int m12810d(sb.C6023q r0, sb.C6023q r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L5
            goto L10
        L5:
            float r0 = r0.f23222a
            float r1 = r1.f23222a
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            return r0
        L10:
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public static int m12811e(sb.C6023q r0, sb.C6023q r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L5
            goto L10
        L5:
            float r0 = r0.f23222a
            float r1 = r1.f23222a
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            return r0
        L10:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: a */
    public sb.C6021o mo2335a(p128hb.C3003h r3) {
            r2 = this;
            int r0 = r2.f24159a
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto Lc
        L7:
            sb.o r3 = r2.mo2337c(r3, r1)
            return r3
        Lc:
            sb.o r3 = r2.mo2337c(r3, r1)
            return r3
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: b */
    public void mo2336b() {
            r0 = this;
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: c */
    public sb.C6021o mo2337c(p128hb.C3003h r33, java.util.Map r34) {
            r32 = this;
            r1 = r34
            sb.p r2 = sb.EnumC6022p.f23213a0
            r3 = r32
            int r0 = r3.f24159a
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto La7
        Lf:
            vb.a r7 = new vb.a
            zb.b r0 = r33.m7387m()
            r7.<init>(r0)
            tb.a r0 = r7.m13484a(r5)     // Catch: sb.C6012f -> L32 sb.C6017k -> L39
            java.util.Map<java.lang.String, java.lang.String> r8 = r0.f12119c     // Catch: sb.C6012f -> L32 sb.C6017k -> L39
            sb.q[] r8 = (sb.C6023q[]) r8     // Catch: sb.C6012f -> L32 sb.C6017k -> L39
            ub.a r9 = new ub.a     // Catch: sb.C6012f -> L2e sb.C6017k -> L30
            r9.<init>()     // Catch: sb.C6012f -> L2e sb.C6017k -> L30
            zb.e r0 = r9.m13018a(r0)     // Catch: sb.C6012f -> L2e sb.C6017k -> L30
            r4 = r0
            r0 = r8
            r8 = 0
            r9 = 0
            goto L42
        L2e:
            r0 = move-exception
            goto L34
        L30:
            r0 = move-exception
            goto L3b
        L32:
            r0 = move-exception
            r8 = 0
        L34:
            r9 = r0
            r0 = r8
            r4 = 0
            r8 = 0
            goto L42
        L39:
            r0 = move-exception
            r8 = 0
        L3b:
            r4 = 0
            r9 = 0
            r31 = r8
            r8 = r0
            r0 = r31
        L42:
            if (r4 != 0) goto L62
            tb.a r0 = r7.m13484a(r6)     // Catch: sb.C6012f -> L58 sb.C6017k -> L5a
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f12119c     // Catch: sb.C6012f -> L58 sb.C6017k -> L5a
            sb.q[] r4 = (sb.C6023q[]) r4     // Catch: sb.C6012f -> L58 sb.C6017k -> L5a
            ub.a r6 = new ub.a     // Catch: sb.C6012f -> L58 sb.C6017k -> L5a
            r6.<init>()     // Catch: sb.C6012f -> L58 sb.C6017k -> L5a
            zb.e r0 = r6.m13018a(r0)     // Catch: sb.C6012f -> L58 sb.C6017k -> L5a
            r14 = r4
            r4 = r0
            goto L63
        L58:
            r0 = move-exception
            goto L5b
        L5a:
            r0 = move-exception
        L5b:
            if (r8 != 0) goto L61
            if (r9 == 0) goto L60
            throw r9
        L60:
            throw r0
        L61:
            throw r8
        L62:
            r14 = r0
        L63:
            if (r1 == 0) goto L7a
            sb.c r0 = sb.EnumC6009c.f23178h0
            java.lang.Object r0 = r1.get(r0)
            sb.r r0 = (sb.InterfaceC6024r) r0
            if (r0 == 0) goto L7a
            int r1 = r14.length
        L70:
            if (r5 >= r1) goto L7a
            r6 = r14[r5]
            r0.mo12503a(r6)
            int r5 = r5 + 1
            goto L70
        L7a:
            sb.o r0 = new sb.o
            java.lang.Object r1 = r4.f27916c
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r4.f27914a
            r12 = r1
            byte[] r12 = (byte[]) r12
            int r13 = r4.f27915b
            sb.a r15 = sb.EnumC6007a.f23151Y
            long r16 = java.lang.System.currentTimeMillis()
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.List<byte[]> r1 = r4.f27917d
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L9d
            sb.p r5 = sb.EnumC6022p.f23212Z
            r0.m12500b(r5, r1)
        L9d:
            java.lang.Object r1 = r4.f27918e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto La6
            r0.m12500b(r2, r1)
        La6:
            return r0
        La7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            zb.b r1 = r33.m7387m()
            java.util.List r7 = p254oc.C5190a.m11505a(r5, r1)
            r8 = r7
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.isEmpty()
            r9 = 2
            if (r8 == 0) goto L114
            zb.b r7 = new zb.b
            int r8 = r1.f27902Y
            int r10 = r1.f27903Z
            int r11 = r1.f27904a0
            int[] r1 = r1.f27905b0
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r7.<init>(r8, r10, r11, r1)
            zb.a r1 = new zb.a
            r1.<init>(r8)
            zb.a r11 = new zb.a
            r11.<init>(r8)
            r8 = 0
        Ldc:
            int r12 = r10 + 1
            int r12 = r12 / r9
            if (r8 >= r12) goto L10b
            zb.a r1 = r7.m14374d(r8, r1)
            int r12 = r10 + (-1)
            int r12 = r12 - r8
            zb.a r11 = r7.m14374d(r12, r11)
            r1.m14369m()
            r11.m14369m()
            int[] r13 = r11.f27900Y
            int[] r14 = r7.f27905b0
            int r15 = r7.f27904a0
            int r4 = r8 * r15
            java.lang.System.arraycopy(r13, r5, r14, r4, r15)
            int[] r4 = r1.f27900Y
            int[] r13 = r7.f27905b0
            int r14 = r7.f27904a0
            int r12 = r12 * r14
            java.lang.System.arraycopy(r4, r5, r13, r12, r14)
            int r8 = r8 + 1
            goto Ldc
        L10b:
            java.util.List r1 = p254oc.C5190a.m11505a(r5, r7)
            r31 = r7
            r7 = r1
            r1 = r31
        L114:
            java.util.Iterator r4 = r7.iterator()
        L118:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L595
            java.lang.Object r7 = r4.next()
            sb.q[] r7 = (sb.C6023q[]) r7
            r8 = 4
            r17 = r7[r8]
            r10 = 5
            r13 = r7[r10]
            r11 = 6
            r18 = r7[r11]
            r12 = 7
            r15 = r7[r12]
            r14 = r7[r5]
            r5 = r7[r8]
            int r5 = m12811e(r14, r5)
            r14 = r7[r11]
            r11 = r7[r9]
            int r11 = m12811e(r14, r11)
            int r11 = r11 * 17
            int r11 = r11 / 18
            int r5 = java.lang.Math.min(r5, r11)
            r11 = r7[r6]
            r14 = r7[r10]
            int r11 = m12811e(r11, r14)
            r14 = r7[r12]
            r19 = 3
            r12 = r7[r19]
            int r12 = m12811e(r14, r12)
            int r12 = r12 * 17
            int r12 = r12 / 18
            int r11 = java.lang.Math.min(r11, r12)
            int r5 = java.lang.Math.min(r5, r11)
            r11 = 0
            r12 = r7[r11]
            r8 = r7[r8]
            int r8 = m12810d(r12, r8)
            r11 = 6
            r11 = r7[r11]
            r12 = r7[r9]
            int r11 = m12810d(r11, r12)
            int r11 = r11 * 17
            int r11 = r11 / 18
            int r8 = java.lang.Math.max(r8, r11)
            r11 = r7[r6]
            r10 = r7[r10]
            int r10 = m12810d(r11, r10)
            r11 = 7
            r11 = r7[r11]
            r12 = r7[r19]
            int r11 = m12810d(r11, r12)
            int r11 = r11 * 17
            int r11 = r11 / 18
            int r10 = java.lang.Math.max(r10, r11)
            int r8 = java.lang.Math.max(r8, r10)
            h7.rb r10 = mc.C4535g.f18439a
            mc.c r19 = new mc.c
            r10 = r19
            r11 = r1
            r12 = r17
            r14 = r18
            r10.<init>(r11, r12, r13, r14, r15)
            r15 = r19
            r10 = 0
            r11 = 0
            r14 = 0
            r19 = 0
        L1b2:
            if (r14 >= r9) goto L26d
            if (r17 == 0) goto L1c6
            r13 = 1
            r10 = r1
            r11 = r15
            r12 = r17
            r20 = r14
            r14 = r5
            r33 = r15
            r15 = r8
            mc.e r10 = mc.C4535g.m10446d(r10, r11, r12, r13, r14, r15)
            goto L1ca
        L1c6:
            r20 = r14
            r33 = r15
        L1ca:
            r21 = r10
            if (r18 == 0) goto L1da
            r13 = 0
            r10 = r1
            r11 = r33
            r12 = r18
            r14 = r5
            r15 = r8
            mc.e r19 = mc.C4535g.m10446d(r10, r11, r12, r13, r14, r15)
        L1da:
            if (r21 != 0) goto L1df
            if (r19 != 0) goto L1df
            goto L20e
        L1df:
            if (r21 == 0) goto L204
            mc.a r10 = r21.m10441A()
            if (r10 != 0) goto L1e8
            goto L204
        L1e8:
            if (r19 == 0) goto L20c
            mc.a r11 = r19.m10441A()
            if (r11 != 0) goto L1f1
            goto L20c
        L1f1:
            int r12 = r10.f18418b
            int r13 = r11.f18418b
            if (r12 == r13) goto L20c
            int r12 = r10.f18419c
            int r13 = r11.f18419c
            if (r12 == r13) goto L20c
            int r12 = r10.f18422f
            int r11 = r11.f18422f
            if (r12 == r11) goto L20c
            goto L206
        L204:
            if (r19 != 0) goto L208
        L206:
            r10 = 0
            goto L20c
        L208:
            mc.a r10 = r19.m10441A()
        L20c:
            if (r10 != 0) goto L210
        L20e:
            r11 = 0
            goto L241
        L210:
            mc.c r11 = mc.C4535g.m10443a(r21)
            mc.c r12 = mc.C4535g.m10443a(r19)
            if (r11 != 0) goto L21c
            r11 = r12
            goto L23b
        L21c:
            if (r12 != 0) goto L21f
            goto L23b
        L21f:
            mc.c r13 = new mc.c
            zb.b r14 = r11.f18424a
            sb.q r15 = r11.f18425b
            sb.q r11 = r11.f18426c
            sb.q r9 = r12.f18427d
            sb.q r12 = r12.f18428e
            r25 = r13
            r26 = r14
            r27 = r15
            r28 = r11
            r29 = r9
            r30 = r12
            r25.<init>(r26, r27, r28, r29, r30)
            r11 = r13
        L23b:
            j6.h r9 = new j6.h
            r9.<init>(r10, r11)
            r11 = r9
        L241:
            if (r11 == 0) goto L26a
            if (r20 != 0) goto L261
            java.lang.Object r9 = r11.f14894b0
            r15 = r9
            mc.c r15 = (mc.C4531c) r15
            if (r15 == 0) goto L261
            int r9 = r15.f18431h
            r12 = r33
            int r10 = r12.f18431h
            if (r9 < r10) goto L25a
            int r9 = r15.f18432i
            int r10 = r12.f18432i
            if (r9 <= r10) goto L263
        L25a:
            int r14 = r20 + 1
            r10 = r21
            r9 = 2
            goto L1b2
        L261:
            r12 = r33
        L263:
            r11.f14894b0 = r12
            r9 = r19
            r10 = r21
            goto L270
        L26a:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        L26d:
            r12 = r15
            r9 = r19
        L270:
            int r13 = r11.f14895c0
            int r13 = r13 + r6
            r14 = 0
            r11.m7899l(r14, r10)
            r11.m7899l(r13, r9)
            if (r10 == 0) goto L27e
            r9 = 1
            goto L27f
        L27e:
            r9 = 0
        L27f:
            r10 = 1
        L280:
            if (r10 > r13) goto L3c5
            if (r9 == 0) goto L286
            r15 = r10
            goto L288
        L286:
            int r15 = r13 - r10
        L288:
            hb.h r17 = r11.m7898k(r15)
            if (r17 != 0) goto L3ae
            if (r15 == 0) goto L299
            if (r15 != r13) goto L293
            goto L299
        L293:
            hb.h r6 = new hb.h
            r6.<init>(r12)
            goto L2a3
        L299:
            mc.e r6 = new mc.e
            if (r15 != 0) goto L29f
            r14 = 1
            goto L2a0
        L29f:
            r14 = 0
        L2a0:
            r6.<init>(r12, r14)
        L2a3:
            r11.m7899l(r15, r6)
            int r14 = r12.f18431h
            r26 = r4
            r3 = -1
        L2ab:
            int r4 = r12.f18432i
            if (r14 > r4) goto L3a9
            r27 = r13
            if (r9 == 0) goto L2b5
            r4 = 1
            goto L2b6
        L2b5:
            r4 = -1
        L2b6:
            int r13 = r15 - r4
            boolean r17 = mc.C4535g.m10447e(r11, r13)
            if (r17 == 0) goto L2d5
            r28 = r0
            hb.h r0 = r11.m7898k(r13)
            r29 = r2
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f12119c
            mc.a[] r2 = (mc.C4529a[]) r2
            wa.b<s9.a> r0 = r0.f12118b
            mc.c r0 = (mc.C4531c) r0
            int r0 = r0.f18431h
            int r0 = r14 - r0
            r0 = r2[r0]
            goto L2da
        L2d5:
            r28 = r0
            r29 = r2
            r0 = 0
        L2da:
            if (r0 == 0) goto L2df
            if (r9 == 0) goto L303
            goto L300
        L2df:
            java.lang.Object r0 = r11.f14893a0
            hb.h[] r0 = (p128hb.C3003h[]) r0
            r0 = r0[r15]
            mc.a r0 = r0.m7388n(r14)
            if (r0 == 0) goto L2ee
            if (r9 == 0) goto L300
            goto L303
        L2ee:
            boolean r2 = mc.C4535g.m10447e(r11, r13)
            if (r2 == 0) goto L2fc
            hb.h r0 = r11.m7898k(r13)
            mc.a r0 = r0.m7388n(r14)
        L2fc:
            if (r0 == 0) goto L308
            if (r9 == 0) goto L303
        L300:
            int r0 = r0.f18419c
            goto L305
        L303:
            int r0 = r0.f18418b
        L305:
            r30 = r15
            goto L356
        L308:
            r2 = r15
            r0 = 0
        L30a:
            int r2 = r2 - r4
            boolean r13 = mc.C4535g.m10447e(r11, r2)
            if (r13 == 0) goto L345
            hb.h r13 = r11.m7898k(r2)
            java.util.Map<java.lang.String, java.lang.String> r13 = r13.f12119c
            mc.a[] r13 = (mc.C4529a[]) r13
            r17 = r2
            int r2 = r13.length
            r30 = r15
            r15 = 0
        L31f:
            if (r15 >= r2) goto L33e
            r18 = r2
            r2 = r13[r15]
            if (r2 == 0) goto L339
            if (r9 == 0) goto L32c
            int r13 = r2.f18419c
            goto L32e
        L32c:
            int r13 = r2.f18418b
        L32e:
            int r4 = r4 * r0
            int r0 = r2.f18419c
            int r2 = r2.f18418b
            int r0 = r0 - r2
            int r0 = r0 * r4
            int r0 = r0 + r13
            goto L356
        L339:
            int r15 = r15 + 1
            r2 = r18
            goto L31f
        L33e:
            int r0 = r0 + 1
            r2 = r17
            r15 = r30
            goto L30a
        L345:
            r30 = r15
            if (r9 == 0) goto L350
            java.lang.Object r0 = r11.f14894b0
            mc.c r0 = (mc.C4531c) r0
            int r0 = r0.f18429f
            goto L356
        L350:
            java.lang.Object r0 = r11.f14894b0
            mc.c r0 = (mc.C4531c) r0
            int r0 = r0.f18430g
        L356:
            if (r0 < 0) goto L35c
            int r2 = r12.f18430g
            if (r0 <= r2) goto L360
        L35c:
            r0 = -1
            if (r3 == r0) goto L39d
            r0 = r3
        L360:
            int r2 = r12.f18429f
            int r4 = r12.f18430g
            r17 = r1
            r18 = r2
            r19 = r4
            r20 = r9
            r21 = r0
            r22 = r14
            r23 = r5
            r24 = r8
            mc.a r2 = mc.C4535g.m10445c(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r2 == 0) goto L39d
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.f12119c
            mc.a[] r3 = (mc.C4529a[]) r3
            wa.b<s9.a> r4 = r6.f12118b
            mc.c r4 = (mc.C4531c) r4
            int r4 = r4.f18431h
            int r4 = r14 - r4
            r3[r4] = r2
            int r3 = r2.f18419c
            int r4 = r2.f18418b
            int r3 = r3 - r4
            int r3 = java.lang.Math.min(r5, r3)
            int r4 = r2.f18419c
            int r2 = r2.f18418b
            int r4 = r4 - r2
            int r2 = java.lang.Math.max(r8, r4)
            r8 = r2
            r5 = r3
            r3 = r0
        L39d:
            int r14 = r14 + 1
            r13 = r27
            r0 = r28
            r2 = r29
            r15 = r30
            goto L2ab
        L3a9:
            r28 = r0
            r29 = r2
            goto L3b4
        L3ae:
            r28 = r0
            r29 = r2
            r26 = r4
        L3b4:
            r27 = r13
            int r10 = r10 + 1
            r3 = r32
            r4 = r26
            r13 = r27
            r0 = r28
            r2 = r29
            r6 = 1
            goto L280
        L3c5:
            r28 = r0
            r29 = r2
            r26 = r4
            int r0 = r11.m7897j()
            int r2 = r11.f14895c0
            r3 = 2
            int r2 = r2 + r3
            int[] r4 = new int[r3]
            r3 = 1
            r4[r3] = r2
            r2 = 0
            r4[r2] = r0
            java.lang.Class<mc.b> r0 = mc.C4530b.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r4)
            mc.b[][] r0 = (mc.C4530b[][]) r0
            r2 = 0
        L3e4:
            int r3 = r0.length
            if (r2 >= r3) goto L3fc
            r3 = 0
        L3e8:
            r4 = r0[r2]
            int r4 = r4.length
            if (r3 >= r4) goto L3f9
            r4 = r0[r2]
            mc.b r5 = new mc.b
            r5.<init>()
            r4[r3] = r5
            int r3 = r3 + 1
            goto L3e8
        L3f9:
            int r2 = r2 + 1
            goto L3e4
        L3fc:
            java.lang.Object r2 = r11.f14893a0
            hb.h[] r2 = (p128hb.C3003h[]) r2
            r3 = 0
            r2 = r2[r3]
            r11.m7890b(r2)
            java.lang.Object r2 = r11.f14893a0
            hb.h[] r2 = (p128hb.C3003h[]) r2
            int r3 = r11.f14895c0
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r11.m7890b(r2)
            r2 = 928(0x3a0, float:1.3E-42)
            r3 = 928(0x3a0, float:1.3E-42)
        L417:
            int r4 = r11.m7891d()
            if (r4 <= 0) goto L422
            if (r4 < r3) goto L420
            goto L422
        L420:
            r3 = r4
            goto L417
        L422:
            java.lang.Object r3 = r11.f14893a0
            hb.h[] r3 = (p128hb.C3003h[]) r3
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L429:
            if (r5 >= r4) goto L453
            r8 = r3[r5]
            if (r8 == 0) goto L44e
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f12119c
            mc.a[] r8 = (mc.C4529a[]) r8
            int r9 = r8.length
            r10 = 0
        L435:
            if (r10 >= r9) goto L44e
            r12 = r8[r10]
            if (r12 == 0) goto L44b
            int r13 = r12.f18422f
            if (r13 < 0) goto L44b
            int r14 = r0.length
            if (r13 >= r14) goto L44b
            r13 = r0[r13]
            r13 = r13[r6]
            int r12 = r12.f18421e
            r13.m10437b(r12)
        L44b:
            int r10 = r10 + 1
            goto L435
        L44e:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L429
        L453:
            r5 = 0
            r3 = r0[r5]
            r4 = 1
            r3 = r3[r4]
            int[] r3 = r3.m10436a()
            int r4 = r11.f14895c0
            int r5 = r11.m7897j()
            int r5 = r5 * r4
            java.lang.Object r4 = r11.f14892Z
            mc.a r4 = (mc.C4529a) r4
            int r4 = r4.f18419c
            r6 = 2
            int r4 = r6 << r4
            int r5 = r5 - r4
            int r4 = r3.length
            if (r4 != 0) goto L480
            if (r5 <= 0) goto L47d
            if (r5 > r2) goto L47d
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r3 = r3[r4]
            goto L48a
        L47d:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
        L480:
            r2 = 0
            r4 = 1
            r3 = r3[r2]
            if (r3 == r5) goto L48d
            r3 = r0[r2]
            r3 = r3[r4]
        L48a:
            r3.m10437b(r5)
        L48d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r11.m7897j()
            int r4 = r11.f14895c0
            int r3 = r3 * r4
            int[] r3 = new int[r3]
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = 0
        L4a7:
            int r9 = r11.m7897j()
            if (r8 >= r9) goto L4e5
            r9 = 0
        L4ae:
            int r10 = r11.f14895c0
            if (r9 >= r10) goto L4e2
            r10 = r0[r8]
            int r12 = r9 + 1
            r10 = r10[r12]
            int[] r10 = r10.m10436a()
            int r13 = r11.f14895c0
            int r13 = r13 * r8
            int r13 = r13 + r9
            int r9 = r10.length
            if (r9 != 0) goto L4cc
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r2.add(r9)
            goto L4e0
        L4cc:
            int r9 = r10.length
            r14 = 1
            if (r9 != r14) goto L4d6
            r9 = 0
            r10 = r10[r9]
            r3[r13] = r10
            goto L4e0
        L4d6:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r5.add(r9)
            r4.add(r10)
        L4e0:
            r9 = r12
            goto L4ae
        L4e2:
            int r8 = r8 + 1
            goto L4a7
        L4e5:
            int r0 = r4.size()
            int[][] r8 = new int[r0][]
            r9 = 0
        L4ec:
            if (r9 >= r0) goto L4f9
            java.lang.Object r10 = r4.get(r9)
            int[] r10 = (int[]) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L4ec
        L4f9:
            java.lang.Object r0 = r11.f14892Z
            mc.a r0 = (mc.C4529a) r0
            int r0 = r0.f18419c
            int[] r2 = lc.C4262a.m9570b(r2)
            int[] r4 = lc.C4262a.m9570b(r5)
            int r5 = r4.length
            int[] r9 = new int[r5]
            r10 = 100
        L50c:
            int r11 = r10 + (-1)
            if (r10 <= 0) goto L590
            r10 = 0
        L511:
            if (r10 >= r5) goto L520
            r12 = r4[r10]
            r13 = r8[r10]
            r14 = r9[r10]
            r13 = r13[r14]
            r3[r12] = r13
            int r10 = r10 + 1
            goto L511
        L520:
            zb.e r0 = mc.C4535g.m10444b(r3, r0, r2)     // Catch: sb.C6008b -> L557
            sb.o r2 = new sb.o
            java.lang.Object r3 = r0.f27916c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.f27914a
            byte[] r4 = (byte[]) r4
            sb.a r5 = sb.EnumC6007a.f23161i0
            r2.<init>(r3, r4, r7, r5)
            java.lang.Object r3 = r0.f27918e
            java.lang.String r3 = (java.lang.String) r3
            r10 = r29
            r2.m12500b(r10, r3)
            java.lang.Object r0 = r0.f27921h
            lc.b r0 = (lc.C4263b) r0
            if (r0 == 0) goto L547
            sb.p r3 = sb.EnumC6022p.f23218f0
            r2.m12500b(r3, r0)
        L547:
            r12 = r28
            r12.add(r2)
            r3 = r32
            r2 = r10
            r0 = r12
            r4 = r26
            r5 = 0
            r6 = 1
            r9 = 2
            goto L118
        L557:
            r12 = r28
            r10 = r29
            if (r5 == 0) goto L58b
            r13 = 0
        L55e:
            if (r13 >= r5) goto L582
            r14 = r9[r13]
            r15 = r8[r13]
            int r15 = r15.length
            r17 = -1
            int r15 = r15 + (-1)
            if (r14 >= r15) goto L572
            r14 = r9[r13]
            r15 = 1
            int r14 = r14 + r15
            r9[r13] = r14
            goto L585
        L572:
            r14 = 0
            r15 = 1
            r9[r13] = r14
            int r14 = r5 + (-1)
            if (r13 == r14) goto L57d
            int r13 = r13 + 1
            goto L55e
        L57d:
            sb.b r0 = sb.C6008b.m12490a()
            throw r0
        L582:
            r15 = 1
            r17 = -1
        L585:
            r29 = r10
            r10 = r11
            r28 = r12
            goto L50c
        L58b:
            sb.b r0 = sb.C6008b.m12490a()
            throw r0
        L590:
            sb.b r0 = sb.C6008b.m12490a()
            throw r0
        L595:
            r12 = r0
            int r0 = r12.size()
            sb.o[] r0 = new sb.C6021o[r0]
            java.lang.Object[] r0 = r12.toArray(r0)
            sb.o[] r0 = (sb.C6021o[]) r0
            if (r0 == 0) goto L5af
            int r1 = r0.length
            if (r1 == 0) goto L5af
            r1 = 0
            r2 = r0[r1]
            if (r2 == 0) goto L5af
            r0 = r0[r1]
            return r0
        L5af:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
    }
}
