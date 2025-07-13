package p108g5;

/* renamed from: g5.b0 */
/* loaded from: classes.dex */
public class C2259b0 implements p216m4.InterfaceC4381z {

    /* renamed from: A */
    public p088f4.C2003e0 f10282A;

    /* renamed from: B */
    public boolean f10283B;

    /* renamed from: C */
    public boolean f10284C;

    /* renamed from: a */
    public final p108g5.C2257a0 f10285a;

    /* renamed from: b */
    public final p108g5.C2259b0.b f10286b;

    /* renamed from: c */
    public final p108g5.C2269g0<p108g5.C2259b0.c> f10287c;

    /* renamed from: d */
    public final p162j4.InterfaceC3405j f10288d;

    /* renamed from: e */
    public final p162j4.InterfaceC3403h.a f10289e;

    /* renamed from: f */
    public final android.os.Looper f10290f;

    /* renamed from: g */
    public p108g5.C2259b0.d f10291g;

    /* renamed from: h */
    public p088f4.C2003e0 f10292h;

    /* renamed from: i */
    public p162j4.InterfaceC3400e f10293i;

    /* renamed from: j */
    public int f10294j;

    /* renamed from: k */
    public int[] f10295k;

    /* renamed from: l */
    public long[] f10296l;

    /* renamed from: m */
    public int[] f10297m;

    /* renamed from: n */
    public int[] f10298n;

    /* renamed from: o */
    public long[] f10299o;

    /* renamed from: p */
    public p216m4.InterfaceC4381z.a[] f10300p;

    /* renamed from: q */
    public int f10301q;

    /* renamed from: r */
    public int f10302r;

    /* renamed from: s */
    public int f10303s;

    /* renamed from: t */
    public int f10304t;

    /* renamed from: u */
    public long f10305u;

    /* renamed from: v */
    public long f10306v;

    /* renamed from: w */
    public long f10307w;

    /* renamed from: x */
    public boolean f10308x;

    /* renamed from: y */
    public boolean f10309y;

    /* renamed from: z */
    public boolean f10310z;

    /* renamed from: g5.b0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: g5.b0$b */
    public static final class b {

        /* renamed from: a */
        public int f10311a;

        /* renamed from: b */
        public long f10312b;

        /* renamed from: c */
        public p216m4.InterfaceC4381z.a f10313c;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: g5.b0$c */
    public static final class c {

        /* renamed from: a */
        public final p088f4.C2003e0 f10314a;

        /* renamed from: b */
        public final p162j4.InterfaceC3405j.b f10315b;

        public c(p088f4.C2003e0 r1, p162j4.InterfaceC3405j.b r2, p108g5.C2259b0.a r3) {
                r0 = this;
                r0.<init>()
                r0.f10314a = r1
                r0.f10315b = r2
                return
        }
    }

    /* renamed from: g5.b0$d */
    public interface d {
    }

    public C2259b0(p352u5.C6324m r1, android.os.Looper r2, p162j4.InterfaceC3405j r3, p162j4.InterfaceC3403h.a r4) {
            r0 = this;
            r0.<init>()
            r0.f10290f = r2
            r0.f10288d = r3
            r0.f10289e = r4
            g5.a0 r2 = new g5.a0
            r2.<init>(r1)
            r0.f10285a = r2
            g5.b0$b r1 = new g5.b0$b
            r1.<init>()
            r0.f10286b = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.f10294j = r1
            int[] r2 = new int[r1]
            r0.f10295k = r2
            long[] r2 = new long[r1]
            r0.f10296l = r2
            long[] r2 = new long[r1]
            r0.f10299o = r2
            int[] r2 = new int[r1]
            r0.f10298n = r2
            int[] r2 = new int[r1]
            r0.f10297m = r2
            m4.z$a[] r1 = new p216m4.InterfaceC4381z.a[r1]
            r0.f10300p = r1
            g5.g0 r1 = new g5.g0
            androidx.room.a r2 = androidx.room.C0618a.f3662l0
            r1.<init>(r2)
            r0.f10287c = r1
            r1 = -9223372036854775808
            r0.f10305u = r1
            r0.f10306v = r1
            r0.f10307w = r1
            r1 = 1
            r0.f10310z = r1
            r0.f10309y = r1
            return
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: a */
    public /* synthetic */ int mo5969a(p352u5.InterfaceC6314f r1, int r2, boolean r3) {
            r0 = this;
            int r1 = p216m4.C4380y.m9830a(r0, r1, r2, r3)
            return r1
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: b */
    public final int mo5970b(p352u5.InterfaceC6314f r5, int r6, boolean r7, int r8) {
            r4 = this;
            g5.a0 r8 = r4.f10285a
            int r6 = r8.m5949c(r6)
            g5.a0$a r0 = r8.f10266f
            u5.a r1 = r0.f10271d
            byte[] r1 = r1.f24619a
            long r2 = r8.f10267g
            int r0 = r0.m5950a(r2)
            int r5 = r5.mo6020b(r1, r0, r6)
            r6 = -1
            if (r5 != r6) goto L23
            if (r7 == 0) goto L1d
            r5 = -1
            goto L26
        L1d:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L23:
            r8.m5948b(r5)
        L26:
            return r5
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: c */
    public void mo5971c(long r10, int r12, int r13, int r14, p216m4.InterfaceC4381z.a r15) {
            r9 = this;
            r0 = r12 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r9.f10309y
            if (r4 == 0) goto L12
            if (r3 != 0) goto L10
            return
        L10:
            r9.f10309y = r1
        L12:
            r3 = 0
            long r10 = r10 + r3
            boolean r3 = r9.f10283B
            if (r3 == 0) goto L4c
            long r3 = r9.f10305u
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 >= 0) goto L20
            return
        L20:
            if (r0 != 0) goto L4c
            boolean r0 = r9.f10284C
            if (r0 != 0) goto L4a
            java.lang.String r0 = "SampleQueue"
            f4.e0 r3 = r9.f10282A
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Overriding unexpected non-sync sample for format: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.w(r0, r3)
            r9.f10284C = r2
        L4a:
            r12 = r12 | 1
        L4c:
            g5.a0 r0 = r9.f10285a
            long r3 = r0.f10267g
            long r5 = (long) r13
            long r3 = r3 - r5
            long r5 = (long) r14
            long r3 = r3 - r5
            monitor-enter(r9)
            int r14 = r9.f10301q     // Catch: java.lang.Throwable -> L15f
            if (r14 <= 0) goto L72
            int r14 = r14 - r2
            int r14 = r9.m5980l(r14)     // Catch: java.lang.Throwable -> L15f
            long[] r0 = r9.f10296l     // Catch: java.lang.Throwable -> L15f
            r5 = r0[r14]     // Catch: java.lang.Throwable -> L15f
            int[] r0 = r9.f10297m     // Catch: java.lang.Throwable -> L15f
            r14 = r0[r14]     // Catch: java.lang.Throwable -> L15f
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L15f
            long r5 = r5 + r7
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 > 0) goto L6e
            r14 = 1
            goto L6f
        L6e:
            r14 = 0
        L6f:
            p371v5.C6549a.m13288b(r14)     // Catch: java.lang.Throwable -> L15f
        L72:
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r14 & r12
            if (r14 == 0) goto L79
            r14 = 1
            goto L7a
        L79:
            r14 = 0
        L7a:
            r9.f10308x = r14     // Catch: java.lang.Throwable -> L15f
            long r5 = r9.f10307w     // Catch: java.lang.Throwable -> L15f
            long r5 = java.lang.Math.max(r5, r10)     // Catch: java.lang.Throwable -> L15f
            r9.f10307w = r5     // Catch: java.lang.Throwable -> L15f
            int r14 = r9.f10301q     // Catch: java.lang.Throwable -> L15f
            int r14 = r9.m5980l(r14)     // Catch: java.lang.Throwable -> L15f
            long[] r0 = r9.f10299o     // Catch: java.lang.Throwable -> L15f
            r0[r14] = r10     // Catch: java.lang.Throwable -> L15f
            long[] r10 = r9.f10296l     // Catch: java.lang.Throwable -> L15f
            r10[r14] = r3     // Catch: java.lang.Throwable -> L15f
            int[] r10 = r9.f10297m     // Catch: java.lang.Throwable -> L15f
            r10[r14] = r13     // Catch: java.lang.Throwable -> L15f
            int[] r10 = r9.f10298n     // Catch: java.lang.Throwable -> L15f
            r10[r14] = r12     // Catch: java.lang.Throwable -> L15f
            m4.z$a[] r10 = r9.f10300p     // Catch: java.lang.Throwable -> L15f
            r10[r14] = r15     // Catch: java.lang.Throwable -> L15f
            int[] r10 = r9.f10295k     // Catch: java.lang.Throwable -> L15f
            r10[r14] = r1     // Catch: java.lang.Throwable -> L15f
            g5.g0<g5.b0$c> r10 = r9.f10287c     // Catch: java.lang.Throwable -> L15f
            android.util.SparseArray<V> r10 = r10.f10369b     // Catch: java.lang.Throwable -> L15f
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L15f
            if (r10 != 0) goto Lae
            r10 = 1
            goto Laf
        Lae:
            r10 = 0
        Laf:
            if (r10 != 0) goto Lc3
            g5.g0<g5.b0$c> r10 = r9.f10287c     // Catch: java.lang.Throwable -> L15f
            java.lang.Object r10 = r10.m6017c()     // Catch: java.lang.Throwable -> L15f
            g5.b0$c r10 = (p108g5.C2259b0.c) r10     // Catch: java.lang.Throwable -> L15f
            f4.e0 r10 = r10.f10314a     // Catch: java.lang.Throwable -> L15f
            f4.e0 r11 = r9.f10282A     // Catch: java.lang.Throwable -> L15f
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L15f
            if (r10 != 0) goto Leb
        Lc3:
            j4.j r10 = r9.f10288d     // Catch: java.lang.Throwable -> L15f
            if (r10 == 0) goto Ld5
            android.os.Looper r11 = r9.f10290f     // Catch: java.lang.Throwable -> L15f
            java.util.Objects.requireNonNull(r11)     // Catch: java.lang.Throwable -> L15f
            j4.h$a r12 = r9.f10289e     // Catch: java.lang.Throwable -> L15f
            f4.e0 r13 = r9.f10282A     // Catch: java.lang.Throwable -> L15f
            j4.j$b r10 = r10.mo7808a(r11, r12, r13)     // Catch: java.lang.Throwable -> L15f
            goto Ld7
        Ld5:
            j4.j$b r10 = p162j4.InterfaceC3405j.b.f14749F     // Catch: java.lang.Throwable -> L15f
        Ld7:
            g5.g0<g5.b0$c> r11 = r9.f10287c     // Catch: java.lang.Throwable -> L15f
            int r12 = r9.m5982n()     // Catch: java.lang.Throwable -> L15f
            g5.b0$c r13 = new g5.b0$c     // Catch: java.lang.Throwable -> L15f
            f4.e0 r14 = r9.f10282A     // Catch: java.lang.Throwable -> L15f
            java.util.Objects.requireNonNull(r14)     // Catch: java.lang.Throwable -> L15f
            r15 = 0
            r13.<init>(r14, r10, r15)     // Catch: java.lang.Throwable -> L15f
            r11.m6015a(r12, r13)     // Catch: java.lang.Throwable -> L15f
        Leb:
            int r10 = r9.f10301q     // Catch: java.lang.Throwable -> L15f
            int r10 = r10 + r2
            r9.f10301q = r10     // Catch: java.lang.Throwable -> L15f
            int r11 = r9.f10294j     // Catch: java.lang.Throwable -> L15f
            if (r10 != r11) goto L15d
            int r10 = r11 + 1000
            int[] r12 = new int[r10]     // Catch: java.lang.Throwable -> L15f
            long[] r13 = new long[r10]     // Catch: java.lang.Throwable -> L15f
            long[] r14 = new long[r10]     // Catch: java.lang.Throwable -> L15f
            int[] r15 = new int[r10]     // Catch: java.lang.Throwable -> L15f
            int[] r0 = new int[r10]     // Catch: java.lang.Throwable -> L15f
            m4.z$a[] r2 = new p216m4.InterfaceC4381z.a[r10]     // Catch: java.lang.Throwable -> L15f
            int r3 = r9.f10303s     // Catch: java.lang.Throwable -> L15f
            int r11 = r11 - r3
            long[] r4 = r9.f10296l     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r4, r3, r13, r1, r11)     // Catch: java.lang.Throwable -> L15f
            long[] r3 = r9.f10299o     // Catch: java.lang.Throwable -> L15f
            int r4 = r9.f10303s     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r3, r4, r14, r1, r11)     // Catch: java.lang.Throwable -> L15f
            int[] r3 = r9.f10298n     // Catch: java.lang.Throwable -> L15f
            int r4 = r9.f10303s     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r3, r4, r15, r1, r11)     // Catch: java.lang.Throwable -> L15f
            int[] r3 = r9.f10297m     // Catch: java.lang.Throwable -> L15f
            int r4 = r9.f10303s     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r3, r4, r0, r1, r11)     // Catch: java.lang.Throwable -> L15f
            m4.z$a[] r3 = r9.f10300p     // Catch: java.lang.Throwable -> L15f
            int r4 = r9.f10303s     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r3, r4, r2, r1, r11)     // Catch: java.lang.Throwable -> L15f
            int[] r3 = r9.f10295k     // Catch: java.lang.Throwable -> L15f
            int r4 = r9.f10303s     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r3, r4, r12, r1, r11)     // Catch: java.lang.Throwable -> L15f
            int r3 = r9.f10303s     // Catch: java.lang.Throwable -> L15f
            long[] r4 = r9.f10296l     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r4, r1, r13, r11, r3)     // Catch: java.lang.Throwable -> L15f
            long[] r4 = r9.f10299o     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r4, r1, r14, r11, r3)     // Catch: java.lang.Throwable -> L15f
            int[] r4 = r9.f10298n     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r4, r1, r15, r11, r3)     // Catch: java.lang.Throwable -> L15f
            int[] r4 = r9.f10297m     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r4, r1, r0, r11, r3)     // Catch: java.lang.Throwable -> L15f
            m4.z$a[] r4 = r9.f10300p     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r4, r1, r2, r11, r3)     // Catch: java.lang.Throwable -> L15f
            int[] r4 = r9.f10295k     // Catch: java.lang.Throwable -> L15f
            java.lang.System.arraycopy(r4, r1, r12, r11, r3)     // Catch: java.lang.Throwable -> L15f
            r9.f10296l = r13     // Catch: java.lang.Throwable -> L15f
            r9.f10299o = r14     // Catch: java.lang.Throwable -> L15f
            r9.f10298n = r15     // Catch: java.lang.Throwable -> L15f
            r9.f10297m = r0     // Catch: java.lang.Throwable -> L15f
            r9.f10300p = r2     // Catch: java.lang.Throwable -> L15f
            r9.f10295k = r12     // Catch: java.lang.Throwable -> L15f
            r9.f10303s = r1     // Catch: java.lang.Throwable -> L15f
            r9.f10294j = r10     // Catch: java.lang.Throwable -> L15f
        L15d:
            monitor-exit(r9)
            return
        L15f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: d */
    public /* synthetic */ void mo5972d(p371v5.C6571u r1, int r2) {
            r0 = this;
            p216m4.C4380y.m9831b(r0, r1, r2)
            return
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: e */
    public final void mo5973e(p088f4.C2003e0 r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r3.f10310z = r0     // Catch: java.lang.Throwable -> L58
            f4.e0 r1 = r3.f10282A     // Catch: java.lang.Throwable -> L58
            boolean r1 = p371v5.C6552b0.m13308a(r4, r1)     // Catch: java.lang.Throwable -> L58
            r2 = 1
            if (r1 == 0) goto Lf
            monitor-exit(r3)
            goto L48
        Lf:
            g5.g0<g5.b0$c> r1 = r3.f10287c     // Catch: java.lang.Throwable -> L58
            android.util.SparseArray<V> r1 = r1.f10369b     // Catch: java.lang.Throwable -> L58
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L38
            g5.g0<g5.b0$c> r1 = r3.f10287c     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r1.m6017c()     // Catch: java.lang.Throwable -> L58
            g5.b0$c r1 = (p108g5.C2259b0.c) r1     // Catch: java.lang.Throwable -> L58
            f4.e0 r1 = r1.f10314a     // Catch: java.lang.Throwable -> L58
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L38
            g5.g0<g5.b0$c> r4 = r3.f10287c     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = r4.m6017c()     // Catch: java.lang.Throwable -> L58
            g5.b0$c r4 = (p108g5.C2259b0.c) r4     // Catch: java.lang.Throwable -> L58
            f4.e0 r4 = r4.f10314a     // Catch: java.lang.Throwable -> L58
        L38:
            r3.f10282A = r4     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = r4.f8896j0     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = r4.f8893g0     // Catch: java.lang.Throwable -> L58
            boolean r4 = p371v5.C6567q.m13371a(r1, r4)     // Catch: java.lang.Throwable -> L58
            r3.f10283B = r4     // Catch: java.lang.Throwable -> L58
            r3.f10284C = r0     // Catch: java.lang.Throwable -> L58
            monitor-exit(r3)
            r0 = 1
        L48:
            g5.b0$d r4 = r3.f10291g
            if (r4 == 0) goto L57
            if (r0 == 0) goto L57
            g5.y r4 = (p108g5.C2290y) r4
            android.os.Handler r0 = r4.f10466n0
            java.lang.Runnable r4 = r4.f10464l0
            r0.post(r4)
        L57:
            return
        L58:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: f */
    public final void mo5974f(p371v5.C6571u r6, int r7, int r8) {
            r5 = this;
            g5.a0 r8 = r5.f10285a
            java.util.Objects.requireNonNull(r8)
        L5:
            if (r7 <= 0) goto L1f
            int r0 = r8.m5949c(r7)
            g5.a0$a r1 = r8.f10266f
            u5.a r2 = r1.f10271d
            byte[] r2 = r2.f24619a
            long r3 = r8.f10267g
            int r1 = r1.m5950a(r3)
            r6.m13402e(r2, r1, r0)
            int r7 = r7 - r0
            r8.m5948b(r0)
            goto L5
        L1f:
            return
    }

    /* renamed from: g */
    public final long m5975g(int r6) {
            r5 = this;
            long r0 = r5.f10306v
            long r2 = r5.m5978j(r6)
            long r0 = java.lang.Math.max(r0, r2)
            r5.f10306v = r0
            int r0 = r5.f10301q
            int r0 = r0 - r6
            r5.f10301q = r0
            int r0 = r5.f10302r
            int r0 = r0 + r6
            r5.f10302r = r0
            int r1 = r5.f10303s
            int r1 = r1 + r6
            r5.f10303s = r1
            int r2 = r5.f10294j
            if (r1 < r2) goto L22
            int r1 = r1 - r2
            r5.f10303s = r1
        L22:
            int r1 = r5.f10304t
            int r1 = r1 - r6
            r5.f10304t = r1
            r6 = 0
            if (r1 >= 0) goto L2c
            r5.f10304t = r6
        L2c:
            g5.g0<g5.b0$c> r1 = r5.f10287c
        L2e:
            android.util.SparseArray<V> r2 = r1.f10369b
            int r2 = r2.size()
            int r2 = r2 + (-1)
            if (r6 >= r2) goto L5c
            android.util.SparseArray<V> r2 = r1.f10369b
            int r3 = r6 + 1
            int r2 = r2.keyAt(r3)
            if (r0 < r2) goto L5c
            v5.h<V> r2 = r1.f10370c
            android.util.SparseArray<V> r4 = r1.f10369b
            java.lang.Object r4 = r4.valueAt(r6)
            r2.mo2143a(r4)
            android.util.SparseArray<V> r2 = r1.f10369b
            r2.removeAt(r6)
            int r6 = r1.f10368a
            if (r6 <= 0) goto L5a
            int r6 = r6 + (-1)
            r1.f10368a = r6
        L5a:
            r6 = r3
            goto L2e
        L5c:
            int r6 = r5.f10301q
            if (r6 != 0) goto L73
            int r6 = r5.f10303s
            if (r6 != 0) goto L66
            int r6 = r5.f10294j
        L66:
            int r6 = r6 + (-1)
            long[] r0 = r5.f10296l
            r1 = r0[r6]
            int[] r0 = r5.f10297m
            r6 = r0[r6]
            long r3 = (long) r6
            long r1 = r1 + r3
            return r1
        L73:
            long[] r6 = r5.f10296l
            int r0 = r5.f10303s
            r0 = r6[r0]
            return r0
    }

    /* renamed from: h */
    public final void m5976h() {
            r3 = this;
            g5.a0 r0 = r3.f10285a
            monitor-enter(r3)
            int r1 = r3.f10301q     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto Lb
            r1 = -1
        L9:
            monitor-exit(r3)
            goto L10
        Lb:
            long r1 = r3.m5975g(r1)     // Catch: java.lang.Throwable -> L14
            goto L9
        L10:
            r0.m5947a(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* renamed from: i */
    public final int m5977i(int r8, int r9, long r10, boolean r12) {
            r7 = this;
            r0 = 0
            r1 = -1
            r2 = 0
        L3:
            if (r2 >= r9) goto L2a
            long[] r3 = r7.f10299o
            r4 = r3[r8]
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L2a
            if (r12 == 0) goto L17
            int[] r4 = r7.f10298n
            r4 = r4[r8]
            r4 = r4 & 1
            if (r4 == 0) goto L20
        L17:
            r4 = r3[r8]
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 != 0) goto L1f
            r1 = r2
            goto L2a
        L1f:
            r1 = r2
        L20:
            int r8 = r8 + 1
            int r3 = r7.f10294j
            if (r8 != r3) goto L27
            r8 = 0
        L27:
            int r2 = r2 + 1
            goto L3
        L2a:
            return r1
    }

    /* renamed from: j */
    public final long m5978j(int r8) {
            r7 = this;
            r0 = -9223372036854775808
            if (r8 != 0) goto L5
            return r0
        L5:
            int r2 = r8 + (-1)
            int r2 = r7.m5980l(r2)
            r3 = 0
        Lc:
            if (r3 >= r8) goto L2b
            long[] r4 = r7.f10299o
            r5 = r4[r2]
            long r0 = java.lang.Math.max(r0, r5)
            int[] r4 = r7.f10298n
            r4 = r4[r2]
            r4 = r4 & 1
            if (r4 == 0) goto L1f
            goto L2b
        L1f:
            int r2 = r2 + (-1)
            r4 = -1
            if (r2 != r4) goto L28
            int r2 = r7.f10294j
            int r2 = r2 + (-1)
        L28:
            int r3 = r3 + 1
            goto Lc
        L2b:
            return r0
    }

    /* renamed from: k */
    public final int m5979k() {
            r2 = this;
            int r0 = r2.f10302r
            int r1 = r2.f10304t
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: l */
    public final int m5980l(int r2) {
            r1 = this;
            int r0 = r1.f10303s
            int r0 = r0 + r2
            int r2 = r1.f10294j
            if (r0 >= r2) goto L8
            goto L9
        L8:
            int r0 = r0 - r2
        L9:
            return r0
    }

    /* renamed from: m */
    public final synchronized p088f4.C2003e0 m5981m() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f10310z     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L7
            r0 = 0
            goto L9
        L7:
            f4.e0 r0 = r1.f10282A     // Catch: java.lang.Throwable -> Lb
        L9:
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: n */
    public final int m5982n() {
            r2 = this;
            int r0 = r2.f10302r
            int r1 = r2.f10301q
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: o */
    public final boolean m5983o() {
            r2 = this;
            int r0 = r2.f10304t
            int r1 = r2.f10301q
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* renamed from: p */
    public synchronized boolean m5984p(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m5983o()     // Catch: java.lang.Throwable -> L3a
            r1 = 1
            if (r0 != 0) goto L1a
            if (r3 != 0) goto L18
            boolean r3 = r2.f10308x     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L18
            f4.e0 r3 = r2.f10282A     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L17
            f4.e0 r0 = r2.f10292h     // Catch: java.lang.Throwable -> L3a
            if (r3 == r0) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            monitor-exit(r2)
            return r1
        L1a:
            g5.g0<g5.b0$c> r3 = r2.f10287c     // Catch: java.lang.Throwable -> L3a
            int r0 = r2.m5979k()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r3.m6016b(r0)     // Catch: java.lang.Throwable -> L3a
            g5.b0$c r3 = (p108g5.C2259b0.c) r3     // Catch: java.lang.Throwable -> L3a
            f4.e0 r3 = r3.f10314a     // Catch: java.lang.Throwable -> L3a
            f4.e0 r0 = r2.f10292h     // Catch: java.lang.Throwable -> L3a
            if (r3 == r0) goto L2e
            monitor-exit(r2)
            return r1
        L2e:
            int r3 = r2.f10304t     // Catch: java.lang.Throwable -> L3a
            int r3 = r2.m5980l(r3)     // Catch: java.lang.Throwable -> L3a
            boolean r3 = r2.m5985q(r3)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r2)
            return r3
        L3a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: q */
    public final boolean m5985q(int r3) {
            r2 = this;
            j4.e r0 = r2.f10293i
            if (r0 == 0) goto L1f
            int r0 = r0.getState()
            r1 = 4
            if (r0 == r1) goto L1f
            int[] r0 = r2.f10298n
            r3 = r0[r3]
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r0
            if (r3 != 0) goto L1d
            j4.e r3 = r2.f10293i
            boolean r3 = r3.mo7789a()
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            return r3
    }

    /* renamed from: r */
    public final void m5986r(p088f4.C2003e0 r6, androidx.appcompat.widget.C0311x r7) {
            r5 = this;
            f4.e0 r0 = r5.f10292h
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto Lb
            r0 = 0
            goto Ld
        Lb:
            j4.d r0 = r0.f8899m0
        Ld:
            r5.f10292h = r6
            j4.d r2 = r6.f8899m0
            j4.j r3 = r5.f10288d
            if (r3 == 0) goto L24
            int r3 = r3.mo7810c(r6)
            f4.e0$b r4 = r6.m5191a()
            r4.f8916D = r3
            f4.e0 r3 = r4.m5193a()
            goto L25
        L24:
            r3 = r6
        L25:
            r7.f1482a0 = r3
            j4.e r3 = r5.f10293i
            r7.f1481Z = r3
            j4.j r3 = r5.f10288d
            if (r3 != 0) goto L30
            return
        L30:
            if (r1 != 0) goto L39
            boolean r0 = p371v5.C6552b0.m13308a(r0, r2)
            if (r0 == 0) goto L39
            return
        L39:
            j4.e r0 = r5.f10293i
            j4.j r1 = r5.f10288d
            android.os.Looper r2 = r5.f10290f
            java.util.Objects.requireNonNull(r2)
            j4.h$a r3 = r5.f10289e
            j4.e r6 = r1.mo7809b(r2, r3, r6)
            r5.f10293i = r6
            r7.f1481Z = r6
            if (r0 == 0) goto L53
            j4.h$a r6 = r5.f10289e
            r0.mo7791c(r6)
        L53:
            return
    }

    /* renamed from: s */
    public void m5987s(boolean r11) {
            r10 = this;
            g5.a0 r0 = r10.f10285a
            g5.a0$a r1 = r0.f10264d
            boolean r2 = r1.f10270c
            r3 = 0
            r4 = 0
            if (r2 != 0) goto Lb
            goto L31
        Lb:
            g5.a0$a r2 = r0.f10266f
            boolean r5 = r2.f10270c
            long r6 = r2.f10268a
            long r8 = r1.f10268a
            long r6 = r6 - r8
            int r2 = (int) r6
            int r6 = r0.f10262b
            int r2 = r2 / r6
            int r2 = r2 + r5
            u5.a[] r5 = new p352u5.C6304a[r2]
            r6 = 0
        L1c:
            if (r6 >= r2) goto L2c
            u5.a r7 = r1.f10271d
            r5[r6] = r7
            r1.f10271d = r4
            g5.a0$a r7 = r1.f10272e
            r1.f10272e = r4
            int r6 = r6 + 1
            r1 = r7
            goto L1c
        L2c:
            u5.m r1 = r0.f10261a
            r1.m12966a(r5)
        L31:
            g5.a0$a r1 = new g5.a0$a
            int r2 = r0.f10262b
            r5 = 0
            r1.<init>(r5, r2)
            r0.f10264d = r1
            r0.f10265e = r1
            r0.f10266f = r1
            r0.f10267g = r5
            u5.m r0 = r0.f10261a
            r0.m12968c()
            r10.f10301q = r3
            r10.f10302r = r3
            r10.f10303s = r3
            r10.f10304t = r3
            r0 = 1
            r10.f10309y = r0
            r1 = -9223372036854775808
            r10.f10305u = r1
            r10.f10306v = r1
            r10.f10307w = r1
            r10.f10308x = r3
            g5.g0<g5.b0$c> r1 = r10.f10287c
        L5e:
            android.util.SparseArray<V> r2 = r1.f10369b
            int r2 = r2.size()
            if (r3 >= r2) goto L74
            v5.h<V> r2 = r1.f10370c
            android.util.SparseArray<V> r5 = r1.f10369b
            java.lang.Object r5 = r5.valueAt(r3)
            r2.mo2143a(r5)
            int r3 = r3 + 1
            goto L5e
        L74:
            r2 = -1
            r1.f10368a = r2
            android.util.SparseArray<V> r1 = r1.f10369b
            r1.clear()
            if (r11 == 0) goto L82
            r10.f10282A = r4
            r10.f10310z = r0
        L82:
            return
    }

    /* renamed from: t */
    public final synchronized boolean m5988t(long r10, boolean r12) {
            r9 = this;
            monitor-enter(r9)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L45
            r0 = 0
            r9.f10304t = r0     // Catch: java.lang.Throwable -> L47
            g5.a0 r1 = r9.f10285a     // Catch: java.lang.Throwable -> L47
            g5.a0$a r2 = r1.f10264d     // Catch: java.lang.Throwable -> L47
            r1.f10265e = r2     // Catch: java.lang.Throwable -> L47
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L45
            int r4 = r9.m5980l(r0)     // Catch: java.lang.Throwable -> L45
            boolean r1 = r9.m5983o()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L43
            long[] r1 = r9.f10299o     // Catch: java.lang.Throwable -> L45
            r2 = r1[r4]     // Catch: java.lang.Throwable -> L45
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 < 0) goto L43
            long r1 = r9.f10307w     // Catch: java.lang.Throwable -> L45
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L27
            if (r12 != 0) goto L27
            goto L43
        L27:
            int r12 = r9.f10301q     // Catch: java.lang.Throwable -> L45
            int r1 = r9.f10304t     // Catch: java.lang.Throwable -> L45
            int r5 = r12 - r1
            r8 = 1
            r3 = r9
            r6 = r10
            int r12 = r3.m5977i(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L45
            r1 = -1
            if (r12 != r1) goto L39
            monitor-exit(r9)
            return r0
        L39:
            r9.f10305u = r10     // Catch: java.lang.Throwable -> L45
            int r10 = r9.f10304t     // Catch: java.lang.Throwable -> L45
            int r10 = r10 + r12
            r9.f10304t = r10     // Catch: java.lang.Throwable -> L45
            r10 = 1
            monitor-exit(r9)
            return r10
        L43:
            monitor-exit(r9)
            return r0
        L45:
            r10 = move-exception
            goto L4a
        L47:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L45
            throw r10     // Catch: java.lang.Throwable -> L45
        L4a:
            monitor-exit(r9)
            throw r10
    }
}
