package p249o7;

/* renamed from: o7.b4 */
/* loaded from: classes.dex */
public final class C4962b4 {
    /* renamed from: a */
    public static java.lang.String m11110a(android.content.Context r2) {
            android.content.res.Resources r0 = r2.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Lc
            r1 = 2131951731(0x7f130073, float:1.9539885E38)
            java.lang.String r2 = r0.getResourcePackageName(r1)     // Catch: android.content.res.Resources.NotFoundException -> Lc
            goto L10
        Lc:
            java.lang.String r2 = r2.getPackageName()
        L10:
            return r2
    }

    /* renamed from: b */
    public static final java.lang.String m11111b(java.lang.String r1, android.content.res.Resources r2, java.lang.String r3) {
            java.lang.String r0 = "string"
            int r1 = r2.getIdentifier(r1, r0, r3)
            if (r1 != 0) goto L9
            goto Le
        L9:
            java.lang.String r1 = r2.getString(r1)     // Catch: android.content.res.Resources.NotFoundException -> Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }
}
