package p121h4;

/* renamed from: h4.p */
/* loaded from: classes.dex */
public final class C2475p {

    /* renamed from: a */
    public final p121h4.C2475p.a f11070a;

    /* renamed from: b */
    public int f11071b;

    /* renamed from: c */
    public long f11072c;

    /* renamed from: d */
    public long f11073d;

    /* renamed from: e */
    public long f11074e;

    /* renamed from: f */
    public long f11075f;

    /* renamed from: h4.p$a */
    public static final class a {

        /* renamed from: a */
        public final android.media.AudioTrack f11076a;

        /* renamed from: b */
        public final android.media.AudioTimestamp f11077b;

        /* renamed from: c */
        public long f11078c;

        /* renamed from: d */
        public long f11079d;

        /* renamed from: e */
        public long f11080e;

        public a(android.media.AudioTrack r1) {
                r0 = this;
                r0.<init>()
                r0.f11076a = r1
                android.media.AudioTimestamp r1 = new android.media.AudioTimestamp
                r1.<init>()
                r0.f11077b = r1
                return
        }
    }

    public C2475p(android.media.AudioTrack r3) {
            r2 = this;
            r2.<init>()
            int r0 = p371v5.C6552b0.f25624a
            r1 = 19
            if (r0 < r1) goto L14
            h4.p$a r0 = new h4.p$a
            r0.<init>(r3)
            r2.f11070a = r0
            r2.m6288a()
            goto L1b
        L14:
            r3 = 0
            r2.f11070a = r3
            r3 = 3
            r2.m6289b(r3)
        L1b:
            return
    }

    /* renamed from: a */
    public void m6288a() {
            r1 = this;
            h4.p$a r0 = r1.f11070a
            if (r0 == 0) goto L8
            r0 = 0
            r1.m6289b(r0)
        L8:
            return
    }

    /* renamed from: b */
    public final void m6289b(int r7) {
            r6 = this;
            r6.f11071b = r7
            r0 = 10000(0x2710, double:4.9407E-320)
            if (r7 == 0) goto L20
            r2 = 1
            if (r7 == r2) goto L31
            r0 = 2
            if (r7 == r0) goto L1c
            r0 = 3
            if (r7 == r0) goto L1c
            r0 = 4
            if (r7 != r0) goto L16
            r0 = 500000(0x7a120, double:2.47033E-318)
            goto L31
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L1c:
            r0 = 10000000(0x989680, double:4.9406565E-317)
            goto L31
        L20:
            r2 = 0
            r6.f11074e = r2
            r2 = -1
            r6.f11075f = r2
            long r2 = java.lang.System.nanoTime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6.f11072c = r2
        L31:
            r6.f11073d = r0
            return
    }
}
