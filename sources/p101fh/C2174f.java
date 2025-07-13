package p101fh;

/* renamed from: fh.f */
/* loaded from: classes.dex */
public class C2174f {
    /* renamed from: A */
    public static final <T> java.lang.Object m5710A(p101fh.InterfaceC2175g r3, mh.InterfaceC4624p<? super p379vh.InterfaceC6686b0, ? super p101fh.InterfaceC2172d<? super T>, ? extends java.lang.Object> r4, p101fh.InterfaceC2172d<? super T> r5) {
            fh.g r0 = r5.mo5706c()
            fh.g r3 = r0.plus(r3)
            p209lh.C4304a.m9619m(r3)
            if (r3 != r0) goto L17
            zh.o r0 = new zh.o
            r0.<init>(r3, r5)
            java.lang.Object r3 = gh.C2390b.m6134x(r0, r0, r4)
            goto L4e
        L17:
            int r1 = p101fh.InterfaceC2173e.f9915a
            fh.e$a r1 = p101fh.InterfaceC2173e.a.f9916Y
            fh.g$a r2 = r3.get(r1)
            fh.g$a r0 = r0.get(r1)
            boolean r0 = p214m2.C4339q.m9702c(r2, r0)
            r1 = 0
            if (r0 == 0) goto L41
            vh.u1 r0 = new vh.u1
            r0.<init>(r3, r5)
            java.lang.Object r1 = p459zh.C7352r.m14437b(r3, r1)
            java.lang.Object r4 = gh.C2390b.m6134x(r0, r0, r4)     // Catch: java.lang.Throwable -> L3c
            p459zh.C7352r.m14436a(r3, r1)
            r3 = r4
            goto L4e
        L3c:
            r4 = move-exception
            p459zh.C7352r.m14436a(r3, r1)
            throw r4
        L41:
            vh.i0 r0 = new vh.i0
            r0.<init>(r3, r5)
            r3 = 4
            p209lh.C4304a.m9602H(r4, r0, r0, r1, r3)
            java.lang.Object r3 = r0.m13637b0()
        L4e:
            gh.a r4 = gh.EnumC2389a.f10764Y
            if (r3 != r4) goto L57
            java.lang.String r4 = "frame"
            p214m2.C4339q.m9706k(r5, r4)
        L57:
            return r3
    }

    /* renamed from: a */
    public static final p379vh.InterfaceC6686b0 m5711a(p101fh.InterfaceC2175g r3) {
            zh.d r0 = new zh.d
            int r1 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r1 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r1 = r3.get(r1)
            if (r1 == 0) goto Ld
            goto L17
        Ld:
            r1 = 0
            vh.e1 r2 = new vh.e1
            r2.<init>(r1)
            fh.g r3 = r3.plus(r2)
        L17:
            r0.<init>(r3)
            return r0
    }

    /* renamed from: b */
    public static void m5712b(long[] r5, long[] r6, long[] r7) {
            r0 = 0
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 1
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 2
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 3
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 4
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 5
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 6
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 7
            r1 = r5[r0]
            r5 = r6[r0]
            long r5 = r5 ^ r1
            r7[r0] = r5
            return
    }

    /* renamed from: c */
    public static final <T> void m5713c(java.lang.Appendable r0, T r1, mh.InterfaceC4620l<? super T, ? extends java.lang.CharSequence> r2) {
            if (r2 == 0) goto L7
            java.lang.Object r1 = r2.mo107b(r1)
            goto Lf
        L7:
            if (r1 != 0) goto Lb
            r2 = 1
            goto Ld
        Lb:
            boolean r2 = r1 instanceof java.lang.CharSequence
        Ld:
            if (r2 == 0) goto L12
        Lf:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L24
        L12:
            boolean r2 = r1 instanceof java.lang.Character
            if (r2 == 0) goto L20
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.append(r1)
            goto L27
        L20:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L24:
            r0.append(r1)
        L27:
            return
    }

    /* renamed from: d */
    public static p379vh.InterfaceC6698f0 m5714d(p379vh.InterfaceC6686b0 r1, p101fh.InterfaceC2175g r2, int r3, mh.InterfaceC4624p r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            fh.i r2 = p101fh.C2177i.f9918Y
        L6:
            r6 = 2
            r5 = r5 & r6
            r0 = 1
            if (r5 == 0) goto Lc
            r3 = 1
        Lc:
            fh.g r1 = p379vh.C6751x.m13668a(r1, r2)
            p365v.C6480g.m13149c(r3)
            if (r3 != r6) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L20
            vh.i1 r2 = new vh.i1
            r2.<init>(r1, r4)
            goto L25
        L20:
            vh.g0 r2 = new vh.g0
            r2.<init>(r1, r0)
        L25:
            r2.m13545a0(r3, r2, r4)
            return r2
    }

    /* renamed from: e */
    public static final p260oi.InterfaceC5285g m5715e(p260oi.InterfaceC5302x r1) {
            java.lang.String r0 = "$this$buffer"
            p214m2.C4339q.m9706k(r1, r0)
            oi.s r0 = new oi.s
            r0.<init>(r1)
            return r0
    }

    /* renamed from: f */
    public static final p260oi.InterfaceC5286h m5716f(p260oi.InterfaceC5304z r1) {
            oi.t r0 = new oi.t
            r0.<init>(r1)
            return r0
    }

    /* renamed from: g */
    public static final void m5717g(java.io.Closeable r0, java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            goto L10
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r0 = move-exception
            p185k7.C3836i.m8616a(r1, r0)
        L10:
            return
    }

    /* renamed from: h */
    public static final void m5718h(p379vh.InterfaceC6686b0 r0) {
            fh.g r0 = r0.mo1407l()
            p209lh.C4304a.m9619m(r0)
            return
    }

    /* renamed from: i */
    public static final p379vh.AbstractC6755z m5719i(java.util.concurrent.Executor r2) {
            boolean r0 = r2 instanceof p379vh.ExecutorC6713k0
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r2
            vh.k0 r0 = (p379vh.ExecutorC6713k0) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L11
            vh.u0 r1 = new vh.u0
            r1.<init>(r2)
        L11:
            return r1
    }

    /* renamed from: j */
    public static fj.C2191c m5720j(p193kj.C4145f r7) {
            if (r7 != 0) goto L4
            r7 = 0
            goto L1e
        L4:
            fj.c r6 = new fj.c
            nj.c r1 = r7.f17175Y
            nj.f r0 = r7.f17177a0
            java.math.BigInteger r3 = r7.f17178b0
            java.math.BigInteger r4 = r7.f17179c0
            byte[] r7 = r7.f17176Z
            byte[] r5 = p400wj.C6888a.m13951c(r7)
            fj.e r2 = new fj.e
            r2.<init>(r0)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r6
        L1e:
            return r7
    }

    /* renamed from: k */
    public static fj.C2191c m5721k(p317ri.C5897n r2) {
            java.util.Hashtable r0 = fj.C2189a.f10025y
            java.lang.Object r0 = r0.get(r2)
            fj.d r0 = (fj.AbstractC2192d) r0
            r1 = 0
            if (r0 == 0) goto L10
            fj.c r0 = r0.m5782b()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L17
            fj.c r0 = p014aj.C0115b.m174e(r2)
        L17:
            if (r0 != 0) goto L29
            java.util.Hashtable r0 = bj.C0807a.f4398p
            java.lang.Object r0 = r0.get(r2)
            fj.d r0 = (fj.AbstractC2192d) r0
            if (r0 == 0) goto L28
            fj.c r0 = r0.m5782b()
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 != 0) goto L3b
            java.util.Hashtable r0 = si.C6078a.f23441c
            java.lang.Object r0 = r0.get(r2)
            fj.d r0 = (fj.AbstractC2192d) r0
            if (r0 != 0) goto L37
            r0 = r1
            goto L3b
        L37:
            fj.c r0 = r0.m5782b()
        L3b:
            if (r0 != 0) goto L49
            java.util.Hashtable r0 = vi.C6758b.f26060b
            java.lang.Object r0 = r0.get(r2)
            kj.f r0 = (p193kj.C4145f) r0
            fj.c r0 = m5720j(r0)
        L49:
            if (r0 != 0) goto L5b
            java.util.Hashtable r0 = p399wi.C6886a.f26785d
            java.lang.Object r2 = r0.get(r2)
            fj.d r2 = (fj.AbstractC2192d) r2
            if (r2 != 0) goto L56
            goto L5a
        L56:
            fj.c r1 = r2.m5782b()
        L5a:
            r0 = r1
        L5b:
            return r0
    }

    /* renamed from: l */
    public static void m5722l(long[] r16, long[] r17) {
            r0 = 0
            r1 = r16[r0]
            r3 = 1
            r4 = r16[r3]
            r6 = 2
            r7 = r16[r6]
            r9 = 3
            r10 = r16[r9]
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r1 & r12
            r17[r0] = r14
            r0 = 60
            long r0 = r1 >>> r0
            r2 = 4
            long r14 = r4 << r2
            long r0 = r0 ^ r14
            long r0 = r0 & r12
            r17[r3] = r0
            r0 = 56
            long r0 = r4 >>> r0
            r2 = 8
            long r2 = r7 << r2
            long r0 = r0 ^ r2
            long r0 = r0 & r12
            r17[r6] = r0
            r0 = 52
            long r0 = r7 >>> r0
            r2 = 12
            long r2 = r10 << r2
            long r0 = r0 ^ r2
            r17[r9] = r0
            return
    }

    /* renamed from: m */
    public static void m5723m(long[] r26, long[] r27, long[] r28) {
            r6 = 4
            long[] r7 = new long[r6]
            long[] r8 = new long[r6]
            r0 = r26
            m5722l(r0, r7)
            r0 = r27
            m5722l(r0, r8)
            r9 = 0
            r0 = r7[r9]
            r2 = r8[r9]
            r5 = 0
            r4 = r28
            m5724n(r0, r2, r4, r5)
            r10 = 1
            r0 = r7[r10]
            r2 = r8[r10]
            r5 = 1
            m5724n(r0, r2, r4, r5)
            r11 = 2
            r0 = r7[r11]
            r2 = r8[r11]
            r5 = 2
            m5724n(r0, r2, r4, r5)
            r12 = 3
            r0 = r7[r12]
            r2 = r8[r12]
            r5 = 3
            m5724n(r0, r2, r4, r5)
            r13 = 5
            r0 = 5
        L37:
            if (r0 <= 0) goto L44
            r1 = r28[r0]
            int r3 = r0 + (-1)
            r4 = r28[r3]
            long r1 = r1 ^ r4
            r28[r0] = r1
            r0 = r3
            goto L37
        L44:
            r0 = r7[r9]
            r2 = r7[r10]
            long r0 = r0 ^ r2
            r2 = r8[r9]
            r4 = r8[r10]
            long r2 = r2 ^ r4
            r5 = 1
            r4 = r28
            m5724n(r0, r2, r4, r5)
            r0 = r7[r11]
            r2 = r7[r12]
            long r0 = r0 ^ r2
            r2 = r8[r11]
            r4 = r8[r12]
            long r2 = r2 ^ r4
            r5 = 3
            r4 = r28
            m5724n(r0, r2, r4, r5)
            r14 = 7
            r0 = 7
        L66:
            if (r0 <= r10) goto L74
            r1 = r28[r0]
            int r3 = r0 + (-2)
            r3 = r28[r3]
            long r1 = r1 ^ r3
            r28[r0] = r1
            int r0 = r0 + (-1)
            goto L66
        L74:
            r0 = r7[r9]
            r2 = r7[r11]
            long r15 = r0 ^ r2
            r0 = r7[r10]
            r2 = r7[r12]
            long r21 = r0 ^ r2
            r0 = r8[r9]
            r2 = r8[r11]
            long r17 = r0 ^ r2
            r0 = r8[r10]
            r2 = r8[r12]
            long r7 = r0 ^ r2
            long r0 = r15 ^ r21
            long r2 = r17 ^ r7
            r5 = 3
            r4 = r28
            m5724n(r0, r2, r4, r5)
            long[] r0 = new long[r12]
            r20 = 0
            r19 = r0
            m5724n(r15, r17, r19, r20)
            r1 = 1
            r17 = r21
            r19 = r7
            r21 = r0
            r22 = r1
            m5724n(r17, r19, r21, r22)
            r1 = r0[r9]
            r3 = r0[r10]
            r7 = r0[r11]
            r15 = r28[r11]
            long r15 = r15 ^ r1
            r28[r11] = r15
            r15 = r28[r12]
            long r0 = r1 ^ r3
            long r0 = r0 ^ r15
            r28[r12] = r0
            r0 = r28[r6]
            long r2 = r7 ^ r3
            long r0 = r0 ^ r2
            r28[r6] = r0
            r0 = r28[r13]
            long r0 = r0 ^ r7
            r28[r13] = r0
            r0 = r28[r9]
            r2 = r28[r10]
            r4 = r28[r11]
            r7 = r28[r12]
            r15 = r28[r6]
            r17 = r28[r13]
            r19 = 6
            r20 = r28[r19]
            r22 = r28[r14]
            r24 = 60
            long r24 = r2 << r24
            long r0 = r0 ^ r24
            r28[r9] = r0
            long r0 = r2 >>> r6
            r2 = 56
            long r2 = r4 << r2
            long r0 = r0 ^ r2
            r28[r10] = r0
            r0 = 8
            long r0 = r4 >>> r0
            r2 = 52
            long r2 = r7 << r2
            long r0 = r0 ^ r2
            r28[r11] = r0
            r0 = 12
            long r0 = r7 >>> r0
            r2 = 48
            long r2 = r15 << r2
            long r0 = r0 ^ r2
            r28[r12] = r0
            r0 = 16
            long r0 = r15 >>> r0
            r2 = 44
            long r2 = r17 << r2
            long r0 = r0 ^ r2
            r28[r6] = r0
            r0 = 20
            long r0 = r17 >>> r0
            r2 = 40
            long r2 = r20 << r2
            long r0 = r0 ^ r2
            r28[r13] = r0
            r0 = 24
            long r0 = r20 >>> r0
            r2 = 36
            long r2 = r22 << r2
            long r0 = r0 ^ r2
            r28[r19] = r0
            r0 = 28
            long r0 = r22 >>> r0
            r28[r14] = r0
            return
    }

    /* renamed from: n */
    public static void m5724n(long r17, long r19, long[] r21, int r22) {
            r0 = r17
            r2 = 8
            long[] r2 = new long[r2]
            r3 = 1
            r2[r3] = r19
            r4 = r2[r3]
            long r4 = r4 << r3
            r6 = 2
            r2[r6] = r4
            r4 = r2[r6]
            long r4 = r4 ^ r19
            r7 = 3
            r2[r7] = r4
            r4 = r2[r6]
            long r4 = r4 << r3
            r6 = 4
            r2[r6] = r4
            r4 = r2[r6]
            long r4 = r4 ^ r19
            r8 = 5
            r2[r8] = r4
            r4 = r2[r7]
            long r4 = r4 << r3
            r9 = 6
            r2[r9] = r4
            r4 = r2[r9]
            long r4 = r4 ^ r19
            r9 = 7
            r2[r9] = r4
            int r4 = (int) r0
            r5 = r4 & 7
            r10 = r2[r5]
            int r4 = r4 >>> r7
            r4 = r4 & r9
            r4 = r2[r4]
            long r4 = r4 << r7
            long r4 = r4 ^ r10
            r10 = 0
            r12 = 54
        L3f:
            long r13 = r0 >>> r12
            int r14 = (int) r13
            r13 = r14 & 7
            r15 = r2[r13]
            int r13 = r14 >>> 3
            r13 = r13 & r9
            r13 = r2[r13]
            long r13 = r13 << r7
            long r13 = r13 ^ r15
            long r15 = r13 << r12
            long r4 = r4 ^ r15
            int r15 = -r12
            long r13 = r13 >>> r15
            long r10 = r10 ^ r13
            int r12 = r12 + (-6)
            if (r12 > 0) goto L3f
            r12 = 585610922974906400(0x820820820820820, double:1.5623800299853277E-269)
            long r0 = r0 & r12
            long r12 = r19 << r6
            r2 = 63
            long r12 = r12 >> r2
            long r0 = r0 & r12
            long r0 = r0 >>> r8
            long r0 = r0 ^ r10
            r7 = r21[r22]
            r9 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r9 & r4
            long r7 = r7 ^ r9
            r21[r22] = r7
            int r2 = r22 + 1
            r7 = r21[r2]
            r3 = 60
            long r3 = r4 >>> r3
            long r0 = r0 << r6
            long r0 = r0 ^ r3
            long r0 = r0 ^ r7
            r21[r2] = r0
            return
    }

    /* renamed from: o */
    public static void m5725o(long[] r4, long[] r5) {
            r0 = 0
            r1 = r4[r0]
            gh.C2390b.m6118h(r1, r5, r0)
            r0 = 1
            r0 = r4[r0]
            r2 = 2
            gh.C2390b.m6118h(r0, r5, r2)
            r0 = r4[r2]
            r2 = 4
            gh.C2390b.m6118h(r0, r5, r2)
            r0 = 3
            r0 = r4[r0]
            int r4 = (int) r0
            long r2 = gh.C2390b.m6117g(r4)
            r4 = 6
            r5[r4] = r2
            r4 = 32
            long r0 = r0 >>> r4
            int r4 = (int) r0
            int r4 = gh.C2390b.m6116f(r4)
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 7
            r5[r4] = r0
            return
    }

    /* renamed from: p */
    public static final boolean m5726p(java.lang.AssertionError r3) {
            java.util.logging.Logger r0 = p260oi.C5294p.f20523a
            java.lang.Throwable r0 = r3.getCause()
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r3 = r3.getMessage()
            if (r3 == 0) goto L17
            r0 = 2
            java.lang.String r2 = "getsockname failed"
            boolean r3 = p362uh.C6467m.m13064U(r3, r2, r1, r0)
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L1b
            r1 = 1
        L1b:
            return r1
    }

    /* renamed from: q */
    public static final boolean m5727q(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 2
            if (r2 != r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* renamed from: r */
    public static p379vh.InterfaceC6687b1 m5728r(p379vh.InterfaceC6686b0 r1, p101fh.InterfaceC2175g r2, int r3, mh.InterfaceC4624p r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            fh.i r2 = p101fh.C2177i.f9918Y
        L6:
            r6 = 2
            r5 = r5 & r6
            r0 = 1
            if (r5 == 0) goto Lc
            r3 = 1
        Lc:
            fh.g r1 = p379vh.C6751x.m13668a(r1, r2)
            p365v.C6480g.m13149c(r3)
            if (r3 != r6) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L20
            vh.j1 r2 = new vh.j1
            r2.<init>(r1, r4)
            goto L25
        L20:
            vh.p1 r2 = new vh.p1
            r2.<init>(r1, r0)
        L25:
            r2.m13545a0(r3, r2, r4)
            return r2
    }

    /* renamed from: s */
    public static void m5729s(long[] r1, long[] r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m5723m(r1, r2, r0)
            m5731u(r0, r3)
            return
    }

    /* renamed from: t */
    public static void m5730t(long[] r1, long[] r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m5723m(r1, r2, r0)
            m5712b(r3, r0, r3)
            return
    }

    /* renamed from: u */
    public static void m5731u(long[] r24, long[] r25) {
            r0 = 0
            r1 = r24[r0]
            r3 = 1
            r4 = r24[r3]
            r6 = 2
            r7 = r24[r6]
            r9 = 3
            r10 = r24[r9]
            r12 = 4
            r12 = r24[r12]
            r14 = 5
            r14 = r24[r14]
            r16 = 6
            r16 = r24[r16]
            r18 = 7
            r18 = r24[r18]
            r20 = 17
            long r21 = r18 << r20
            long r10 = r10 ^ r21
            r21 = 47
            long r22 = r18 >>> r21
            long r12 = r12 ^ r22
            long r22 = r18 << r21
            long r14 = r14 ^ r22
            long r18 = r18 >>> r20
            long r16 = r16 ^ r18
            long r18 = r16 << r20
            long r7 = r7 ^ r18
            long r18 = r16 >>> r21
            long r10 = r10 ^ r18
            long r18 = r16 << r21
            long r12 = r12 ^ r18
            long r16 = r16 >>> r20
            long r14 = r14 ^ r16
            long r16 = r14 << r20
            long r4 = r4 ^ r16
            long r16 = r14 >>> r21
            long r7 = r7 ^ r16
            long r16 = r14 << r21
            long r10 = r10 ^ r16
            long r14 = r14 >>> r20
            long r12 = r12 ^ r14
            long r14 = r12 << r20
            long r1 = r1 ^ r14
            long r14 = r12 >>> r21
            long r4 = r4 ^ r14
            long r14 = r12 << r21
            long r7 = r7 ^ r14
            long r12 = r12 >>> r20
            long r10 = r10 ^ r12
            long r12 = r10 >>> r21
            long r1 = r1 ^ r12
            r25[r0] = r1
            r25[r3] = r4
            r0 = 30
            long r0 = r12 << r0
            long r0 = r0 ^ r7
            r25[r6] = r0
            r0 = 140737488355327(0x7fffffffffff, double:6.95335580783495E-310)
            long r0 = r0 & r10
            r25[r9] = r0
            return
    }

    /* renamed from: v */
    public static final <T> void m5732v(p379vh.AbstractC6710j0<? super T> r3, p101fh.InterfaceC2172d<? super T> r4, boolean r5) {
            java.lang.Object r0 = r3.mo13626i()
            java.lang.Throwable r1 = r3.mo13624e(r0)
            if (r1 == 0) goto Lf
            java.lang.Object r3 = p074e9.C1805a.m4520e(r1)
            goto L13
        Lf:
            java.lang.Object r3 = r3.mo13625g(r0)
        L13:
            if (r5 == 0) goto L4b
            zh.e r4 = (p459zh.C7339e) r4
            fh.d<T> r5 = r4.f28086c0
            java.lang.Object r0 = r4.f28088e0
            fh.g r1 = r5.mo5706c()
            java.lang.Object r0 = p459zh.C7352r.m14437b(r1, r0)
            zh.p r2 = p459zh.C7352r.f28111a
            if (r0 == r2) goto L2c
            vh.u1 r5 = p379vh.C6751x.m13669b(r5, r1, r0)
            goto L2d
        L2c:
            r5 = 0
        L2d:
            fh.d<T> r4 = r4.f28086c0     // Catch: java.lang.Throwable -> L3e
            r4.mo5707k(r3)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L3a
            boolean r3 = r5.m13667b0()
            if (r3 == 0) goto L4e
        L3a:
            p459zh.C7352r.m14436a(r1, r0)
            goto L4e
        L3e:
            r3 = move-exception
            if (r5 == 0) goto L47
            boolean r4 = r5.m13667b0()
            if (r4 == 0) goto L4a
        L47:
            p459zh.C7352r.m14436a(r1, r0)
        L4a:
            throw r3
        L4b:
            r4.mo5707k(r3)
        L4e:
            return
    }

    /* renamed from: w */
    public static final p260oi.InterfaceC5302x m5733w(java.net.Socket r3) {
            java.util.logging.Logger r0 = p260oi.C5294p.f20523a
            oi.y r0 = new oi.y
            r0.<init>(r3)
            oi.r r1 = new oi.r
            java.io.OutputStream r3 = r3.getOutputStream()
            java.lang.String r2 = "getOutputStream()"
            p214m2.C4339q.m9705j(r3, r2)
            r1.<init>(r3, r0)
            oi.c r3 = new oi.c
            r3.<init>(r0, r1)
            return r3
    }

    /* renamed from: x */
    public static final p260oi.InterfaceC5304z m5734x(java.net.Socket r3) {
            java.util.logging.Logger r0 = p260oi.C5294p.f20523a
            oi.y r0 = new oi.y
            r0.<init>(r3)
            oi.o r1 = new oi.o
            java.io.InputStream r3 = r3.getInputStream()
            java.lang.String r2 = "getInputStream()"
            p214m2.C4339q.m9705j(r3, r2)
            r1.<init>(r3, r0)
            oi.d r3 = new oi.d
            r3.<init>(r0, r1)
            return r3
    }

    /* renamed from: y */
    public static void m5735y(long[] r1, long[] r2) {
            r0 = 8
            long[] r0 = new long[r0]
            m5725o(r1, r0)
            m5731u(r0, r2)
            return
    }

    /* renamed from: z */
    public static void m5736z(long[] r1, int r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m5725o(r1, r0)
        L7:
            m5731u(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            m5725o(r3, r0)
            goto L7
        L12:
            return
    }
}
