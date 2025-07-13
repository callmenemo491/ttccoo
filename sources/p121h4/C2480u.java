package p121h4;

/* renamed from: h4.u */
/* loaded from: classes.dex */
public final class C2480u implements p121h4.InterfaceC2474o {

    /* renamed from: A */
    public long f11124A;

    /* renamed from: B */
    public long f11125B;

    /* renamed from: C */
    public long f11126C;

    /* renamed from: D */
    public int f11127D;

    /* renamed from: E */
    public boolean f11128E;

    /* renamed from: F */
    public boolean f11129F;

    /* renamed from: G */
    public long f11130G;

    /* renamed from: H */
    public float f11131H;

    /* renamed from: I */
    public p121h4.InterfaceC2465f[] f11132I;

    /* renamed from: J */
    public java.nio.ByteBuffer[] f11133J;

    /* renamed from: K */
    public java.nio.ByteBuffer f11134K;

    /* renamed from: L */
    public int f11135L;

    /* renamed from: M */
    public java.nio.ByteBuffer f11136M;

    /* renamed from: N */
    public byte[] f11137N;

    /* renamed from: O */
    public int f11138O;

    /* renamed from: P */
    public int f11139P;

    /* renamed from: Q */
    public boolean f11140Q;

    /* renamed from: R */
    public boolean f11141R;

    /* renamed from: S */
    public boolean f11142S;

    /* renamed from: T */
    public boolean f11143T;

    /* renamed from: U */
    public int f11144U;

    /* renamed from: V */
    public p121h4.C2477r f11145V;

    /* renamed from: W */
    public boolean f11146W;

    /* renamed from: X */
    public long f11147X;

    /* renamed from: Y */
    public boolean f11148Y;

    /* renamed from: Z */
    public boolean f11149Z;

    /* renamed from: a */
    public final p121h4.C2463e f11150a;

    /* renamed from: b */
    public final p121h4.C2480u.b f11151b;

    /* renamed from: c */
    public final boolean f11152c;

    /* renamed from: d */
    public final p121h4.C2479t f11153d;

    /* renamed from: e */
    public final p121h4.C2464e0 f11154e;

    /* renamed from: f */
    public final p121h4.InterfaceC2465f[] f11155f;

    /* renamed from: g */
    public final p121h4.InterfaceC2465f[] f11156g;

    /* renamed from: h */
    public final android.os.ConditionVariable f11157h;

    /* renamed from: i */
    public final p121h4.C2476q f11158i;

    /* renamed from: j */
    public final java.util.ArrayDeque<p121h4.C2480u.e> f11159j;

    /* renamed from: k */
    public final boolean f11160k;

    /* renamed from: l */
    public final int f11161l;

    /* renamed from: m */
    public p121h4.C2480u.h f11162m;

    /* renamed from: n */
    public final p121h4.C2480u.f<p121h4.InterfaceC2474o.b> f11163n;

    /* renamed from: o */
    public final p121h4.C2480u.f<p121h4.InterfaceC2474o.e> f11164o;

    /* renamed from: p */
    public p121h4.InterfaceC2474o.c f11165p;

    /* renamed from: q */
    public p121h4.C2480u.c f11166q;

    /* renamed from: r */
    public p121h4.C2480u.c f11167r;

    /* renamed from: s */
    public android.media.AudioTrack f11168s;

    /* renamed from: t */
    public p121h4.C2461d f11169t;

    /* renamed from: u */
    public p121h4.C2480u.e f11170u;

    /* renamed from: v */
    public p121h4.C2480u.e f11171v;

    /* renamed from: w */
    public p088f4.C2052w0 f11172w;

    /* renamed from: x */
    public java.nio.ByteBuffer f11173x;

    /* renamed from: y */
    public int f11174y;

    /* renamed from: z */
    public long f11175z;

    /* renamed from: h4.u$a */
    public class a extends java.lang.Thread {

        /* renamed from: Y */
        public final /* synthetic */ android.media.AudioTrack f11176Y;

        /* renamed from: Z */
        public final /* synthetic */ p121h4.C2480u f11177Z;

        public a(p121h4.C2480u r1, java.lang.String r2, android.media.AudioTrack r3) {
                r0 = this;
                r0.f11177Z = r1
                r0.f11176Y = r3
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
                android.media.AudioTrack r0 = r2.f11176Y     // Catch: java.lang.Throwable -> L12
                r0.flush()     // Catch: java.lang.Throwable -> L12
                android.media.AudioTrack r0 = r2.f11176Y     // Catch: java.lang.Throwable -> L12
                r0.release()     // Catch: java.lang.Throwable -> L12
                h4.u r0 = r2.f11177Z
                android.os.ConditionVariable r0 = r0.f11157h
                r0.open()
                return
            L12:
                r0 = move-exception
                h4.u r1 = r2.f11177Z
                android.os.ConditionVariable r1 = r1.f11157h
                r1.open()
                throw r0
        }
    }

    /* renamed from: h4.u$b */
    public interface b {
        /* renamed from: a */
        p088f4.C2052w0 mo6322a(p088f4.C2052w0 r1);

        /* renamed from: b */
        long mo6323b();

        /* renamed from: c */
        boolean mo6324c(boolean r1);

        /* renamed from: d */
        long mo6325d(long r1);
    }

    /* renamed from: h4.u$c */
    public static final class c {

        /* renamed from: a */
        public final p088f4.C2003e0 f11178a;

        /* renamed from: b */
        public final int f11179b;

        /* renamed from: c */
        public final int f11180c;

        /* renamed from: d */
        public final int f11181d;

        /* renamed from: e */
        public final int f11182e;

        /* renamed from: f */
        public final int f11183f;

        /* renamed from: g */
        public final int f11184g;

        /* renamed from: h */
        public final int f11185h;

        /* renamed from: i */
        public final p121h4.InterfaceC2465f[] f11186i;

        public c(p088f4.C2003e0 r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, boolean r23, p121h4.InterfaceC2465f[] r24) {
                r14 = this;
                r0 = r14
                r1 = r17
                r2 = r18
                r3 = r19
                r14.<init>()
                r4 = r15
                r0.f11178a = r4
                r4 = r16
                r0.f11179b = r4
                r0.f11180c = r1
                r0.f11181d = r2
                r0.f11182e = r3
                r4 = r20
                r0.f11183f = r4
                r5 = r21
                r0.f11184g = r5
                r6 = r24
                r0.f11186i = r6
                if (r22 == 0) goto L28
                r1 = r22
                goto L85
            L28:
                r6 = 250000(0x3d090, double:1.235164E-318)
                r8 = 1
                if (r1 == 0) goto L46
                if (r1 == r8) goto L3e
                r2 = 2
                if (r1 != r2) goto L38
                int r1 = r14.m6330e(r6)
                goto L85
            L38:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
            L3e:
                r1 = 50000000(0x2faf080, double:2.47032823E-316)
                int r1 = r14.m6330e(r1)
                goto L85
            L46:
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r23 == 0) goto L4d
                r9 = 1090519040(0x41000000, float:8.0)
                goto L4f
            L4d:
                r9 = 1065353216(0x3f800000, float:1.0)
            L4f:
                int r4 = android.media.AudioTrack.getMinBufferSize(r19, r20, r21)
                r5 = -2
                if (r4 == r5) goto L57
                goto L58
            L57:
                r8 = 0
            L58:
                p371v5.C6549a.m13291e(r8)
                int r5 = r4 * 4
                long r10 = (long) r3
                long r6 = r6 * r10
                r12 = 1000000(0xf4240, double:4.940656E-318)
                long r6 = r6 / r12
                int r3 = (int) r6
                int r3 = r3 * r2
                r6 = 750000(0xb71b0, double:3.70549E-318)
                long r10 = r10 * r6
                long r10 = r10 / r12
                int r6 = (int) r10
                int r6 = r6 * r2
                int r2 = java.lang.Math.max(r4, r6)
                int r2 = p371v5.C6552b0.m13315h(r5, r3, r2)
                int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r1 == 0) goto L84
                float r1 = (float) r2
                float r1 = r1 * r9
                int r1 = java.lang.Math.round(r1)
                goto L85
            L84:
                r1 = r2
            L85:
                r0.f11185h = r1
                return
        }

        /* renamed from: d */
        public static android.media.AudioAttributes m6326d(p121h4.C2461d r0, boolean r1) {
                if (r1 == 0) goto L1c
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1 = 3
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                r1 = 16
                android.media.AudioAttributes$Builder r0 = r0.setFlags(r1)
                r1 = 1
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                android.media.AudioAttributes r0 = r0.build()
                return r0
            L1c:
                android.media.AudioAttributes r0 = r0.m6256a()
                return r0
        }

        /* renamed from: a */
        public android.media.AudioTrack m6327a(boolean r9, p121h4.C2461d r10, int r11) {
                r8 = this;
                android.media.AudioTrack r9 = r8.m6328b(r9, r10, r11)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.UnsupportedOperationException -> L25
                int r1 = r9.getState()
                r10 = 1
                if (r1 != r10) goto Lc
                return r9
            Lc:
                r9.release()     // Catch: java.lang.Exception -> Lf
            Lf:
                h4.o$b r9 = new h4.o$b
                int r2 = r8.f11182e
                int r3 = r8.f11183f
                int r4 = r8.f11185h
                f4.e0 r5 = r8.f11178a
                boolean r6 = r8.m6331f()
                r7 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                throw r9
            L23:
                r9 = move-exception
                goto L26
            L25:
                r9 = move-exception
            L26:
                r7 = r9
                h4.o$b r9 = new h4.o$b
                r1 = 0
                int r2 = r8.f11182e
                int r3 = r8.f11183f
                int r4 = r8.f11185h
                f4.e0 r5 = r8.f11178a
                boolean r6 = r8.m6331f()
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                throw r9
        }

        /* renamed from: b */
        public final android.media.AudioTrack m6328b(boolean r9, p121h4.C2461d r10, int r11) {
                r8 = this;
                int r0 = p371v5.C6552b0.f25624a
                r1 = 29
                if (r0 < r1) goto L3f
                int r0 = r8.f11182e
                int r1 = r8.f11183f
                int r2 = r8.f11184g
                android.media.AudioFormat r0 = p121h4.C2480u.m6303z(r0, r1, r2)
                android.media.AudioAttributes r9 = m6326d(r10, r9)
                android.media.AudioTrack$Builder r10 = new android.media.AudioTrack$Builder
                r10.<init>()
                android.media.AudioTrack$Builder r9 = r10.setAudioAttributes(r9)
                android.media.AudioTrack$Builder r9 = r9.setAudioFormat(r0)
                r10 = 1
                android.media.AudioTrack$Builder r9 = r9.setTransferMode(r10)
                int r0 = r8.f11185h
                android.media.AudioTrack$Builder r9 = r9.setBufferSizeInBytes(r0)
                android.media.AudioTrack$Builder r9 = r9.setSessionId(r11)
                int r11 = r8.f11180c
                if (r11 != r10) goto L35
                goto L36
            L35:
                r10 = 0
            L36:
                android.media.AudioTrack$Builder r9 = r9.setOffloadedPlayback(r10)
                android.media.AudioTrack r9 = r9.build()
                return r9
            L3f:
                r1 = 21
                if (r0 < r1) goto L5c
                android.media.AudioTrack r0 = new android.media.AudioTrack
                android.media.AudioAttributes r3 = m6326d(r10, r9)
                int r9 = r8.f11182e
                int r10 = r8.f11183f
                int r1 = r8.f11184g
                android.media.AudioFormat r4 = p121h4.C2480u.m6303z(r9, r10, r1)
                int r5 = r8.f11185h
                r6 = 1
                r2 = r0
                r7 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                return r0
            L5c:
                int r9 = r10.f11006a0
                int r1 = p371v5.C6552b0.m13327t(r9)
                android.media.AudioTrack r9 = new android.media.AudioTrack
                int r2 = r8.f11182e
                int r3 = r8.f11183f
                int r4 = r8.f11184g
                int r5 = r8.f11185h
                r6 = 1
                if (r11 != 0) goto L74
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                goto L7a
            L74:
                r6 = 1
                r0 = r9
                r7 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            L7a:
                return r9
        }

        /* renamed from: c */
        public long m6329c(long r3) {
                r2 = this;
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r3 = r3 * r0
                int r0 = r2.f11182e
                long r0 = (long) r0
                long r3 = r3 / r0
                return r3
        }

        /* renamed from: e */
        public final int m6330e(long r4) {
                r3 = this;
                int r0 = r3.f11184g
                switch(r0) {
                    case 5: goto L34;
                    case 6: goto L30;
                    case 7: goto L2c;
                    case 8: goto L28;
                    case 9: goto L24;
                    case 10: goto L20;
                    case 11: goto L1d;
                    case 12: goto L1a;
                    case 13: goto L5;
                    case 14: goto L16;
                    case 15: goto L13;
                    case 16: goto Lf;
                    case 17: goto Lb;
                    case 18: goto L30;
                    default: goto L5;
                }
            L5:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r4.<init>()
                throw r4
            Lb:
                r1 = 336000(0x52080, float:4.70836E-40)
                goto L37
            Lf:
                r1 = 256000(0x3e800, float:3.58732E-40)
                goto L37
            L13:
                r1 = 8000(0x1f40, float:1.121E-41)
                goto L37
            L16:
                r1 = 3062500(0x2ebae4, float:4.291477E-39)
                goto L37
            L1a:
                r1 = 7000(0x1b58, float:9.809E-42)
                goto L37
            L1d:
                r1 = 16000(0x3e80, float:2.2421E-41)
                goto L37
            L20:
                r1 = 100000(0x186a0, float:1.4013E-40)
                goto L37
            L24:
                r1 = 40000(0x9c40, float:5.6052E-41)
                goto L37
            L28:
                r1 = 2250000(0x225510, float:3.152922E-39)
                goto L37
            L2c:
                r1 = 192000(0x2ee00, float:2.6905E-40)
                goto L37
            L30:
                r1 = 768000(0xbb800, float:1.076197E-39)
                goto L37
            L34:
                r1 = 80000(0x13880, float:1.12104E-40)
            L37:
                r2 = 5
                if (r0 != r2) goto L3c
                int r1 = r1 * 2
            L3c:
                long r0 = (long) r1
                long r4 = r4 * r0
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r4 / r0
                int r5 = (int) r4
                return r5
        }

        /* renamed from: f */
        public boolean m6331f() {
                r2 = this;
                int r0 = r2.f11180c
                r1 = 1
                if (r0 != r1) goto L6
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }
    }

    /* renamed from: h4.u$d */
    public static class d implements p121h4.C2480u.b {

        /* renamed from: a */
        public final p121h4.InterfaceC2465f[] f11187a;

        /* renamed from: b */
        public final p121h4.C2458b0 f11188b;

        /* renamed from: c */
        public final p121h4.C2462d0 f11189c;

        public d(p121h4.InterfaceC2465f... r6) {
                r5 = this;
                h4.b0 r0 = new h4.b0
                r0.<init>()
                h4.d0 r1 = new h4.d0
                r1.<init>()
                r5.<init>()
                int r2 = r6.length
                int r2 = r2 + 2
                h4.f[] r2 = new p121h4.InterfaceC2465f[r2]
                r5.f11187a = r2
                int r3 = r6.length
                r4 = 0
                java.lang.System.arraycopy(r6, r4, r2, r4, r3)
                r5.f11188b = r0
                r5.f11189c = r1
                int r3 = r6.length
                r2[r3] = r0
                int r6 = r6.length
                int r6 = r6 + 1
                r2[r6] = r1
                return
        }

        @Override // p121h4.C2480u.b
        /* renamed from: a */
        public p088f4.C2052w0 mo6322a(p088f4.C2052w0 r5) {
                r4 = this;
                h4.d0 r0 = r4.f11189c
                float r1 = r5.f9372Y
                float r2 = r0.f11010c
                r3 = 1
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 == 0) goto Lf
                r0.f11010c = r1
                r0.f11016i = r3
            Lf:
                float r1 = r5.f9373Z
                float r2 = r0.f11011d
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 == 0) goto L1b
                r0.f11011d = r1
                r0.f11016i = r3
            L1b:
                return r5
        }

        @Override // p121h4.C2480u.b
        /* renamed from: b */
        public long mo6323b() {
                r2 = this;
                h4.b0 r0 = r2.f11188b
                long r0 = r0.f10976t
                return r0
        }

        @Override // p121h4.C2480u.b
        /* renamed from: c */
        public boolean mo6324c(boolean r2) {
                r1 = this;
                h4.b0 r0 = r1.f11188b
                r0.f10969m = r2
                return r2
        }

        @Override // p121h4.C2480u.b
        /* renamed from: d */
        public long mo6325d(long r17) {
                r16 = this;
                r0 = r16
                h4.d0 r1 = r0.f11189c
                long r2 = r1.f11022o
                r4 = 1024(0x400, double:5.06E-321)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L40
                long r2 = r1.f11021n
                h4.c0 r4 = r1.f11017j
                java.util.Objects.requireNonNull(r4)
                int r5 = r4.f10991k
                int r4 = r4.f10982b
                int r5 = r5 * r4
                int r5 = r5 * 2
                long r4 = (long) r5
                long r8 = r2 - r4
                h4.f$a r2 = r1.f11015h
                int r2 = r2.f11038a
                h4.f$a r3 = r1.f11014g
                int r3 = r3.f11038a
                if (r2 != r3) goto L31
                long r10 = r1.f11022o
                r6 = r17
                long r1 = p371v5.C6552b0.m13301E(r6, r8, r10)
                goto L49
            L31:
                long r4 = (long) r2
                long r12 = r8 * r4
                long r1 = r1.f11022o
                long r3 = (long) r3
                long r14 = r1 * r3
                r10 = r17
                long r1 = p371v5.C6552b0.m13301E(r10, r12, r14)
                goto L49
            L40:
                float r1 = r1.f11010c
                double r1 = (double) r1
                r3 = r17
                double r3 = (double) r3
                double r1 = r1 * r3
                long r1 = (long) r1
            L49:
                return r1
        }
    }

    /* renamed from: h4.u$e */
    public static final class e {

        /* renamed from: a */
        public final p088f4.C2052w0 f11190a;

        /* renamed from: b */
        public final boolean f11191b;

        /* renamed from: c */
        public final long f11192c;

        /* renamed from: d */
        public final long f11193d;

        public e(p088f4.C2052w0 r1, boolean r2, long r3, long r5, p121h4.C2480u.a r7) {
                r0 = this;
                r0.<init>()
                r0.f11190a = r1
                r0.f11191b = r2
                r0.f11192c = r3
                r0.f11193d = r5
                return
        }
    }

    /* renamed from: h4.u$f */
    public static final class f<T extends java.lang.Exception> {

        /* renamed from: a */
        public T f11194a;

        /* renamed from: b */
        public long f11195b;

        public f(long r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m6332a(T r6) {
                r5 = this;
                long r0 = android.os.SystemClock.elapsedRealtime()
                T extends java.lang.Exception r2 = r5.f11194a
                if (r2 != 0) goto Lf
                r5.f11194a = r6
                r2 = 100
                long r2 = r2 + r0
                r5.f11195b = r2
            Lf:
                long r2 = r5.f11195b
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L22
                T extends java.lang.Exception r0 = r5.f11194a
                if (r0 == r6) goto L1c
                r0.addSuppressed(r6)
            L1c:
                T extends java.lang.Exception r6 = r5.f11194a
                r0 = 0
                r5.f11194a = r0
                throw r6
            L22:
                return
        }
    }

    /* renamed from: h4.u$g */
    public final class g implements p121h4.C2476q.a {

        /* renamed from: a */
        public final /* synthetic */ p121h4.C2480u f11196a;

        public g(p121h4.C2480u r1, p121h4.C2480u.a r2) {
                r0 = this;
                r0.f11196a = r1
                r0.<init>()
                return
        }

        @Override // p121h4.C2476q.a
        /* renamed from: a */
        public void mo6295a(long r4) {
                r3 = this;
                h4.u r0 = r3.f11196a
                h4.o$c r0 = r0.f11165p
                if (r0 == 0) goto L18
                h4.x$b r0 = (p121h4.C2483x.b) r0
                h4.x r0 = r0.f11216a
                h4.n$a r0 = r0.f11206D1
                android.os.Handler r1 = r0.f11063a
                if (r1 == 0) goto L18
                h4.m r2 = new h4.m
                r2.<init>(r0, r4)
                r1.post(r2)
            L18:
                return
        }

        @Override // p121h4.C2476q.a
        /* renamed from: b */
        public void mo6296b(int r13, long r14) {
                r12 = this;
                h4.u r0 = r12.f11196a
                h4.o$c r0 = r0.f11165p
                if (r0 == 0) goto L27
                long r0 = android.os.SystemClock.elapsedRealtime()
                h4.u r2 = r12.f11196a
                long r3 = r2.f11147X
                long r10 = r0 - r3
                h4.o$c r0 = r2.f11165p
                h4.x$b r0 = (p121h4.C2483x.b) r0
                h4.x r0 = r0.f11216a
                h4.n$a r6 = r0.f11206D1
                android.os.Handler r0 = r6.f11063a
                if (r0 == 0) goto L27
                h4.j r1 = new h4.j
                r5 = r1
                r7 = r13
                r8 = r14
                r5.<init>(r6, r7, r8, r10)
                r0.post(r1)
            L27:
                return
        }

        @Override // p121h4.C2476q.a
        /* renamed from: c */
        public void mo6297c(long r7, long r9, long r11, long r13) {
                r6 = this;
                h4.u r0 = r6.f11196a
                h4.u$c r1 = r0.f11167r
                int r2 = r1.f11180c
                if (r2 != 0) goto Lf
                long r2 = r0.f11175z
                int r1 = r1.f11179b
                long r4 = (long) r1
                long r2 = r2 / r4
                goto L11
            Lf:
                long r2 = r0.f11124A
            L11:
                long r0 = r0.m6307E()
                r4 = 182(0xb6, float:2.55E-43)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r4)
                java.lang.String r4 = "Spurious audio timestamp (frame position mismatch): "
                r5.append(r4)
                r5.append(r7)
                java.lang.String r7 = ", "
                r5.append(r7)
                r5.append(r9)
                r5.append(r7)
                r5.append(r11)
                r5.append(r7)
                r5.append(r13)
                r5.append(r7)
                r5.append(r2)
                r5.append(r7)
                r5.append(r0)
                java.lang.String r7 = r5.toString()
                java.lang.String r8 = "DefaultAudioSink"
                android.util.Log.w(r8, r7)
                return
        }

        @Override // p121h4.C2476q.a
        /* renamed from: d */
        public void mo6298d(long r7, long r9, long r11, long r13) {
                r6 = this;
                h4.u r0 = r6.f11196a
                h4.u$c r1 = r0.f11167r
                int r2 = r1.f11180c
                if (r2 != 0) goto Lf
                long r2 = r0.f11175z
                int r1 = r1.f11179b
                long r4 = (long) r1
                long r2 = r2 / r4
                goto L11
            Lf:
                long r2 = r0.f11124A
            L11:
                long r0 = r0.m6307E()
                r4 = 180(0xb4, float:2.52E-43)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r4)
                java.lang.String r4 = "Spurious audio timestamp (system clock mismatch): "
                r5.append(r4)
                r5.append(r7)
                java.lang.String r7 = ", "
                r5.append(r7)
                r5.append(r9)
                r5.append(r7)
                r5.append(r11)
                r5.append(r7)
                r5.append(r13)
                r5.append(r7)
                r5.append(r2)
                r5.append(r7)
                r5.append(r0)
                java.lang.String r7 = r5.toString()
                java.lang.String r8 = "DefaultAudioSink"
                android.util.Log.w(r8, r7)
                return
        }

        @Override // p121h4.C2476q.a
        /* renamed from: e */
        public void mo6299e(long r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 61
                r0.<init>(r1)
                java.lang.String r1 = "Ignoring impossibly large audio latency: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r4 = "DefaultAudioSink"
                android.util.Log.w(r4, r3)
                return
        }
    }

    /* renamed from: h4.u$h */
    public final class h {

        /* renamed from: a */
        public final android.os.Handler f11197a;

        /* renamed from: b */
        public final android.media.AudioTrack.StreamEventCallback f11198b;

        /* renamed from: c */
        public final /* synthetic */ p121h4.C2480u f11199c;

        /* renamed from: h4.u$h$a */
        public class a extends android.media.AudioTrack.StreamEventCallback {

            /* renamed from: a */
            public final /* synthetic */ p121h4.C2480u.h f11200a;

            public a(p121h4.C2480u.h r1, p121h4.C2480u r2) {
                    r0 = this;
                    r0.f11200a = r1
                    r0.<init>()
                    return
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(android.media.AudioTrack r1, int r2) {
                    r0 = this;
                    h4.u$h r2 = r0.f11200a
                    h4.u r2 = r2.f11199c
                    android.media.AudioTrack r2 = r2.f11168s
                    if (r1 != r2) goto La
                    r1 = 1
                    goto Lb
                La:
                    r1 = 0
                Lb:
                    p371v5.C6549a.m13291e(r1)
                    h4.u$h r1 = r0.f11200a
                    h4.u r1 = r1.f11199c
                    h4.o$c r2 = r1.f11165p
                    if (r2 == 0) goto L25
                    boolean r1 = r1.f11142S
                    if (r1 == 0) goto L25
                    h4.x$b r2 = (p121h4.C2483x.b) r2
                    h4.x r1 = r2.f11216a
                    f4.e1$a r1 = r1.f11215M1
                    if (r1 == 0) goto L25
                    r1.mo5101a()
                L25:
                    return
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(android.media.AudioTrack r2) {
                    r1 = this;
                    h4.u$h r0 = r1.f11200a
                    h4.u r0 = r0.f11199c
                    android.media.AudioTrack r0 = r0.f11168s
                    if (r2 != r0) goto La
                    r2 = 1
                    goto Lb
                La:
                    r2 = 0
                Lb:
                    p371v5.C6549a.m13291e(r2)
                    h4.u$h r2 = r1.f11200a
                    h4.u r2 = r2.f11199c
                    h4.o$c r0 = r2.f11165p
                    if (r0 == 0) goto L25
                    boolean r2 = r2.f11142S
                    if (r2 == 0) goto L25
                    h4.x$b r0 = (p121h4.C2483x.b) r0
                    h4.x r2 = r0.f11216a
                    f4.e1$a r2 = r2.f11215M1
                    if (r2 == 0) goto L25
                    r2.mo5101a()
                L25:
                    return
            }
        }

        public h(p121h4.C2480u r2) {
                r1 = this;
                r1.f11199c = r2
                r1.<init>()
                android.os.Handler r0 = new android.os.Handler
                r0.<init>()
                r1.f11197a = r0
                h4.u$h$a r0 = new h4.u$h$a
                r0.<init>(r1, r2)
                r1.f11198b = r0
                return
        }
    }

    public C2480u(p121h4.C2463e r11, p121h4.C2480u.b r12, boolean r13, boolean r14, int r15) {
            r10 = this;
            r10.<init>()
            r10.f11150a = r11
            r10.f11151b = r12
            int r11 = p371v5.C6552b0.f25624a
            r0 = 1
            r1 = 0
            r2 = 21
            if (r11 < r2) goto L13
            if (r13 == 0) goto L13
            r13 = 1
            goto L14
        L13:
            r13 = 0
        L14:
            r10.f11152c = r13
            r13 = 23
            if (r11 < r13) goto L1e
            if (r14 == 0) goto L1e
            r13 = 1
            goto L1f
        L1e:
            r13 = 0
        L1f:
            r10.f11160k = r13
            r13 = 29
            if (r11 < r13) goto L26
            goto L27
        L26:
            r15 = 0
        L27:
            r10.f11161l = r15
            android.os.ConditionVariable r11 = new android.os.ConditionVariable
            r11.<init>(r0)
            r10.f11157h = r11
            h4.q r11 = new h4.q
            h4.u$g r13 = new h4.u$g
            r14 = 0
            r13.<init>(r10, r14)
            r11.<init>(r13)
            r10.f11158i = r11
            h4.t r11 = new h4.t
            r11.<init>()
            r10.f11153d = r11
            h4.e0 r13 = new h4.e0
            r13.<init>()
            r10.f11154e = r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = 3
            h4.s[] r15 = new p121h4.AbstractC2478s[r15]
            h4.a0 r2 = new h4.a0
            r2.<init>()
            r15[r1] = r2
            r15[r0] = r11
            r11 = 2
            r15[r11] = r13
            java.util.Collections.addAll(r14, r15)
            h4.u$d r12 = (p121h4.C2480u.d) r12
            h4.f[] r11 = r12.f11187a
            java.util.Collections.addAll(r14, r11)
            h4.f[] r11 = new p121h4.InterfaceC2465f[r1]
            java.lang.Object[] r11 = r14.toArray(r11)
            h4.f[] r11 = (p121h4.InterfaceC2465f[]) r11
            r10.f11155f = r11
            h4.f[] r11 = new p121h4.InterfaceC2465f[r0]
            h4.w r12 = new h4.w
            r12.<init>()
            r11[r1] = r12
            r10.f11156g = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.f11131H = r11
            h4.d r11 = p121h4.C2461d.f11003d0
            r10.f11169t = r11
            r10.f11144U = r1
            h4.r r11 = new h4.r
            r12 = 0
            r11.<init>(r1, r12)
            r10.f11145V = r11
            h4.u$e r11 = new h4.u$e
            f4.w0 r12 = p088f4.C2052w0.f9371b0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r2 = r11
            r3 = r12
            r2.<init>(r3, r4, r5, r7, r9)
            r10.f11171v = r11
            r10.f11172w = r12
            r11 = -1
            r10.f11139P = r11
            h4.f[] r11 = new p121h4.InterfaceC2465f[r1]
            r10.f11132I = r11
            java.nio.ByteBuffer[] r11 = new java.nio.ByteBuffer[r1]
            r10.f11133J = r11
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>()
            r10.f11159j = r11
            h4.u$f r11 = new h4.u$f
            r12 = 100
            r11.<init>(r12)
            r10.f11163n = r11
            h4.u$f r11 = new h4.u$f
            r11.<init>(r12)
            r10.f11164o = r11
            return
    }

    /* renamed from: B */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m6301B(p088f4.C2003e0 r13, p121h4.C2463e r14) {
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r13.f8896j0
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = r13.f8893g0
            int r1 = p371v5.C6567q.m13372b(r1, r2)
            r2 = 0
            r3 = 5
            r4 = 7
            r5 = 1
            r6 = 6
            r7 = 8
            r8 = 18
            if (r1 == r3) goto L2d
            if (r1 == r6) goto L2d
            if (r1 == r8) goto L2d
            r9 = 17
            if (r1 == r9) goto L2d
            if (r1 == r4) goto L2d
            if (r1 == r7) goto L2d
            r9 = 14
            if (r1 != r9) goto L2b
            goto L2d
        L2b:
            r9 = 0
            goto L2e
        L2d:
            r9 = 1
        L2e:
            if (r9 != 0) goto L31
            return r0
        L31:
            if (r1 != r8) goto L3b
            boolean r9 = r14.m6262a(r8)
            if (r9 != 0) goto L3b
            r1 = 6
            goto L44
        L3b:
            if (r1 != r7) goto L44
            boolean r9 = r14.m6262a(r7)
            if (r9 != 0) goto L44
            r1 = 7
        L44:
            boolean r9 = r14.m6262a(r1)
            if (r9 != 0) goto L4b
            return r0
        L4b:
            r9 = 3
            if (r1 != r8) goto L9b
            int r14 = p371v5.C6552b0.f25624a
            r10 = 29
            if (r14 < r10) goto L99
            int r13 = r13.f8910x0
            android.media.AudioAttributes$Builder r14 = new android.media.AudioAttributes$Builder
            r14.<init>()
            android.media.AudioAttributes$Builder r14 = r14.setUsage(r5)
            android.media.AudioAttributes$Builder r14 = r14.setContentType(r9)
            android.media.AudioAttributes r14 = r14.build()
            r10 = 8
        L69:
            if (r10 <= 0) goto L8f
            android.media.AudioFormat$Builder r11 = new android.media.AudioFormat$Builder
            r11.<init>()
            android.media.AudioFormat$Builder r11 = r11.setEncoding(r8)
            android.media.AudioFormat$Builder r11 = r11.setSampleRate(r13)
            int r12 = p371v5.C6552b0.m13321n(r10)
            android.media.AudioFormat$Builder r11 = r11.setChannelMask(r12)
            android.media.AudioFormat r11 = r11.build()
            boolean r11 = android.media.AudioTrack.isDirectPlaybackSupported(r11, r14)
            if (r11 == 0) goto L8c
            r2 = r10
            goto L8f
        L8c:
            int r10 = r10 + (-1)
            goto L69
        L8f:
            if (r2 != 0) goto La2
            java.lang.String r13 = "DefaultAudioSink"
            java.lang.String r14 = "E-AC3 JOC encoding supported but no channel count supported"
            android.util.Log.w(r13, r14)
            return r0
        L99:
            r2 = 6
            goto La2
        L9b:
            int r2 = r13.f8909w0
            int r13 = r14.f11028b
            if (r2 <= r13) goto La2
            return r0
        La2:
            int r13 = p371v5.C6552b0.f25624a
            r14 = 28
            if (r13 > r14) goto Lb5
            if (r2 != r4) goto Lad
            r6 = 8
            goto Lb6
        Lad:
            if (r2 == r9) goto Lb6
            r14 = 4
            if (r2 == r14) goto Lb6
            if (r2 != r3) goto Lb5
            goto Lb6
        Lb5:
            r6 = r2
        Lb6:
            r14 = 26
            if (r13 > r14) goto Lc7
            java.lang.String r13 = p371v5.C6552b0.f25625b
            java.lang.String r14 = "fugu"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto Lc7
            if (r6 != r5) goto Lc7
            r6 = 2
        Lc7:
            int r13 = p371v5.C6552b0.m13321n(r6)
            if (r13 != 0) goto Lce
            return r0
        Lce:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.util.Pair r13 = android.util.Pair.create(r14, r13)
            return r13
    }

    /* renamed from: H */
    public static boolean m6302H(android.media.AudioTrack r2) {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 29
            if (r0 < r1) goto Le
            boolean r2 = r2.isOffloadedPlayback()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    /* renamed from: z */
    public static android.media.AudioFormat m6303z(int r1, int r2, int r3) {
            android.media.AudioFormat$Builder r0 = new android.media.AudioFormat$Builder
            r0.<init>()
            android.media.AudioFormat$Builder r1 = r0.setSampleRate(r1)
            android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r3)
            android.media.AudioFormat r1 = r1.build()
            return r1
    }

    /* renamed from: A */
    public final p088f4.C2052w0 m6304A() {
            r1 = this;
            h4.u$e r0 = r1.m6305C()
            f4.w0 r0 = r0.f11190a
            return r0
    }

    /* renamed from: C */
    public final p121h4.C2480u.e m6305C() {
            r1 = this;
            h4.u$e r0 = r1.f11170u
            if (r0 == 0) goto L5
            goto L18
        L5:
            java.util.ArrayDeque<h4.u$e> r0 = r1.f11159j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            java.util.ArrayDeque<h4.u$e> r0 = r1.f11159j
            java.lang.Object r0 = r0.getLast()
            h4.u$e r0 = (p121h4.C2480u.e) r0
            goto L18
        L16:
            h4.u$e r0 = r1.f11171v
        L18:
            return r0
    }

    /* renamed from: D */
    public boolean m6306D() {
            r1 = this;
            h4.u$e r0 = r1.m6305C()
            boolean r0 = r0.f11191b
            return r0
    }

    /* renamed from: E */
    public final long m6307E() {
            r5 = this;
            h4.u$c r0 = r5.f11167r
            int r1 = r0.f11180c
            if (r1 != 0) goto Ld
            long r1 = r5.f11125B
            int r0 = r0.f11181d
            long r3 = (long) r0
            long r1 = r1 / r3
            goto Lf
        Ld:
            long r1 = r5.f11126C
        Lf:
            return r1
    }

    /* renamed from: F */
    public final void m6308F() {
            r8 = this;
            android.os.ConditionVariable r0 = r8.f11157h
            r0.block()
            r0 = 1
            h4.u$c r1 = r8.f11167r     // Catch: p121h4.InterfaceC2474o.b -> L86
            java.util.Objects.requireNonNull(r1)     // Catch: p121h4.InterfaceC2474o.b -> L86
            boolean r2 = r8.f11146W     // Catch: p121h4.InterfaceC2474o.b -> L86
            h4.d r3 = r8.f11169t     // Catch: p121h4.InterfaceC2474o.b -> L86
            int r4 = r8.f11144U     // Catch: p121h4.InterfaceC2474o.b -> L86
            android.media.AudioTrack r1 = r1.m6327a(r2, r3, r4)     // Catch: p121h4.InterfaceC2474o.b -> L86
            r8.f11168s = r1
            boolean r1 = m6302H(r1)
            if (r1 == 0) goto L4d
            android.media.AudioTrack r1 = r8.f11168s
            h4.u$h r2 = r8.f11162m
            if (r2 != 0) goto L2a
            h4.u$h r2 = new h4.u$h
            r2.<init>(r8)
            r8.f11162m = r2
        L2a:
            h4.u$h r2 = r8.f11162m
            android.os.Handler r3 = r2.f11197a
            java.util.Objects.requireNonNull(r3)
            f1.a r4 = new f1.a
            r4.<init>(r3, r0)
            android.media.AudioTrack$StreamEventCallback r2 = r2.f11198b
            r1.registerStreamEventCallback(r4, r2)
            int r1 = r8.f11161l
            r2 = 3
            if (r1 == r2) goto L4d
            android.media.AudioTrack r1 = r8.f11168s
            h4.u$c r2 = r8.f11167r
            f4.e0 r2 = r2.f11178a
            int r3 = r2.f8912z0
            int r2 = r2.f8881A0
            r1.setOffloadDelayPadding(r3, r2)
        L4d:
            android.media.AudioTrack r1 = r8.f11168s
            int r1 = r1.getAudioSessionId()
            r8.f11144U = r1
            h4.q r2 = r8.f11158i
            android.media.AudioTrack r3 = r8.f11168s
            h4.u$c r1 = r8.f11167r
            int r4 = r1.f11180c
            r5 = 2
            if (r4 != r5) goto L62
            r4 = 1
            goto L63
        L62:
            r4 = 0
        L63:
            int r5 = r1.f11184g
            int r6 = r1.f11181d
            int r7 = r1.f11185h
            r2.m6294e(r3, r4, r5, r6, r7)
            r8.m6315N()
            h4.r r1 = r8.f11145V
            int r1 = r1.f11113a
            if (r1 == 0) goto L83
            android.media.AudioTrack r2 = r8.f11168s
            r2.attachAuxEffect(r1)
            android.media.AudioTrack r1 = r8.f11168s
            h4.r r2 = r8.f11145V
            float r2 = r2.f11114b
            r1.setAuxEffectSendLevel(r2)
        L83:
            r8.f11129F = r0
            return
        L86:
            r1 = move-exception
            h4.u$c r2 = r8.f11167r
            boolean r2 = r2.m6331f()
            if (r2 != 0) goto L90
            goto L92
        L90:
            r8.f11148Y = r0
        L92:
            h4.o$c r0 = r8.f11165p
            if (r0 == 0) goto L9b
            h4.x$b r0 = (p121h4.C2483x.b) r0
            r0.m6351a(r1)
        L9b:
            throw r1
    }

    /* renamed from: G */
    public final boolean m6309G() {
            r1 = this;
            android.media.AudioTrack r0 = r1.f11168s
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: I */
    public final void m6310I() {
            r7 = this;
            boolean r0 = r7.f11141R
            if (r0 != 0) goto L27
            r0 = 1
            r7.f11141R = r0
            h4.q r0 = r7.f11158i
            long r1 = r7.m6307E()
            long r3 = r0.m6291b()
            r0.f11112z = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.f11110x = r3
            r0.f11081A = r1
            android.media.AudioTrack r0 = r7.f11168s
            r0.stop()
            r0 = 0
            r7.f11174y = r0
        L27:
            return
    }

    /* renamed from: J */
    public final void m6311J(long r6) {
            r5 = this;
            h4.f[] r0 = r5.f11132I
            int r0 = r0.length
            r1 = r0
        L4:
            if (r1 < 0) goto L42
            if (r1 <= 0) goto Lf
            java.nio.ByteBuffer[] r2 = r5.f11133J
            int r3 = r1 + (-1)
            r2 = r2[r3]
            goto L16
        Lf:
            java.nio.ByteBuffer r2 = r5.f11134K
            if (r2 == 0) goto L14
            goto L16
        L14:
            java.nio.ByteBuffer r2 = p121h4.InterfaceC2465f.f11036a
        L16:
            if (r1 != r0) goto L1c
            r5.m6318Q(r2, r6)
            goto L38
        L1c:
            h4.f[] r3 = r5.f11132I
            r3 = r3[r1]
            int r4 = r5.f11139P
            if (r1 <= r4) goto L27
            r3.mo6237g(r2)
        L27:
            java.nio.ByteBuffer r3 = r3.mo6258c()
            java.nio.ByteBuffer[] r4 = r5.f11133J
            r4[r1] = r3
            boolean r3 = r3.hasRemaining()
            if (r3 == 0) goto L38
            int r1 = r1 + 1
            goto L4
        L38:
            boolean r2 = r2.hasRemaining()
            if (r2 == 0) goto L3f
            return
        L3f:
            int r1 = r1 + (-1)
            goto L4
        L42:
            return
    }

    /* renamed from: K */
    public final void m6312K() {
            r12 = this;
            r0 = 0
            r12.f11175z = r0
            r12.f11124A = r0
            r12.f11125B = r0
            r12.f11126C = r0
            r2 = 0
            r12.f11149Z = r2
            r12.f11127D = r2
            h4.u$e r11 = new h4.u$e
            f4.w0 r4 = r12.m6304A()
            boolean r5 = r12.m6306D()
            r6 = 0
            r8 = 0
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r8, r10)
            r12.f11171v = r11
            r12.f11130G = r0
            r3 = 0
            r12.f11170u = r3
            java.util.ArrayDeque<h4.u$e> r4 = r12.f11159j
            r4.clear()
            r12.f11134K = r3
            r12.f11135L = r2
            r12.f11136M = r3
            r12.f11141R = r2
            r12.f11140Q = r2
            r4 = -1
            r12.f11139P = r4
            r12.f11173x = r3
            r12.f11174y = r2
            h4.e0 r2 = r12.f11154e
            r2.f11035o = r0
            r12.m6321y()
            return
    }

    /* renamed from: L */
    public final void m6313L(p088f4.C2052w0 r10, boolean r11) {
            r9 = this;
            h4.u$e r0 = r9.m6305C()
            f4.w0 r1 = r0.f11190a
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L10
            boolean r0 = r0.f11191b
            if (r11 == r0) goto L2e
        L10:
            h4.u$e r0 = new h4.u$e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r6, r8)
            boolean r10 = r9.m6309G()
            if (r10 == 0) goto L2c
            r9.f11170u = r0
            goto L2e
        L2c:
            r9.f11171v = r0
        L2e:
            return
    }

    /* renamed from: M */
    public final void m6314M(p088f4.C2052w0 r3) {
            r2 = this;
            boolean r0 = r2.m6309G()
            if (r0 == 0) goto L54
            android.media.PlaybackParams r0 = new android.media.PlaybackParams
            r0.<init>()
            android.media.PlaybackParams r0 = r0.allowDefaults()
            float r1 = r3.f9372Y
            android.media.PlaybackParams r0 = r0.setSpeed(r1)
            float r3 = r3.f9373Z
            android.media.PlaybackParams r3 = r0.setPitch(r3)
            r0 = 2
            android.media.PlaybackParams r3 = r3.setAudioFallbackMode(r0)
            android.media.AudioTrack r0 = r2.f11168s     // Catch: java.lang.IllegalArgumentException -> L26
            r0.setPlaybackParams(r3)     // Catch: java.lang.IllegalArgumentException -> L26
            goto L2e
        L26:
            r3 = move-exception
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r1 = "Failed to set playback params"
            p371v5.C6565o.m13370c(r0, r1, r3)
        L2e:
            f4.w0 r3 = new f4.w0
            android.media.AudioTrack r0 = r2.f11168s
            android.media.PlaybackParams r0 = r0.getPlaybackParams()
            float r0 = r0.getSpeed()
            android.media.AudioTrack r1 = r2.f11168s
            android.media.PlaybackParams r1 = r1.getPlaybackParams()
            float r1 = r1.getPitch()
            r3.<init>(r0, r1)
            h4.q r0 = r2.f11158i
            float r1 = r3.f9372Y
            r0.f11096j = r1
            h4.p r0 = r0.f11092f
            if (r0 == 0) goto L54
            r0.m6288a()
        L54:
            r2.f11172w = r3
            return
    }

    /* renamed from: N */
    public final void m6315N() {
            r2 = this;
            boolean r0 = r2.m6309G()
            if (r0 != 0) goto L7
            goto L1c
        L7:
            int r0 = p371v5.C6552b0.f25624a
            r1 = 21
            if (r0 < r1) goto L15
            android.media.AudioTrack r0 = r2.f11168s
            float r1 = r2.f11131H
            r0.setVolume(r1)
            goto L1c
        L15:
            android.media.AudioTrack r0 = r2.f11168s
            float r1 = r2.f11131H
            r0.setStereoVolume(r1, r1)
        L1c:
            return
    }

    /* renamed from: O */
    public final boolean m6316O() {
            r4 = this;
            boolean r0 = r4.f11146W
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L2a
            h4.u$c r0 = r4.f11167r
            f4.e0 r0 = r0.f11178a
            java.lang.String r0 = r0.f8896j0
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2a
            h4.u$c r0 = r4.f11167r
            f4.e0 r0 = r0.f11178a
            int r0 = r0.f8911y0
            boolean r3 = r4.f11152c
            if (r3 == 0) goto L26
            boolean r0 = p371v5.C6552b0.m13331x(r0)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L2a
            r1 = 1
        L2a:
            return r1
    }

    /* renamed from: P */
    public final boolean m6317P(p088f4.C2003e0 r7, p121h4.C2461d r8) {
            r6 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 0
            r2 = 1
            r3 = 29
            if (r0 < r3) goto L77
            int r3 = r6.f11161l
            if (r3 != 0) goto Le
            goto L77
        Le:
            java.lang.String r3 = r7.f8896j0
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = r7.f8893g0
            int r3 = p371v5.C6567q.m13372b(r3, r4)
            if (r3 != 0) goto L1c
            return r1
        L1c:
            int r4 = r7.f8909w0
            int r4 = p371v5.C6552b0.m13321n(r4)
            if (r4 != 0) goto L25
            return r1
        L25:
            int r5 = r7.f8910x0
            android.media.AudioFormat r3 = m6303z(r5, r4, r3)
            android.media.AudioAttributes r8 = r8.m6256a()
            r4 = 31
            r5 = 2
            if (r0 < r4) goto L39
            int r8 = android.media.AudioManager.getPlaybackOffloadSupport(r3, r8)
            goto L52
        L39:
            boolean r8 = android.media.AudioManager.isOffloadedPlaybackSupported(r3, r8)
            if (r8 != 0) goto L41
            r8 = 0
            goto L52
        L41:
            r8 = 30
            if (r0 != r8) goto L51
            java.lang.String r8 = p371v5.C6552b0.f25627d
            java.lang.String r0 = "Pixel"
            boolean r8 = r8.startsWith(r0)
            if (r8 == 0) goto L51
            r8 = 2
            goto L52
        L51:
            r8 = 1
        L52:
            if (r8 == 0) goto L77
            if (r8 == r2) goto L5f
            if (r8 != r5) goto L59
            return r2
        L59:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L5f:
            int r8 = r7.f8912z0
            if (r8 != 0) goto L6a
            int r7 = r7.f8881A0
            if (r7 == 0) goto L68
            goto L6a
        L68:
            r7 = 0
            goto L6b
        L6a:
            r7 = 1
        L6b:
            int r8 = r6.f11161l
            if (r8 != r2) goto L71
            r8 = 1
            goto L72
        L71:
            r8 = 0
        L72:
            if (r7 == 0) goto L76
            if (r8 != 0) goto L77
        L76:
            r1 = 1
        L77:
            return r1
    }

    /* renamed from: Q */
    public final void m6318Q(java.nio.ByteBuffer r13, long r14) {
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L7
            return
        L7:
            java.nio.ByteBuffer r0 = r12.f11136M
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L18
            if (r0 != r13) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            p371v5.C6549a.m13288b(r0)
            goto L3b
        L18:
            r12.f11136M = r13
            int r0 = p371v5.C6552b0.f25624a
            if (r0 >= r1) goto L3b
            int r0 = r13.remaining()
            byte[] r4 = r12.f11137N
            if (r4 == 0) goto L29
            int r4 = r4.length
            if (r4 >= r0) goto L2d
        L29:
            byte[] r4 = new byte[r0]
            r12.f11137N = r4
        L2d:
            int r4 = r13.position()
            byte[] r5 = r12.f11137N
            r13.get(r5, r3, r0)
            r13.position(r4)
            r12.f11138O = r3
        L3b:
            int r0 = r13.remaining()
            int r4 = p371v5.C6552b0.f25624a
            if (r4 >= r1) goto L76
            h4.q r14 = r12.f11158i
            long r5 = r12.f11125B
            long r7 = r14.m6291b()
            int r15 = r14.f11090d
            long r9 = (long) r15
            long r7 = r7 * r9
            long r5 = r5 - r7
            int r15 = (int) r5
            int r14 = r14.f11091e
            int r14 = r14 - r15
            if (r14 <= 0) goto Le4
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.f11168s
            byte[] r1 = r12.f11137N
            int r5 = r12.f11138O
            int r14 = r15.write(r1, r5, r14)
            if (r14 <= 0) goto Lfb
            int r15 = r12.f11138O
            int r15 = r15 + r14
            r12.f11138O = r15
            int r15 = r13.position()
            int r15 = r15 + r14
            r13.position(r15)
            goto Lfb
        L76:
            boolean r1 = r12.f11146W
            if (r1 == 0) goto Lf5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 == 0) goto L85
            r1 = 1
            goto L86
        L85:
            r1 = 0
        L86:
            p371v5.C6549a.m13291e(r1)
            android.media.AudioTrack r6 = r12.f11168s
            r7 = 1000(0x3e8, double:4.94E-321)
            r1 = 26
            if (r4 < r1) goto L9b
            r9 = 1
            long r10 = r14 * r7
            r7 = r13
            r8 = r0
            int r14 = r6.write(r7, r8, r9, r10)
            goto Lfb
        L9b:
            java.nio.ByteBuffer r1 = r12.f11173x
            if (r1 != 0) goto Lb4
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r12.f11173x = r1
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r5)
            java.nio.ByteBuffer r1 = r12.f11173x
            r5 = 1431633921(0x55550001, float:1.463725E13)
            r1.putInt(r5)
        Lb4:
            int r1 = r12.f11174y
            if (r1 != 0) goto Lce
            java.nio.ByteBuffer r1 = r12.f11173x
            r5 = 4
            r1.putInt(r5, r0)
            java.nio.ByteBuffer r1 = r12.f11173x
            r5 = 8
            long r14 = r14 * r7
            r1.putLong(r5, r14)
            java.nio.ByteBuffer r14 = r12.f11173x
            r14.position(r3)
            r12.f11174y = r0
        Lce:
            java.nio.ByteBuffer r14 = r12.f11173x
            int r14 = r14.remaining()
            if (r14 <= 0) goto Le6
            java.nio.ByteBuffer r15 = r12.f11173x
            int r15 = r6.write(r15, r14, r2)
            if (r15 >= 0) goto Le2
            r12.f11174y = r3
            r14 = r15
            goto Lfb
        Le2:
            if (r15 >= r14) goto Le6
        Le4:
            r14 = 0
            goto Lfb
        Le6:
            int r14 = r6.write(r13, r0, r2)
            if (r14 >= 0) goto Lef
            r12.f11174y = r3
            goto Lfb
        Lef:
            int r15 = r12.f11174y
            int r15 = r15 - r14
            r12.f11174y = r15
            goto Lfb
        Lf5:
            android.media.AudioTrack r14 = r12.f11168s
            int r14 = r14.write(r13, r0, r2)
        Lfb:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r12.f11147X = r5
            if (r14 >= 0) goto L139
            r13 = 24
            if (r4 < r13) goto L10a
            r13 = -6
            if (r14 == r13) goto L10e
        L10a:
            r13 = -32
            if (r14 != r13) goto L10f
        L10e:
            r3 = 1
        L10f:
            if (r3 == 0) goto L11c
            h4.u$c r13 = r12.f11167r
            boolean r13 = r13.m6331f()
            if (r13 != 0) goto L11a
            goto L11c
        L11a:
            r12.f11148Y = r2
        L11c:
            h4.o$e r13 = new h4.o$e
            h4.u$c r15 = r12.f11167r
            f4.e0 r15 = r15.f11178a
            r13.<init>(r14, r15, r3)
            h4.o$c r14 = r12.f11165p
            if (r14 == 0) goto L12e
            h4.x$b r14 = (p121h4.C2483x.b) r14
            r14.m6351a(r13)
        L12e:
            boolean r14 = r13.f11068Y
            if (r14 != 0) goto L138
            h4.u$f<h4.o$e> r14 = r12.f11164o
            r14.m6332a(r13)
            return
        L138:
            throw r13
        L139:
            h4.u$f<h4.o$e> r15 = r12.f11164o
            r1 = 0
            r15.f11194a = r1
            android.media.AudioTrack r15 = r12.f11168s
            boolean r15 = m6302H(r15)
            if (r15 == 0) goto L17a
            long r4 = r12.f11126C
            r6 = 0
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 <= 0) goto L150
            r12.f11149Z = r3
        L150:
            boolean r15 = r12.f11142S
            if (r15 == 0) goto L17a
            h4.o$c r15 = r12.f11165p
            if (r15 == 0) goto L17a
            if (r14 >= r0) goto L17a
            boolean r15 = r12.f11149Z
            if (r15 != 0) goto L17a
            h4.q r15 = r12.f11158i
            long r6 = r15.m6291b()
            long r4 = r4 - r6
            long r4 = r15.m6290a(r4)
            long r4 = p371v5.C6552b0.m13307K(r4)
            h4.o$c r15 = r12.f11165p
            h4.x$b r15 = (p121h4.C2483x.b) r15
            h4.x r15 = r15.f11216a
            f4.e1$a r15 = r15.f11215M1
            if (r15 == 0) goto L17a
            r15.mo5102b(r4)
        L17a:
            h4.u$c r15 = r12.f11167r
            int r15 = r15.f11180c
            if (r15 != 0) goto L186
            long r4 = r12.f11125B
            long r6 = (long) r14
            long r4 = r4 + r6
            r12.f11125B = r4
        L186:
            if (r14 != r0) goto L1a1
            if (r15 == 0) goto L19f
            java.nio.ByteBuffer r14 = r12.f11134K
            if (r13 != r14) goto L18f
            goto L190
        L18f:
            r2 = 0
        L190:
            p371v5.C6549a.m13291e(r2)
            long r13 = r12.f11126C
            int r15 = r12.f11127D
            int r0 = r12.f11135L
            int r15 = r15 * r0
            long r2 = (long) r15
            long r13 = r13 + r2
            r12.f11126C = r13
        L19f:
            r12.f11136M = r1
        L1a1:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: a */
    public void mo6266a(p121h4.C2477r r5) {
            r4 = this;
            h4.r r0 = r4.f11145V
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L9
            return
        L9:
            int r0 = r5.f11113a
            float r1 = r5.f11114b
            android.media.AudioTrack r2 = r4.f11168s
            if (r2 == 0) goto L21
            h4.r r3 = r4.f11145V
            int r3 = r3.f11113a
            if (r3 == r0) goto L1a
            r2.attachAuxEffect(r0)
        L1a:
            if (r0 == 0) goto L21
            android.media.AudioTrack r0 = r4.f11168s
            r0.setAuxEffectSendLevel(r1)
        L21:
            r4.f11145V = r5
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: b */
    public void mo6267b() {
            r5 = this;
            r5.flush()
            h4.f[] r0 = r5.f11155f
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L12
            r4 = r0[r3]
            r4.mo6257b()
            int r3 = r3 + 1
            goto L8
        L12:
            h4.f[] r0 = r5.f11156g
            int r1 = r0.length
            r3 = 0
        L16:
            if (r3 >= r1) goto L20
            r4 = r0[r3]
            r4.mo6257b()
            int r3 = r3 + 1
            goto L16
        L20:
            r5.f11142S = r2
            r5.f11148Y = r2
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: c */
    public void mo6268c(p088f4.C2052w0 r5) {
            r4 = this;
            f4.w0 r0 = new f4.w0
            float r1 = r5.f9372Y
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r3 = 1090519040(0x41000000, float:8.0)
            float r1 = p371v5.C6552b0.m13314g(r1, r2, r3)
            float r5 = r5.f9373Z
            float r5 = p371v5.C6552b0.m13314g(r5, r2, r3)
            r0.<init>(r1, r5)
            boolean r5 = r4.f11160k
            if (r5 == 0) goto L24
            int r5 = p371v5.C6552b0.f25624a
            r1 = 23
            if (r5 < r1) goto L24
            r4.m6314M(r0)
            goto L2b
        L24:
            boolean r5 = r4.m6306D()
            r4.m6313L(r0, r5)
        L2b:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: d */
    public boolean mo6269d() {
            r1 = this;
            boolean r0 = r1.m6309G()
            if (r0 == 0) goto L13
            boolean r0 = r1.f11140Q
            if (r0 == 0) goto L11
            boolean r0 = r1.mo6276k()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: e */
    public p088f4.C2052w0 mo6270e() {
            r1 = this;
            boolean r0 = r1.f11160k
            if (r0 == 0) goto L7
            f4.w0 r0 = r1.f11172w
            goto Lb
        L7:
            f4.w0 r0 = r1.m6304A()
        Lb:
            return r0
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: f */
    public boolean mo6271f(p088f4.C2003e0 r1) {
            r0 = this;
            int r1 = r0.mo6277l(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // p121h4.InterfaceC2474o
    public void flush() {
            r5 = this;
            boolean r0 = r5.m6309G()
            r1 = 0
            if (r0 == 0) goto L68
            r5.m6312K()
            h4.q r0 = r5.f11158i
            android.media.AudioTrack r0 = r0.f11089c
            java.util.Objects.requireNonNull(r0)
            int r0 = r0.getPlayState()
            r2 = 3
            r3 = 0
            if (r0 != r2) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L23
            android.media.AudioTrack r0 = r5.f11168s
            r0.pause()
        L23:
            android.media.AudioTrack r0 = r5.f11168s
            boolean r0 = m6302H(r0)
            if (r0 == 0) goto L3c
            h4.u$h r0 = r5.f11162m
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r2 = r5.f11168s
            android.media.AudioTrack$StreamEventCallback r4 = r0.f11198b
            r2.unregisterStreamEventCallback(r4)
            android.os.Handler r0 = r0.f11197a
            r0.removeCallbacksAndMessages(r1)
        L3c:
            android.media.AudioTrack r0 = r5.f11168s
            r5.f11168s = r1
            int r2 = p371v5.C6552b0.f25624a
            r4 = 21
            if (r2 >= r4) goto L4c
            boolean r2 = r5.f11143T
            if (r2 != 0) goto L4c
            r5.f11144U = r3
        L4c:
            h4.u$c r2 = r5.f11166q
            if (r2 == 0) goto L54
            r5.f11167r = r2
            r5.f11166q = r1
        L54:
            h4.q r2 = r5.f11158i
            r2.m6293d()
            android.os.ConditionVariable r2 = r5.f11157h
            r2.close()
            h4.u$a r2 = new h4.u$a
            java.lang.String r3 = "ExoPlayer:AudioTrackReleaseThread"
            r2.<init>(r5, r3, r0)
            r2.start()
        L68:
            h4.u$f<h4.o$e> r0 = r5.f11164o
            r0.f11194a = r1
            h4.u$f<h4.o$b> r0 = r5.f11163n
            r0.f11194a = r1
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: g */
    public void mo6272g() {
            r3 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 1
            r2 = 21
            if (r0 < r2) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            p371v5.C6549a.m13291e(r0)
            boolean r0 = r3.f11143T
            p371v5.C6549a.m13291e(r0)
            boolean r0 = r3.f11146W
            if (r0 != 0) goto L1b
            r3.f11146W = r1
            r3.flush()
        L1b:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: h */
    public void mo6273h(p121h4.C2461d r2) {
            r1 = this;
            h4.d r0 = r1.f11169t
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            return
        L9:
            r1.f11169t = r2
            boolean r2 = r1.f11146W
            if (r2 == 0) goto L10
            return
        L10:
            r1.flush()
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: i */
    public void mo6274i() {
            r1 = this;
            boolean r0 = r1.f11140Q
            if (r0 != 0) goto L16
            boolean r0 = r1.m6309G()
            if (r0 == 0) goto L16
            boolean r0 = r1.m6320x()
            if (r0 == 0) goto L16
            r1.m6310I()
            r0 = 1
            r1.f11140Q = r0
        L16:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: j */
    public void mo6275j() {
            r7 = this;
            r0 = 0
            r7.f11142S = r0
            boolean r1 = r7.m6309G()
            if (r1 == 0) goto L36
            h4.q r1 = r7.f11158i
            r2 = 0
            r1.f11098l = r2
            r1.f11109w = r0
            r1.f11108v = r0
            r1.f11099m = r2
            r1.f11083C = r2
            r1.f11086F = r2
            r1.f11097k = r0
            long r2 = r1.f11110x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2f
            h4.p r0 = r1.f11092f
            java.util.Objects.requireNonNull(r0)
            r0.m6288a()
            r0 = 1
        L2f:
            if (r0 == 0) goto L36
            android.media.AudioTrack r0 = r7.f11168s
            r0.pause()
        L36:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: k */
    public boolean mo6276k() {
            r3 = this;
            boolean r0 = r3.m6309G()
            if (r0 == 0) goto L14
            h4.q r0 = r3.f11158i
            long r1 = r3.m6307E()
            boolean r0 = r0.m6292c(r1)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: l */
    public int mo6277l(p088f4.C2003e0 r5) {
            r4 = this;
            java.lang.String r0 = r5.f8896j0
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L2d
            int r0 = r5.f8911y0
            boolean r0 = p371v5.C6552b0.m13332y(r0)
            int r5 = r5.f8911y0
            if (r0 != 0) goto L21
            r0 = 33
            java.lang.String r1 = "Invalid PCM encoding: "
            java.lang.String r3 = "DefaultAudioSink"
            p088f4.C1999d.m5182a(r0, r1, r5, r3)
            return r2
        L21:
            if (r5 == r3) goto L2c
            boolean r0 = r4.f11152c
            if (r0 == 0) goto L2b
            r0 = 4
            if (r5 != r0) goto L2b
            goto L2c
        L2b:
            return r1
        L2c:
            return r3
        L2d:
            boolean r0 = r4.f11148Y
            if (r0 != 0) goto L3a
            h4.d r0 = r4.f11169t
            boolean r0 = r4.m6317P(r5, r0)
            if (r0 == 0) goto L3a
            return r3
        L3a:
            h4.e r0 = r4.f11150a
            android.util.Pair r5 = m6301B(r5, r0)
            if (r5 == 0) goto L43
            goto L44
        L43:
            r1 = 0
        L44:
            if (r1 == 0) goto L47
            return r3
        L47:
            return r2
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: m */
    public void mo6278m(int r2) {
            r1 = this;
            int r0 = r1.f11144U
            if (r0 == r2) goto L10
            r1.f11144U = r2
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.f11143T = r2
            r1.flush()
        L10:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: n */
    public boolean mo6279n(java.nio.ByteBuffer r19, long r20, int r22) {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r4 = r22
            java.nio.ByteBuffer r5 = r1.f11134K
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L13
            if (r0 != r5) goto L11
            goto L13
        L11:
            r5 = 0
            goto L14
        L13:
            r5 = 1
        L14:
            p371v5.C6549a.m13288b(r5)
            h4.u$c r5 = r1.f11166q
            r8 = 0
            r9 = 3
            if (r5 == 0) goto L85
            boolean r5 = r18.m6320x()
            if (r5 != 0) goto L24
            return r6
        L24:
            h4.u$c r5 = r1.f11166q
            h4.u$c r10 = r1.f11167r
            java.util.Objects.requireNonNull(r5)
            int r11 = r10.f11180c
            int r12 = r5.f11180c
            if (r11 != r12) goto L4b
            int r11 = r10.f11184g
            int r12 = r5.f11184g
            if (r11 != r12) goto L4b
            int r11 = r10.f11182e
            int r12 = r5.f11182e
            if (r11 != r12) goto L4b
            int r11 = r10.f11183f
            int r12 = r5.f11183f
            if (r11 != r12) goto L4b
            int r10 = r10.f11181d
            int r5 = r5.f11181d
            if (r10 != r5) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            if (r5 != 0) goto L5c
            r18.m6310I()
            boolean r5 = r18.mo6276k()
            if (r5 == 0) goto L58
            return r6
        L58:
            r18.flush()
            goto L82
        L5c:
            h4.u$c r5 = r1.f11166q
            r1.f11167r = r5
            r1.f11166q = r8
            android.media.AudioTrack r5 = r1.f11168s
            boolean r5 = m6302H(r5)
            if (r5 == 0) goto L82
            int r5 = r1.f11161l
            if (r5 == r9) goto L82
            android.media.AudioTrack r5 = r1.f11168s
            r5.setOffloadEndOfStream()
            android.media.AudioTrack r5 = r1.f11168s
            h4.u$c r9 = r1.f11167r
            f4.e0 r9 = r9.f11178a
            int r10 = r9.f8912z0
            int r9 = r9.f8881A0
            r5.setOffloadDelayPadding(r10, r9)
            r1.f11149Z = r7
        L82:
            r1.m6319w(r2)
        L85:
            boolean r5 = r18.m6309G()
            if (r5 != 0) goto L9c
            r18.m6308F()     // Catch: p121h4.InterfaceC2474o.b -> L8f
            goto L9c
        L8f:
            r0 = move-exception
            r2 = r0
            boolean r0 = r2.f11066Y
            if (r0 != 0) goto L9b
            h4.u$f<h4.o$b> r0 = r1.f11163n
            r0.m6332a(r2)
            return r6
        L9b:
            throw r2
        L9c:
            h4.u$f<h4.o$b> r5 = r1.f11163n
            r5.f11194a = r8
            boolean r5 = r1.f11129F
            r9 = 0
            if (r5 == 0) goto Lc9
            long r11 = java.lang.Math.max(r9, r2)
            r1.f11130G = r11
            r1.f11128E = r6
            r1.f11129F = r6
            boolean r5 = r1.f11160k
            if (r5 == 0) goto Lbf
            int r5 = p371v5.C6552b0.f25624a
            r11 = 23
            if (r5 < r11) goto Lbf
            f4.w0 r5 = r1.f11172w
            r1.m6314M(r5)
        Lbf:
            r1.m6319w(r2)
            boolean r5 = r1.f11142S
            if (r5 == 0) goto Lc9
            r18.mo6281p()
        Lc9:
            h4.q r5 = r1.f11158i
            long r11 = r18.m6307E()
            android.media.AudioTrack r13 = r5.f11089c
            java.util.Objects.requireNonNull(r13)
            int r13 = r13.getPlayState()
            boolean r14 = r5.f11094h
            r15 = 2
            if (r14 == 0) goto Lee
            if (r13 != r15) goto Le2
            r5.f11102p = r6
            goto Lec
        Le2:
            if (r13 != r7) goto Lee
            long r16 = r5.m6291b()
            int r14 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r14 != 0) goto Lee
        Lec:
            r5 = 0
            goto L10a
        Lee:
            boolean r9 = r5.f11102p
            boolean r10 = r5.m6292c(r11)
            r5.f11102p = r10
            if (r9 == 0) goto L109
            if (r10 != 0) goto L109
            if (r13 == r7) goto L109
            h4.q$a r9 = r5.f11087a
            int r10 = r5.f11091e
            long r11 = r5.f11095i
            long r11 = p371v5.C6552b0.m13307K(r11)
            r9.mo6296b(r10, r11)
        L109:
            r5 = 1
        L10a:
            if (r5 != 0) goto L10d
            return r6
        L10d:
            java.nio.ByteBuffer r5 = r1.f11134K
            if (r5 != 0) goto L326
            java.nio.ByteOrder r5 = r19.order()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r9) goto L11b
            r5 = 1
            goto L11c
        L11b:
            r5 = 0
        L11c:
            p371v5.C6549a.m13288b(r5)
            boolean r5 = r19.hasRemaining()
            if (r5 != 0) goto L126
            return r7
        L126:
            h4.u$c r5 = r1.f11167r
            int r9 = r5.f11180c
            if (r9 == 0) goto L28e
            int r9 = r1.f11127D
            if (r9 != 0) goto L28e
            int r5 = r5.f11184g
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 16
            r11 = -1
            r12 = -2
            switch(r5) {
                case 5: goto L247;
                case 6: goto L247;
                case 7: goto L1f4;
                case 8: goto L1f4;
                case 9: goto L1cf;
                case 10: goto L289;
                case 11: goto L1cb;
                case 12: goto L1cb;
                case 13: goto L13b;
                case 14: goto L166;
                case 15: goto L162;
                case 16: goto L289;
                case 17: goto L149;
                case 18: goto L247;
                default: goto L13b;
            }
        L13b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2 = 38
            java.lang.String r3 = "Unexpected audio encoding: "
            java.lang.String r2 = p064e.C1490d.m4039a(r2, r3, r5)
            r0.<init>(r2)
            throw r0
        L149:
            byte[] r5 = new byte[r10]
            int r9 = r19.position()
            r0.get(r5)
            r0.position(r9)
            m4.b0 r9 = new m4.b0
            r9.<init>(r5, r7, r8)
            h4.c$b r5 = p121h4.C2459c.m6248b(r9)
            int r9 = r5.f10980c
            goto L289
        L162:
            r9 = 512(0x200, float:7.17E-43)
            goto L289
        L166:
            int r5 = r19.position()
            int r8 = r19.limit()
            int r8 = r8 + (-10)
            r9 = r5
        L171:
            if (r9 > r8) goto L194
            int r10 = r9 + 4
            int r12 = p371v5.C6552b0.f25624a
            int r10 = r0.getInt(r10)
            java.nio.ByteOrder r12 = r19.order()
            java.nio.ByteOrder r13 = java.nio.ByteOrder.BIG_ENDIAN
            if (r12 != r13) goto L184
            goto L188
        L184:
            int r10 = java.lang.Integer.reverseBytes(r10)
        L188:
            r10 = r10 & (-2)
            r12 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r10 != r12) goto L191
            int r9 = r9 - r5
            goto L195
        L191:
            int r9 = r9 + 1
            goto L171
        L194:
            r9 = -1
        L195:
            if (r9 != r11) goto L19a
            r9 = 0
            goto L289
        L19a:
            int r5 = r19.position()
            int r5 = r5 + r9
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r8 = 187(0xbb, float:2.62E-43)
            if (r5 != r8) goto L1ad
            r5 = 1
            goto L1ae
        L1ad:
            r5 = 0
        L1ae:
            r8 = 40
            int r10 = r19.position()
            int r10 = r10 + r9
            if (r5 == 0) goto L1ba
            r5 = 9
            goto L1bc
        L1ba:
            r5 = 8
        L1bc:
            int r10 = r10 + r5
            byte r5 = r0.get(r10)
            int r5 = r5 >> 4
            r5 = r5 & 7
            int r5 = r8 << r5
            int r5 = r5 * 16
            goto L285
        L1cb:
            r9 = 2048(0x800, float:2.87E-42)
            goto L289
        L1cf:
            int r5 = r19.position()
            int r8 = p371v5.C6552b0.f25624a
            int r5 = r0.getInt(r5)
            java.nio.ByteOrder r8 = r19.order()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            if (r8 != r9) goto L1e2
            goto L1e6
        L1e2:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L1e6:
            int r9 = p121h4.C2485z.m6356d(r5)
            if (r9 == r11) goto L1ee
            goto L289
        L1ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L1f4:
            int r5 = r19.position()
            byte r8 = r0.get(r5)
            if (r8 == r12) goto L230
            if (r8 == r11) goto L21d
            r9 = 31
            if (r8 == r9) goto L210
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & r7
            int r8 = r8 << 6
            int r5 = r5 + 5
            goto L23b
        L210:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 6
            goto L229
        L21d:
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 7
        L229:
            byte r5 = r0.get(r5)
            r5 = r5 & 60
            goto L241
        L230:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & r7
            int r8 = r8 << 6
            int r5 = r5 + 4
        L23b:
            byte r5 = r0.get(r5)
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L241:
            int r5 = r5 >> r15
            r5 = r5 | r8
            int r5 = r5 + r7
            int r9 = r5 * 32
            goto L289
        L247:
            int r5 = r19.position()
            int r5 = r5 + 5
            byte r5 = r0.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            int r5 = r5 >> 3
            r8 = 10
            if (r5 <= r8) goto L25b
            r5 = 1
            goto L25c
        L25b:
            r5 = 0
        L25c:
            if (r5 == 0) goto L287
            int r5 = r19.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            r8 = 3
            if (r5 != r8) goto L271
            r5 = 3
            goto L27f
        L271:
            int r5 = r19.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 48
            int r5 = r5 >> 4
        L27f:
            int[] r8 = p121h4.C2457b.f10959a
            r5 = r8[r5]
            int r5 = r5 * 256
        L285:
            r9 = r5
            goto L289
        L287:
            r9 = 1536(0x600, float:2.152E-42)
        L289:
            r1.f11127D = r9
            if (r9 != 0) goto L28e
            return r7
        L28e:
            h4.u$e r5 = r1.f11170u
            if (r5 == 0) goto L29f
            boolean r5 = r18.m6320x()
            if (r5 != 0) goto L299
            return r6
        L299:
            r1.m6319w(r2)
            r5 = 0
            r1.f11170u = r5
        L29f:
            long r8 = r1.f11130G
            h4.u$c r5 = r1.f11167r
            int r10 = r5.f11180c
            if (r10 != 0) goto L2ae
            long r10 = r1.f11175z
            int r12 = r5.f11179b
            long r12 = (long) r12
            long r10 = r10 / r12
            goto L2b0
        L2ae:
            long r10 = r1.f11124A
        L2b0:
            h4.e0 r12 = r1.f11154e
            long r12 = r12.f11035o
            long r10 = r10 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r12
            f4.e0 r5 = r5.f11178a
            int r5 = r5.f8910x0
            long r12 = (long) r5
            long r10 = r10 / r12
            long r10 = r10 + r8
            boolean r5 = r1.f11128E
            if (r5 != 0) goto L2e0
            long r8 = r10 - r2
            long r8 = java.lang.Math.abs(r8)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L2e0
            h4.o$c r5 = r1.f11165p
            h4.o$d r8 = new h4.o$d
            r8.<init>(r2, r10)
            h4.x$b r5 = (p121h4.C2483x.b) r5
            r5.m6351a(r8)
            r1.f11128E = r7
        L2e0:
            boolean r5 = r1.f11128E
            if (r5 == 0) goto L307
            boolean r5 = r18.m6320x()
            if (r5 != 0) goto L2eb
            return r6
        L2eb:
            long r8 = r2 - r10
            long r10 = r1.f11130G
            long r10 = r10 + r8
            r1.f11130G = r10
            r1.f11128E = r6
            r1.m6319w(r2)
            h4.o$c r5 = r1.f11165p
            if (r5 == 0) goto L307
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L307
            h4.x$b r5 = (p121h4.C2483x.b) r5
            h4.x r5 = r5.f11216a
            r5.f11213K1 = r7
        L307:
            h4.u$c r5 = r1.f11167r
            int r5 = r5.f11180c
            if (r5 != 0) goto L318
            long r8 = r1.f11175z
            int r5 = r19.remaining()
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.f11175z = r8
            goto L322
        L318:
            long r8 = r1.f11124A
            int r5 = r1.f11127D
            int r5 = r5 * r4
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.f11124A = r8
        L322:
            r1.f11134K = r0
            r1.f11135L = r4
        L326:
            r1.m6311J(r2)
            java.nio.ByteBuffer r0 = r1.f11134K
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L337
            r0 = 0
            r1.f11134K = r0
            r1.f11135L = r6
            return r7
        L337:
            h4.q r0 = r1.f11158i
            long r2 = r18.m6307E()
            long r4 = r0.f11111y
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L35d
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L35d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.f11111y
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L35d
            r0 = 1
            goto L35e
        L35d:
            r0 = 0
        L35e:
            if (r0 == 0) goto L36b
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            android.util.Log.w(r0, r2)
            r18.flush()
            return r7
        L36b:
            return r6
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: o */
    public long mo6280o(boolean r27) {
            r26 = this;
            r0 = r26
            boolean r1 = r26.m6309G()
            if (r1 == 0) goto L2ee
            boolean r1 = r0.f11129F
            if (r1 == 0) goto Le
            goto L2ee
        Le:
            h4.q r1 = r0.f11158i
            android.media.AudioTrack r2 = r1.f11089c
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.getPlayState()
            r3 = 2
            r4 = 3
            r9 = 1
            r10 = 0
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r2 != r4) goto L1b1
            long r5 = r1.m6291b()
            long r24 = r1.m6290a(r5)
            int r2 = (r24 > r10 ? 1 : (r24 == r10 ? 0 : -1))
            if (r2 != 0) goto L30
            goto L1b1
        L30:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 / r13
            long r7 = r1.f11099m
            long r7 = r5 - r7
            r17 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r2 < 0) goto L6f
            long[] r2 = r1.f11088b
            int r7 = r1.f11108v
            long r17 = r24 - r5
            r2[r7] = r17
            int r7 = r7 + r9
            r2 = 10
            int r7 = r7 % r2
            r1.f11108v = r7
            int r7 = r1.f11109w
            if (r7 >= r2) goto L54
            int r7 = r7 + r9
            r1.f11109w = r7
        L54:
            r1.f11099m = r5
            r1.f11098l = r10
            r2 = 0
        L59:
            int r7 = r1.f11109w
            if (r2 >= r7) goto L6f
            long r10 = r1.f11098l
            long[] r8 = r1.f11088b
            r17 = r8[r2]
            long r7 = (long) r7
            long r17 = r17 / r7
            long r7 = r17 + r10
            r1.f11098l = r7
            int r2 = r2 + 1
            r10 = 0
            goto L59
        L6f:
            boolean r2 = r1.f11094h
            if (r2 == 0) goto L75
            goto L1b1
        L75:
            h4.p r2 = r1.f11092f
            java.util.Objects.requireNonNull(r2)
            h4.p$a r7 = r2.f11070a
            r8 = 4
            if (r7 == 0) goto L109
            long r10 = r2.f11074e
            long r10 = r5 - r10
            long r12 = r2.f11073d
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L8b
            goto L109
        L8b:
            r2.f11074e = r5
            android.media.AudioTrack r10 = r7.f11076a
            android.media.AudioTimestamp r11 = r7.f11077b
            boolean r10 = r10.getTimestamp(r11)
            if (r10 == 0) goto Lb4
            android.media.AudioTimestamp r11 = r7.f11077b
            long r11 = r11.framePosition
            long r13 = r7.f11079d
            int r17 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r17 <= 0) goto La9
            long r13 = r7.f11078c
            r17 = 1
            long r13 = r13 + r17
            r7.f11078c = r13
        La9:
            r7.f11079d = r11
            long r13 = r7.f11078c
            r17 = 32
            long r13 = r13 << r17
            long r11 = r11 + r13
            r7.f11080e = r11
        Lb4:
            int r7 = r2.f11071b
            if (r7 == 0) goto Le1
            if (r7 == r9) goto Lcd
            if (r7 == r3) goto Lca
            if (r7 == r4) goto Lc7
            if (r7 != r8) goto Lc1
            goto L10a
        Lc1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        Lc7:
            if (r10 == 0) goto L10a
            goto Ldd
        Lca:
            if (r10 != 0) goto L10a
            goto Ldd
        Lcd:
            if (r10 == 0) goto Ldd
            h4.p$a r4 = r2.f11070a
            long r11 = r4.f11080e
            long r13 = r2.f11075f
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L10a
            r2.m6289b(r3)
            goto L10a
        Ldd:
            r2.m6288a()
            goto L10a
        Le1:
            if (r10 == 0) goto Lfa
            h4.p$a r4 = r2.f11070a
            android.media.AudioTimestamp r7 = r4.f11077b
            long r11 = r7.nanoTime
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            long r13 = r2.f11072c
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 < 0) goto L109
            long r11 = r4.f11080e
            r2.f11075f = r11
            r2.m6289b(r9)
            goto L10a
        Lfa:
            long r11 = r2.f11072c
            long r11 = r5 - r11
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 <= 0) goto L10a
            r2.m6289b(r4)
            goto L10a
        L109:
            r10 = 0
        L10a:
            r11 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r10 != 0) goto L110
            goto L165
        L110:
            h4.p$a r4 = r2.f11070a
            if (r4 == 0) goto L11f
            android.media.AudioTimestamp r7 = r4.f11077b
            long r13 = r7.nanoTime
            r17 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r17
            r20 = r13
            goto L124
        L11f:
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L124:
            if (r4 == 0) goto L129
            long r13 = r4.f11080e
            goto L12b
        L129:
            r13 = -1
        L12b:
            long r17 = r20 - r5
            long r17 = java.lang.Math.abs(r17)
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 <= 0) goto L141
            h4.q$a r4 = r1.f11087a
            r17 = r4
            r18 = r13
            r22 = r5
            r17.mo6298d(r18, r20, r22, r24)
            goto L15a
        L141:
            long r17 = r1.m6290a(r13)
            long r17 = r17 - r24
            long r17 = java.lang.Math.abs(r17)
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 <= 0) goto L15e
            h4.q$a r4 = r1.f11087a
            r17 = r4
            r18 = r13
            r22 = r5
            r17.mo6297c(r18, r20, r22, r24)
        L15a:
            r2.m6289b(r8)
            goto L165
        L15e:
            int r4 = r2.f11071b
            if (r4 != r8) goto L165
            r2.m6288a()
        L165:
            boolean r2 = r1.f11103q
            if (r2 == 0) goto L1b1
            java.lang.reflect.Method r2 = r1.f11100n
            if (r2 == 0) goto L1b1
            long r7 = r1.f11104r
            long r7 = r5 - r7
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r4 < 0) goto L1b1
            android.media.AudioTrack r4 = r1.f11089c     // Catch: java.lang.Exception -> L1ac
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> L1ac
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L1ac
            java.lang.Object r2 = r2.invoke(r4, r8)     // Catch: java.lang.Exception -> L1ac
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L1ac
            int r4 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> L1ac
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L1ac
            long r13 = (long) r2     // Catch: java.lang.Exception -> L1ac
            r17 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r17
            long r7 = r1.f11095i     // Catch: java.lang.Exception -> L1ac
            long r13 = r13 - r7
            r1.f11101o = r13     // Catch: java.lang.Exception -> L1ac
            r7 = 0
            long r13 = java.lang.Math.max(r13, r7)     // Catch: java.lang.Exception -> L1ac
            r1.f11101o = r13     // Catch: java.lang.Exception -> L1ac
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 <= 0) goto L1af
            h4.q$a r2 = r1.f11087a     // Catch: java.lang.Exception -> L1ac
            r2.mo6299e(r13)     // Catch: java.lang.Exception -> L1ac
            r7 = 0
            r1.f11101o = r7     // Catch: java.lang.Exception -> L1ac
            goto L1af
        L1ac:
            r2 = 0
            r1.f11100n = r2
        L1af:
            r1.f11104r = r5
        L1b1:
            long r4 = java.lang.System.nanoTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            h4.p r2 = r1.f11092f
            java.util.Objects.requireNonNull(r2)
            int r6 = r2.f11071b
            if (r6 != r3) goto L1c3
            r12 = 1
            goto L1c4
        L1c3:
            r12 = 0
        L1c4:
            if (r12 == 0) goto L1ef
            h4.p$a r3 = r2.f11070a
            if (r3 == 0) goto L1cd
            long r7 = r3.f11080e
            goto L1cf
        L1cd:
            r7 = -1
        L1cf:
            long r6 = r1.m6290a(r7)
            h4.p$a r2 = r2.f11070a
            if (r2 == 0) goto L1e0
            android.media.AudioTimestamp r2 = r2.f11077b
            long r2 = r2.nanoTime
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r10
            r15 = r2
            goto L1e5
        L1e0:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1e5:
            long r2 = r4 - r15
            float r8 = r1.f11096j
            long r2 = p371v5.C6552b0.m13324q(r2, r8)
            long r2 = r2 + r6
            goto L20a
        L1ef:
            int r2 = r1.f11109w
            if (r2 != 0) goto L1fc
            long r2 = r1.m6291b()
            long r2 = r1.m6290a(r2)
            goto L1ff
        L1fc:
            long r2 = r1.f11098l
            long r2 = r2 + r4
        L1ff:
            if (r27 != 0) goto L20a
            long r6 = r1.f11101o
            long r2 = r2 - r6
            r6 = 0
            long r2 = java.lang.Math.max(r6, r2)
        L20a:
            boolean r6 = r1.f11084D
            if (r6 == r12) goto L216
            long r6 = r1.f11083C
            r1.f11086F = r6
            long r6 = r1.f11082B
            r1.f11085E = r6
        L216:
            long r6 = r1.f11086F
            long r6 = r4 - r6
            r10 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 >= 0) goto L238
            long r13 = r1.f11085E
            float r8 = r1.f11096j
            long r15 = p371v5.C6552b0.m13324q(r6, r8)
            long r15 = r15 + r13
            r13 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r13
            long r6 = r6 / r10
            long r2 = r2 * r6
            long r6 = r13 - r6
            long r6 = r6 * r15
            long r6 = r6 + r2
            long r2 = r6 / r13
        L238:
            boolean r6 = r1.f11097k
            if (r6 != 0) goto L268
            long r6 = r1.f11082B
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L268
            r1.f11097k = r9
            long r6 = r2 - r6
            long r6 = p371v5.C6552b0.m13307K(r6)
            float r8 = r1.f11096j
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L253
            goto L25a
        L253:
            double r6 = (double) r6
            double r8 = (double) r8
            double r6 = r6 / r8
            long r6 = java.lang.Math.round(r6)
        L25a:
            long r8 = java.lang.System.currentTimeMillis()
            long r6 = p371v5.C6552b0.m13307K(r6)
            long r8 = r8 - r6
            h4.q$a r6 = r1.f11087a
            r6.mo6295a(r8)
        L268:
            r1.f11083C = r4
            r1.f11082B = r2
            r1.f11084D = r12
            h4.u$c r1 = r0.f11167r
            long r4 = r26.m6307E()
            long r4 = r1.m6329c(r4)
            long r1 = java.lang.Math.min(r2, r4)
        L27c:
            java.util.ArrayDeque<h4.u$e> r3 = r0.f11159j
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L29d
            java.util.ArrayDeque<h4.u$e> r3 = r0.f11159j
            java.lang.Object r3 = r3.getFirst()
            h4.u$e r3 = (p121h4.C2480u.e) r3
            long r3 = r3.f11193d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L29d
            java.util.ArrayDeque<h4.u$e> r3 = r0.f11159j
            java.lang.Object r3 = r3.remove()
            h4.u$e r3 = (p121h4.C2480u.e) r3
            r0.f11171v = r3
            goto L27c
        L29d:
            h4.u$e r3 = r0.f11171v
            long r4 = r3.f11193d
            long r4 = r1 - r4
            f4.w0 r3 = r3.f11190a
            f4.w0 r6 = p088f4.C2052w0.f9371b0
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L2b3
            h4.u$e r1 = r0.f11171v
            long r1 = r1.f11192c
            long r1 = r1 + r4
            goto L2e0
        L2b3:
            java.util.ArrayDeque<h4.u$e> r3 = r0.f11159j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2c7
            h4.u$b r1 = r0.f11151b
            long r1 = r1.mo6325d(r4)
            h4.u$e r3 = r0.f11171v
            long r3 = r3.f11192c
            long r1 = r1 + r3
            goto L2e0
        L2c7:
            java.util.ArrayDeque<h4.u$e> r3 = r0.f11159j
            java.lang.Object r3 = r3.getFirst()
            h4.u$e r3 = (p121h4.C2480u.e) r3
            long r4 = r3.f11193d
            long r4 = r4 - r1
            h4.u$e r1 = r0.f11171v
            f4.w0 r1 = r1.f11190a
            float r1 = r1.f9372Y
            long r1 = p371v5.C6552b0.m13324q(r4, r1)
            long r3 = r3.f11192c
            long r1 = r3 - r1
        L2e0:
            h4.u$c r3 = r0.f11167r
            h4.u$b r4 = r0.f11151b
            long r4 = r4.mo6323b()
            long r3 = r3.m6329c(r4)
            long r3 = r3 + r1
            return r3
        L2ee:
            r1 = -9223372036854775808
            return r1
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: p */
    public void mo6281p() {
            r1 = this;
            r0 = 1
            r1.f11142S = r0
            boolean r0 = r1.m6309G()
            if (r0 == 0) goto L18
            h4.q r0 = r1.f11158i
            h4.p r0 = r0.f11092f
            java.util.Objects.requireNonNull(r0)
            r0.m6288a()
            android.media.AudioTrack r0 = r1.f11168s
            r0.play()
        L18:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: q */
    public void mo6282q() {
            r1 = this;
            boolean r0 = r1.f11146W
            if (r0 == 0) goto La
            r0 = 0
            r1.f11146W = r0
            r1.flush()
        La:
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: r */
    public void mo6283r(p121h4.InterfaceC2474o.c r1) {
            r0 = this;
            r0.f11165p = r1
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: s */
    public void mo6284s(p088f4.C2003e0 r15, int r16, int[] r17) {
            r14 = this;
            r1 = r14
            r3 = r15
            java.lang.String r0 = r3.f8896j0
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            r2 = -1
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L9a
            int r0 = r3.f8911y0
            boolean r0 = p371v5.C6552b0.m13332y(r0)
            p371v5.C6549a.m13288b(r0)
            int r0 = r3.f8911y0
            int r2 = r3.f8909w0
            int r0 = p371v5.C6552b0.m13326s(r0, r2)
            int r2 = r3.f8911y0
            boolean r6 = r1.f11152c
            if (r6 == 0) goto L2d
            boolean r2 = p371v5.C6552b0.m13331x(r2)
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r4 = 0
        L2e:
            if (r4 == 0) goto L33
            h4.f[] r2 = r1.f11156g
            goto L35
        L33:
            h4.f[] r2 = r1.f11155f
        L35:
            h4.e0 r4 = r1.f11154e
            int r6 = r3.f8912z0
            int r7 = r3.f8881A0
            r4.f11029i = r6
            r4.f11030j = r7
            int r4 = p371v5.C6552b0.f25624a
            r6 = 21
            if (r4 >= r6) goto L58
            int r4 = r3.f8909w0
            r6 = 8
            if (r4 != r6) goto L58
            if (r17 != 0) goto L58
            r4 = 6
            int[] r6 = new int[r4]
            r7 = 0
        L51:
            if (r7 >= r4) goto L5a
            r6[r7] = r7
            int r7 = r7 + 1
            goto L51
        L58:
            r6 = r17
        L5a:
            h4.t r4 = r1.f11153d
            r4.f11122i = r6
            h4.f$a r4 = new h4.f$a
            int r6 = r3.f8910x0
            int r7 = r3.f8909w0
            int r8 = r3.f8911y0
            r4.<init>(r6, r7, r8)
            int r6 = r2.length
            r7 = 0
        L6b:
            if (r7 >= r6) goto L84
            r8 = r2[r7]
            h4.f$a r9 = r8.mo6261f(r4)     // Catch: p121h4.InterfaceC2465f.b -> L7d
            boolean r8 = r8.mo6240a()     // Catch: p121h4.InterfaceC2465f.b -> L7d
            if (r8 == 0) goto L7a
            r4 = r9
        L7a:
            int r7 = r7 + 1
            goto L6b
        L7d:
            r0 = move-exception
            h4.o$a r2 = new h4.o$a
            r2.<init>(r0, r15)
            throw r2
        L84:
            int r6 = r4.f11040c
            int r7 = r4.f11038a
            int r8 = r4.f11039b
            int r8 = p371v5.C6552b0.m13321n(r8)
            int r4 = r4.f11039b
            int r4 = p371v5.C6552b0.m13326s(r6, r4)
            r12 = r2
            r9 = r6
            r6 = r4
            r4 = r0
            r0 = 0
            goto Ld7
        L9a:
            h4.f[] r0 = new p121h4.InterfaceC2465f[r5]
            int r6 = r3.f8910x0
            h4.d r7 = r1.f11169t
            boolean r7 = r14.m6317P(r15, r7)
            if (r7 == 0) goto Lb8
            java.lang.String r7 = r3.f8896j0
            java.util.Objects.requireNonNull(r7)
            java.lang.String r8 = r3.f8893g0
            int r7 = p371v5.C6567q.m13372b(r7, r8)
            int r8 = r3.f8909w0
            int r8 = p371v5.C6552b0.m13321n(r8)
            goto Ld1
        Lb8:
            h4.e r4 = r1.f11150a
            android.util.Pair r4 = m6301B(r15, r4)
            if (r4 == 0) goto L145
            java.lang.Object r7 = r4.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r8 = r4.intValue()
            r4 = 2
        Ld1:
            r12 = r0
            r0 = r4
            r9 = r7
            r4 = -1
            r7 = r6
            r6 = -1
        Ld7:
            java.lang.String r2 = ") for: "
            if (r9 == 0) goto L11e
            if (r8 == 0) goto Lf7
            r1.f11148Y = r5
            h4.u$c r13 = new h4.u$c
            boolean r11 = r1.f11160k
            r2 = r13
            r3 = r15
            r5 = r0
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r14.m6309G()
            if (r0 == 0) goto Lf4
            r1.f11166q = r13
            goto Lf6
        Lf4:
            r1.f11167r = r13
        Lf6:
            return
        Lf7:
            h4.o$a r4 = new h4.o$a
            java.lang.String r5 = java.lang.String.valueOf(r15)
            int r6 = r5.length()
            int r6 = r6 + 54
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Invalid output channel config (mode="
            r7.append(r6)
            r7.append(r0)
            r7.append(r2)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            r4.<init>(r0, r15)
            throw r4
        L11e:
            h4.o$a r4 = new h4.o$a
            java.lang.String r5 = java.lang.String.valueOf(r15)
            int r6 = r5.length()
            int r6 = r6 + 48
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Invalid output encoding (mode="
            r7.append(r6)
            r7.append(r0)
            r7.append(r2)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            r4.<init>(r0, r15)
            throw r4
        L145:
            h4.o$a r0 = new h4.o$a
            java.lang.String r2 = java.lang.String.valueOf(r15)
            int r4 = r2.length()
            int r4 = r4 + 37
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Unable to configure passthrough for: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2, r15)
            throw r0
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: t */
    public void mo6285t(boolean r2) {
            r1 = this;
            f4.w0 r0 = r1.m6304A()
            r1.m6313L(r0, r2)
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: u */
    public void mo6286u() {
            r1 = this;
            r0 = 1
            r1.f11128E = r0
            return
    }

    @Override // p121h4.InterfaceC2474o
    /* renamed from: v */
    public void mo6287v(float r2) {
            r1 = this;
            float r0 = r1.f11131H
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f11131H = r2
            r1.m6315N()
        Lb:
            return
    }

    /* renamed from: w */
    public final void m6319w(long r13) {
            r12 = this;
            boolean r0 = r12.m6316O()
            if (r0 == 0) goto L11
            h4.u$b r0 = r12.f11151b
            f4.w0 r1 = r12.m6304A()
            f4.w0 r0 = r0.mo6322a(r1)
            goto L13
        L11:
            f4.w0 r0 = p088f4.C2052w0.f9371b0
        L13:
            r2 = r0
            boolean r0 = r12.m6316O()
            r9 = 0
            if (r0 == 0) goto L26
            h4.u$b r0 = r12.f11151b
            boolean r1 = r12.m6306D()
            boolean r0 = r0.mo6324c(r1)
            goto L27
        L26:
            r0 = 0
        L27:
            java.util.ArrayDeque<h4.u$e> r10 = r12.f11159j
            h4.u$e r11 = new h4.u$e
            r3 = 0
            long r4 = java.lang.Math.max(r3, r13)
            h4.u$c r13 = r12.f11167r
            long r6 = r12.m6307E()
            long r6 = r13.m6329c(r6)
            r8 = 0
            r1 = r11
            r3 = r0
            r1.<init>(r2, r3, r4, r6, r8)
            r10.add(r11)
            h4.u$c r13 = r12.f11167r
            h4.f[] r13 = r13.f11186i
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r1 = r13.length
        L4e:
            if (r9 >= r1) goto L62
            r2 = r13[r9]
            boolean r3 = r2.mo6240a()
            if (r3 == 0) goto L5c
            r14.add(r2)
            goto L5f
        L5c:
            r2.flush()
        L5f:
            int r9 = r9 + 1
            goto L4e
        L62:
            int r13 = r14.size()
            h4.f[] r1 = new p121h4.InterfaceC2465f[r13]
            java.lang.Object[] r14 = r14.toArray(r1)
            h4.f[] r14 = (p121h4.InterfaceC2465f[]) r14
            r12.f11132I = r14
            java.nio.ByteBuffer[] r13 = new java.nio.ByteBuffer[r13]
            r12.f11133J = r13
            r12.m6321y()
            h4.o$c r13 = r12.f11165p
            if (r13 == 0) goto L8d
            h4.x$b r13 = (p121h4.C2483x.b) r13
            h4.x r13 = r13.f11216a
            h4.n$a r13 = r13.f11206D1
            android.os.Handler r14 = r13.f11063a
            if (r14 == 0) goto L8d
            h4.l r1 = new h4.l
            r1.<init>(r13, r0)
            r14.post(r1)
        L8d:
            return
    }

    /* renamed from: x */
    public final boolean m6320x() {
            r9 = this;
            int r0 = r9.f11139P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f11139P = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f11139P
            h4.f[] r5 = r9.f11132I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo6260e()
        L1f:
            r9.m6311J(r7)
            boolean r0 = r4.mo6259d()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f11139P
            int r0 = r0 + r2
            r9.f11139P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f11136M
            if (r0 == 0) goto L3b
            r9.m6318Q(r0, r7)
            java.nio.ByteBuffer r0 = r9.f11136M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f11139P = r1
            return r2
    }

    /* renamed from: y */
    public final void m6321y() {
            r3 = this;
            r0 = 0
        L1:
            h4.f[] r1 = r3.f11132I
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r1 = r1[r0]
            r1.flush()
            java.nio.ByteBuffer[] r2 = r3.f11133J
            java.nio.ByteBuffer r1 = r1.mo6258c()
            r2[r0] = r1
            int r0 = r0 + 1
            goto L1
        L16:
            return
    }
}
