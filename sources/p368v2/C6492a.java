package p368v2;

/* renamed from: v2.a */
/* loaded from: classes.dex */
public final class C6492a {

    /* renamed from: a */
    public static volatile boolean f25175a = true;

    /* renamed from: a */
    public static android.graphics.drawable.Drawable m13206a(android.content.Context r1, android.content.Context r2, int r3, android.content.res.Resources.Theme r4) {
            boolean r0 = p368v2.C6492a.f25175a     // Catch: android.content.res.Resources.NotFoundException -> Lc java.lang.IllegalStateException -> L14 java.lang.NoClassDefFoundError -> L2b
            if (r0 == 0) goto L2e
            if (r4 == 0) goto Le
            k.c r0 = new k.c     // Catch: android.content.res.Resources.NotFoundException -> Lc java.lang.IllegalStateException -> L14 java.lang.NoClassDefFoundError -> L2b
            r0.<init>(r2, r4)     // Catch: android.content.res.Resources.NotFoundException -> Lc java.lang.IllegalStateException -> L14 java.lang.NoClassDefFoundError -> L2b
            goto Lf
        Lc:
            goto L2e
        Le:
            r0 = r2
        Lf:
            android.graphics.drawable.Drawable r1 = p102g.C2199a.m5784b(r0, r3)     // Catch: android.content.res.Resources.NotFoundException -> Lc java.lang.IllegalStateException -> L14 java.lang.NoClassDefFoundError -> L2b
            return r1
        L14:
            r4 = move-exception
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = r2.getPackageName()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2a
            java.lang.Object r1 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r1 = p046d0.C1259a.b.m3710b(r2, r3)
            return r1
        L2a:
            throw r4
        L2b:
            r1 = 0
            p368v2.C6492a.f25175a = r1
        L2e:
            if (r4 == 0) goto L31
            goto L35
        L31:
            android.content.res.Resources$Theme r4 = r2.getTheme()
        L35:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.ThreadLocal<android.util.TypedValue> r2 = p065e0.C1503h.f7314a
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            return r1
    }
}
