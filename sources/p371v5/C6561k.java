package p371v5;

/* renamed from: v5.k */
/* loaded from: classes.dex */
public final class C6561k {

    /* renamed from: a */
    public final android.util.SparseBooleanArray f25655a;

    /* renamed from: v5.k$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: v5.k$b */
    public static final class b {

        /* renamed from: a */
        public final android.util.SparseBooleanArray f25656a;

        /* renamed from: b */
        public boolean f25657b;

        public b() {
                r1 = this;
                r1.<init>()
                android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
                r0.<init>()
                r1.f25656a = r0
                return
        }

        /* renamed from: a */
        public p371v5.C6561k.b m13348a(int r3) {
                r2 = this;
                boolean r0 = r2.f25657b
                r1 = 1
                r0 = r0 ^ r1
                p371v5.C6549a.m13291e(r0)
                android.util.SparseBooleanArray r0 = r2.f25656a
                r0.append(r3, r1)
                return r2
        }

        /* renamed from: b */
        public p371v5.C6561k m13349b() {
                r3 = this;
                boolean r0 = r3.f25657b
                r1 = 1
                r0 = r0 ^ r1
                p371v5.C6549a.m13291e(r0)
                r3.f25657b = r1
                v5.k r0 = new v5.k
                android.util.SparseBooleanArray r1 = r3.f25656a
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    public C6561k(android.util.SparseBooleanArray r1, p371v5.C6561k.a r2) {
            r0 = this;
            r0.<init>()
            r0.f25655a = r1
            return
    }

    /* renamed from: a */
    public boolean m13345a(int r2) {
            r1 = this;
            android.util.SparseBooleanArray r0 = r1.f25655a
            boolean r2 = r0.get(r2)
            return r2
    }

    /* renamed from: b */
    public int m13346b(int r3) {
            r2 = this;
            int r0 = r2.m13347c()
            r1 = 0
            p371v5.C6549a.m13290d(r3, r1, r0)
            android.util.SparseBooleanArray r0 = r2.f25655a
            int r3 = r0.keyAt(r3)
            return r3
    }

    /* renamed from: c */
    public int m13347c() {
            r1 = this;
            android.util.SparseBooleanArray r0 = r1.f25655a
            int r0 = r0.size()
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p371v5.C6561k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v5.k r6 = (p371v5.C6561k) r6
            int r1 = p371v5.C6552b0.f25624a
            r3 = 24
            if (r1 >= r3) goto L33
            int r1 = r5.m13347c()
            int r3 = r6.m13347c()
            if (r1 == r3) goto L1d
            return r2
        L1d:
            r1 = 0
        L1e:
            int r3 = r5.m13347c()
            if (r1 >= r3) goto L32
            int r3 = r5.m13346b(r1)
            int r4 = r6.m13346b(r1)
            if (r3 == r4) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto L1e
        L32:
            return r0
        L33:
            android.util.SparseBooleanArray r0 = r5.f25655a
            android.util.SparseBooleanArray r6 = r6.f25655a
            boolean r6 = r0.equals(r6)
            return r6
    }

    public int hashCode() {
            r3 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 24
            if (r0 >= r1) goto L1c
            int r0 = r3.m13347c()
            r1 = 0
        Lb:
            int r2 = r3.m13347c()
            if (r1 >= r2) goto L1b
            int r0 = r0 * 31
            int r2 = r3.m13346b(r1)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
        L1c:
            android.util.SparseBooleanArray r0 = r3.f25655a
            int r0 = r0.hashCode()
            return r0
    }
}
