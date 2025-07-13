package p387w5;

/* renamed from: w5.e */
/* loaded from: classes.dex */
public final class C6802e {

    /* renamed from: a */
    public p387w5.C6802e.a f26422a;

    /* renamed from: b */
    public p387w5.C6802e.a f26423b;

    /* renamed from: c */
    public boolean f26424c;

    /* renamed from: d */
    public long f26425d;

    /* renamed from: e */
    public int f26426e;

    /* renamed from: w5.e$a */
    public static final class a {

        /* renamed from: a */
        public long f26427a;

        /* renamed from: b */
        public long f26428b;

        /* renamed from: c */
        public long f26429c;

        /* renamed from: d */
        public long f26430d;

        /* renamed from: e */
        public long f26431e;

        /* renamed from: f */
        public long f26432f;

        /* renamed from: g */
        public final boolean[] f26433g;

        /* renamed from: h */
        public int f26434h;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 15
                boolean[] r0 = new boolean[r0]
                r1.f26433g = r0
                return
        }

        /* renamed from: a */
        public boolean m13842a() {
                r5 = this;
                long r0 = r5.f26430d
                r2 = 15
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto Le
                int r0 = r5.f26434h
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        /* renamed from: b */
        public void m13843b(long r12) {
                r11 = this;
                long r0 = r11.f26430d
                r2 = 1
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto Ld
                r11.f26427a = r12
                goto L58
            Ld:
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1c
                long r0 = r11.f26427a
                long r0 = r12 - r0
                r11.f26428b = r0
                r11.f26432f = r0
                r11.f26431e = r2
                goto L58
            L1c:
                long r4 = r11.f26429c
                long r4 = r12 - r4
                r6 = 15
                long r0 = r0 % r6
                int r1 = (int) r0
                long r6 = r11.f26428b
                long r6 = r4 - r6
                long r6 = java.lang.Math.abs(r6)
                r8 = 1000000(0xf4240, double:4.940656E-318)
                r0 = 1
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 > 0) goto L4b
                long r6 = r11.f26431e
                long r6 = r6 + r2
                r11.f26431e = r6
                long r6 = r11.f26432f
                long r6 = r6 + r4
                r11.f26432f = r6
                boolean[] r4 = r11.f26433g
                boolean r5 = r4[r1]
                if (r5 == 0) goto L58
                r5 = 0
                r4[r1] = r5
                int r1 = r11.f26434h
                int r1 = r1 - r0
                goto L56
            L4b:
                boolean[] r4 = r11.f26433g
                boolean r5 = r4[r1]
                if (r5 != 0) goto L58
                r4[r1] = r0
                int r1 = r11.f26434h
                int r1 = r1 + r0
            L56:
                r11.f26434h = r1
            L58:
                long r0 = r11.f26430d
                long r0 = r0 + r2
                r11.f26430d = r0
                r11.f26429c = r12
                return
        }

        /* renamed from: c */
        public void m13844c() {
                r2 = this;
                r0 = 0
                r2.f26430d = r0
                r2.f26431e = r0
                r2.f26432f = r0
                r0 = 0
                r2.f26434h = r0
                boolean[] r1 = r2.f26433g
                java.util.Arrays.fill(r1, r0)
                return
        }
    }

    public C6802e() {
            r2 = this;
            r2.<init>()
            w5.e$a r0 = new w5.e$a
            r0.<init>()
            r2.f26422a = r0
            w5.e$a r0 = new w5.e$a
            r0.<init>()
            r2.f26423b = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f26425d = r0
            return
    }

    /* renamed from: a */
    public boolean m13841a() {
            r1 = this;
            w5.e$a r0 = r1.f26422a
            boolean r0 = r0.m13842a()
            return r0
    }
}
