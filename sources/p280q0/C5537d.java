package p280q0;

/* renamed from: q0.d */
/* loaded from: classes.dex */
public final class C5537d {

    /* renamed from: q0.d$a */
    public static class a {
        /* renamed from: a */
        public static android.widget.EdgeEffect m11807a(android.content.Context r1, android.util.AttributeSet r2) {
                android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L6
                r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6
                return r0
            L6:
                android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
                r2.<init>(r1)
                return r2
        }

        /* renamed from: b */
        public static float m11808b(android.widget.EdgeEffect r0) {
                float r0 = r0.getDistance()     // Catch: java.lang.Throwable -> L5
                return r0
            L5:
                r0 = 0
                return r0
        }

        /* renamed from: c */
        public static float m11809c(android.widget.EdgeEffect r0, float r1, float r2) {
                float r0 = r0.onPullDistance(r1, r2)     // Catch: java.lang.Throwable -> L5
                return r0
            L5:
                r0.onPull(r1, r2)
                r0 = 0
                return r0
        }
    }

    /* renamed from: a */
    public static float m11805a(android.widget.EdgeEffect r1) {
            boolean r0 = p158j0.C3379a.m7754a()
            if (r0 == 0) goto Lb
            float r1 = p280q0.C5537d.a.m11808b(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public static float m11806b(android.widget.EdgeEffect r1, float r2, float r3) {
            boolean r0 = p158j0.C3379a.m7754a()
            if (r0 == 0) goto Lb
            float r1 = p280q0.C5537d.a.m11809c(r1, r2, r3)
            return r1
        Lb:
            r1.onPull(r2, r3)
            return r2
    }
}
