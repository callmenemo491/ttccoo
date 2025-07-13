package p240nj;

/* renamed from: nj.t */
/* loaded from: classes.dex */
public abstract class AbstractC4862t {

    /* renamed from: a */
    public static final int[] f19319a = null;

    /* renamed from: b */
    public static final byte[] f19320b = null;

    /* renamed from: c */
    public static final int[] f19321c = null;

    /* renamed from: d */
    public static final p240nj.AbstractC4848f[] f19322d = null;

    /* renamed from: nj.t$a */
    public static class a implements p240nj.InterfaceC4855m {

        /* renamed from: a */
        public final /* synthetic */ p240nj.C4861s f19323a;

        /* renamed from: b */
        public final /* synthetic */ p124h7.C2839rb f19324b;

        /* renamed from: c */
        public final /* synthetic */ boolean f19325c;

        public a(p240nj.C4861s r1, p124h7.C2839rb r2, boolean r3) {
                r0 = this;
                r0.f19323a = r1
                r0.f19324b = r2
                r0.f19325c = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4855m
        /* renamed from: a */
        public p240nj.InterfaceC4856n mo10945a(p240nj.InterfaceC4856n r8) {
                r7 = this;
                nj.s r8 = new nj.s
                r8.<init>()
                nj.s r0 = r7.f19323a
                nj.f r0 = r0.f19318c
                if (r0 == 0) goto L17
                h7.rb r1 = r7.f19324b
                java.lang.Object r1 = r1.f11884Z
                nj.d r1 = (p240nj.AbstractC4846d) r1
                nj.f r0 = r0.mo10938s(r1)
                r8.f19318c = r0
            L17:
                nj.s r0 = r7.f19323a
                nj.f[] r0 = r0.f19316a
                int r1 = r0.length
                nj.f[] r2 = new p240nj.AbstractC4848f[r1]
                r3 = 0
                r4 = 0
            L20:
                int r5 = r0.length
                if (r4 >= r5) goto L30
                h7.rb r5 = r7.f19324b
                r6 = r0[r4]
                nj.f r5 = r5.m7094o(r6)
                r2[r4] = r5
                int r4 = r4 + 1
                goto L20
            L30:
                r8.f19316a = r2
                boolean r0 = r7.f19325c
                if (r0 == 0) goto L47
                nj.f[] r0 = new p240nj.AbstractC4848f[r1]
            L38:
                if (r3 >= r1) goto L45
                r4 = r2[r3]
                nj.f r4 = r4.mo10933n()
                r0[r3] = r4
                int r3 = r3 + 1
                goto L38
            L45:
                r8.f19317b = r0
            L47:
                return r8
        }
    }

    /* renamed from: nj.t$b */
    public static class b implements p240nj.InterfaceC4855m {

        /* renamed from: a */
        public final /* synthetic */ int f19326a;

        /* renamed from: b */
        public final /* synthetic */ boolean f19327b;

        /* renamed from: c */
        public final /* synthetic */ p240nj.AbstractC4848f f19328c;

        /* renamed from: d */
        public final /* synthetic */ p240nj.AbstractC4845c f19329d;

        public b(int r1, boolean r2, p240nj.AbstractC4848f r3, p240nj.AbstractC4845c r4) {
                r0 = this;
                r0.f19326a = r1
                r0.f19327b = r2
                r0.f19328c = r3
                r0.f19329d = r4
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4855m
        /* renamed from: a */
        public p240nj.InterfaceC4856n mo10945a(p240nj.InterfaceC4856n r12) {
                r11 = this;
                boolean r0 = r12 instanceof p240nj.C4861s
                r1 = 0
                if (r0 == 0) goto L8
                nj.s r12 = (p240nj.C4861s) r12
                goto L9
            L8:
                r12 = r1
            L9:
                int r0 = r11.f19326a
                r2 = 2
                int r0 = r0 - r2
                r3 = 0
                int r0 = java.lang.Math.max(r3, r0)
                r4 = 1
                int r0 = r4 << r0
                boolean r5 = r11.f19327b
                if (r12 == 0) goto L35
                nj.f[] r6 = r12.f19316a
                if (r6 == 0) goto L22
                int r6 = r6.length
                if (r6 < r0) goto L22
                r6 = 1
                goto L23
            L22:
                r6 = 0
            L23:
                if (r6 == 0) goto L35
                if (r5 == 0) goto L33
                nj.f[] r5 = r12.f19317b
                if (r5 == 0) goto L30
                int r5 = r5.length
                if (r5 < r0) goto L30
                r5 = 1
                goto L31
            L30:
                r5 = 0
            L31:
                if (r5 == 0) goto L35
            L33:
                r5 = 1
                goto L36
            L35:
                r5 = 0
            L36:
                if (r5 == 0) goto L39
                return r12
            L39:
                if (r12 == 0) goto L42
                nj.f[] r5 = r12.f19316a
                nj.f[] r6 = r12.f19317b
                nj.f r12 = r12.f19318c
                goto L45
            L42:
                r12 = r1
                r5 = r12
                r6 = r5
            L45:
                if (r5 != 0) goto L4b
                nj.f[] r5 = p240nj.AbstractC4862t.f19322d
                r7 = 0
                goto L4c
            L4b:
                int r7 = r5.length
            L4c:
                if (r7 >= r0) goto Le8
                nj.f[] r8 = new p240nj.AbstractC4848f[r0]
                int r9 = r5.length
                java.lang.System.arraycopy(r5, r3, r8, r3, r9)
                if (r0 != r4) goto L60
                nj.f r1 = r11.f19328c
                nj.f r1 = r1.m10934o()
                r8[r3] = r1
                goto Le7
            L60:
                if (r7 != 0) goto L68
                nj.f r5 = r11.f19328c
                r8[r3] = r5
                r5 = 1
                goto L69
            L68:
                r5 = r7
            L69:
                if (r0 != r2) goto L75
                nj.f r2 = r11.f19328c
                nj.f r2 = r2.mo10941v()
                r8[r4] = r2
                goto Le0
            L75:
                int r4 = r5 + (-1)
                r4 = r8[r4]
                if (r12 != 0) goto Ld3
                r12 = r8[r3]
                nj.f r12 = r12.mo10943x()
                boolean r9 = r12.m10930k()
                if (r9 != 0) goto Ld3
                nj.c r9 = r11.f19329d
                boolean r9 = p240nj.C4843a.m10867g(r9)
                if (r9 == 0) goto Ld3
                nj.c r9 = r11.f19329d
                int r9 = r9.mo10880m()
                r10 = 64
                if (r9 < r10) goto Ld3
                nj.c r9 = r11.f19329d
                int r9 = r9.f19253f
                if (r9 == r2) goto La6
                r2 = 3
                if (r9 == r2) goto La6
                r2 = 4
                if (r9 == r2) goto La6
                goto Ld3
            La6:
                nj.d r1 = r12.mo10928i(r3)
                nj.c r2 = r11.f19329d
                nj.d r9 = r12.f19287b
                java.math.BigInteger r9 = r9.mo10912t()
                nj.d r10 = r12.mo10927h()
                java.math.BigInteger r10 = r10.mo10912t()
                nj.f r2 = r2.m10872e(r9, r10)
                nj.d r9 = r1.mo10907o()
                nj.d r10 = r9.mo10902j(r1)
                nj.f r4 = r4.mo10938s(r9)
                nj.f r4 = r4.mo10939t(r10)
                if (r7 != 0) goto Ld4
                r8[r3] = r4
                goto Ld4
            Ld3:
                r2 = r12
            Ld4:
                if (r5 >= r0) goto Le0
                int r9 = r5 + 1
                nj.f r4 = r4.mo10920a(r2)
                r8[r5] = r4
                r5 = r9
                goto Ld4
            Le0:
                nj.c r2 = r11.f19329d
                int r4 = r0 - r7
                r2.m10884q(r8, r7, r4, r1)
            Le7:
                r5 = r8
            Le8:
                boolean r1 = r11.f19327b
                if (r1 == 0) goto L10c
                if (r6 != 0) goto Lf2
                nj.f[] r1 = new p240nj.AbstractC4848f[r0]
                r6 = r1
                goto Lff
            Lf2:
                int r1 = r6.length
                if (r1 >= r0) goto Lfe
                nj.f[] r2 = new p240nj.AbstractC4848f[r0]
                int r4 = r6.length
                java.lang.System.arraycopy(r6, r3, r2, r3, r4)
                r3 = r1
                r6 = r2
                goto Lff
            Lfe:
                r3 = r1
            Lff:
                if (r3 >= r0) goto L10c
                r1 = r5[r3]
                nj.f r1 = r1.mo10933n()
                r6[r3] = r1
                int r3 = r3 + 1
                goto Lff
            L10c:
                nj.s r0 = new nj.s
                r0.<init>()
                r0.f19316a = r5
                r0.f19317b = r6
                r0.f19318c = r12
                return r0
        }
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [13, 41, 121, 337, 897, 2305} // fill-array
            p240nj.AbstractC4862t.f19319a = r0
            r0 = 0
            byte[] r1 = new byte[r0]
            p240nj.AbstractC4862t.f19320b = r1
            int[] r1 = new int[r0]
            p240nj.AbstractC4862t.f19321c = r1
            nj.f[] r0 = new p240nj.AbstractC4848f[r0]
            p240nj.AbstractC4862t.f19322d = r0
            return
    }

    /* renamed from: a */
    public static byte[] m10983a(int r11, java.math.BigInteger r12) {
            r0 = 1
            r1 = 2
            if (r11 != r1) goto L40
            int r11 = r12.signum()
            if (r11 != 0) goto Ld
            byte[] r11 = p240nj.AbstractC4862t.f19320b
            goto L3f
        Ld:
            java.math.BigInteger r11 = r12.shiftLeft(r0)
            java.math.BigInteger r11 = r11.add(r12)
            int r1 = r11.bitLength()
            int r1 = r1 - r0
            byte[] r2 = new byte[r1]
            java.math.BigInteger r11 = r11.xor(r12)
            r3 = 1
        L21:
            if (r3 >= r1) goto L3b
            boolean r4 = r11.testBit(r3)
            if (r4 == 0) goto L39
            int r4 = r3 + (-1)
            boolean r5 = r12.testBit(r3)
            if (r5 == 0) goto L33
            r5 = -1
            goto L34
        L33:
            r5 = 1
        L34:
            byte r5 = (byte) r5
            r2[r4] = r5
            int r3 = r3 + 1
        L39:
            int r3 = r3 + r0
            goto L21
        L3b:
            int r1 = r1 - r0
            r2[r1] = r0
            r11 = r2
        L3f:
            return r11
        L40:
            if (r11 < r1) goto L9c
            r1 = 8
            if (r11 > r1) goto L9c
            int r1 = r12.signum()
            if (r1 != 0) goto L4f
            byte[] r11 = p240nj.AbstractC4862t.f19320b
            return r11
        L4f:
            int r1 = r12.bitLength()
            int r1 = r1 + r0
            byte[] r2 = new byte[r1]
            int r3 = r0 << r11
            int r4 = r3 + (-1)
            int r5 = r3 >>> 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L60:
            int r10 = r12.bitLength()
            if (r7 > r10) goto L93
            boolean r10 = r12.testBit(r7)
            if (r10 != r9) goto L6f
            int r7 = r7 + 1
            goto L60
        L6f:
            java.math.BigInteger r12 = r12.shiftRight(r7)
            int r10 = r12.intValue()
            r10 = r10 & r4
            if (r9 == 0) goto L7c
            int r10 = r10 + 1
        L7c:
            r9 = r10 & r5
            if (r9 == 0) goto L82
            r9 = 1
            goto L83
        L82:
            r9 = 0
        L83:
            if (r9 == 0) goto L86
            int r10 = r10 - r3
        L86:
            if (r8 <= 0) goto L8a
            int r7 = r7 + (-1)
        L8a:
            int r8 = r8 + r7
            int r7 = r8 + 1
            byte r10 = (byte) r10
            r2[r8] = r10
            r8 = r7
            r7 = r11
            goto L60
        L93:
            if (r1 <= r8) goto L9b
            byte[] r11 = new byte[r8]
            java.lang.System.arraycopy(r2, r6, r11, r6, r8)
            r2 = r11
        L9b:
            return r2
        L9c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "'width' must be in the range [2, 8]"
            r11.<init>(r12)
            throw r11
    }

    /* renamed from: b */
    public static p240nj.C4861s m10984b(p240nj.AbstractC4848f r3) {
            nj.c r0 = r3.f19286a
            java.lang.String r1 = "bc_wnaf"
            java.util.Objects.requireNonNull(r0)
            nj.c r2 = r3.f19286a
            if (r0 != r2) goto L2a
            monitor-enter(r3)
            java.util.Hashtable r0 = r3.f19291f     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            r3 = 0
            if (r0 != 0) goto L14
            r1 = r3
            goto L1c
        L14:
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            nj.n r1 = (p240nj.InterfaceC4856n) r1     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
        L1c:
            boolean r0 = r1 instanceof p240nj.C4861s
            if (r0 == 0) goto L23
            r3 = r1
            nj.s r3 = (p240nj.C4861s) r3
        L23:
            return r3
        L24:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3
        L27:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'point' must be non-null and on this curve"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: c */
    public static int m10985c(int r3) {
            int[] r0 = p240nj.AbstractC4862t.f19319a
            r1 = 0
        L3:
            int r2 = r0.length
            if (r1 >= r2) goto Le
            r2 = r0[r1]
            if (r3 >= r2) goto Lb
            goto Le
        Lb:
            int r1 = r1 + 1
            goto L3
        Le:
            int r1 = r1 + 2
            return r1
    }

    /* renamed from: d */
    public static p240nj.AbstractC4848f m10986d(p240nj.AbstractC4848f r2, int r3, boolean r4, p124h7.C2839rb r5) {
            nj.c r0 = r2.f19286a
            nj.s r3 = m10987e(r2, r3, r4)
            java.lang.Object r1 = r5.f11884Z
            nj.d r1 = (p240nj.AbstractC4846d) r1
            nj.f r2 = r2.mo10938s(r1)
            nj.t$a r1 = new nj.t$a
            r1.<init>(r3, r5, r4)
            java.lang.String r3 = "bc_wnaf"
            r0.m10885r(r2, r3, r1)
            return r2
    }

    /* renamed from: e */
    public static p240nj.C4861s m10987e(p240nj.AbstractC4848f r2, int r3, boolean r4) {
            nj.c r0 = r2.f19286a
            nj.t$b r1 = new nj.t$b
            r1.<init>(r3, r4, r2, r0)
            java.lang.String r3 = "bc_wnaf"
            nj.n r2 = r0.m10885r(r2, r3, r1)
            nj.s r2 = (p240nj.C4861s) r2
            return r2
    }
}
