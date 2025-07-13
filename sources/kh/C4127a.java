package kh;

/* renamed from: kh.a */
/* loaded from: classes.dex */
public class C4127a extends p174jh.C3610a {

    /* renamed from: kh.a$a */
    public static final class a {

        /* renamed from: a */
        public static final java.lang.Integer f17141a = null;

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
                kh.C4127a.a.f17141a = r0
                return
        }
    }

    public C4127a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p153ih.C3172a
    /* renamed from: b */
    public ph.AbstractC5526c mo7611b() {
            r2 = this;
            java.lang.Integer r0 = kh.C4127a.a.f17141a
            if (r0 == 0) goto Lf
            int r0 = r0.intValue()
            r1 = 24
            if (r0 < r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L18
            qh.a r0 = new qh.a
            r0.<init>()
            goto L1d
        L18:
            ph.b r0 = new ph.b
            r0.<init>()
        L1d:
            return r0
    }
}
