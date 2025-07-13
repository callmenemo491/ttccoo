package p351u4;

/* renamed from: u4.a */
/* loaded from: classes.dex */
public final class C6295a implements p351u4.InterfaceC6300f {

    /* renamed from: a */
    public final p351u4.C6299e f24559a;

    /* renamed from: b */
    public final long f24560b;

    /* renamed from: c */
    public final long f24561c;

    /* renamed from: d */
    public final p351u4.AbstractC6302h f24562d;

    /* renamed from: e */
    public int f24563e;

    /* renamed from: f */
    public long f24564f;

    /* renamed from: g */
    public long f24565g;

    /* renamed from: h */
    public long f24566h;

    /* renamed from: i */
    public long f24567i;

    /* renamed from: j */
    public long f24568j;

    /* renamed from: k */
    public long f24569k;

    /* renamed from: l */
    public long f24570l;

    /* renamed from: u4.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: u4.a$b */
    public final class b implements p216m4.InterfaceC4378w {

        /* renamed from: a */
        public final /* synthetic */ p351u4.C6295a f24571a;

        public b(p351u4.C6295a r1, p351u4.C6295a.a r2) {
                r0 = this;
                r0.f24571a = r1
                r0.<init>()
                return
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: d */
        public boolean mo9742d() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: g */
        public p216m4.InterfaceC4378w.a mo9743g(long r10) {
                r9 = this;
                u4.a r0 = r9.f24571a
                u4.h r1 = r0.f24562d
                int r1 = r1.f24603i
                long r1 = (long) r1
                long r1 = r1 * r10
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r1 = r1 / r3
                long r5 = r0.f24560b
                long r3 = r0.f24561c
                long r7 = r3 - r5
                long r7 = r7 * r1
                long r0 = r0.f24564f
                long r7 = r7 / r0
                long r7 = r7 + r5
                r0 = 30000(0x7530, double:1.4822E-319)
                long r0 = r7 - r0
                r7 = 1
                long r7 = r3 - r7
                r3 = r0
                long r0 = p371v5.C6552b0.m13316i(r3, r5, r7)
                m4.w$a r2 = new m4.w$a
                m4.x r3 = new m4.x
                r3.<init>(r10, r0)
                r2.<init>(r3)
                return r2
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: h */
        public long mo9744h() {
                r6 = this;
                u4.a r0 = r6.f24571a
                u4.h r1 = r0.f24562d
                long r2 = r0.f24564f
                r4 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r2 * r4
                int r0 = r1.f24603i
                long r0 = (long) r0
                long r2 = r2 / r0
                return r2
        }
    }

    public C6295a(p351u4.AbstractC6302h r5, long r6, long r8, long r10, long r12, boolean r14) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L10
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            p371v5.C6549a.m13288b(r1)
            r4.f24562d = r5
            r4.f24560b = r6
            r4.f24561c = r8
            long r8 = r8 - r6
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L25
            if (r14 == 0) goto L22
            goto L25
        L22:
            r4.f24563e = r0
            goto L2a
        L25:
            r4.f24564f = r12
            r5 = 4
            r4.f24563e = r5
        L2a:
            u4.e r5 = new u4.e
            r5.<init>()
            r4.f24559a = r5
            return
    }

    @Override // p351u4.InterfaceC6300f
    /* renamed from: a */
    public p216m4.InterfaceC4378w mo12930a() {
            r6 = this;
            long r0 = r6.f24564f
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto Lf
            u4.a$b r0 = new u4.a$b
            r0.<init>(r6, r2)
            r2 = r0
        Lf:
            return r2
    }

    @Override // p351u4.InterfaceC6300f
    /* renamed from: b */
    public void mo12931b(long r11) {
            r10 = this;
            long r0 = r10.f24564f
            r2 = 1
            long r8 = r0 - r2
            r6 = 0
            r4 = r11
            long r11 = p371v5.C6552b0.m13316i(r4, r6, r8)
            r10.f24566h = r11
            r11 = 2
            r10.f24563e = r11
            long r11 = r10.f24560b
            r10.f24567i = r11
            long r11 = r10.f24561c
            r10.f24568j = r11
            r11 = 0
            r10.f24569k = r11
            long r11 = r10.f24564f
            r10.f24570l = r11
            return
    }

    @Override // p351u4.InterfaceC6300f
    /* renamed from: c */
    public long mo12932c(p216m4.InterfaceC4365j r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r0.f24563e
            r3 = 1
            r4 = 0
            r5 = 4
            r6 = -1
            if (r2 == 0) goto L100
            if (r2 == r3) goto L113
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L21
            if (r2 == r10) goto L1e
            if (r2 != r5) goto L18
            return r6
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L1e:
            r2 = r6
            goto Lc5
        L21:
            long r2 = r0.f24567i
            long r11 = r0.f24568j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L2c
        L29:
            r11 = r6
            goto Lbc
        L2c:
            long r2 = r23.mo9797q()
            u4.e r11 = r0.f24559a
            long r12 = r0.f24568j
            boolean r11 = r11.m12941c(r1, r12)
            if (r11 != 0) goto L4a
            long r11 = r0.f24567i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L42
            goto Lbc
        L42:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L4a:
            u4.e r11 = r0.f24559a
            r11.m12939a(r1, r4)
            r23.mo9790h()
            long r11 = r0.f24566h
            u4.e r13 = r0.f24559a
            long r14 = r13.f24587b
            long r11 = r11 - r14
            int r8 = r13.f24589d
            int r9 = r13.f24590e
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r9 > 0) goto L6c
            r18 = 72000(0x11940, double:3.55727E-319)
            int r9 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r9 >= 0) goto L6c
            goto L29
        L6c:
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 >= 0) goto L75
            r0.f24568j = r2
            r0.f24570l = r14
            goto L83
        L75:
            long r2 = r23.mo9797q()
            long r13 = (long) r8
            long r2 = r2 + r13
            r0.f24567i = r2
            u4.e r2 = r0.f24559a
            long r2 = r2.f24587b
            r0.f24569k = r2
        L83:
            long r2 = r0.f24568j
            long r13 = r0.f24567i
            long r2 = r2 - r13
            r16 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r15 >= 0) goto L93
            r0.f24568j = r13
            r11 = r13
            goto Lbc
        L93:
            long r2 = (long) r8
            r13 = 1
            if (r9 > 0) goto L9b
            r8 = 2
            goto L9c
        L9b:
            r8 = r13
        L9c:
            long r2 = r2 * r8
            long r8 = r23.mo9797q()
            long r8 = r8 - r2
            long r2 = r0.f24568j
            long r4 = r0.f24567i
            long r16 = r2 - r4
            long r16 = r16 * r11
            long r11 = r0.f24570l
            long r6 = r0.f24569k
            long r11 = r11 - r6
            long r16 = r16 / r11
            long r16 = r16 + r8
            long r20 = r2 - r13
            r18 = r4
            long r11 = p371v5.C6552b0.m13316i(r16, r18, r20)
        Lbc:
            r2 = -1
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc3
            return r11
        Lc3:
            r0.f24563e = r10
        Lc5:
            u4.e r4 = r0.f24559a
            r4.m12941c(r1, r2)
            u4.e r2 = r0.f24559a
            r3 = 0
            r2.m12939a(r1, r3)
            u4.e r2 = r0.f24559a
            long r3 = r2.f24587b
            long r5 = r0.f24566h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto Le7
            r23.mo9790h()
            r1 = 4
            r0.f24563e = r1
            long r1 = r0.f24569k
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        Le7:
            r4 = 2
            int r3 = r2.f24589d
            int r2 = r2.f24590e
            int r3 = r3 + r2
            r1.mo9791i(r3)
            long r2 = r23.mo9797q()
            r0.f24567i = r2
            u4.e r2 = r0.f24559a
            long r2 = r2.f24587b
            r0.f24569k = r2
            r2 = -1
            goto Lc5
        L100:
            long r4 = r23.mo9797q()
            r0.f24565g = r4
            r0.f24563e = r3
            long r6 = r0.f24561c
            r8 = 65307(0xff1b, double:3.2266E-319)
            long r6 = r6 - r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L113
            return r6
        L113:
            u4.e r2 = r0.f24559a
            r2.m12940b()
            u4.e r2 = r0.f24559a
            r4 = -1
            boolean r2 = r2.m12941c(r1, r4)
            if (r2 == 0) goto L16d
            u4.e r2 = r0.f24559a
            r4 = 0
            r2.m12939a(r1, r4)
            u4.e r2 = r0.f24559a
            int r5 = r2.f24589d
            int r2 = r2.f24590e
            int r5 = r5 + r2
            r1.mo9791i(r5)
        L132:
            u4.e r2 = r0.f24559a
            long r5 = r2.f24587b
            int r7 = r2.f24586a
            r8 = 4
            r7 = r7 & r8
            if (r7 == r8) goto L165
            r7 = -1
            boolean r2 = r2.m12941c(r1, r7)
            if (r2 == 0) goto L165
            long r9 = r23.mo9797q()
            long r11 = r0.f24561c
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L165
            u4.e r2 = r0.f24559a
            boolean r2 = r2.m12939a(r1, r3)
            if (r2 == 0) goto L165
            u4.e r2 = r0.f24559a
            int r9 = r2.f24589d
            int r2 = r2.f24590e
            int r9 = r9 + r2
            r1.mo9791i(r9)     // Catch: java.io.EOFException -> L162
            r2 = 1
            goto L163
        L162:
            r2 = 0
        L163:
            if (r2 != 0) goto L132
        L165:
            r0.f24564f = r5
            r1 = 4
            r0.f24563e = r1
            long r1 = r0.f24565g
            return r1
        L16d:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }
}
