package p288q8;

/* renamed from: q8.b */
/* loaded from: classes.dex */
public class C5598b {
    /* renamed from: a */
    public static android.util.TypedValue m11872a(android.content.Context r2, int r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r1)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public static boolean m11873b(android.content.Context r1, int r2, boolean r3) {
            android.util.TypedValue r1 = m11872a(r1, r2)
            if (r1 == 0) goto L13
            int r2 = r1.type
            r0 = 18
            if (r2 != r0) goto L13
            int r1 = r1.data
            if (r1 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
    }

    /* renamed from: c */
    public static int m11874c(android.content.Context r3, int r4, java.lang.String r5) {
            android.util.TypedValue r0 = m11872a(r3, r4)
            if (r0 == 0) goto L9
            int r3 = r0.data
            return r3
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r4)
            r1[r5] = r3
            java.lang.String r3 = "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }
}
