package p370v4;

/* renamed from: v4.d0 */
/* loaded from: classes.dex */
public interface InterfaceC6525d0 {

    /* renamed from: v4.d0$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.String f25338a;

        /* renamed from: b */
        public final byte[] f25339b;

        public a(java.lang.String r1, int r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.f25338a = r1
                r0.f25339b = r3
                return
        }
    }

    /* renamed from: v4.d0$b */
    public static final class b {

        /* renamed from: a */
        public final java.lang.String f25340a;

        /* renamed from: b */
        public final java.util.List<p370v4.InterfaceC6525d0.a> f25341b;

        /* renamed from: c */
        public final byte[] f25342c;

        public b(int r1, java.lang.String r2, java.util.List<p370v4.InterfaceC6525d0.a> r3, byte[] r4) {
                r0 = this;
                r0.<init>()
                r0.f25340a = r2
                if (r3 != 0) goto Lc
                java.util.List r1 = java.util.Collections.emptyList()
                goto L10
            Lc:
                java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            L10:
                r0.f25341b = r1
                r0.f25342c = r4
                return
        }
    }

    /* renamed from: v4.d0$c */
    public interface c {
        /* renamed from: a */
        p370v4.InterfaceC6525d0 mo13252a(int r1, p370v4.InterfaceC6525d0.b r2);
    }

    /* renamed from: v4.d0$d */
    public static final class d {

        /* renamed from: a */
        public final java.lang.String f25343a;

        /* renamed from: b */
        public final int f25344b;

        /* renamed from: c */
        public final int f25345c;

        /* renamed from: d */
        public int f25346d;

        /* renamed from: e */
        public java.lang.String f25347e;

        public d(int r5, int r6, int r7) {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = ""
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r5 == r1) goto L1d
                r2 = 12
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                r3.append(r5)
                java.lang.String r5 = "/"
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                goto L1e
            L1d:
                r5 = r0
            L1e:
                r4.f25343a = r5
                r4.f25344b = r6
                r4.f25345c = r7
                r4.f25346d = r1
                r4.f25347e = r0
                return
        }

        /* renamed from: a */
        public void m13253a() {
                r3 = this;
                int r0 = r3.f25346d
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r1) goto L9
                int r0 = r3.f25344b
                goto Lc
            L9:
                int r1 = r3.f25345c
                int r0 = r0 + r1
            Lc:
                r3.f25346d = r0
                java.lang.String r1 = r3.f25343a
                r2 = 11
                int r2 = p064e.C1489c.m4038a(r1, r2)
                java.lang.String r0 = p064e.C1490d.m4039a(r2, r1, r0)
                r3.f25347e = r0
                return
        }

        /* renamed from: b */
        public java.lang.String m13254b() {
                r2 = this;
                int r0 = r2.f25346d
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L9
                java.lang.String r0 = r2.f25347e
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "generateNewId() must be called before retrieving ids."
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: c */
        public int m13255c() {
                r2 = this;
                int r0 = r2.f25346d
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "generateNewId() must be called before retrieving ids."
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: a */
    void mo13249a();

    /* renamed from: b */
    void mo13250b(p371v5.C6576z r1, p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3);

    /* renamed from: c */
    void mo13251c(p371v5.C6571u r1, int r2);
}
