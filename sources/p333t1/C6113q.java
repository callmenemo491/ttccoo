package p333t1;

/* renamed from: t1.q */
/* loaded from: classes.dex */
public class C6113q {

    /* renamed from: a */
    public static final p333t1.C6119w f23625a = null;

    /* renamed from: b */
    public static final android.util.Property<android.view.View, java.lang.Float> f23626b = null;

    /* renamed from: t1.q$a */
    public static class a extends android.util.Property<android.view.View, java.lang.Float> {
        public a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                float r1 = p333t1.C6113q.m12639a(r1)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(android.view.View r2, java.lang.Float r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                t1.w r0 = p333t1.C6113q.f23625a
                r0.mo12644e(r2, r3)
                return
        }
    }

    /* renamed from: t1.q$b */
    public static class b extends android.util.Property<android.view.View, android.graphics.Rect> {
        public b(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public android.graphics.Rect get(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                android.graphics.Rect r2 = p227n0.C4661t.e.m10583a(r2)
                return r2
        }

        @Override // android.util.Property
        public void set(android.view.View r2, android.graphics.Rect r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                android.graphics.Rect r3 = (android.graphics.Rect) r3
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                p227n0.C4661t.e.m10585c(r2, r3)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            t1.v r0 = new t1.v
            r0.<init>()
            goto L25
        Lc:
            r1 = 23
            if (r0 < r1) goto L16
            t1.u r0 = new t1.u
            r0.<init>()
            goto L25
        L16:
            r1 = 22
            if (r0 < r1) goto L20
            t1.t r0 = new t1.t
            r0.<init>()
            goto L25
        L20:
            t1.s r0 = new t1.s
            r0.<init>()
        L25:
            p333t1.C6113q.f23625a = r0
            t1.q$a r0 = new t1.q$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "translationAlpha"
            r0.<init>(r1, r2)
            p333t1.C6113q.f23626b = r0
            t1.q$b r0 = new t1.q$b
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r2 = "clipBounds"
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    public static float m12639a(android.view.View r1) {
            t1.w r0 = p333t1.C6113q.f23625a
            float r1 = r0.mo12642b(r1)
            return r1
    }

    /* renamed from: b */
    public static void m12640b(android.view.View r6, int r7, int r8, int r9, int r10) {
            t1.w r0 = p333t1.C6113q.f23625a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mo12647d(r1, r2, r3, r4, r5)
            return
    }
}
