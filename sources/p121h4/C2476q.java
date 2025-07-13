package p121h4;

/* renamed from: h4.q */
/* loaded from: classes.dex */
public final class C2476q {

    /* renamed from: A */
    public long f11081A;

    /* renamed from: B */
    public long f11082B;

    /* renamed from: C */
    public long f11083C;

    /* renamed from: D */
    public boolean f11084D;

    /* renamed from: E */
    public long f11085E;

    /* renamed from: F */
    public long f11086F;

    /* renamed from: a */
    public final p121h4.C2476q.a f11087a;

    /* renamed from: b */
    public final long[] f11088b;

    /* renamed from: c */
    public android.media.AudioTrack f11089c;

    /* renamed from: d */
    public int f11090d;

    /* renamed from: e */
    public int f11091e;

    /* renamed from: f */
    public p121h4.C2475p f11092f;

    /* renamed from: g */
    public int f11093g;

    /* renamed from: h */
    public boolean f11094h;

    /* renamed from: i */
    public long f11095i;

    /* renamed from: j */
    public float f11096j;

    /* renamed from: k */
    public boolean f11097k;

    /* renamed from: l */
    public long f11098l;

    /* renamed from: m */
    public long f11099m;

    /* renamed from: n */
    public java.lang.reflect.Method f11100n;

    /* renamed from: o */
    public long f11101o;

    /* renamed from: p */
    public boolean f11102p;

    /* renamed from: q */
    public boolean f11103q;

    /* renamed from: r */
    public long f11104r;

    /* renamed from: s */
    public long f11105s;

    /* renamed from: t */
    public long f11106t;

    /* renamed from: u */
    public long f11107u;

    /* renamed from: v */
    public int f11108v;

    /* renamed from: w */
    public int f11109w;

    /* renamed from: x */
    public long f11110x;

    /* renamed from: y */
    public long f11111y;

    /* renamed from: z */
    public long f11112z;

    /* renamed from: h4.q$a */
    public interface a {
        /* renamed from: a */
        void mo6295a(long r1);

        /* renamed from: b */
        void mo6296b(int r1, long r2);

        /* renamed from: c */
        void mo6297c(long r1, long r3, long r5, long r7);

        /* renamed from: d */
        void mo6298d(long r1, long r3, long r5, long r7);

        /* renamed from: e */
        void mo6299e(long r1);
    }

    public C2476q(p121h4.C2476q.a r3) {
            r2 = this;
            r2.<init>()
            r2.f11087a = r3
            int r3 = p371v5.C6552b0.f25624a
            r0 = 18
            if (r3 < r0) goto L16
            java.lang.Class<android.media.AudioTrack> r3 = android.media.AudioTrack.class
            java.lang.String r0 = "getLatency"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L16
            r2.f11100n = r3     // Catch: java.lang.NoSuchMethodException -> L16
        L16:
            r3 = 10
            long[] r3 = new long[r3]
            r2.f11088b = r3
            return
    }

    /* renamed from: a */
    public final long m6290a(long r3) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            int r0 = r2.f11093g
            long r0 = (long) r0
            long r3 = r3 / r0
            return r3
    }

    /* renamed from: b */
    public final long m6291b() {
            r11 = this;
            android.media.AudioTrack r0 = r11.f11089c
            java.util.Objects.requireNonNull(r0)
            long r1 = r11.f11110x
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = r11.f11110x
            long r0 = r0 - r2
            int r2 = r11.f11093g
            long r2 = (long) r2
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            long r2 = r11.f11081A
            long r4 = r11.f11112z
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2e:
            int r1 = r0.getPlayState()
            r2 = 1
            r5 = 0
            if (r1 != r2) goto L38
            return r5
        L38:
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = r0.getPlaybackHeadPosition()
            long r9 = (long) r0
            long r7 = r7 & r9
            boolean r0 = r11.f11094h
            if (r0 == 0) goto L55
            r0 = 2
            if (r1 != r0) goto L52
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L52
            long r9 = r11.f11105s
            r11.f11107u = r9
        L52:
            long r9 = r11.f11107u
            long r7 = r7 + r9
        L55:
            int r0 = p371v5.C6552b0.f25624a
            r2 = 29
            if (r0 > r2) goto L79
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L77
            long r9 = r11.f11105s
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L77
            r0 = 3
            if (r1 != r0) goto L77
            long r0 = r11.f11111y
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L74
            long r0 = android.os.SystemClock.elapsedRealtime()
            r11.f11111y = r0
        L74:
            long r0 = r11.f11105s
            return r0
        L77:
            r11.f11111y = r3
        L79:
            long r0 = r11.f11105s
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L86
            long r0 = r11.f11106t
            r2 = 1
            long r0 = r0 + r2
            r11.f11106t = r0
        L86:
            r11.f11105s = r7
            long r0 = r11.f11106t
            r2 = 32
            long r0 = r0 << r2
            long r7 = r7 + r0
            return r7
    }

    /* renamed from: c */
    public boolean m6292c(long r6) {
            r5 = this;
            long r0 = r5.m6291b()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L29
            boolean r6 = r5.f11094h
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.f11089c
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L26
            long r6 = r5.m6291b()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L2a
        L29:
            r2 = 1
        L2a:
            return r2
    }

    /* renamed from: d */
    public void m6293d() {
            r3 = this;
            r0 = 0
            r3.f11098l = r0
            r2 = 0
            r3.f11109w = r2
            r3.f11108v = r2
            r3.f11099m = r0
            r3.f11083C = r0
            r3.f11086F = r0
            r3.f11097k = r2
            r0 = 0
            r3.f11089c = r0
            r3.f11092f = r0
            return
    }

    /* renamed from: e */
    public void m6294e(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
            r2 = this;
            r2.f11089c = r3
            r2.f11090d = r6
            r2.f11091e = r7
            h4.p r0 = new h4.p
            r0.<init>(r3)
            r2.f11092f = r0
            int r3 = r3.getSampleRate()
            r2.f11093g = r3
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L29
            int r4 = p371v5.C6552b0.f25624a
            r1 = 23
            if (r4 >= r1) goto L25
            r4 = 5
            if (r5 == r4) goto L23
            r4 = 6
            if (r5 != r4) goto L25
        L23:
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r3 = 0
        L2a:
            r2.f11094h = r3
            boolean r3 = p371v5.C6552b0.m13332y(r5)
            r2.f11103q = r3
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L40
            int r7 = r7 / r6
            long r6 = (long) r7
            long r6 = r2.m6290a(r6)
            goto L41
        L40:
            r6 = r4
        L41:
            r2.f11095i = r6
            r6 = 0
            r2.f11105s = r6
            r2.f11106t = r6
            r2.f11107u = r6
            r2.f11102p = r0
            r2.f11110x = r4
            r2.f11111y = r4
            r2.f11104r = r6
            r2.f11101o = r6
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f11096j = r3
            return
    }
}
