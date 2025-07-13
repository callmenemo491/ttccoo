package p174jh;

/* renamed from: jh.a */
/* loaded from: classes.dex */
public class C3610a extends p153ih.C3172a {

    /* renamed from: jh.a$a */
    public static final class a {

        /* renamed from: a */
        public static final java.lang.Integer f15875a = null;

        static {
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L18
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L19
            L18:
                r1 = r0
            L19:
                if (r1 == 0) goto L27
                int r2 = r1.intValue()
                if (r2 <= 0) goto L23
                r2 = 1
                goto L24
            L23:
                r2 = 0
            L24:
                if (r2 == 0) goto L27
                r0 = r1
            L27:
                p174jh.C3610a.a.f15875a = r0
                return
        }
    }

    public C3610a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p153ih.C3172a
    /* renamed from: a */
    public void mo7610a(java.lang.Throwable r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.Integer r0 = p174jh.C3610a.a.f15875a
            if (r0 == 0) goto Lf
            int r0 = r0.intValue()
            r1 = 19
            if (r0 < r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L16
            r3.addSuppressed(r4)
            goto L19
        L16:
            super.mo7610a(r3, r4)
        L19:
            return
    }
}
