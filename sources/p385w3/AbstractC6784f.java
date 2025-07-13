package p385w3;

@com.google.auto.value.AutoValue
/* renamed from: w3.f */
/* loaded from: classes.dex */
public abstract class AbstractC6784f {

    @com.google.auto.value.AutoValue.Builder
    /* renamed from: w3.f$a */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final p385w3.AbstractC6784f.a m13807a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.Map r0 = r1.mo13793c()
                r0.put(r2, r3)
                return r1
        }

        /* renamed from: b */
        public abstract p385w3.AbstractC6784f mo13792b();

        /* renamed from: c */
        public abstract java.util.Map<java.lang.String, java.lang.String> mo13793c();
    }

    public AbstractC6784f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final java.lang.String m13804a(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.mo13786b()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Le
            java.lang.String r2 = ""
        Le:
            return r2
    }

    /* renamed from: b */
    public abstract java.util.Map<java.lang.String, java.lang.String> mo13786b();

    /* renamed from: c */
    public abstract java.lang.Integer mo13787c();

    /* renamed from: d */
    public abstract p385w3.C6783e mo13788d();

    /* renamed from: e */
    public abstract long mo13789e();

    /* renamed from: f */
    public final int m13805f(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.mo13786b()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Le
            r2 = 0
            goto L16
        Le:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
        L16:
            return r2
    }

    /* renamed from: g */
    public abstract java.lang.String mo13790g();

    /* renamed from: h */
    public abstract long mo13791h();

    /* renamed from: i */
    public p385w3.AbstractC6784f.a m13806i() {
            r3 = this;
            w3.a$b r0 = new w3.a$b
            r0.<init>()
            java.lang.String r1 = r3.mo13790g()
            r0.m13796f(r1)
            java.lang.Integer r1 = r3.mo13787c()
            r0.f26313b = r1
            w3.e r1 = r3.mo13788d()
            r0.m13794d(r1)
            long r1 = r3.mo13789e()
            r0.m13795e(r1)
            long r1 = r3.mo13791h()
            r0.m13797g(r1)
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map r2 = r3.mo13786b()
            r1.<init>(r2)
            r0.f26317f = r1
            return r0
    }
}
