package p221m9;

/* renamed from: m9.p */
/* loaded from: classes.dex */
public class C4478p {

    /* renamed from: b */
    public static volatile p221m9.C4478p f18202b;

    /* renamed from: c */
    public static final p221m9.C4478p f18203c = null;

    /* renamed from: a */
    public final java.util.Map<p221m9.C4478p.a, p221m9.AbstractC4501x.e<?, ?>> f18204a;

    /* renamed from: m9.p$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.Object f18205a;

        /* renamed from: b */
        public final int f18206b;

        public a(java.lang.Object r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f18205a = r1
                r0.f18206b = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof p221m9.C4478p.a
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                m9.p$a r4 = (p221m9.C4478p.a) r4
                java.lang.Object r0 = r3.f18205a
                java.lang.Object r2 = r4.f18205a
                if (r0 != r2) goto L15
                int r0 = r3.f18206b
                int r4 = r4.f18206b
                if (r0 != r4) goto L15
                r1 = 1
            L15:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.f18205a
                int r0 = java.lang.System.identityHashCode(r0)
                r1 = 65535(0xffff, float:9.1834E-41)
                int r0 = r0 * r1
                int r1 = r2.f18206b
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            m9.p r0 = new m9.p
            r1 = 1
            r0.<init>(r1)
            p221m9.C4478p.f18203c = r0
            return
    }

    public C4478p() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f18204a = r0
            return
    }

    public C4478p(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f18204a = r1
            return
    }

    /* renamed from: a */
    public static p221m9.C4478p m10222a() {
            m9.p r0 = p221m9.C4478p.f18202b
            if (r0 != 0) goto L32
            java.lang.Class<m9.p> r1 = p221m9.C4478p.class
            monitor-enter(r1)
            m9.p r0 = p221m9.C4478p.f18202b     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L2d
            java.lang.String r0 = "getEmptyRegistry"
            java.lang.Class<?> r2 = p221m9.C4475o.f18201a     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r2 != 0) goto L13
            goto L25
        L13:
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L2f
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r5)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L2f
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L2f
            m9.p r0 = (p221m9.C4478p) r0     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L2f
            r3 = r0
            goto L25
        L24:
        L25:
            if (r3 == 0) goto L28
            goto L2a
        L28:
            m9.p r3 = p221m9.C4478p.f18203c     // Catch: java.lang.Throwable -> L2f
        L2a:
            p221m9.C4478p.f18202b = r3     // Catch: java.lang.Throwable -> L2f
            r0 = r3
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L32:
            return r0
    }
}
