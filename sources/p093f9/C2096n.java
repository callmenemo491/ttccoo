package p093f9;

/* renamed from: f9.n */
/* loaded from: classes.dex */
public final class C2096n<P> {

    /* renamed from: d */
    public static final java.nio.charset.Charset f9515d = null;

    /* renamed from: a */
    public java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<p093f9.C2096n.a<P>>> f9516a;

    /* renamed from: b */
    public p093f9.C2096n.a<P> f9517b;

    /* renamed from: c */
    public final java.lang.Class<P> f9518c;

    /* renamed from: f9.n$a */
    public static final class a<P> {

        /* renamed from: a */
        public final P f9519a;

        /* renamed from: b */
        public final byte[] f9520b;

        /* renamed from: c */
        public final p204l9.EnumC4230x f9521c;

        /* renamed from: d */
        public final p204l9.EnumC4210g0 f9522d;

        public a(P r1, byte[] r2, p204l9.EnumC4230x r3, p204l9.EnumC4210g0 r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f9519a = r1
                int r1 = r2.length
                byte[] r1 = java.util.Arrays.copyOf(r2, r1)
                r0.f9520b = r1
                r0.f9521c = r3
                r0.f9522d = r4
                return
        }

        /* renamed from: a */
        public final byte[] m5540a() {
                r2 = this;
                byte[] r0 = r2.f9520b
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r1 = r0.length
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p093f9.C2096n.f9515d = r0
            return
    }

    public C2096n(java.lang.Class<P> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f9516a = r0
            r1.f9518c = r2
            return
    }

    /* renamed from: a */
    public java.util.List<p093f9.C2096n.a<P>> m5538a(byte[] r4) {
            r3 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<f9.n$a<P>>> r0 = r3.f9516a
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p093f9.C2096n.f9515d
            r1.<init>(r4, r2)
            java.lang.Object r4 = r0.get(r1)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L12
            goto L16
        L12:
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            return r4
    }

    /* renamed from: b */
    public java.util.List<p093f9.C2096n.a<P>> m5539b() {
            r1 = this;
            byte[] r0 = p093f9.C2084b.f9503a
            java.util.List r0 = r1.m5538a(r0)
            return r0
    }
}
