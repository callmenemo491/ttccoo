package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.g0 */
/* loaded from: classes.dex */
public class C0590g0 implements androidx.recyclerview.widget.C0577a.a {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f3409a;

    public C0590g0(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.f3409a = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void m2037a(androidx.recyclerview.widget.C0577a.b r5) {
            r4 = this;
            int r0 = r5.f3369a
            r1 = 1
            if (r0 == r1) goto L36
            r2 = 2
            if (r0 == r2) goto L2a
            r2 = 4
            if (r0 == r2) goto L1c
            r2 = 8
            if (r0 == r2) goto L10
            goto L41
        L10:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3409a
            androidx.recyclerview.widget.RecyclerView$m r2 = r0.f3172m0
            int r3 = r5.f3370b
            int r5 = r5.f3372d
            r2.mo1640j0(r0, r3, r5, r1)
            goto L41
        L1c:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3409a
            androidx.recyclerview.widget.RecyclerView$m r1 = r0.f3172m0
            int r2 = r5.f3370b
            int r3 = r5.f3372d
            java.lang.Object r5 = r5.f3371c
            r1.mo1642l0(r0, r2, r3, r5)
            goto L41
        L2a:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3409a
            androidx.recyclerview.widget.RecyclerView$m r1 = r0.f3172m0
            int r2 = r5.f3370b
            int r5 = r5.f3372d
            r1.mo1641k0(r0, r2, r5)
            goto L41
        L36:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3409a
            androidx.recyclerview.widget.RecyclerView$m r1 = r0.f3172m0
            int r2 = r5.f3370b
            int r5 = r5.f3372d
            r1.mo1635h0(r0, r2, r5)
        L41:
            return
    }

    /* renamed from: b */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 m2038b(int r8) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.f3409a
            androidx.recyclerview.widget.h r1 = r0.f3156e0
            int r1 = r1.m2049h()
            r2 = 0
            r3 = 0
            r4 = r3
        Lb:
            if (r2 >= r1) goto L35
            androidx.recyclerview.widget.h r5 = r0.f3156e0
            android.view.View r5 = r5.m2048g(r2)
            androidx.recyclerview.widget.RecyclerView$b0 r5 = androidx.recyclerview.widget.RecyclerView.m1716K(r5)
            if (r5 == 0) goto L32
            boolean r6 = r5.m1797n()
            if (r6 != 0) goto L32
            int r6 = r5.f3210c
            if (r6 == r8) goto L24
            goto L32
        L24:
            androidx.recyclerview.widget.h r4 = r0.f3156e0
            android.view.View r6 = r5.f3208a
            boolean r4 = r4.m2052k(r6)
            if (r4 == 0) goto L30
            r4 = r5
            goto L32
        L30:
            r4 = r5
            goto L35
        L32:
            int r2 = r2 + 1
            goto Lb
        L35:
            if (r4 != 0) goto L38
            return r3
        L38:
            androidx.recyclerview.widget.RecyclerView r8 = r7.f3409a
            androidx.recyclerview.widget.h r8 = r8.f3156e0
            android.view.View r0 = r4.f3208a
            boolean r8 = r8.m2052k(r0)
            if (r8 == 0) goto L45
            return r3
        L45:
            return r4
    }

    /* renamed from: c */
    public void m2039c(int r9, int r10, java.lang.Object r11) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3409a
            androidx.recyclerview.widget.h r1 = r0.f3156e0
            int r1 = r1.m2049h()
            int r10 = r10 + r9
            r2 = 0
        La:
            r3 = 2
            r4 = 1
            if (r2 >= r1) goto L38
            androidx.recyclerview.widget.h r5 = r0.f3156e0
            android.view.View r5 = r5.m2048g(r2)
            androidx.recyclerview.widget.RecyclerView$b0 r6 = androidx.recyclerview.widget.RecyclerView.m1716K(r5)
            if (r6 == 0) goto L35
            boolean r7 = r6.m1805v()
            if (r7 == 0) goto L21
            goto L35
        L21:
            int r7 = r6.f3210c
            if (r7 < r9) goto L35
            if (r7 >= r10) goto L35
            r6.m1785b(r3)
            r6.m1784a(r11)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.C0558n) r3
            r3.f3263c = r4
        L35:
            int r2 = r2 + 1
            goto La
        L38:
            androidx.recyclerview.widget.RecyclerView$t r11 = r0.f3150b0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r11.f3273c
            int r0 = r0.size()
        L40:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L5c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r1 = r11.f3273c
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r1
            if (r1 != 0) goto L4f
            goto L40
        L4f:
            int r2 = r1.f3210c
            if (r2 < r9) goto L40
            if (r2 >= r10) goto L40
            r1.m1785b(r3)
            r11.m1914f(r0)
            goto L40
        L5c:
            androidx.recyclerview.widget.RecyclerView r9 = r8.f3409a
            r9.f3165i1 = r4
            return
    }

    /* renamed from: d */
    public void m2040d(int r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3409a
            androidx.recyclerview.widget.h r1 = r0.f3156e0
            int r1 = r1.m2049h()
            r2 = 0
            r3 = 0
        La:
            r4 = 1
            if (r3 >= r1) goto L2d
            androidx.recyclerview.widget.h r5 = r0.f3156e0
            android.view.View r5 = r5.m2048g(r3)
            androidx.recyclerview.widget.RecyclerView$b0 r5 = androidx.recyclerview.widget.RecyclerView.m1716K(r5)
            if (r5 == 0) goto L2a
            boolean r6 = r5.m1805v()
            if (r6 != 0) goto L2a
            int r6 = r5.f3210c
            if (r6 < r9) goto L2a
            r5.m1801r(r10, r2)
            androidx.recyclerview.widget.RecyclerView$y r5 = r0.f3157e1
            r5.f3301f = r4
        L2a:
            int r3 = r3 + 1
            goto La
        L2d:
            androidx.recyclerview.widget.RecyclerView$t r1 = r0.f3150b0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r1.f3273c
            int r3 = r3.size()
            r5 = 0
        L36:
            if (r5 >= r3) goto L4c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r6 = r1.f3273c
            java.lang.Object r6 = r6.get(r5)
            androidx.recyclerview.widget.RecyclerView$b0 r6 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r6
            if (r6 == 0) goto L49
            int r7 = r6.f3210c
            if (r7 < r9) goto L49
            r6.m1801r(r10, r2)
        L49:
            int r5 = r5 + 1
            goto L36
        L4c:
            r0.requestLayout()
            androidx.recyclerview.widget.RecyclerView r9 = r8.f3409a
            r9.f3163h1 = r4
            return
    }

    /* renamed from: e */
    public void m2041e(int r12, int r13) {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3409a
            androidx.recyclerview.widget.h r1 = r0.f3156e0
            int r1 = r1.m2049h()
            r2 = -1
            r3 = 1
            if (r12 >= r13) goto L10
            r4 = r12
            r5 = r13
            r6 = -1
            goto L13
        L10:
            r5 = r12
            r4 = r13
            r6 = 1
        L13:
            r7 = 0
            r8 = 0
        L15:
            if (r8 >= r1) goto L3c
            androidx.recyclerview.widget.h r9 = r0.f3156e0
            android.view.View r9 = r9.m2048g(r8)
            androidx.recyclerview.widget.RecyclerView$b0 r9 = androidx.recyclerview.widget.RecyclerView.m1716K(r9)
            if (r9 == 0) goto L39
            int r10 = r9.f3210c
            if (r10 < r4) goto L39
            if (r10 <= r5) goto L2a
            goto L39
        L2a:
            if (r10 != r12) goto L32
            int r10 = r13 - r12
            r9.m1801r(r10, r7)
            goto L35
        L32:
            r9.m1801r(r6, r7)
        L35:
            androidx.recyclerview.widget.RecyclerView$y r9 = r0.f3157e1
            r9.f3301f = r3
        L39:
            int r8 = r8 + 1
            goto L15
        L3c:
            androidx.recyclerview.widget.RecyclerView$t r1 = r0.f3150b0
            if (r12 >= r13) goto L43
            r4 = r12
            r5 = r13
            goto L46
        L43:
            r5 = r12
            r4 = r13
            r2 = 1
        L46:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r6 = r1.f3273c
            int r6 = r6.size()
            r8 = 0
        L4d:
            if (r8 >= r6) goto L6e
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r9 = r1.f3273c
            java.lang.Object r9 = r9.get(r8)
            androidx.recyclerview.widget.RecyclerView$b0 r9 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r9
            if (r9 == 0) goto L6b
            int r10 = r9.f3210c
            if (r10 < r4) goto L6b
            if (r10 <= r5) goto L60
            goto L6b
        L60:
            if (r10 != r12) goto L68
            int r10 = r13 - r12
            r9.m1801r(r10, r7)
            goto L6b
        L68:
            r9.m1801r(r2, r7)
        L6b:
            int r8 = r8 + 1
            goto L4d
        L6e:
            r0.requestLayout()
            androidx.recyclerview.widget.RecyclerView r12 = r11.f3409a
            r12.f3163h1 = r3
            return
    }
}
