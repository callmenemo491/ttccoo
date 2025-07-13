package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.i0 */
/* loaded from: classes.dex */
public class C0594i0 {
    /* renamed from: a */
    public static int m2078a(androidx.recyclerview.widget.RecyclerView.C0569y r1, androidx.recyclerview.widget.AbstractC0582c0 r2, android.view.View r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView.AbstractC0557m r5, boolean r6) {
            int r0 = r5.m1891z()
            if (r0 == 0) goto L35
            int r1 = r1.m1930b()
            if (r1 == 0) goto L35
            if (r3 == 0) goto L35
            if (r4 != 0) goto L11
            goto L35
        L11:
            if (r6 != 0) goto L23
            int r1 = r5.m1868R(r3)
            int r2 = r5.m1868R(r4)
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + 1
            return r1
        L23:
            int r1 = r2.mo1997b(r4)
            int r3 = r2.mo2000e(r3)
            int r1 = r1 - r3
            int r2 = r2.mo2007l()
            int r1 = java.lang.Math.min(r2, r1)
            return r1
        L35:
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public static int m2079b(androidx.recyclerview.widget.RecyclerView.C0569y r4, androidx.recyclerview.widget.AbstractC0582c0 r5, android.view.View r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView.AbstractC0557m r8, boolean r9, boolean r10) {
            int r0 = r8.m1891z()
            r1 = 0
            if (r0 == 0) goto L71
            int r0 = r4.m1930b()
            if (r0 == 0) goto L71
            if (r6 == 0) goto L71
            if (r7 != 0) goto L12
            goto L71
        L12:
            int r0 = r8.m1868R(r6)
            int r2 = r8.m1868R(r7)
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r8.m1868R(r6)
            int r3 = r8.m1868R(r7)
            int r2 = java.lang.Math.max(r2, r3)
            if (r10 == 0) goto L38
            int r4 = r4.m1930b()
            int r4 = r4 - r2
            int r4 = r4 + (-1)
            int r4 = java.lang.Math.max(r1, r4)
            goto L3c
        L38:
            int r4 = java.lang.Math.max(r1, r0)
        L3c:
            if (r9 != 0) goto L3f
            return r4
        L3f:
            int r9 = r5.mo1997b(r7)
            int r10 = r5.mo2000e(r6)
            int r9 = r9 - r10
            int r9 = java.lang.Math.abs(r9)
            int r10 = r8.m1868R(r6)
            int r7 = r8.m1868R(r7)
            int r10 = r10 - r7
            int r7 = java.lang.Math.abs(r10)
            int r7 = r7 + 1
            float r8 = (float) r9
            float r7 = (float) r7
            float r8 = r8 / r7
            float r4 = (float) r4
            float r4 = r4 * r8
            int r7 = r5.mo2006k()
            int r5 = r5.mo2000e(r6)
            int r7 = r7 - r5
            float r5 = (float) r7
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            return r4
        L71:
            return r1
    }

    /* renamed from: c */
    public static int m2080c(androidx.recyclerview.widget.RecyclerView.C0569y r1, androidx.recyclerview.widget.AbstractC0582c0 r2, android.view.View r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView.AbstractC0557m r5, boolean r6) {
            int r0 = r5.m1891z()
            if (r0 == 0) goto L3c
            int r0 = r1.m1930b()
            if (r0 == 0) goto L3c
            if (r3 == 0) goto L3c
            if (r4 != 0) goto L11
            goto L3c
        L11:
            if (r6 != 0) goto L18
            int r1 = r1.m1930b()
            return r1
        L18:
            int r6 = r2.mo1997b(r4)
            int r2 = r2.mo2000e(r3)
            int r6 = r6 - r2
            int r2 = r5.m1868R(r3)
            int r3 = r5.m1868R(r4)
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            int r2 = r2 + 1
            float r3 = (float) r6
            float r2 = (float) r2
            float r3 = r3 / r2
            int r1 = r1.m1930b()
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = (int) r3
            return r1
        L3c:
            r1 = 0
            return r1
    }
}
