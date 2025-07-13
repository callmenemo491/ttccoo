package androidx.navigation;

/* renamed from: androidx.navigation.u */
/* loaded from: classes.dex */
public final class C0526u {
    /* renamed from: a */
    public static androidx.navigation.NavController m1609a(android.view.View r4) {
            r0 = r4
        L1:
            r1 = 0
            if (r0 == 0) goto L2f
            r2 = 2131362442(0x7f0a028a, float:1.8344665E38)
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof java.lang.ref.WeakReference
            if (r3 == 0) goto L16
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            goto L1a
        L16:
            boolean r3 = r2 instanceof androidx.navigation.NavController
            if (r3 == 0) goto L1d
        L1a:
            androidx.navigation.NavController r2 = (androidx.navigation.NavController) r2
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 == 0) goto L22
            r1 = r2
            goto L2f
        L22:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L2d
            android.view.View r0 = (android.view.View) r0
            goto L1
        L2d:
            r0 = r1
            goto L1
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " does not have a NavController set"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
