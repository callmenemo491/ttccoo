package hk;

/* renamed from: hk.a */
/* loaded from: classes.dex */
public final class C3053a {

    /* renamed from: a */
    public static volatile hk.C3053a.b[] f12281a;

    /* renamed from: b */
    public static final hk.C3053a.b f12282b = null;

    /* renamed from: hk.a$a */
    public static class a extends hk.C3053a.b {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // hk.C3053a.b
        /* renamed from: a */
        public void mo7467a(java.lang.String r5, java.lang.Object... r6) {
                r4 = this;
                hk.a$b[] r0 = hk.C3053a.f12281a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.mo7467a(r5, r6)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        @Override // hk.C3053a.b
        /* renamed from: b */
        public void mo7468b(java.lang.Throwable r5) {
                r4 = this;
                hk.a$b[] r0 = hk.C3053a.f12281a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.mo7468b(r5)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        @Override // hk.C3053a.b
        /* renamed from: c */
        public void mo7469c(java.lang.String r5, java.lang.Object... r6) {
                r4 = this;
                hk.a$b[] r0 = hk.C3053a.f12281a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.mo7469c(r5, r6)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        @Override // hk.C3053a.b
        /* renamed from: d */
        public void mo7470d(java.lang.Throwable r5) {
                r4 = this;
                hk.a$b[] r0 = hk.C3053a.f12281a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.mo7470d(r5)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }
    }

    /* renamed from: hk.a$b */
    public static abstract class b {

        /* renamed from: a */
        public final java.lang.ThreadLocal<java.lang.String> f12283a;

        public b() {
                r1 = this;
                r1.<init>()
                java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
                r0.<init>()
                r1.f12283a = r0
                return
        }

        /* renamed from: a */
        public abstract void mo7467a(java.lang.String r1, java.lang.Object... r2);

        /* renamed from: b */
        public abstract void mo7468b(java.lang.Throwable r1);

        /* renamed from: c */
        public abstract void mo7469c(java.lang.String r1, java.lang.Object... r2);

        /* renamed from: d */
        public abstract void mo7470d(java.lang.Throwable r1);
    }

    static {
            r0 = 0
            hk.a$b[] r0 = new hk.C3053a.b[r0]
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            hk.C3053a.f12281a = r0
            hk.a$a r0 = new hk.a$a
            r0.<init>()
            hk.C3053a.f12282b = r0
            return
    }

    /* renamed from: a */
    public static hk.C3053a.b m7466a(java.lang.String r4) {
            hk.a$b[] r0 = hk.C3053a.f12281a
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            java.lang.ThreadLocal<java.lang.String> r3 = r3.f12283a
            r3.set(r4)
            int r2 = r2 + 1
            goto L4
        L10:
            hk.a$b r4 = hk.C3053a.f12282b
            return r4
    }
}
